/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigTitleSection
 *  net.runelite.client.config.Keybind
 *  net.runelite.client.config.Range
 *  net.runelite.client.config.Title
 *  net.runelite.client.config.Units
 */
package net.runelite.client.plugins.DeadZoneAutoSpec;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitleSection;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.Range;
import net.runelite.client.config.Title;
import net.runelite.client.config.Units;
import net.runelite.client.plugins.DeadZoneAutoSpec.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2;

@ConfigGroup(value="DZAutoSpecConfig")
public interface AB1CaddDEdaHI12361JKLM8NO3ka5gw
extends Config {
    @ConfigTitleSection(keyName="specConfigOne", name="Auto-Spec Config", position=0, description="")
    default public Title AB1CaddDEdaHI12361JKLM8NO3ka5gw() {
        return new Title();
    }

    @ConfigItem(keyName="specOneEnabled", name="Enabled", position=0, description="Determines if this configuration is enabled", titleSection="specConfigOne")
    default public boolean DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178() {
        return false;
    }

    @ConfigItem(keyName="specOneManualKey", name="Manual Key", description="Press to manually execute the special attack", position=1, titleSection="specConfigOne")
    default public Keybind JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2() {
        return new Keybind(97, 0);
    }

    @ConfigItem(keyName="specOneXPDrop", name="XP Drop", position=2, description="Determine which XP drop to match threshold when executing automatic swap", titleSection="specConfigOne")
    default public JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2 jkld2369IJgha561gkkbcFdaw1fa5def() {
        return JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178;
    }

    @ConfigItem(keyName="specOneXPThreshold", name="XP Threshold", description="When the XP threshold is detected using the above XP method, execute Auto-Spec", position=3, titleSection="specConfigOne")
    default public int PQRS23TgasdUVWX114666ce13Abefgh93f9awdf() {
        return 45;
    }

    @ConfigItem(keyName="specOneSpecType", name="Spec Type", position=4, description="Determine what type of special attack to use", titleSection="specConfigOne")
    default public DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 asgn2kd1p2no455mnop2dqrstuvwxyz111146() {
        return DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.AB1CaddDEdaHI12361JKLM8NO3ka5gw;
    }

    @ConfigItem(keyName="specOneReqPercent", name="Spec Req Percentage", position=5, description="The required special percentage available to trigger Auto-Spec", titleSection="specConfigOne")
    @Units(value="%")
    @Range(min=10, max=100)
    default public int jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq() {
        return 100;
    }

    @ConfigItem(keyName="specOneToPercent", name="Spec To Percentage", position=6, description="The special attack percentage to automatically spec to when using the continued spec method", titleSection="specConfigOne", hidden=true, unhide="specOneSpecType", unhideValue="Continued")
    @Units(value="%")
    @Range(min=0, max=90)
    default public int cdefghi367869abcdefhJKL1234AB1Cad() {
        return 50;
    }

    @ConfigItem(keyName="specOnePrayerManagement", name="Prayer Management", position=7, description="Determine what type of prayer management you would like to use", titleSection="specConfigOne")
    default public AB1CaddDEdaHI12361JKLM8NO3ka5gw vwxyzQdw3RSTUVwxyz11114XYZ1234() {
        return AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw;
    }

    @ConfigItem(keyName="specOneTogglePrayer", name="Prayers", position=8, description="Enter Prayer Names separated by a comma", titleSection="specConfigOne", hidden=true, unhide="specOnePrayerManagement", unhideValue="Custom")
    default public String s6641asgn2kd1dasgha1333() {
        return "";
    }

    @ConfigItem(keyName="specOneUseSpecificWeapon", name="Use Trigger Weapons", position=9, description="Determines if the Auto-Spec should only be activated using a specific trigger weapons", titleSection="specConfigOne")
    default public boolean nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3() {
        return false;
    }

    @ConfigItem(keyName="specOneSpecificWeapon", name="Trigger Weapons", description="Enter the IDs of the trigger weapons to use seperated by a comma", position=10, titleSection="specConfigOne")
    default public String stuvwxdwyz1111EFda123ghaswGHIOP() {
        return "";
    }

    @ConfigItem(keyName="specOneSwapGear", name="Swap Gear", position=11, description="Determines if the plugin should automatically swap gear", titleSection="specConfigOne")
    default public boolean FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23() {
        return false;
    }

    @ConfigItem(keyName="specOneGear", name="Gear to Swap", description="Enter the IDs of the gear you want to swap separated by a comma", position=12, titleSection="specConfigOne")
    default public String IOPQRSTUV4abcdefgJKLM8NO3ka5gM8() {
        return "";
    }

    @ConfigItem(keyName="specSecondarySwapGear", name="Use Secondary Swap Gear", position=13, description="Determines if the plugin should automatically swap gear after the first spec", titleSection="specConfigOne", hidden=true, unhide="specOneSpecType", unhideValue="Continued")
    default public boolean VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3() {
        return false;
    }

    @ConfigItem(keyName="specSecondaryOneGear", name="Secondary Swap Gear", description="Enter the IDs of the gear you want to swap separated by a comma", position=14, titleSection="specConfigOne", hidden=true, unhide="specOneSpecType", unhideValue="Continued")
    default public String AB35raDWsFGHda212365IJKL12tfa1MNO() {
        return "";
    }

    @ConfigTitleSection(keyName="revSpecConfig", name="Reverse Swap Config", position=2, description="")
    default public Title dIJgha561gkkbcFdaw1fa5def() {
        return new Title();
    }

    @ConfigItem(keyName="revSpecEnabled", name="Enabled", position=0, description="Determines if this configuration is enabled", titleSection="revSpecConfig")
    default public boolean PQRS23TUVWX112e4666ce13Abefghi893f9awdf() {
        return false;
    }

    @ConfigItem(keyName="revSpecPrayerManagement", name="Prayer Management", position=7, description="Determine what type of prayer management you would like to use", titleSection="revSpecConfig")
    default public AB1CaddDEdaHI12361JKLM8NO3ka5gw asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146() {
        return AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw;
    }

    @ConfigItem(keyName="revSpecCustomPrayers", name="Prayers", position=8, description="Enter Prayer Names separated by a comma", titleSection="revSpecConfig", hidden=true, unhide="revSpecPrayerManagement", unhideValue="Custom")
    default public String UVasWXYd2aZ123456fhg581dafl2FFfawff() {
        return "";
    }

    @ConfigItem(keyName="revAttackPlayer", name="Auto-Attack Player", position=1, description="Determines if the plugin should automatically attack the target player after a reverse gear swap", titleSection="revSpecConfig")
    default public boolean fas3a5580asgn2ksgnkdag580asgn2kd1dafl() {
        return false;
    }

    @ConfigItem(keyName="revSpecSwapGear", name="Swap Gear", position=2, description="Determines if the plugin should automatically swap gear", titleSection="revSpecConfig")
    default public boolean fl2FFdaw16ffa5Vg580asg1234ABn2kd1dafl2F() {
        return false;
    }

    @ConfigItem(keyName="revSpecGear", name="Reverse Gear to Swap", description="Enter the IDs of the gear you want to swap separated by a comma", position=3, titleSection="revSpecConfig")
    default public String CDEs6FGHdDE6FGw3DE6FGw3gHIJ() {
        return "";
    }

    public static enum AB1CaddDEdaHI12361JKLM8NO3ka5gw {
        AB1CaddDEdaHI12361JKLM8NO3ka5gw,
        DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178,
        JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2;

    }

    public static enum DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 {
        AB1CaddDEdaHI12361JKLM8NO3ka5gw,
        DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178,
        JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2;

    }
}

