package org.jurassicraft.common.dinosaur;

import org.jurassicraft.common.entity.EntitySegisaurus;
import org.jurassicraft.common.entity.base.EntityDinosaur;
import org.jurassicraft.common.entity.base.EnumGrowthStage;
import org.jurassicraft.common.period.EnumTimePeriod;

public class DinosaurSegisaurus extends Dinosaur
{
    private String[] maleTextures;
    private String[] femaleTextures;

    private String[] maleOverlayTextures;
    private String[] femaleOverlayTextures;

    public DinosaurSegisaurus()
    {
        this.maleTextures = new String[]{getDinosaurTexture("male")};
        this.femaleTextures = new String[]{getDinosaurTexture("female")};

        this.maleOverlayTextures = new String[]{getDinosaurTexture("male_detail")};
        this.femaleOverlayTextures = new String[]{getDinosaurTexture("female_detail")};
    }

    // TODO: Figure out all the entities properties

    @Override
    public String getName(int geneticVariant)
    {
        return "Segisaurus";
    }

    @Override
    public Class<? extends EntityDinosaur> getDinosaurClass()
    {
        return EntitySegisaurus.class;
    }

    @Override
    public EnumTimePeriod getPeriod()
    {
        return EnumTimePeriod.JURASSIC;
    }

    @Override
    public int getEggPrimaryColor()
    {
        return 0x834B4C;
    }

    @Override
    public int getEggSecondaryColor()
    {
        return 0x4B8FB5;
    }

    @Override
    public double getBabyHealth()
    {
        return 16;
    }

    @Override
    public double getAdultHealth()
    {
        return 30;
    }

    @Override
    public double getBabySpeed()
    {
        return 0.46;
    }

    @Override
    public double getAttackSpeed()
    {
        return 0.50;
    }

    @Override
    public double getAdultSpeed()
    {
        return 0.40;
    }

    @Override
    public double getBabyStrength()
    {
        return 6;
    }

    @Override
    public double getAdultStrength()
    {
        return 36;
    }

    @Override
    public double getBabyKnockback()
    {
        return 0.3;
    }

    @Override
    public double getAdultKnockback()
    {
        return 0.6;
    }

    @Override
    public int getMaximumAge()
    {
        return fromDays(30);
    }

    @Override
    public String[] getMaleTextures(int geneticVariant, EnumGrowthStage stage)
    {
        return maleTextures;
    }

    @Override
    public String[] getFemaleTextures(int geneticVariant, EnumGrowthStage stage)
    {
        return femaleTextures;
    }

    @Override
    public String[] getMaleOverlayTextures(int geneticVariant, EnumGrowthStage stage)
    {
        return maleOverlayTextures;
    }

    @Override
    public String[] getFemaleOverlayTextures(int geneticVariant, EnumGrowthStage stage)
    {
        return femaleOverlayTextures;
    }

    @Override
    public float getBabyEyeHeight()
    {
        return 0.3F;
    }

    @Override
    public float getAdultEyeHeight()
    {
        return 0.85F;
    }

    @Override
    public float getBabySizeX()
    {
        return 0.3F;
    }

    @Override
    public float getBabySizeY()
    {
        return 0.4F;
    }

    @Override
    public float getAdultSizeX()
    {
        return 0.5F;
    }

    @Override
    public float getAdultSizeY()
    {
        return 0.85F;
    }

    @Override
    public int getStorage()
    {
        return 9;
    }
}