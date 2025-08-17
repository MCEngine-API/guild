package io.github.mcengine.api.guild.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Guild-based Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate guild-related agents into the system.
 */
public interface IMCEngineGuildAgent {
    /**
     * Called when the Guild Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Guild Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Guild Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
