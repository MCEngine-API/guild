package io.github.mcengine.api.guild.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Guild-based DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content into the system.
 */
public interface IMCEngineGuildDLC {
    /**
     * Called when the Guild DLC is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Guild DLC is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Guild DLC instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
