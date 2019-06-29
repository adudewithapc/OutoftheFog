package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;

/**
 * bloodfish - Hjalma
 * Created using Tabula 7.0.1
 */
public class ModelBloodfish extends ModelBase {
    private final ModelRenderer head;
    private final ModelRenderer upperJaw;
    private final ModelRenderer lowerJaw;
    private final ModelRenderer bodyFront;
    private final ModelRenderer bodyMiddle;
    private final ModelRenderer dorsalFin;
    private final ModelRenderer pelvicFins;
    private final ModelRenderer pectoralFinsLeft;
    private final ModelRenderer pectoralFinsRight;
    private final ModelRenderer bodyBack;
    private final ModelRenderer analFin;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tailFin;

    public ModelBloodfish() {
        textureWidth = 110;
        textureHeight = 110;

        head = new ModelRenderer(this, 68, 0);
        head.setRotationPoint(0.0F, -0.20000000298023224F, -6.400000095367432F);
        head.addBox(-4.5F, -3.0F, -2.200000047683716F, 9, 9, 7, 0.0F);

        upperJaw = new ModelRenderer(this, 29, 38);
        upperJaw.setRotationPoint(0.0F, 0.5F, -1.899999976158142F);
        upperJaw.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 5, 0.0F);

        lowerJaw = new ModelRenderer(this, 59, 55);
        lowerJaw.setRotationPoint(0.0F, 7.400000095367432F, 1.100000023841858F);
        lowerJaw.addBox(-3.0F, -1.5F, -10.5F, 6, 3, 12, 0.0F);

        bodyFront = new ModelRenderer(this, 0, 0);
        bodyFront.setRotationPoint(0.0F, 17.2F, -5.0F);
        bodyFront.addBox(-4.0F, -4.0F, -4.0F, 8, 13, 8, 0.0F);

        bodyMiddle = new ModelRenderer(this, 33, 0);
        bodyMiddle.setRotationPoint(0.0F, -0.2F, 2.5F);
        bodyMiddle.addBox(-3.5F, -4.5F, 0.0F, 7, 14, 10, 0.0F);

        dorsalFin = new ModelRenderer(this, 34, 11);
        dorsalFin.setRotationPoint(0.0F, -3.0F, 0.0F);
        dorsalFin.addBox(0.0F, -11.0F, -2.0F, 0, 11, 15, 0.0F);

        pelvicFins = new ModelRenderer(this, 0, 39);
        pelvicFins.setRotationPoint(0.0F, 8.5F, -0.5F);
        pelvicFins.addBox(-2.0F, 0.0F, 0.0F, 4, 10, 7, 0.0F);

        pectoralFinsLeft = new ModelRenderer(this, 40, 38);
        pectoralFinsLeft.mirror = true;
        pectoralFinsLeft.setRotationPoint(0.0F, 4.0F, 2.0F);
        pectoralFinsLeft.addBox(0.0F, 0.0F, 0.0F, 11, 0, 14, 0.0F);

        pectoralFinsRight = new ModelRenderer(this, 40, 38);
        pectoralFinsRight.setRotationPoint(0.0F, 4.0F, 2.0F);
        pectoralFinsRight.addBox(-11.0F, 0.0F, 0.0F, 11, 0, 14, 0.0F);

        bodyBack = new ModelRenderer(this, 19, 51);
        bodyBack.setRotationPoint(0.0F, 3.1F, 8.7F);
        bodyBack.addBox(-3.0F, -4.5F, -1.0F, 6, 11, 8, 0.0F);

        analFin = new ModelRenderer(this, 0, 58);
        analFin.setRotationPoint(0.0F, 5.5F, 0.0F);
        analFin.addBox(0.0F, -2.0F, 0.0F, 0, 8, 13, 0.0F);

        tail1 = new ModelRenderer(this, 48, 53);
        tail1.setRotationPoint(0.0F, -1.1F, 5.5F);
        tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 6, 7, 0.0F);

        tail2 = new ModelRenderer(this, 0, 57);
        tail2.setRotationPoint(0.0F, 0.5F, 5.0F);
        tail2.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 7, 0.0F);

        tailFin = new ModelRenderer(this, 0, 6);
        tailFin.setRotationPoint(0.0F, -0.5F, 3.0F);
        tailFin.addBox(0.0F, -8.0F, 0.0F, 0, 16, 16, 0.0F);

        head.addChild(upperJaw);
        head.addChild(lowerJaw);

        bodyFront.addChild(head);
        bodyFront.addChild(bodyMiddle);
        bodyFront.addChild(pectoralFinsLeft);
        bodyFront.addChild(pectoralFinsRight);

        bodyMiddle.addChild(dorsalFin);
        bodyMiddle.addChild(pelvicFins);
        bodyMiddle.addChild(bodyBack);

        bodyBack.addChild(analFin);
        bodyBack.addChild(tail1);

        tail1.addChild(tail2);

        tail2.addChild(tailFin);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(bodyFront.offsetX, bodyFront.offsetY, bodyFront.offsetZ);
        GlStateManager.translate(bodyFront.rotationPointX * f5, bodyFront.rotationPointY * f5, bodyFront.rotationPointZ * f5);
        GlStateManager.scale(0.3D, 0.3D, 0.3D);
        GlStateManager.translate(-bodyFront.offsetX, -bodyFront.offsetY, -bodyFront.offsetZ);
        GlStateManager.translate(-bodyFront.rotationPointX * f5, -bodyFront.rotationPointY * f5, -bodyFront.rotationPointZ * f5);
        bodyFront.render(f5);
        GlStateManager.popMatrix();
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        int i = 1; // 0: idle, 1: swimming

        setRotateAngle(head, 0.12740903872453743F, 0.0F, 0.0F);
        setRotateAngle(upperJaw, 0.5942845969882637F, 0.0F, 0.0F);
        setRotateAngle(lowerJaw, -0.67928211291826F, 0.0F, 0.0F);
        setRotateAngle(bodyFront, 0.04241150082346221F, 0.0F, 0.0F);
        setRotateAngle(pelvicFins, 0.5094616179782085F, 0.0F, 0.0F);

        if (i == 0) {
            setRotateAngle(bodyMiddle, 0.08482300397719036F, 0.0F, 0.0F);
            setRotateAngle(pectoralFinsLeft, 0.12740903539558604F, 0.0F, 0.0F);
            setRotateAngle(pectoralFinsRight, 0.12740903539558604F, 0.0F, 0.0F);
            setRotateAngle(bodyBack, -0.12740903872453743F, 0.0F, 0.0F);
            setRotateAngle(tail1, -0.04241150198859518F, 0.0F, 0.0F);
            setRotateAngle(tail2, -0.12740903872453743F, 0.0F, 0.0F);
            setRotateAngle(tailFin, 0.08482300397719036F, 0.0F, 0.0F);
        } else if (i == 1) {
            float f = 0.9F;//TODO
            setRotateAngle(bodyMiddle, 0.08482300164692443F, 0.136659280431156F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(pectoralFinsLeft, 0.12740903539558604F, 0.136659280431156F - 0.182212374F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(pectoralFinsRight, 0.12740903539558604F, 0.045553093477052F - 0.182212374F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(bodyBack, -0.12740903539558604F, 0.136659280431156F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(tail1, -0.04241150082346221F, 0.136659280431156F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(tail2, -0.12740903539558604F, 0.31869712141416456F * MathHelper.cos(ageInTicks * f), 0.0F);
            setRotateAngle(tailFin, 0.08482300164692443F, 0.091106186954104F * MathHelper.cos(ageInTicks * f), 0.0F);
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
