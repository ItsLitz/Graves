package me.litz.Graves.events;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;

public class GravesEvents implements Listener {

    @EventHandler
    public void EntityGravestone(EntityDeathEvent event) {

        World world = event.getEntity().getWorld();
        Block block = event.getEntity().getLocation().getBlock();
        Entity entity = event.getEntity();

        Location location = event.getEntity().getLocation();

        double locationX = event.getEntity().getLocation().getX();
        double locationY = event.getEntity().getLocation().getY();
        double locationZ = event.getEntity().getLocation().getZ();

        Location loc = new Location(world, locationX, locationY, locationZ+2);
        Location loc2 = new Location(world, locationX, locationY-1, locationZ+1);
        Location loc3 = new Location(world, locationX, locationY-1, locationZ);
        Location loc4 = new Location(world, locationX, locationY, locationZ+1);
        Location loc5 = new Location(world, locationX, locationY, locationZ);
        Location loc6 = new Location(world, locationX, locationY-1, locationZ+2);

        loc.getBlock().setType(Material.MOSSY_COBBLESTONE);
        loc2.getBlock().setType(Material.PODZOL);
        loc3.getBlock().setType(Material.PODZOL);
        loc4.getBlock().setType(Material.OAK_WALL_SIGN);
        loc5.getBlock().setType(Material.RED_TULIP);
        loc6.getBlock().setType(Material.PODZOL);

        org.bukkit.block.Sign graveSign = (org.bukkit.block.Sign) entity.getWorld().getBlockAt(loc4).getState();
        graveSign.setLine(0, "RIP");
        graveSign.setLine(2, String.valueOf(event.getEntityType()));
        graveSign.update();

    }
    @EventHandler
    public void PlayerGravestone(PlayerDeathEvent event) {

        World world = event.getEntity().getWorld();
        Block block = event.getEntity().getLocation().getBlock();
        Entity entity = event.getEntity();

        Location location = event.getEntity().getLocation();

        double locationX = event.getEntity().getLocation().getX();
        double locationY = event.getEntity().getLocation().getY();
        double locationZ = event.getEntity().getLocation().getZ();

        Location loc = new Location(world, locationX, locationY, locationZ+2);
        Location loc2 = new Location(world, locationX, locationY-1, locationZ+1);
        Location loc3 = new Location(world, locationX, locationY-1, locationZ);
        Location loc4 = new Location(world, locationX, locationY, locationZ+1);
        Location loc5 = new Location(world, locationX, locationY, locationZ);
        Location loc6 = new Location(world, locationX, locationY-1, locationZ+2);

        loc.getBlock().setType(Material.MOSSY_COBBLESTONE);
        loc2.getBlock().setType(Material.PODZOL);
        loc3.getBlock().setType(Material.PODZOL);
        loc4.getBlock().setType(Material.OAK_WALL_SIGN);
        loc5.getBlock().setType(Material.RED_TULIP);
        loc6.getBlock().setType(Material.PODZOL);

        org.bukkit.block.Sign graveSign = (org.bukkit.block.Sign) entity.getWorld().getBlockAt(loc4).getState();
        graveSign.setLine(0, "RIP");
        graveSign.setLine(2, String.valueOf(event.getEntity().getDisplayName()));
        graveSign.update();

    }
}
