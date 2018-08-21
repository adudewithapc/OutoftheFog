package org.ootf.outofthefog.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;
import org.ootf.outofthefog.util.ModelHelper;

/**
 * vastatosaurus_rex - Hjalma
 * Created using Tabula 7.0.0
 */
public class ModelVastatosaurusRex extends ModelBase {
    public ModelRenderer Hipregion;
    public ModelRenderer Leftthigh;
    public ModelRenderer Rightthigh;
    public ModelRenderer Ribcageback;
    public ModelRenderer Tail1;
    public ModelRenderer Bodyscutes3;
    public ModelRenderer Ribcagefront;
    public ModelRenderer Bodyscutes2;
    public ModelRenderer Neck1;
    public ModelRenderer Leftupperarm;
    public ModelRenderer Rightupperarm;
    public ModelRenderer Bodyscutes1;
    public ModelRenderer Neck2;
    public ModelRenderer Neckscutes2;
    public ModelRenderer Head;
    public ModelRenderer Neckscutes1;
    public ModelRenderer Upperjawback;
    public ModelRenderer Lowerjawback;
    public ModelRenderer Jawparting;
    public ModelRenderer Brow;
    public ModelRenderer Nosebridge;
    public ModelRenderer Upperjawfront;
    public ModelRenderer Upperjawteeth1;
    public ModelRenderer Upperjawteeth2;
    public ModelRenderer Lowerjawmiddle;
    public ModelRenderer Lowerjawfront;
    public ModelRenderer Lowerjawteeth1;
    public ModelRenderer Lowerjawteeth2;
    public ModelRenderer Leftlowerarm;
    public ModelRenderer Lefthand;
    public ModelRenderer Rightlowerarm;
    public ModelRenderer Righthand;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer Leftshin;
    public ModelRenderer Leftankle;
    public ModelRenderer Leftfoot;
    public ModelRenderer Rightshin;
    public ModelRenderer Rightankle;
    public ModelRenderer Rightfoot;

