package net.linkle.newgrowth.utils;
import java.util.List;
import java.util.function.Predicate;

import net.linkle.newgrowth.NewGrowth;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class Util {
    public static boolean inWater(ItemPlacementContext context) {
        return context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
    }

    /*
    private static RegistryKey<PlacedFeature> register(String id, ConfiguredFeature<?, ?> config,
            List<PlacementModifier> mods) {
        var place = config.withPlacement(mods);
        var identifier = newId(id);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, identifier, config);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, identifier, place);
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, identifier);
    } */

    public static BlockStateProvider randomHoriFacing(BlockState state) {
        var builder = new DataPool.Builder<BlockState>();
        builder.add(state.with(Properties.HORIZONTAL_FACING, Direction.NORTH), 1);
        builder.add(state.with(Properties.HORIZONTAL_FACING, Direction.EAST), 1);
        builder.add(state.with(Properties.HORIZONTAL_FACING, Direction.SOUTH), 1);
        builder.add(state.with(Properties.HORIZONTAL_FACING, Direction.WEST), 1);
        return new WeightedBlockStateProvider(builder);
    }

    public static Identifier newId(String id) {
        return new Identifier(NewGrowth.MOD_ID, id);
    }

    /**
     * {@return the ticker if the given type and expected type are the same, or
     * {@code null} if they are different}
     */
    @SuppressWarnings("unchecked")
    public static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> checkType(
            BlockEntityType<A> givenType, BlockEntityType<E> expectedType, BlockEntityTicker<? super E> ticker) {
        return expectedType == givenType ? (BlockEntityTicker<A>) ticker : null;
    }

    public static <T> Predicate<T> pair(Predicate<T> first, Predicate<T> second, BooleanBiFunction function) {
        return obj -> function.apply(first.test(obj), second.test(obj));
    }

    public static boolean canMergeItems(ItemStack first, ItemStack second) {
        if (!first.isOf(second.getItem())) {
            return false;
        }
        if (first.getDamage() != second.getDamage()) {
            return false;
        }
        if (first.getCount() > first.getMaxCount()) {
            return false;
        }
        return ItemStack.areNbtEqual(first, second);
    }
}