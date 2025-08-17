package io.github.mcengine.api.guild.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Guild-based Skript module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate scripted guild content into the system.
 */
public interface IMCEngineGuildSkript {
    /**
     * Called when the Guild Skript module is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Guild Skript module is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Guild Skript instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