    public ModelVastatosaurusRex() {
        this.textureWidth = 160;
        this.textureHeight = 160;
        this.Nosebridge = new ModelRenderer(this, 100, 133);
        this.Nosebridge.setRotationPoint(0.0F, -1.2000000476837158F, -12.5F);
        this.Nosebridge.addBox(-2.5F, -2.0F, -3.5F, 5, 2, 7, 0.0F);
        this.setRotateAngle(Nosebridge, -0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerjawteeth1 = new ModelRenderer(this, 33, 134);
        this.Lowerjawteeth1.setRotationPoint(0.0F, -0.4000000059604645F, -3.0999999046325684F);
        this.Lowerjawteeth1.addBox(-4.0F, -3.0F, -4.5F, 8, 3, 7, 0.0F);
        this.setRotateAngle(Lowerjawteeth1, -0.04241150198859518F, 0.0F, 0.0F);
        this.Neck1 = new ModelRenderer(this, 0, 84);
        this.Neck1.setRotationPoint(0.0F, -1.0F, -5.4F);
        this.Neck1.addBox(-3.5F, -4.0F, -10.0F, 7, 11, 14, 0.0F);
        this.setRotateAngle(Neck1, -0.9560913642424937F, 0.0F, 0.0F);
        this.Neckscutes1 = new ModelRenderer(this, 0, 9);
        this.Neckscutes1.setRotationPoint(0.0F, -4.199999809265137F, -2.700000047683716F);
        this.Neckscutes1.addBox(-3.0F, -1.0F, -3.5F, 6, 1, 7, 0.0F);
        this.Jawparting = new ModelRenderer(this, 111, 102);
        this.Jawparting.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.Jawparting.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
        this.setRotateAngle(Jawparting, 0.2972295835988592F, 0.0F, 0.0F);
        this.Rightfoot = new ModelRenderer(this, 0, 141);
        this.Rightfoot.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Rightfoot.addBox(-4.5F, -1.0F, -7.0F, 9, 4, 11, 0.0F);
        this.setRotateAngle(Rightfoot, 0.2972295835988592F, 0.0F, 0.0F);
        this.Leftthigh = new ModelRenderer(this, 48, 54);
        this.Leftthigh.setRotationPoint(5.5F, -6.8F, 1.0F);
        this.Leftthigh.addBox(-2.0F, -2.5F, -3.5F, 7, 16, 11, 0.0F);
        this.setRotateAngle(Leftthigh, -0.2972295716146343F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 63, 93);
        this.Tail3.setRotationPoint(0.0F, 0.699999988079071F, 14.5F);
        this.Tail3.addBox(-3.0F, -3.5F, -1.0F, 6, 8, 15, 0.0F);
        this.setRotateAngle(Tail3, -0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerjawback = new ModelRenderer(this, 87, 0);
        this.Lowerjawback.setRotationPoint(0.0F, 5.699999809265137F, -0.800000011920929F);
        this.Lowerjawback.addBox(-4.5F, -1.5F, -5.5F, 9, 5, 7, 0.0F);
        this.setRotateAngle(Lowerjawback, -0.08482300397719036F, 0.0F, 0.0F);
        this.Leftshin = new ModelRenderer(this, 99, 14);
        this.Leftshin.setRotationPoint(1.5F, 11.5F, -0.5F);
        this.Leftshin.addBox(-3.0F, -1.5F, -2.0F, 6, 13, 8, 0.0F);
        this.setRotateAngle(Leftshin, 0.7641051252178287F, 0.0F, 0.0F);
        this.Bodyscutes3 = new ModelRenderer(this, 78, 133);
        this.Bodyscutes3.setRotationPoint(0.0F, -6.099999904632568F, -0.5F);
        this.Bodyscutes3.addBox(-2.0F, -1.0F, -7.0F, 4, 1, 14, 0.0F);
        this.Brow = new ModelRenderer(this, 26, 11);
        this.Brow.setRotationPoint(0.0F, -2.799999952316284F, -5.0F);
        this.Brow.addBox(-4.0F, -0.5F, -5.0F, 8, 1, 5, 0.0F);
        this.setRotateAngle(Brow, 0.169820528229565F, 0.0F, 0.0F);
        this.Upperjawteeth1 = new ModelRenderer(this, 90, 92);
        this.Upperjawteeth1.setRotationPoint(0.0F, 2.5999999046325684F, -4.800000190734863F);
        this.Upperjawteeth1.addBox(-4.0F, 0.0F, -4.0F, 8, 3, 7, 0.0F);
        this.Tail4 = new ModelRenderer(this, 34, 108);
        this.Tail4.setRotationPoint(0.0F, -0.20000000298023224F, 13.0F);
        this.Tail4.addBox(-2.0F, -2.5F, -1.0F, 4, 6, 14, 0.0F);
        this.setRotateAngle(Tail4, 0.169820528229565F, 0.0F, 0.0F);
        this.Lowerjawteeth2 = new ModelRenderer(this, 104, 120);
        this.Lowerjawteeth2.setRotationPoint(0.0F, -0.8999999761581421F, -3.0999999046325684F);
        this.Lowerjawteeth2.addBox(-3.5F, -3.0F, -3.0F, 7, 3, 6, 0.0F);
        this.setRotateAngle(Lowerjawteeth2, -0.04241150198859518F, 0.0F, 0.0F);
        this.Leftankle = new ModelRenderer(this, 119, 0);
        this.Leftankle.setRotationPoint(0.0F, 9.0F, 1.5F);
        this.Leftankle.addBox(-2.5F, -1.0F, -2.5F, 5, 12, 6, 0.0F);
        this.setRotateAngle(Leftankle, -0.7641051252178287F, 0.0F, 0.0F);
        this.Upperjawback = new ModelRenderer(this, 113, 83);
        this.Upperjawback.setRotationPoint(0.0F, -0.10000000149011612F, -5.0F);
        this.Upperjawback.addBox(-3.5F, -2.5F, -8.5F, 7, 6, 9, 0.0F);
        this.setRotateAngle(Upperjawback, 0.08482300397719036F, 0.0F, 0.0F);
        this.Rightshin = new ModelRenderer(this, 119, 27);
        this.Rightshin.setRotationPoint(-1.5F, 11.5F, -0.5F);
        this.Rightshin.addBox(-3.0F, -1.5F, -2.0F, 6, 13, 8, 0.0F);
        this.setRotateAngle(Rightshin, 0.7641051252178287F, 0.0F, 0.0F);
        this.Rightupperarm = new ModelRenderer(this, 24, 21);
        this.Rightupperarm.setRotationPoint(-5.0F, 6.0F, -7.0F);
        this.Rightupperarm.addBox(-2.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.8915142138766367F, -0.08482300397719036F, 0.169820528229565F);
        this.Leftlowerarm = new ModelRenderer(this, 38, 59);
        this.Leftlowerarm.setRotationPoint(1.399999976158142F, 3.0F, 0.0F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -1.5283848206451123F, 0.42446406875869874F, 0.12740903872453743F);
        this.Ribcageback = new ModelRenderer(this, 0, 29);
        this.Ribcageback.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Ribcageback.addBox(-7.0F, -4.0F, -9.0F, 14, 17, 11, 0.0F);
        this.setRotateAngle(Ribcageback, 0.169820528229565F, 0.0F, 0.0F);
        this.Righthand = new ModelRenderer(this, 0, 9);
        this.Righthand.setRotationPoint(0.0F, 5.5F, -0.20000000298023224F);
        this.Righthand.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Righthand, 1.018923235956417F, -0.08482300397719036F, -1.1887437641859822F);
        this.Bodyscutes1 = new ModelRenderer(this, 0, 129);
        this.Bodyscutes1.setRotationPoint(0.0F, -4.300000190734863F, -5.0F);
        this.Bodyscutes1.addBox(-4.5F, -1.0F, -3.0F, 9, 1, 11, 0.0F);
        this.setRotateAngle(Bodyscutes1, 0.04241150198859518F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new ModelRenderer(this, 38, 144);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjawmiddle.addBox(-3.5F, -1.5F, -7.5F, 7, 4, 8, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.21223203437934937F, 0.0F, 0.0F);
        this.Ribcagefront = new ModelRenderer(this, 0, 57);
        this.Ribcagefront.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.Ribcagefront.addBox(-6.0F, -4.5F, -9.0F, 12, 15, 12, 0.0F);
        this.setRotateAngle(Ribcagefront, -0.08482300397719036F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 68, 65);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 13.5F);
        this.Tail2.addBox(-4.0F, -4.0F, -1.0F, 8, 11, 16, 0.0F);
        this.setRotateAngle(Tail2, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftupperarm = new ModelRenderer(this, 13, 0);
        this.Leftupperarm.setRotationPoint(5.0F, 6.0F, -7.0F);
        this.Leftupperarm.addBox(-0.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.8915142138766367F, 0.08482300397719036F, -0.169820528229565F);
        this.Upperjawfront = new ModelRenderer(this, 0, 17);
        this.Upperjawfront.setRotationPoint(0.0F, 0.699999988079071F, -7.5F);
        this.Upperjawfront.addBox(-3.0F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.2546435405291338F, 0.0F, 0.0F);
        this.Hipregion = new ModelRenderer(this, 39, 0);
        this.Hipregion.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Hipregion.addBox(-6.5F, -6.5F, -8.0F, 13, 18, 17, 0.0F);
        this.setRotateAngle(Hipregion, -0.04241150082346221F, 0.0F, 0.0F);
        this.Leftfoot = new ModelRenderer(this, 100, 65);
        this.Leftfoot.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Leftfoot.addBox(-4.5F, -1.0F, -7.0F, 9, 4, 11, 0.0F);
        this.setRotateAngle(Leftfoot, 0.2972295835988592F, 0.0F, 0.0F);
        this.Rightankle = new ModelRenderer(this, 129, 48);
        this.Rightankle.setRotationPoint(0.0F, 9.0F, 1.5F);
        this.Rightankle.addBox(-2.5F, -1.0F, -2.5F, 5, 12, 6, 0.0F);
        this.setRotateAngle(Rightankle, -0.7641051252178287F, 0.0F, 0.0F);
        this.Neck2 = new ModelRenderer(this, 0, 109);
        this.Neck2.mirror = true;
        this.Neck2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Neck2.addBox(-4.0F, -4.5F, -8.0F, 8, 11, 9, 0.0F);
        this.setRotateAngle(Neck2, 0.7740535232594852F, 0.0F, 0.0F);
        this.Lefthand = new ModelRenderer(this, 49, 57);
        this.Lefthand.setRotationPoint(0.0F, 5.5F, -0.20000000298023224F);
        this.Lefthand.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Lefthand, 1.018923235956417F, 0.08482300397719036F, 1.1887437641859822F);
        this.Head = new ModelRenderer(this, 57, 37);
        this.Head.setRotationPoint(0.0F, -1.0F, -6.199999809265137F);
        this.Head.addBox(-5.0F, -3.5F, -5.5F, 10, 8, 6, 0.0F);
        this.setRotateAngle(Head, 0.38205256260891435F, 0.0F, 0.0F);
        this.Neckscutes2 = new ModelRenderer(this, 82, 120);
        this.Neckscutes2.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Neckscutes2.addBox(-2.5F, -1.0F, -3.5F, 5, 1, 12, 0.0F);
        this.Tail5 = new ModelRenderer(this, 91, 102);
        this.Tail5.setRotationPoint(0.0F, -0.20000000298023224F, 12.5F);
        this.Tail5.addBox(-1.5F, -1.5F, -1.0F, 3, 4, 14, 0.0F);
        this.setRotateAngle(Tail5, 0.21223203437934937F, 0.0F, 0.0F);
        this.Rightthigh = new ModelRenderer(this, 42, 81);
        this.Rightthigh.setRotationPoint(-5.5F, -6.8F, 1.0F);
        this.Rightthigh.addBox(-5.0F, -2.5F, -3.5F, 7, 16, 11, 0.0F);
        this.setRotateAngle(Rightthigh, -0.2972295716146343F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 73, 35);
        this.Tail1.setRotationPoint(0.0F, -0.699999988079071F, 8.0F);
        this.Tail1.addBox(-5.0F, -5.0F, -1.0F, 10, 14, 16, 0.0F);
        this.setRotateAngle(Tail1, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightlowerarm = new ModelRenderer(this, 0, 0);
        this.Rightlowerarm.setRotationPoint(-1.399999976158142F, 3.0F, 0.0F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -1.5283848206451123F, -0.42446406875869874F, -0.12740903872453743F);
        this.Upperjawteeth2 = new ModelRenderer(this, 64, 122);
        this.Upperjawteeth2.setRotationPoint(0.0F, 2.0999999046325684F, -3.4000000953674316F);
        this.Upperjawteeth2.addBox(-3.5F, 0.0F, -3.0F, 7, 3, 6, 0.0F);
        this.setRotateAngle(Upperjawteeth2, 0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjawfront = new ModelRenderer(this, 30, 0);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.10000000149011612F, -7.5F);
        this.Lowerjawfront.addBox(-3.0F, -1.5F, -6.0F, 6, 3, 7, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.21223203437934937F, 0.0F, 0.0F);
        this.Bodyscutes2 = new ModelRenderer(this, 60, 134);
        this.Bodyscutes2.setRotationPoint(0.0F, -4.0F, -3.5F);
        this.Bodyscutes2.addBox(-3.0F, -1.0F, -5.0F, 6, 1, 10, 0.0F);
        this.Head.addChild(this.Nosebridge);
        this.Lowerjawmiddle.addChild(this.Lowerjawteeth1);
        this.Ribcagefront.addChild(this.Neck1);
        this.Neck2.addChild(this.Neckscutes1);
        this.Head.addChild(this.Jawparting);
        this.Rightankle.addChild(this.Rightfoot);
        this.Tail2.addChild(this.Tail3);
        this.Head.addChild(this.Lowerjawback);
        this.Leftthigh.addChild(this.Leftshin);
        this.Hipregion.addChild(this.Bodyscutes3);
        this.Head.addChild(this.Brow);
        this.Upperjawback.addChild(this.Upperjawteeth1);
        this.Tail3.addChild(this.Tail4);
        this.Lowerjawfront.addChild(this.Lowerjawteeth2);
        this.Leftshin.addChild(this.Leftankle);
        this.Head.addChild(this.Upperjawback);
        this.Rightthigh.addChild(this.Rightshin);
        this.Ribcagefront.addChild(this.Rightupperarm);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Hipregion.addChild(this.Ribcageback);
        this.Rightlowerarm.addChild(this.Righthand);
        this.Ribcagefront.addChild(this.Bodyscutes1);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Ribcageback.addChild(this.Ribcagefront);
        this.Tail1.addChild(this.Tail2);
        this.Ribcagefront.addChild(this.Leftupperarm);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Leftankle.addChild(this.Leftfoot);
        this.Rightshin.addChild(this.Rightankle);
        this.Neck1.addChild(this.Neck2);
        this.Leftlowerarm.addChild(this.Lefthand);
        this.Neck2.addChild(this.Head);
        this.Neck1.addChild(this.Neckscutes2);
        this.Tail4.addChild(this.Tail5);
        this.Hipregion.addChild(this.Tail1);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Upperjawfront.addChild(this.Upperjawteeth2);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Ribcageback.addChild(this.Bodyscutes2);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        Leftthigh.rotateAngleX = ModelHelper.getDefaultXLeftLimbRotation(limbSwing, limbSwingAmount) - 0.29722956f;
        Rightthigh.rotateAngleX = ModelHelper.getDefaultXRightLimbRotation(limbSwing, limbSwingAmount) - 0.29722956f;

        EntityVastatosaurusRex vastatosaurusRex = (EntityVastatosaurusRex) entity;
        if(vastatosaurusRex.isAdolescent())
        {
            GlStateManager.scale(1.3, 1.3, 1.3);
        }
        else if(!vastatosaurusRex.isChild())
        {
            GlStateManager.scale(2.5, 2.5, 2.5);
            GlStateManager.translate(0, -1, 0);
        }

        this.Leftthigh.render(scale);
        this.Hipregion.render(scale);
        this.Rightthigh.render(scale);
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
