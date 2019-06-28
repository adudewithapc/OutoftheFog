package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * butterfly - Hjalma
 * Created using Tabula 7.0.1
 */
public class ModelMosuraAeterna extends ModelBase {
    public ModelRenderer Thorax;
    public ModelRenderer Leftlegs;
    public ModelRenderer Rightlegs;
    public ModelRenderer Head;
    public ModelRenderer Abdomen1;
    public ModelRenderer Leftfrontwing;
    public ModelRenderer Rightfrontwing;
    public ModelRenderer Lefthindwing;
    public ModelRenderer Righthindwing;
    public ModelRenderer Proboscis;
    public ModelRenderer Leftantenna;
    public ModelRenderer Rightantenna;
    public ModelRenderer Abdomen2;
    public ModelRenderer Abdomen3;

    public ModelMosuraAeterna() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Thorax = new ModelRenderer(this, 10, 0);
        this.Thorax.setRotationPoint(0.0F, 21.6F, 0.0F);
        this.Thorax.addBox(-1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F);
        this.Abdomen1 = new ModelRenderer(this, 6, 5);
        this.Abdomen1.setRotationPoint(0.0F, 0.20000000298023224F, 1.0F);
        this.Abdomen1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Abdomen1, 0.21223203437934937F, 0.0F, 0.0F);
        this.Leftantenna = new ModelRenderer(this, 0, 5);
        this.Leftantenna.setRotationPoint(0.10000000149011612F, -0.20000000298023224F, -1.0F);
        this.Leftantenna.addBox(0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftantenna, -0.46705011182842415F, -0.67928211291826F, 0.0F);
        this.Abdomen3 = new ModelRenderer(this, 0, 0);
        this.Abdomen3.setRotationPoint(0.0F, 0.0F, 3.700000047683716F);
        this.Abdomen3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Abdomen3, -0.21223203437934937F, 0.0F, 0.0F);
        this.Rightlegs = new ModelRenderer(this, 0, 7);
        this.Rightlegs.setRotationPoint(-0.8F, 22.3F, 0.3F);
        this.Rightlegs.addBox(0.0F, 0.0F, -2.5F, 0, 3, 5, 0.0F);
        this.setRotateAngle(Rightlegs, 0.0F, 0.0F, 0.8491026810952413F);
        this.Abdomen2 = new ModelRenderer(this, 8, 5);
        this.Abdomen2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Abdomen2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Abdomen2, -0.33964105645913F, 0.0F, 0.0F);
        this.Leftfrontwing = new ModelRenderer(this, 26, 0);
        this.Leftfrontwing.setRotationPoint(0.4000000059604645F, -1.0F, -0.8999999761581421F);
        this.Leftfrontwing.addBox(0.0F, 0.0F, -8.0F, 11, 0, 8, 0.0F);
        this.setRotateAngle(Leftfrontwing, 0.04241150198859518F, -0.9339256534473936F, -0.08482300397719036F);
        this.Leftlegs = new ModelRenderer(this, 24, 5);
        this.Leftlegs.setRotationPoint(0.8F, 22.3F, 0.3F);
        this.Leftlegs.addBox(0.0F, 0.0F, -2.5F, 0, 3, 5, 0.0F);
        this.setRotateAngle(Leftlegs, 0.0F, 0.0F, -0.8491026810952413F);
        this.Rightfrontwing = new ModelRenderer(this, 4, 13);
        this.Rightfrontwing.setRotationPoint(-0.4000000059604645F, -1.0F, -0.8999999761581421F);
        this.Rightfrontwing.addBox(-11.0F, 0.0F, -8.0F, 11, 0, 8, 0.0F);
        this.setRotateAngle(Rightfrontwing, 0.04241150198859518F, 0.9339256534473936F, 0.08482300397719036F);
        this.Rightantenna = new ModelRenderer(this, 0, 7);
        this.Rightantenna.setRotationPoint(-0.10000000149011612F, -0.20000000298023224F, -1.0F);
        this.Rightantenna.addBox(0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightantenna, -0.46705011182842415F, 0.67928211291826F, 0.0F);
        this.Head = new ModelRenderer(this, 5, 2);
        this.Head.setRotationPoint(0.0F, -0.20000000298023224F, -1.5F);
        this.Head.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Head, 0.2546435405291338F, 0.0F, 0.0F);
        this.Lefthindwing = new ModelRenderer(this, 24, 9);
        this.Lefthindwing.setRotationPoint(0.10000000149011612F, -1.0F, -0.699999988079071F);
        this.Lefthindwing.addBox(0.0F, 0.0F, 0.0F, 7, 0, 10, 0.0F);
        this.setRotateAngle(Lefthindwing, 0.04241150198859518F, -0.2546435405291338F, -0.04241150198859518F);
        this.Proboscis = new ModelRenderer(this, 0, 3);
        this.Proboscis.setRotationPoint(0.0F, -0.4000000059604645F, -1.0F);
        this.Proboscis.addBox(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
        this.setRotateAngle(Proboscis, -0.38205256260891435F, 0.0F, 0.0F);
        this.Righthindwing = new ModelRenderer(this, 10, 0);
        this.Righthindwing.setRotationPoint(-0.10000000149011612F, -1.0F, -0.699999988079071F);
        this.Righthindwing.addBox(-7.0F, 0.0F, 0.0F, 7, 0, 10, 0.0F);
        this.setRotateAngle(Righthindwing, 0.04241150198859518F, 0.2546435405291338F, 0.04241150198859518F);
        this.Thorax.addChild(this.Abdomen1);
        this.Head.addChild(this.Leftantenna);
        this.Abdomen2.addChild(this.Abdomen3);
        this.Abdomen1.addChild(this.Abdomen2);
        this.Thorax.addChild(this.Leftfrontwing);
        this.Thorax.addChild(this.Rightfrontwing);
        this.Head.addChild(this.Rightantenna);
        this.Thorax.addChild(this.Head);
        this.Thorax.addChild(this.Lefthindwing);
        this.Head.addChild(this.Proboscis);
        this.Thorax.addChild(this.Righthindwing);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Thorax.offsetX, this.Thorax.offsetY, this.Thorax.offsetZ);
        GlStateManager.translate(this.Thorax.rotationPointX * f5, this.Thorax.rotationPointY * f5, this.Thorax.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.Thorax.offsetX, -this.Thorax.offsetY, -this.Thorax.offsetZ);
        GlStateManager.translate(-this.Thorax.rotationPointX * f5, -this.Thorax.rotationPointY * f5, -this.Thorax.rotationPointZ * f5);
        this.Thorax.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Rightlegs.offsetX, this.Rightlegs.offsetY, this.Rightlegs.offsetZ);
        GlStateManager.translate(this.Rightlegs.rotationPointX * f5, this.Rightlegs.rotationPointY * f5, this.Rightlegs.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.Rightlegs.offsetX, -this.Rightlegs.offsetY, -this.Rightlegs.offsetZ);
        GlStateManager.translate(-this.Rightlegs.rotationPointX * f5, -this.Rightlegs.rotationPointY * f5, -this.Rightlegs.rotationPointZ * f5);
        this.Rightlegs.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Leftlegs.offsetX, this.Leftlegs.offsetY, this.Leftlegs.offsetZ);
        GlStateManager.translate(this.Leftlegs.rotationPointX * f5, this.Leftlegs.rotationPointY * f5, this.Leftlegs.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.Leftlegs.offsetX, -this.Leftlegs.offsetY, -this.Leftlegs.offsetZ);
        GlStateManager.translate(-this.Leftlegs.rotationPointX * f5, -this.Leftlegs.rotationPointY * f5, -this.Leftlegs.rotationPointZ * f5);
        this.Leftlegs.render(f5);
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
