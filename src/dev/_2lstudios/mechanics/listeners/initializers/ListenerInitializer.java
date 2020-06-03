package dev._2lstudios.mechanics.listeners.initializers;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import dev._2lstudios.mechanics.listeners.*;
import dev._2lstudios.mechanics.managers.GameMechanicsManager;

public class ListenerInitializer {
	public ListenerInitializer(final Plugin plugin, final GameMechanicsManager gameMechanicsManager) {
		final Server server = plugin.getServer();
		final PluginManager pluginManager = server.getPluginManager();

		pluginManager.registerEvents(new BlockBreakListener(plugin, gameMechanicsManager), plugin);
		pluginManager.registerEvents(new BlockDamageListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new BlockDispenseListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new BlockFromToListener(), plugin);
		pluginManager.registerEvents(new BlockPlaceListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new BrewListener(), plugin);
		pluginManager.registerEvents(new ChunkUnloadListener(), plugin);
		pluginManager.registerEvents(new EnchantItemListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new EntityDamageByEntityListener(), plugin);
		pluginManager.registerEvents(new EntityDamageListener(), plugin);
		pluginManager.registerEvents(new EntityDeathListener(), plugin);
		pluginManager.registerEvents(new EntityRegainHealthListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new EntitySpawnListener(), plugin);
		pluginManager.registerEvents(new InventoryClickListener(plugin, gameMechanicsManager), plugin);
		pluginManager.registerEvents(new InventoryCloseListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new InventoryDragListener(), plugin);
		pluginManager.registerEvents(new InventoryMoveListener(), plugin);
		pluginManager.registerEvents(new InventoryOpenListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerDeathListener(plugin), plugin);
		pluginManager.registerEvents(new PlayerFishListener(), plugin);
		pluginManager.registerEvents(new PlayerItemConsumeListener(), plugin);
		pluginManager.registerEvents(new PlayerItemHeldListener(), plugin);
		pluginManager.registerEvents(new PlayerJoinListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerMoveListener(), plugin);
		pluginManager.registerEvents(new EntityPickupItemListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerQuitListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerRespawnListener(), plugin);
		pluginManager.registerEvents(new PlayerSwapHandItemsListener(), plugin);
		pluginManager.registerEvents(new PlayerTeleportListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerVelocityListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PlayerWorldChangeListener(), plugin);
		pluginManager.registerEvents(new PotionSplashListener(), plugin);
		pluginManager.registerEvents(new PrepareAnvilListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new PrepareItemCraftListener(gameMechanicsManager), plugin);
		pluginManager.registerEvents(new ProjectileHitListener(), plugin);
		pluginManager.registerEvents(new ProjectileLaunchListener(), plugin);
	}
}
