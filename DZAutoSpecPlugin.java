/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.VarPlayer
 *  net.runelite.api.Varbits
 *  net.runelite.api.events.FakeXpDrop
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.InteractingChanged
 *  net.runelite.api.events.PlayerDespawned
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.DeadZoneAPI.DeadZoneAPI
 *  net.runelite.client.plugins.DeadZoneAPI.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8
 *  net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP
 *  net.runelite.client.plugins.DeadZoneAPI.vwxyzQdw3RSTUVwxyz11114XYZ1234
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDependency
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.PluginType
 *  net.runelite.client.util.ColorUtil
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.runelite.client.plugins.DeadZoneAutoSpec;

import com.google.inject.Provides;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.DeadZoneAPI.DeadZoneAPI;
import net.runelite.client.plugins.DeadZoneAPI.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8;
import net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP;
import net.runelite.client.plugins.DeadZoneAPI.vwxyzQdw3RSTUVwxyz11114XYZ1234;
import net.runelite.client.plugins.DeadZoneAutoSpec.AB1CaddDEdaHI12361JKLM8NO3ka5gw;
import net.runelite.client.plugins.DeadZoneAutoSpec.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178;
import net.runelite.client.plugins.DeadZoneAutoSpec.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.ColorUtil;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Extension
@PluginDescriptor(name="DZ Auto Spec", description="Configure Auto Spec", tags={"deadzone", "pvp", "helper", "kill"}, type=PluginType.PVP, enabledByDefault=false)
@PluginDependency(value=DeadZoneAPI.class)
public class DZAutoSpecPlugin
extends Plugin
implements KeyListener {
    private static final Logger DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 = LoggerFactory.getLogger(DZAutoSpecPlugin.class);
    @Inject
    private Client JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2;
    @Inject
    private DeadZoneAPI jkld2369IJgha561gkkbcFdaw1fa5def;
    @Inject
    private AB1CaddDEdaHI12361JKLM8NO3ka5gw PQRS23TgasdUVWX114666ce13Abefgh93f9awdf;
    @Inject
    private stuvwxdwyz1111EFda123ghaswGHIOP asgn2kd1p2no455mnop2dqrstuvwxyz111146;
    @Inject
    private KeyManager jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq;
    @Inject
    private IOPQRSTUV4abcdefgJKLM8NO3ka5gM8 cdefghi367869abcdefhJKL1234AB1Cad;
    private String vwxyzQdw3RSTUVwxyz11114XYZ1234;
    private ScheduledExecutorService s6641asgn2kd1dasgha1333;
    private boolean nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = false;
    private boolean stuvwxdwyz1111EFda123ghaswGHIOP = false;
    private boolean FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = false;
    private int IOPQRSTUV4abcdefgJKLM8NO3ka5gM8;
    private Player VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3;
    private final List<DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178> AB35raDWsFGHda212365IJKL12tfa1MNO = new LinkedList<DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178>();
    public int AB1CaddDEdaHI12361JKLM8NO3ka5gw = -1;
    private int dIJgha561gkkbcFdaw1fa5def = 0;
    private int PQRS23TUVWX112e4666ce13Abefghi893f9awdf = 0;
    private int asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 = 0;
    private int UVasWXYd2aZ123456fhg581dafl2FFfawff = 0;

    @Provides
    private static AB1CaddDEdaHI12361JKLM8NO3ka5gw AB1CaddDEdaHI12361JKLM8NO3ka5gw(ConfigManager configManager) {
        return (AB1CaddDEdaHI12361JKLM8NO3ka5gw)configManager.getConfig(AB1CaddDEdaHI12361JKLM8NO3ka5gw.class);
    }

    protected void startUp() {
        this.jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq.registerKeyListener((KeyListener)this);
        this.s6641asgn2kd1dasgha1333 = this.jkld2369IJgha561gkkbcFdaw1fa5def.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178;
        this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = false;
        this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = false;
        this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
        this.AB1CaddDEdaHI12361JKLM8NO3ka5gw = -1;
        this.vwxyzQdw3RSTUVwxyz11114XYZ1234 = ColorUtil.wrapWithColorTag((String)"| ", (Color)Color.yellow) + ColorUtil.wrapWithColorTag((String)"Auto Spec", (Color)Color.green) + ColorUtil.wrapWithColorTag((String)" | ", (Color)Color.yellow);
        this.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
        try {
            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getLocalPlayer() != null) {
                this.dIJgha561gkkbcFdaw1fa5def = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.HITPOINTS);
                this.PQRS23TUVWX112e4666ce13Abefghi893f9awdf = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.ATTACK);
                this.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.STRENGTH);
                this.UVasWXYd2aZ123456fhg581dafl2FFfawff = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.RANGED);
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.stuvwxdwyz1111EFda123ghaswGHIOP = true;
    }

    protected void shutDown() {
        this.jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq.unregisterKeyListener((KeyListener)this);
        this.stuvwxdwyz1111EFda123ghaswGHIOP = false;
    }

    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(GameTick event) {
        if (this.AB1CaddDEdaHI12361JKLM8NO3ka5gw >= 0) {
            if (this.AB1CaddDEdaHI12361JKLM8NO3ka5gw + 1 >= 5) {
                this.AB1CaddDEdaHI12361JKLM8NO3ka5gw = -1;
                return;
            }
            ++this.AB1CaddDEdaHI12361JKLM8NO3ka5gw;
        }
    }

    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(ConfigChanged event) {
        if (event.getGroup().equals("DZAutoSpecConfig")) {
            this.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw() {
        this.AB35raDWsFGHda212365IJKL12tfa1MNO.clear();
        try {
            void var2_3;
            int[] specificWeapon = new int[]{};
            if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3() && this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.stuvwxdwyz1111EFda123ghaswGHIOP().trim().length() > 0 && (specificWeapon = net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP.AB1CaddDEdaHI12361JKLM8NO3ka5gw((String)this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.stuvwxdwyz1111EFda123ghaswGHIOP())).length <= 0) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to register PVP Types! Invalid Trigger Weapons!");
                return;
            }
            List<Object> prayerMap = new LinkedList();
            if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.vwxyzQdw3RSTUVwxyz11114XYZ1234().equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178) && this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.s6641asgn2kd1dasgha1333().trim().length() > 0) {
                DZAutoSpecPlugin dZAutoSpecPlugin = this;
                prayerMap = dZAutoSpecPlugin.AB1CaddDEdaHI12361JKLM8NO3ka5gw(dZAutoSpecPlugin.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.s6641asgn2kd1dasgha1333());
                if (prayerMap.size() <= 0) {
                    DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to register PVP Types! Invalid Custom Prayers!");
                    return;
                }
            }
            this.AB35raDWsFGHda212365IJKL12tfa1MNO.add(new DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178(this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2().getKeyCode(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.jkld2369IJgha561gkkbcFdaw1fa5def(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.asgn2kd1p2no455mnop2dqrstuvwxyz111146(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.cdefghi367869abcdefhJKL1234AB1Cad(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3(), specificWeapon, this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8(), this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.vwxyzQdw3RSTUVwxyz11114XYZ1234(), (List<vwxyzQdw3RSTUVwxyz11114XYZ1234>)var2_3));
            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Successfully registered PvP Config!");
            return;
        }
        catch (Exception e) {
            void var1_2;
            this.AB35raDWsFGHda212365IJKL12tfa1MNO.clear();
            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to register PVP Types!");
            var1_2.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<vwxyzQdw3RSTUVwxyz11114XYZ1234> AB1CaddDEdaHI12361JKLM8NO3ka5gw(String prayerItems) {
        void var2_2;
        void var1_1;
        String[] prayerNames = net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178((String)prayerItems);
        LinkedList<vwxyzQdw3RSTUVwxyz11114XYZ1234> prayersMapped = new LinkedList<vwxyzQdw3RSTUVwxyz11114XYZ1234>();
        for (void var5_5 : var1_1) {
            String prayer = var5_5.trim();
            try {
                prayersMapped.add(net.runelite.client.plugins.DeadZoneAPI.vwxyzQdw3RSTUVwxyz11114XYZ1234.valueOf((String)prayer.toUpperCase().replace(" ", "_")));
            }
            catch (Exception exception) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to create valid Prayer List!");
                break;
            }
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(GameStateChanged event) {
        void var1_1;
        if (event.getGameState() == GameState.LOGGED_IN) {
            this.dIJgha561gkkbcFdaw1fa5def = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.HITPOINTS);
            this.PQRS23TUVWX112e4666ce13Abefghi893f9awdf = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.ATTACK);
            this.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.STRENGTH);
            this.UVasWXYd2aZ123456fhg581dafl2FFfawff = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.RANGED);
            return;
        }
        if (var1_1.getGameState() == GameState.LOGIN_SCREEN) {
            this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(FakeXpDrop event) {
        if (!this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 && this.AB1CaddDEdaHI12361JKLM8NO3ka5gw == -1 && this.s6641asgn2kd1dasgha1333 != null && this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 != null && this.jkld2369IJgha561gkkbcFdaw1fa5def.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2()) {
            if (Objects.requireNonNull(this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getLocalPlayer()).getWorldLocation().distanceTo(this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3.getWorldLocation()) > 3500) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Detected Target Player no longer within distance!");
                this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
                return;
            }
            if (event.getSkill().equals((Object)Skill.ATTACK) || event.getSkill().equals((Object)Skill.STRENGTH) || event.getSkill().equals((Object)Skill.RANGED)) {
                for (DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 type : this.AB35raDWsFGHda212365IJKL12tfa1MNO) {
                    void var3_3;
                    List equippedWeapon;
                    if (!type.AB1CaddDEdaHI12361JKLM8NO3ka5gw || type.cdefghi367869abcdefhJKL1234AB1Cad && (equippedWeapon = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2(type.vwxyzQdw3RSTUVwxyz11114XYZ1234)) != null && equippedWeapon.size() <= 0 || this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) < type.asgn2kd1p2no455mnop2dqrstuvwxyz111146 * 10 || !event.getSkill().equals((Object)type.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.AB1CaddDEdaHI12361JKLM8NO3ka5gw()) && !type.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.equals((Object)net.runelite.client.plugins.DeadZoneAutoSpec.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.AB1CaddDEdaHI12361JKLM8NO3ka5gw) || event.getXp() + Math.round((float)event.getXp() / 4.0f) < type.jkld2369IJgha561gkkbcFdaw1fa5def) continue;
                    this.AB1CaddDEdaHI12361JKLM8NO3ka5gw((DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178)var3_3);
                    return;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(StatChanged event) {
        if (!this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 && this.AB1CaddDEdaHI12361JKLM8NO3ka5gw == -1 && this.s6641asgn2kd1dasgha1333 != null && this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 != null && this.jkld2369IJgha561gkkbcFdaw1fa5def.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2()) {
            if (Objects.requireNonNull(this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getLocalPlayer()).getWorldLocation().distanceTo(this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3.getWorldLocation()) > 8000) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Detected Target Player no longer within distance!");
                this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
                return;
            }
            if (event.getSkill().equals((Object)Skill.ATTACK) || event.getSkill().equals((Object)Skill.STRENGTH) || event.getSkill().equals((Object)Skill.RANGED)) {
                for (DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 type : this.AB35raDWsFGHda212365IJKL12tfa1MNO) {
                    List equippedWeapon;
                    if (!type.AB1CaddDEdaHI12361JKLM8NO3ka5gw || !event.getSkill().equals((Object)type.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.AB1CaddDEdaHI12361JKLM8NO3ka5gw()) && !type.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.equals((Object)net.runelite.client.plugins.DeadZoneAutoSpec.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.AB1CaddDEdaHI12361JKLM8NO3ka5gw) || type.cdefghi367869abcdefhJKL1234AB1Cad && (equippedWeapon = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2(type.vwxyzQdw3RSTUVwxyz11114XYZ1234)) != null && equippedWeapon.size() <= 0 || this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) < type.asgn2kd1p2no455mnop2dqrstuvwxyz111146 * 10) continue;
                    int healthDifference = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.HITPOINTS) - this.dIJgha561gkkbcFdaw1fa5def;
                    switch (event.getSkill()) {
                        case ATTACK: {
                            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.ATTACK) - this.PQRS23TUVWX112e4666ce13Abefghi893f9awdf + healthDifference < type.jkld2369IJgha561gkkbcFdaw1fa5def) break;
                            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Attack XP Trigger: " + (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.ATTACK) - this.PQRS23TUVWX112e4666ce13Abefghi893f9awdf + healthDifference));
                            this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(type);
                            return;
                        }
                        case STRENGTH: {
                            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.STRENGTH) - this.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 + healthDifference < type.jkld2369IJgha561gkkbcFdaw1fa5def) break;
                            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Strength XP Trigger: " + (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.STRENGTH) - this.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 + healthDifference));
                            this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(type);
                            return;
                        }
                        case RANGED: {
                            void var3_3;
                            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.RANGED) - this.UVasWXYd2aZ123456fhg581dafl2FFfawff + healthDifference < type.jkld2369IJgha561gkkbcFdaw1fa5def) break;
                            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Ranged XP Trigger: " + (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.RANGED) - this.UVasWXYd2aZ123456fhg581dafl2FFfawff + healthDifference));
                            this.AB1CaddDEdaHI12361JKLM8NO3ka5gw((DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178)var3_3);
                            return;
                        }
                    }
                }
            }
        }
        this.dIJgha561gkkbcFdaw1fa5def = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.HITPOINTS);
        this.PQRS23TUVWX112e4666ce13Abefghi893f9awdf = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.ATTACK);
        this.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146 = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.STRENGTH);
        this.UVasWXYd2aZ123456fhg581dafl2FFfawff = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getSkillExperience(Skill.RANGED);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(InteractingChanged event) {
        if (event.getSource() instanceof Player && event.getTarget() instanceof Player) {
            void var2_2;
            Player SourcePlayer = (Player)event.getSource();
            Player TargetPlayer = (Player)event.getTarget();
            if (var2_2 == this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getLocalPlayer() && this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 != TargetPlayer) {
                void var1_1;
                this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = var1_1;
            }
        }
    }

    @Subscribe
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(PlayerDespawned event) {
        if (event.getPlayer().equals((Object)this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3)) {
            this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void AB1CaddDEdaHI12361JKLM8NO3ka5gw(DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 type) {
        void var2_2;
        void var1_1;
        DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Executing PVP Swap!");
        if (this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 == null) {
            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("No valid target found!");
            this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.addChatMessage(ChatMessageType.GAMEMESSAGE, "", this.vwxyzQdw3RSTUVwxyz11114XYZ1234 + "Failed to find Valid Target!", null);
            return;
        }
        long delayAmount = 0L;
        this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = true;
        if (type.s6641asgn2kd1dasgha1333 && type.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3.length() > 0) {
            delayAmount = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(type.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3, 0L);
        }
        if (type.stuvwxdwyz1111EFda123ghaswGHIOP.equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2)) {
            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(Varbits.QUICK_PRAYER) == 0) {
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 0xA0000E, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount, TimeUnit.MILLISECONDS);
                delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
            }
        } else if (type.stuvwxdwyz1111EFda123ghaswGHIOP.equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178)) {
            delayAmount = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(type.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23, delayAmount);
        }
        delayAmount = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(type.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf, delayAmount);
        this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = true;
        this.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8 = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT);
        delayAmount = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(delayAmount);
        this.s6641asgn2kd1dasgha1333.schedule(() -> this.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178((DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178)var1_1), (long)var2_2, TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - void declaration
     */
    private long AB1CaddDEdaHI12361JKLM8NO3ka5gw(List<vwxyzQdw3RSTUVwxyz11114XYZ1234> prayers, long delayAmount) {
        void var2_2;
        for (vwxyzQdw3RSTUVwxyz11114XYZ1234 prayer : prayers) {
            Prayer p = Prayer.valueOf((String)prayer.AB1CaddDEdaHI12361JKLM8NO3ka5gw().toUpperCase().replace(" ", "_"));
            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.isPrayerActive(p)) continue;
            this.s6641asgn2kd1dasgha1333.schedule(() -> {
                void var1_1;
                MenuEntry entry = new MenuEntry("", "", 1, 57, -1, prayer.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178(), true);
                this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
            }, delayAmount, TimeUnit.MILLISECONDS);
            delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
        }
        return (long)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private long AB1CaddDEdaHI12361JKLM8NO3ka5gw(String gearToSwap, long delayAmount) {
        void var2_3;
        try {
            Object ids = net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP.AB1CaddDEdaHI12361JKLM8NO3ka5gw((String)gearToSwap);
            List list = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw((int[])ids);
            ids = list;
            ids = list.iterator();
            while (ids.hasNext()) {
                Item item = (Item)ids.next();
                int finalItemPosition = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178(item.getId());
                if (finalItemPosition == -1) continue;
                this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = true;
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    void var2_2;
                    MenuEntry entry = new MenuEntry("", "", item.getId(), 34, (int)var2_2, 0x950000, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount, TimeUnit.MILLISECONDS);
                delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
            }
        }
        catch (Exception e) {
            void var1_2;
            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to swap gear!");
            this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.addChatMessage(ChatMessageType.GAMEMESSAGE, "", this.vwxyzQdw3RSTUVwxyz11114XYZ1234 + "Failed to swap gear!", null);
            var1_2.printStackTrace();
        }
        return (long)var2_3;
    }

    /*
     * WARNING - void declaration
     */
    private long AB1CaddDEdaHI12361JKLM8NO3ka5gw(AB1CaddDEdaHI12361JKLM8NO3ka5gw.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 type, long delayAmount) {
        void var2_2;
        void var1_1;
        switch (1.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178[var1_1.ordinal()]) {
            case 1: 
            case 2: {
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 38862884, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount, TimeUnit.MILLISECONDS);
                delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
                break;
            }
            case 3: {
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 38862884, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount, TimeUnit.MILLISECONDS);
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 38862884, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount += (long)net.runelite.client.plugins.DeadZoneAPI.stuvwxdwyz1111EFda123ghaswGHIOP.jkld2369IJgha561gkkbcFdaw1fa5def((int)40, (int)60), TimeUnit.MILLISECONDS);
                delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
            }
        }
        return (long)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private long AB1CaddDEdaHI12361JKLM8NO3ka5gw(long delayAmount) {
        void var1_1;
        if (this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 != null) {
            try {
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3.getPlayerId(), 45, 0, 0, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delayAmount, TimeUnit.MILLISECONDS);
                delayAmount += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
            }
            catch (Exception e) {
                void var3_2;
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to find target player!");
                this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.addChatMessage(ChatMessageType.GAMEMESSAGE, "", this.vwxyzQdw3RSTUVwxyz11114XYZ1234 + "Failed to find target player!", null);
                var3_2.printStackTrace();
            }
        }
        return (long)var1_1;
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    /*
     * WARNING - void declaration
     */
    public void keyPressed(KeyEvent keyEvent) {
        void var1_1;
        if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getGameState() == GameState.LOGGED_IN && this.s6641asgn2kd1dasgha1333 != null && this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 != null && !this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 && this.AB1CaddDEdaHI12361JKLM8NO3ka5gw == -1 && this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2().matches((KeyEvent)var1_1) && this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getCanvas().hasFocus() && this.AB35raDWsFGHda212365IJKL12tfa1MNO.size() > 0) {
            DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Manual Key Used!");
            if (Objects.requireNonNull(this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getLocalPlayer()).getWorldLocation().distanceTo(this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3.getWorldLocation()) > 8000) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Detected Target Player no longer within distance!");
                this.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3 = null;
                return;
            }
            try {
                DZAutoSpecPlugin dZAutoSpecPlugin = this;
                dZAutoSpecPlugin.AB1CaddDEdaHI12361JKLM8NO3ka5gw(dZAutoSpecPlugin.AB35raDWsFGHda212365IJKL12tfa1MNO.get(0));
                return;
            }
            catch (Exception exception) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Failed to Execute PVP Swap through Manuel Key!");
            }
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
    }

    private /* synthetic */ void DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178(DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178 type) {
        int currentRetry = 0;
        boolean secondarySwap = false;
        boolean continuedSpecType = type.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2);
        while (true) {
            if (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) <= 0 || this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) <= type.jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq * 10 && continuedSpecType || !continuedSpecType && this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) < type.asgn2kd1p2no455mnop2dqrstuvwxyz111146 * 10) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Handling Auto-Spec Termination!");
                long delay = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw() << 1;
                if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.PQRS23TUVWX112e4666ce13Abefghi893f9awdf()) {
                    if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.fl2FFdaw16ffa5Vg580asg1234ABn2kd1dafl2F()) {
                        DZAutoSpecPlugin dZAutoSpecPlugin = this;
                        delay = dZAutoSpecPlugin.AB1CaddDEdaHI12361JKLM8NO3ka5gw(dZAutoSpecPlugin.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.CDEs6FGHdDE6FGw3DE6FGw3gHIJ(), delay);
                    }
                    if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146().equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2)) {
                        this.s6641asgn2kd1dasgha1333.schedule(() -> {
                            void var1_1;
                            MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 0xA0000E, true);
                            this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                        }, delay, TimeUnit.MILLISECONDS);
                        delay += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
                    } else if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.asgn2kd1p2nopda2kd1dafl2Fqrstuxyz111146().equals((Object)AB1CaddDEdaHI12361JKLM8NO3ka5gw.AB1CaddDEdaHI12361JKLM8NO3ka5gw.DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178)) {
                        List<vwxyzQdw3RSTUVwxyz11114XYZ1234> prayerMap = new LinkedList<vwxyzQdw3RSTUVwxyz11114XYZ1234>();
                        if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.UVasWXYd2aZ123456fhg581dafl2FFfawff().trim().length() > 0) {
                            DZAutoSpecPlugin dZAutoSpecPlugin = this;
                            prayerMap = dZAutoSpecPlugin.AB1CaddDEdaHI12361JKLM8NO3ka5gw(dZAutoSpecPlugin.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.UVasWXYd2aZ123456fhg581dafl2FFfawff());
                        }
                        delay = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(prayerMap, delay);
                    }
                    if (this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.fas3a5580asgn2ksgnkdag580asgn2kd1dafl()) {
                        delay = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(delay);
                    }
                }
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    this.AB1CaddDEdaHI12361JKLM8NO3ka5gw = 0;
                    this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = false;
                    this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = false;
                }, delay, TimeUnit.MILLISECONDS);
                return;
            }
            if (this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 && (this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_ENABLED) == 1 || this.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8 != this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT))) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Detected Active Spec, disabling CantEnableSpec!");
                this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = false;
            }
            if (continuedSpecType && !this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 && this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) > type.jkl2dawd345O3kd5a5gM8NO3ka5gwP5mnop2dq * 10 && this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_ENABLED) == 0) {
                DEFGvsdHI1sfggwPQRSTUdfVop2qrstuz178.info("Handling Continued Spec!");
                this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = true;
                this.IOPQRSTUV4abcdefgJKLM8NO3ka5gM8 = this.JKaFLM8NO3ka5g12M8NO3ka5gwPQRS2.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT);
                long delay = this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
                if (!secondarySwap && this.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.VWXcdefghi3FGYZ13Ab3558933gHIJKLM8NO3()) {
                    secondarySwap = true;
                    DZAutoSpecPlugin dZAutoSpecPlugin = this;
                    delay = dZAutoSpecPlugin.AB1CaddDEdaHI12361JKLM8NO3ka5gw(dZAutoSpecPlugin.PQRS23TgasdUVWX114666ce13Abefgh93f9awdf.AB35raDWsFGHda212365IJKL12tfa1MNO(), delay);
                }
                this.s6641asgn2kd1dasgha1333.schedule(() -> {
                    void var1_1;
                    MenuEntry entry = new MenuEntry("", "", 1, 57, -1, 38862884, true);
                    this.cdefghi367869abcdefhJKL1234AB1Cad.AB1CaddDEdaHI12361JKLM8NO3ka5gw((MenuEntry)var1_1);
                }, delay += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw(), TimeUnit.MILLISECONDS);
                delay += this.asgn2kd1p2no455mnop2dqrstuvwxyz111146.AB1CaddDEdaHI12361JKLM8NO3ka5gw();
                delay = this.AB1CaddDEdaHI12361JKLM8NO3ka5gw(delay);
                currentRetry = 0;
                try {
                    Thread.sleep(delay);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
            }
            if (++currentRetry > 1000 || !this.stuvwxdwyz1111EFda123ghaswGHIOP || !this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3) {
                this.AB1CaddDEdaHI12361JKLM8NO3ka5gw = 0;
                this.nkdaflooqwEFGHIOPQRSTUV4666ce13Ab3 = false;
                this.FGw3gHIJdaw1faKLM8NO3ka5gwPQRS23 = false;
                return;
            }
            try {
                Thread.sleep(10L);
                continue;
            }
            catch (Exception exception) {
                Exception exception3 = exception;
                exception.printStackTrace();
                continue;
            }
            break;
        }
    }
}

