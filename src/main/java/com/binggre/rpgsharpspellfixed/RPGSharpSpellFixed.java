package com.binggre.rpgsharpspellfixed;

import com.hj.rpgsharp.rpg.apis.rpgsharp.utils.MetadataUtil;
import com.nisovin.magicspells.events.MagicSpellsEntityDamageByEntityEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGSharpSpellFixed extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onSpellDamage(MagicSpellsEntityDamageByEntityEvent event) {
        final String KEY = "StopGetDamage";
        MetadataUtil.setMetadata(event.getDamager(), KEY, (byte) 1);
    }
}
