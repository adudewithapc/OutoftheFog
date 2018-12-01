package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelScorpioPede - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelScorpioPede extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer Leg3_L;
    public ModelRenderer Leg3_R;
    public ModelRenderer Leg2_R;
    public ModelRenderer Leg2_L;
    public ModelRenderer Leg2_R_1;
    public ModelRenderer Leg2_L_1;
    public ModelRenderer Neck;
    public ModelRenderer Tail1;
    public ModelRenderer Head;
    public ModelRenderer Fang1_R;
    public ModelRenderer Fang1_L;
    public ModelRenderer Fang2_R;
    public ModelRenderer Fang3_R;
    public ModelRenderer Fang2_L;
    public ModelRenderer Fang3_L;
    public ModelRenderer Tail2;
    public ModelRenderer Fin1;
    public ModelRenderer Fin2;
    public ModelRenderer Tail3;
    public ModelRenderer Fin3;
    public ModelRenderer Fin4;
    public ModelRenderer Tail4;
    public ModelRenderer Fin5;
    public ModelRenderer TailTip;
    public ModelRenderer Fin6;
    public ModelRenderer TailPincer1_R;
    public ModelRenderer TailPincer1_L;
    public ModelRenderer TailPincer2_R;
    public ModelRenderer TailPincer2_L;
    public ModelRenderer Leg31_L;
    public ModelRenderer Leg32_L;
    public ModelRenderer Leg31_R;
    public ModelRenderer Leg32_R;
    public ModelRenderer Leg21_R;
    public ModelRenderer Leg22_R;
    public ModelRenderer Leg21_L;
    public ModelRenderer Leg22_L;
    public ModelRenderer Leg21_R_1;
    public ModelRenderer Leg22_R_1;
    public ModelRenderer Leg21_L_1;
    public ModelRenderer Leg22_L_1;

    public ModelScorpioPede() {
        this.textureWidth = 64;
        this.textureHeight = 40;
        this.Leg2_R_1 = new ModelRenderer(this, 0, 22);
        this.Leg2_R_1.setRotationPoint(2.5F, 20.100000381469727F, -5.0F);
        this.Leg2_R_1.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leg2_R_1, 0.0F, 0.45535640450848164F, 0.0F);
        this.Leg21_L_1 = new ModelRenderer(this, 0, 37);
        this.Leg21_L_1.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.Leg21_L_1.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg21_L_1, 0.0F, 0.0F, 0.7285004590772052F);
        this.Leg21_R_1 = new ModelRenderer(this, 0, 33);
        this.Leg21_R_1.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.Leg21_R_1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg21_R_1, 0.0F, 0.0F, -0.7285004590772052F);
        this.Fin1 = new ModelRenderer(this, 31, 0);
        this.Fin1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fin1.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 4, 0.0F);
        this.Tail1 = new ModelRenderer(this, 23, 19);
        this.Tail1.setRotationPoint(0.0F, -0.30000001192092896F, 7.0F);
        this.Tail1.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F);
        this.setRotateAngle(Tail1, -0.04555309164612875F, 0.0F, 0.0F);
        this.Leg22_L = new ModelRenderer(this, 0, 31);
        this.Leg22_L.setRotationPoint(-3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg22_L.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg22_L, 0.0F, 0.0F, 0.8651597048872669F);
        this.Leg3_R = new ModelRenderer(this, 0, 14);
        this.Leg3_R.setRotationPoint(2.799999952316284F, 20.0F, 5.0F);
        this.Leg3_R.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leg3_R, 0.0F, -0.45535640450848164F, 0.0F);
        this.Fang2_R = new ModelRenderer(this, 45, 27);
        this.Fang2_R.setRotationPoint(0.14000000059604645F, 0.0F, -2.5999999046325684F);
        this.Fang2_R.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Fang2_R, -0.3186971254089062F, 0.6829473549475088F, 0.04555309164612875F);
        this.Leg3_L = new ModelRenderer(this, 0, 12);
        this.Leg3_L.setRotationPoint(-2.799999952316284F, 20.0F, 5.0F);
        this.Leg3_L.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leg3_L, 0.0F, 0.45535640450848164F, 0.0F);
        this.Leg21_L = new ModelRenderer(this, 50, 11);
        this.Leg21_L.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.Leg21_L.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg21_L, 0.0F, 0.0F, 0.7285004590772052F);
        this.Leg22_L_1 = new ModelRenderer(this, 10, 37);
        this.Leg22_L_1.setRotationPoint(-3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg22_L_1.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg22_L_1, 0.0F, 0.0F, 0.8651597048872669F);
        this.Fin3 = new ModelRenderer(this, 36, 32);
        this.Fin3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fin3.addBox(-5.0F, 0.0F, 0.0F, 10, 0, 4, 0.0F);
        this.TailPincer2_R = new ModelRenderer(this, 0, 5);
        this.TailPincer2_R.setRotationPoint(0.0F, 0.0F, 2.799999952316284F);
        this.TailPincer2_R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(TailPincer2_R, 0.0F, -0.4098033003787853F, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 12);
        this.MainBody.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.MainBody.addBox(-3.5F, -1.5F, 0.0F, 7, 2, 8, 0.0F);
        this.setRotateAngle(MainBody, 0.04555309164612875F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 22, 13);
        this.Head.setRotationPoint(0.0F, -0.20000000298023224F, -6.0F);
        this.Head.addBox(-2.5F, -1.5F, -4.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
        this.Leg22_R = new ModelRenderer(this, 46, 15);
        this.Leg22_R.setRotationPoint(3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg22_R.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg22_R, 0.0F, 0.0F, 2.2764328155444717F);
        this.Leg32_L = new ModelRenderer(this, 40, 17);
        this.Leg32_L.setRotationPoint(-3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg32_L.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg32_L, 0.0F, 0.0F, 0.8651597048872669F);
        this.Fang2_L = new ModelRenderer(this, 45, 27);
        this.Fang2_L.setRotationPoint(-0.25999999046325684F, 0.0F, -2.5F);
        this.Fang2_L.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Fang2_L, -0.3642502295386026F, -0.6829473549475088F, 0.04555309164612875F);
        this.Tail4 = new ModelRenderer(this, 42, 19);
        this.Tail4.setRotationPoint(0.0F, -0.10000000149011612F, 7.0F);
        this.Tail4.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F);
        this.Leg22_R_1 = new ModelRenderer(this, 0, 35);
        this.Leg22_R_1.setRotationPoint(3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg22_R_1.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg22_R_1, 0.0F, 0.0F, 2.2764328155444717F);
        this.Neck = new ModelRenderer(this, 0, 22);
        this.Neck.setRotationPoint(0.0F, -0.20000000298023224F, 1.0F);
        this.Neck.addBox(-3.0F, -1.5F, -7.0F, 6, 2, 7, 0.0F);
        this.setRotateAngle(Neck, 0.04555309164612875F, 0.0F, 0.0F);
        this.Leg31_R = new ModelRenderer(this, 36, 15);
        this.Leg31_R.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.Leg31_R.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg31_R, 0.0F, 0.0F, -0.7285004590772052F);
        this.Fin6 = new ModelRenderer(this, 34, 8);
        this.Fin6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fin6.addBox(-6.0F, 0.0F, 0.0F, 12, 0, 3, 0.0F);
        this.TailPincer2_L = new ModelRenderer(this, 0, 5);
        this.TailPincer2_L.setRotationPoint(0.0F, 0.0F, 2.799999952316284F);
        this.TailPincer2_L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(TailPincer2_L, 0.0F, 0.45535640450848164F, 0.0F);
        this.Leg31_L = new ModelRenderer(this, 22, 5);
        this.Leg31_L.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.Leg31_L.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg31_L, 0.0F, 0.0F, 0.7285004590772052F);
        this.Leg2_L_1 = new ModelRenderer(this, 0, 24);
        this.Leg2_L_1.setRotationPoint(-2.5F, 20.0F, -5.0F);
        this.Leg2_L_1.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Leg2_L_1, 0.0F, -0.45535640450848164F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 2);
        this.Tail2.setRotationPoint(0.0F, 0.10000000149011612F, 6.0F);
        this.Tail2.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 8, 0.0F);
        this.setRotateAngle(Tail2, -0.04555309164612875F, 0.0F, 0.0F);
        this.Leg32_R = new ModelRenderer(this, 36, 13);
        this.Leg32_R.setRotationPoint(3.700000047683716F, 0.6000000238418579F, 0.0F);
        this.Leg32_R.addBox(-1.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.setRotateAngle(Leg32_R, 0.0F, 0.0F, 2.2764328155444717F);
        this.Tail3 = new ModelRenderer(this, 0, 2);
        this.Tail3.setRotationPoint(0.0F, -0.10000000149011612F, 7.0F);
        this.Tail3.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 8, 0.0F);
        this.Fin5 = new ModelRenderer(this, 24, 36);
        this.Fin5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Fin5.addBox(-5.5F, 0.0F, 0.0F, 11, 0, 4, 0.0F);
        this.Fang1_R = new ModelRenderer(this, 23, 28);
        this.Fang1_R.setRotationPoint(1.600000023841858F, -0.5F, -3.200000047683716F);
        this.Fang1_R.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Fang1_R, 0.13665927909957545F, -0.9105382388075086F, -0.13665927909957545F);
        this.TailTip = new ModelRenderer(this, 22, 7);
        this.TailTip.setRotationPoint(0.0F, -0.10000000149011612F, 4.0F);
        this.TailTip.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 4, 0.0F);
        this.Fang3_R = new ModelRenderer(this, 14, 5);
        this.Fang3_R.setRotationPoint(0.4000000059604645F, 0.0F, -3.5F);
        this.Fang3_R.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Fang3_R, 0.0F, 1.3203416057653212F, 0.0F);
        this.TailPincer1_R = new ModelRenderer(this, 33, 28);
        this.TailPincer1_R.setRotationPoint(1.7000000476837158F, 0.0F, 3.0F);
        this.TailPincer1_R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(TailPincer1_R, 0.0F, -0.13665927909957545F, 0.0F);
        this.Fang3_L = new ModelRenderer(this, 51, 26);
        this.Fang3_L.setRotationPoint(-0.30000001192092896F, 0.0F, -3.5F);
        this.Fang3_L.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Fang3_L, 0.0F, -1.3203416057653212F, -0.0911061832922575F);
        this.TailPincer1_L = new ModelRenderer(this, 19, 22);
        this.TailPincer1_L.setRotationPoint(-1.7000000476837158F, 0.0F, 3.0F);
        this.TailPincer1_L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(TailPincer1_L, 0.0F, 0.13665927909957545F, 0.0F);
        this.Leg2_R = new ModelRenderer(this, 0, 7);
        this.Leg2_R.setRotationPoint(2.5999999046325684F, 20.0F, 0.0F);
        this.Leg2_R.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.Leg21_R = new ModelRenderer(this, 40, 11);
        this.Leg21_R.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.Leg21_R.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(Leg21_R, 0.0F, 0.0F, -0.7285004590772052F);
        this.Leg2_L = new ModelRenderer(this, 0, 16);
        this.Leg2_L.setRotationPoint(-2.5999999046325684F, 20.0F, 0.0F);
        this.Leg2_L.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.Fin2 = new ModelRenderer(this, 40, 4);
        this.Fin2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Fin2.addBox(-4.5F, 0.0F, 0.0F, 9, 0, 3, 0.0F);
        this.Fin4 = new ModelRenderer(this, 10, 0);
        this.Fin4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Fin4.addBox(-5.0F, 0.0F, 0.0F, 10, 0, 4, 0.0F);
        this.Fang1_L = new ModelRenderer(this, 23, 28);
        this.Fang1_L.setRotationPoint(-1.600000023841858F, -0.5F, -3.200000047683716F);
        this.Fang1_L.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Fang1_L, 0.13665927909957545F, 0.9105382388075086F, 0.13665927909957545F);
        this.Leg2_L_1.addChild(this.Leg21_L_1);
        this.Leg2_R_1.addChild(this.Leg21_R_1);
        this.Tail2.addChild(this.Fin1);
        this.MainBody.addChild(this.Tail1);
        this.Leg21_L.addChild(this.Leg22_L);
        this.Fang1_R.addChild(this.Fang2_R);
        this.Leg2_L.addChild(this.Leg21_L);
        this.Leg21_L_1.addChild(this.Leg22_L_1);
        this.Tail3.addChild(this.Fin3);
        this.TailPincer1_R.addChild(this.TailPincer2_R);
        this.Neck.addChild(this.Head);
        this.Leg21_R.addChild(this.Leg22_R);
        this.Leg31_L.addChild(this.Leg32_L);
        this.Fang1_L.addChild(this.Fang2_L);
        this.Tail3.addChild(this.Tail4);
        this.Leg21_R_1.addChild(this.Leg22_R_1);
        this.MainBody.addChild(this.Neck);
        this.Leg3_R.addChild(this.Leg31_R);
        this.TailTip.addChild(this.Fin6);
        this.TailPincer1_L.addChild(this.TailPincer2_L);
        this.Leg3_L.addChild(this.Leg31_L);
        this.Tail1.addChild(this.Tail2);
        this.Leg31_R.addChild(this.Leg32_R);
        this.Tail2.addChild(this.Tail3);
        this.Tail4.addChild(this.Fin5);
        this.Head.addChild(this.Fang1_R);
        this.Tail4.addChild(this.TailTip);
        this.Fang2_R.addChild(this.Fang3_R);
        this.TailTip.addChild(this.TailPincer1_R);
        this.Fang2_L.addChild(this.Fang3_L);
        this.TailTip.addChild(this.TailPincer1_L);
        this.Leg2_R.addChild(this.Leg21_R);
        this.Tail2.addChild(this.Fin2);
        this.Tail3.addChild(this.Fin4);
        this.Head.addChild(this.Fang1_L);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Leg2_R_1.render(f5);
        this.Leg3_R.render(f5);
        this.Leg3_L.render(f5);
        this.MainBody.render(f5);
        this.Leg2_L_1.render(f5);
        this.Leg2_R.render(f5);
        this.Leg2_L.render(f5);
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