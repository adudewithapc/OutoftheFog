package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.util.vector.Quaternion;

/**
 * Clam - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelClam extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer BottomBack;
    public ModelRenderer Pearl;
    public ModelRenderer BottomRight;
    public ModelRenderer BottomLeft;
    public ModelRenderer TopBack;
    public ModelRenderer TopRight;
    public ModelRenderer TopLeft;
    public ModelRenderer MiddleLeft;

    public ModelClam() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BottomBack = new ModelRenderer(this, 12, 0);
        this.BottomBack.setRotationPoint(0.0F, -0.5099999904632568F, 0.0F);
        this.BottomBack.addBox(-2.5F, -0.5F, 0.0F, 5, 1, 1, 0.0F);
        this.TopLeft = new ModelRenderer(this, 0, 6);
        this.TopLeft.setRotationPoint(-1.0499999523162842F, 0.019999999552965164F, 0.1899999976158142F);
        this.TopLeft.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.MiddleLeft = new ModelRenderer(this, 16, 6);
        this.MiddleLeft.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.MiddleLeft.addBox(-1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F);
        this.Pearl = new ModelRenderer(this, 0, 0);
        this.Pearl.setRotationPoint(0.0F, -0.4000000059604645F, -3.5F);
        this.Pearl.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.TopRight = new ModelRenderer(this, 27, 3);
        this.TopRight.setRotationPoint(1.0499999523162842F, 0.019999999552965164F, 0.1899999976158142F);
        this.TopRight.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.TopBack = new ModelRenderer(this, 26, 0);
        this.TopBack.setRotationPoint(0.009999999776482582F, -0.8100000023841858F, 0.0F);
        this.TopBack.addBox(-2.5F, -0.5F, 0.0F, 5, 1, 1, 0.0F);
        this.BottomLeft = new ModelRenderer(this, 0, 0);
        this.BottomLeft.setRotationPoint(-1.0F, 0.019999999552965164F, 0.2199999988079071F);
        this.BottomLeft.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.BottomRight = new ModelRenderer(this, 0, 0);
        this.BottomRight.setRotationPoint(1.0F, 0.019999999552965164F, 0.2199999988079071F);
        this.BottomRight.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.MainBody.addBox(-1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F);
        this.MainBody.addChild(this.BottomBack);
        this.TopBack.addChild(this.TopLeft);
        this.TopBack.addChild(this.MiddleLeft);
        this.MainBody.addChild(this.Pearl);
        this.TopBack.addChild(this.TopRight);
        this.BottomBack.addChild(this.TopBack);
        this.BottomBack.addChild(this.BottomLeft);
        this.BottomBack.addChild(this.BottomRight);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.MainBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        float f = 0.3F;//TODO
        float f2 = MathHelper.cos(ageInTicks * f);
        this.setRotateAngle(TopLeft, 0.04555309164612875F, 0.3642502295386026F, -0.04555309164612875F);
        this.setRotateAngle(TopRight, 0.04555309164612875F, -0.3642502295386026F, 0.04555309164612875F);
        this.setRotateAngle(TopBack, -0.4553564018453205F - 0.500734962F * f2, 0.0F, 0.0F);
        this.setRotateAngle(MiddleLeft, 0.04555309164612875F, 0.0F, 0.0F);
        this.setRotateAngle(BottomLeft, 0.0F, 0.3642502295386026F, -0.04555309164612875F);
        this.setRotateAngle(BottomRight, 0.0F, -0.3642502295386026F, 0.04555309164612875F);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
