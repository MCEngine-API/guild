package io.github.mcengine.api.guild.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Represents an AddOn module that can be dynamically loaded into the MCEngine guild system.
 * <p>
 * AddOns extend the functionality of the guild system and may provide features such as
 * cosmetic enhancements, special rules, or integrations with other plugins.
 * This interface should be implemented by any AddOn that wishes to be managed by the engine.
 */
public interface IMCEngineGuildAddOn {

    /**
     * Called when the AddOn is loaded by the MCEngine.
     * <p>
     * Use this method to initialize resources, register event listeners,
     * commands, or any logic necessary for the AddOn to function.
     *
     * @param plugin The {@link Plugin} instance providing context for this AddOn.
     */
    void onLoad(Plugin plugin);
}
