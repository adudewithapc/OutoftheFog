package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * bloodfish - Hjalma
 * Created using Tabula 7.0.1
 */
public class ModelBloodfish extends ModelBase {
    public ModelRenderer Bodyfront;
    public ModelRenderer Bodymiddle;
    public ModelRenderer Head;
    public ModelRenderer PectoralfinsRight;
    public ModelRenderer PectoralfinsLeft;
    public ModelRenderer Bodyback;
    public ModelRenderer Dorsalfin;
    public ModelRenderer Pelvicfins;
    public ModelRenderer Tail1;
    public ModelRenderer Analfin;
    public ModelRenderer Tail2;
    public ModelRenderer Tailfin;
    public ModelRenderer Lowerjaw;
    public ModelRenderer Upperjaw;

    public ModelBloodfish() {
        this.textureWidth = 110;
        this.textureHeight = 110;
        this.Bodyfront = new ModelRenderer(this, 0, 0);
        this.Bodyfront.setRotationPoint(0.0F, 17.2F, -5.0F);
        this.Bodyfront.addBox(-4.0F, -4.0F, -4.0F, 8, 13, 8, 0.0F);
        this.setRotateAngle(Bodyfront, 0.04241150082346221F, 0.0F, 0.0F);
        this.Dorsalfin = new ModelRenderer(this, 34, 11);
        this.Dorsalfin.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Dorsalfin.addBox(0.0F, -11.0F, -2.0F, 0, 11, 15, 0.0F);
        this.Tail1 = new ModelRenderer(this, 48, 53);
        this.Tail1.setRotationPoint(0.0F, -1.100000023841858F, 5.5F);
        this.Tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 6, 7, 0.0F);
        this.setRotateAngle(Tail1, -0.04241150198859518F, 0.0F, 0.0F);
        this.Tailfin = new ModelRenderer(this, 0, 6);
        this.Tailfin.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Tailfin.addBox(0.0F, -8.0F, 0.0F, 0, 16, 16, 0.0F);
        this.setRotateAngle(Tailfin, 0.08482300397719036F, 0.0F, 0.0F);
        this.PectoralfinsLeft = new ModelRenderer(this, 40, 38);
        this.PectoralfinsLeft.mirror = true;
        this.PectoralfinsLeft.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.PectoralfinsLeft.addBox(0.0F, 0.0F, 0.0F, 11, 0, 14, 0.0F);
        this.setRotateAngle(PectoralfinsLeft, 0.12740903539558604F, 0.0F, 0.0F);
        this.Bodymiddle = new ModelRenderer(this, 33, 0);
        this.Bodymiddle.setRotationPoint(0.0F, -0.20000000298023224F, 2.5F);
        this.Bodymiddle.addBox(-3.5F, -4.5F, 0.0F, 7, 14, 10, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.08482300397719036F, 0.0F, 0.0F);
        this.Upperjaw = new ModelRenderer(this, 29, 38);
        this.Upperjaw.setRotationPoint(0.0F, 0.5F, -1.899999976158142F);
        this.Upperjaw.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 5, 0.0F);
        this.setRotateAngle(Upperjaw, 0.5942845969882637F, 0.0F, 0.0F);
        this.Pelvicfins = new ModelRenderer(this, 0, 39);
        this.Pelvicfins.setRotationPoint(0.0F, 8.5F, -0.5F);
        this.Pelvicfins.addBox(-2.0F, 0.0F, 0.0F, 4, 10, 7, 0.0F);
        this.setRotateAngle(Pelvicfins, 0.5094616179782085F, 0.0F, 0.0F);
        this.Analfin = new ModelRenderer(this, 0, 58);
        this.Analfin.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Analfin.addBox(0.0F, -2.0F, 0.0F, 0, 8, 13, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 57);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail2.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 7, 0.0F);
        this.setRotateAngle(Tail2, -0.12740903872453743F, 0.0F, 0.0F);
        this.Bodyback = new ModelRenderer(this, 19, 51);
        this.Bodyback.setRotationPoint(0.0F, 3.0999999046325684F, 8.699999809265137F);
        this.Bodyback.addBox(-3.0F, -4.5F, -1.0F, 6, 11, 8, 0.0F);
        this.setRotateAngle(Bodyback, -0.12740903872453743F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 68, 0);
        this.Head.setRotationPoint(0.0F, -0.20000000298023224F, -6.400000095367432F);
        this.Head.addBox(-4.5F, -3.0F, -2.200000047683716F, 9, 9, 7, 0.0F);
        this.setRotateAngle(Head, 0.12740903872453743F, 0.0F, 0.0F);
        this.PectoralfinsRight = new ModelRenderer(this, 40, 38);
        this.PectoralfinsRight.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.PectoralfinsRight.addBox(-11.0F, 0.0F, 0.0F, 11, 0, 14, 0.0F);
        this.setRotateAngle(PectoralfinsRight, 0.12740903539558604F, 0.0F, 0.0F);
        this.Lowerjaw = new ModelRenderer(this, 59, 55);
        this.Lowerjaw.setRotationPoint(0.0F, 7.400000095367432F, 1.100000023841858F);
        this.Lowerjaw.addBox(-3.0F, -1.5F, -10.5F, 6, 3, 12, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.67928211291826F, 0.0F, 0.0F);
        this.Bodymiddle.addChild(this.Dorsalfin);
        this.Bodyback.addChild(this.Tail1);
        this.Tail2.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.PectoralfinsLeft);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Head.addChild(this.Upperjaw);
        this.Bodymiddle.addChild(this.Pelvicfins);
        this.Bodyback.addChild(this.Analfin);
        this.Tail1.addChild(this.Tail2);
        this.Bodymiddle.addChild(this.Bodyback);
        this.Bodyfront.addChild(this.Head);
        this.Bodyfront.addChild(this.PectoralfinsRight);
        this.Head.addChild(this.Lowerjaw);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Bodyfront.offsetX, this.Bodyfront.offsetY, this.Bodyfront.offsetZ);
        GlStateManager.translate(this.Bodyfront.rotationPointX * f5, this.Bodyfront.rotationPointY * f5, this.Bodyfront.rotationPointZ * f5);
        GlStateManager.scale(0.3D, 0.3D, 0.3D);
        GlStateManager.translate(-this.Bodyfront.offsetX, -this.Bodyfront.offsetY, -this.Bodyfront.offsetZ);
        GlStateManager.translate(-this.Bodyfront.rotationPointX * f5, -this.Bodyfront.rotationPointY * f5, -this.Bodyfront.rotationPointZ * f5);
        this.Bodyfront.render(f5);
        GlStateManager.popMatrix();
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
