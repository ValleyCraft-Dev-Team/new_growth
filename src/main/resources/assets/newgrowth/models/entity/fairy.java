// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17
// Paste this class into your mod and generate all required imports

/* Commented because it's causing errors on my IDE (Eclipse)

package com.example.mod;

public class custom_model extends SinglePartEntityModel<Entity> {
    private final ModelPart root;

    private final ModelPart bb_main;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;

    public custom_model(ModelPart root) {
        this.root = root;

        // TODO define your model parts here - 'this.body = root.getChild("body");' etc
    }

    public static TexturedModelData getTexturedModelData() {
        // TODO replace 'undefined' with 'root'

        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        ModelPartData bb_main = undefined.addChild(
		    "bb_main",
		    ModelPartBuilder.create()
		        .uv(0, 0)
		        .mirrored(false)
		        .cuboid(-2.0F, -14.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)),
		    ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F)
		);

		ModelPartData cube_r1 = bb_main.addChild(
		    "cube_r1",
		    ModelPartBuilder.create()
		        .uv(0, 9)
		        .mirrored(false)
		        .cuboid(2.0F, -17.0F, 0.0F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(13, 0)
		        .mirrored(false)
		        .cuboid(2.0F, -11.0F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)),
		    ModelTransform.of(0.0F, 0.0F, 1.0F, 0.1415F, -0.3892F, -0.054F)
		);

		ModelPartData cube_r2 = bb_main.addChild(
		    "cube_r2",
		    ModelPartBuilder.create()
		        .uv(9, 9)
		        .mirrored(false)
		        .cuboid(-6.0F, -17.0F, 0.0F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 15)
		        .mirrored(false)
		        .cuboid(-5.0F, -11.0F, 0.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)),
		    ModelTransform.of(0.0F, 0.0F, 1.0F, 0.1415F, 0.3892F, 0.054F)
		);

        return TexturedModelData.of(data, 32, 32);
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }

    
} */