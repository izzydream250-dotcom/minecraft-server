package com.izzydream250.minecraftserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public ExampleCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("example.use")) {
            sender.sendMessage("This is an example command!");
            return true;
        } else {
            sender.sendMessage("You do not have permission to use this command.");
            return false;
        }
    }
}