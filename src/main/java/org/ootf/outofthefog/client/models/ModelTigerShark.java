package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * Tiger Shark - Nova
 * Created using Tabula 7.0.1
 */
public class ModelTigerShark extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer BackBody;
    public ModelRenderer Neck;
    public ModelRenderer DorsalFin;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer PelvicFinLeft;
    public ModelRenderer PelvicFinRight;
    public ModelRenderer Tail3;
    public ModelRenderer Tailend;
    public ModelRenderer BackDorsalFin;
    public ModelRenderer AnulFin;
    public ModelRenderer TailFin;
    public ModelRenderer BottomTailfin;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LowerJaw1;
    public ModelRenderer Jawparting;

    public ModelTigerShark() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.BackDorsalFin = new ModelRenderer(this, 64, 28);
        this.BackDorsalFin.setRotationPoint(0.0F, -2.5F, 3.0F);
        this.BackDorsalFin.addBox(-0.5F, -4.5F, 0.0F, 1, 4, 5, 0.0F);
        this.PelvicFinLeft = new ModelRenderer(this, 78, 35);
        this.PelvicFinLeft.setRotationPoint(1.0F, 3.5F, 8.5F);
        this.PelvicFinLeft.addBox(-0.5F, -2.5F, 0.0F, 1, 5, 5, 0.0F);
        this.Head = new ModelRenderer(this, 21, 110);
        this.Head.setRotationPoint(0.0F, -2.200000047683716F, -7.199999809265137F);
        this.Head.addBox(-6.0F, -3.5F, -11.0F, 12, 7, 11, 0.0F);
        this.Tail3 = new ModelRenderer(this, 0, 105);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.Tail3.addBox(-3.5F, -3.0F, 0.0F, 7, 7, 9, 0.0F);
        this.BackBody = new ModelRenderer(this, 0, 33);
        this.BackBody.setRotationPoint(0.0F, -0.30000001192092896F, 9.0F);
        this.BackBody.addBox(-5.5F, -6.0F, 0.0F, 11, 12, 11, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 0, 93);
        this.LowerJaw1.setRotationPoint(0.0F, 6.199999809265137F, -1.600000023841858F);
        this.LowerJaw1.addBox(-5.5F, -1.5F, -9.0F, 11, 3, 9, 0.0F);
        this.BottomTailfin = new ModelRenderer(this, 55, 49);
        this.BottomTailfin.setRotationPoint(0.5F, 2.0F, 5.0F);
        this.BottomTailfin.addBox(-1.0F, 0.0F, 0.0F, 1, 11, 6, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 73);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail1.addBox(-4.5F, -5.0F, 0.0F, 9, 10, 10, 0.0F);
        this.Tailend = new ModelRenderer(this, 44, 35);
        this.Tailend.setRotationPoint(0.0F, 0.5F, 7.5F);
        this.Tailend.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 9, 0.0F);
        this.Neck = new ModelRenderer(this, 38, 78);
        this.Neck.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Neck.addBox(-6.5F, -6.0F, -10.0F, 13, 12, 10, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 56);
        this.Tail2.setRotationPoint(0.0F, -0.20000000298023224F, 9.0F);
        this.Tail2.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 9, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 62, 16);
        this.PectoralFinLeft.setRotationPoint(6.0F, 4.5F, -5.5F);
        this.PectoralFinLeft.addBox(0.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
        this.Jawparting = new ModelRenderer(this, 43, 0);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 1.7000000476837158F, -10.199999809265137F);
        this.Jawparting.addBox(-6.0F, -1.0F, 0.0F, 12, 3, 9, 0.0F);
        this.AnulFin = new ModelRenderer(this, 36, 33);
        this.AnulFin.setRotationPoint(0.0F, 3.9000000953674316F, 3.5F);
        this.AnulFin.addBox(-0.5F, -4.5F, 0.0F, 1, 5, 5, 0.0F);
        this.Snout = new ModelRenderer(this, 40, 100);
        this.Snout.setRotationPoint(0.0F, -1.3200000524520874F, -14.199999809265137F);
        this.Snout.addBox(-5.5F, 0.0F, 0.0F, 11, 6, 4, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Body.addBox(-6.0F, -7.0F, -8.0F, 12, 14, 19, 0.0F);
        this.PectoralFinRight = new ModelRenderer(this, 76, 46);
        this.PectoralFinRight.setRotationPoint(-6.0F, 4.5F, -5.5F);
        this.PectoralFinRight.addBox(-13.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
        this.TailFin = new ModelRenderer(this, 37, 49);
        this.TailFin.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.TailFin.addBox(-1.0F, -21.0F, 0.0F, 2, 21, 7, 0.0F);
        this.PelvicFinRight = new ModelRenderer(this, 2, 8);
        this.PelvicFinRight.setRotationPoint(-1.0F, 3.5F, 8.5F);
        this.PelvicFinRight.addBox(-0.5F, -2.5F, 0.0F, 1, 5, 5, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 61, 57);
        this.DorsalFin.setRotationPoint(0.0F, -6.0F, 3.0F);
        this.DorsalFin.addBox(-1.0F, -12.0F, 0.0F, 2, 12, 9, 0.0F);
        this.Tail3.addChild(this.BackDorsalFin);
        this.Tail1.addChild(this.PelvicFinLeft);
        this.Neck.addChild(this.Head);
        this.Tail2.addChild(this.Tail3);
        this.Body.addChild(this.BackBody);
        this.Head.addChild(this.LowerJaw1);
        this.Tailend.addChild(this.BottomTailfin);
        this.BackBody.addChild(this.Tail1);
        this.Tail3.addChild(this.Tailend);
        this.Body.addChild(this.Neck);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.PectoralFinLeft);
        this.Head.addChild(this.Jawparting);
        this.Tail3.addChild(this.AnulFin);
        this.Head.addChild(this.Snout);
        this.Body.addChild(this.PectoralFinRight);
        this.Tailend.addChild(this.TailFin);
        this.Tail1.addChild(this.PelvicFinRight);
        this.Body.addChild(this.DorsalFin);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.setRotateAngle(Snout, 0.581369197807761F, 0.0F, 0.0F);
        this.setRotateAngle(Jawparting, -0.33964105645913F, 0.0F, 0.0F);
        this.setRotateAngle(LowerJaw1, -0.33964105645913F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.08482300397719036F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.08482300397719036F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.04241150082346221F, 0.0F, 0.0F);

        this.setRotateAngle(PectoralFinLeft, 0.0F, -0.17453292519943295F, 0.767944870877505F);
        this.setRotateAngle(PectoralFinRight, 0.0F, 0.17453292519943295F, -0.767944870877505F);

        this.setRotateAngle(DorsalFin, -0.6108652381980153F, 0.0F, 0.0F);
        this.setRotateAngle(BackDorsalFin, -0.7216936190680444F, 0.0F, 0.0F);

        this.setRotateAngle(PelvicFinLeft, -0.8915142138766367F, 0.42446406875869874F, -0.5942845969882637F);
        this.setRotateAngle(PelvicFinRight, -0.8915142138766367F, -0.42446406875869874F, 0.5942845969882637F);

        this.setRotateAngle(AnulFin, -0.7216936190680444F, 0.0F, 0.0F);

        this.setRotateAngle(TailFin, -0.7641051252178287F, 0.0F, 0.0F);
        this.setRotateAngle(BottomTailfin, 0.5518731241279929F, 0.0F, 0.0F);

        int i = 1;
        if (i == 0) {
            this.setRotateAngle(BackBody, -0.08482300397719036F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.04241150198859518F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.04241150198859518F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.04555309164612875F, 0.0F, 0.0F);
            this.setRotateAngle(Tailend, -0.04555309164612875F, 0.0F, 0.0F);
        } else {
            float f = 0.9F;//TODO
            float f2 = MathHelper.cos(ageInTicks * f);
            this.setRotateAngle(BackBody, -0.08482300164692443F, 0.045553093477052F * f2, 0.0F);
            this.setRotateAngle(Tail1, -0.04241150082346221F, 0.18203784098300857F * f2, 0.0F);
            this.setRotateAngle(Tail2, 0.04241150082346221F, 0.045553093477052F * f2, 0.0F);
            this.setRotateAngle(Tail3, 0.045553093477052F, 0.091106186954104F * f2, 0.0F);
            this.setRotateAngle(Tailend, -0.045553093477052F, 0.136659280431156F * f2, 0.0F);
        }
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
