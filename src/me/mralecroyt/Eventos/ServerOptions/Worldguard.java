package me.mralecroyt.Eventos.ServerOptions;


import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Worldguard implements Listener {

    @EventHandler
    public void soilChangePlayer(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getLocation().getWorld().getName().equals("Lobby")) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void soilChangeEntity(final EntityInteractEvent e) {
        final Entity p = e.getEntity();
        if (p.getLocation().getWorld().getName().equals("Lobby")) {
            e.setCancelled(true);
        }
    }


    @EventHandler
    public void onRemoveDefaultMessages(final PlayerJoinEvent e) {
            e.setJoinMessage(null);
        }

    @EventHandler
    public void onRemoveDefaultMessages(final PlayerQuitEvent e) {
            e.setQuitMessage(null);
        }
    }

