package io.github.mcengine.api.guild.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Guild-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide guild-related APIs to the system.
 */
public interface IMCEngineGuildAPI {
    /**
     * Called when the Guild API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Guild API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Guild API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
