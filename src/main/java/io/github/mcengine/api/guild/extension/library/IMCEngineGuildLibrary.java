package io.github.mcengine.api.guild.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Guild-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide guild-related library support to the system.
 */
public interface IMCEngineGuildLibrary {
    /**
     * Called when the Guild Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Guild Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Guild Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
