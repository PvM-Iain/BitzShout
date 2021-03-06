package com.bitzcraftonline.shout;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class BitzShout extends JavaPlugin {
	
	public static BitzShout plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
		
	//calls plugin desc file when enabled to get version and plugin name.
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " by PvM_Iain is enabled.");
	}
    
	//calls plugin desc file when disabled to get version and plugin name.
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " by PvM_Iain is disabled.");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("shout")) {
		  if(!(sender instanceof Player)){
		    }else if (args.length == 0 ){
				sender.sendMessage(ChatColor.GRAY + "Not enough arguments! Syntax: /shout <message>");
			}if(args.length == 1){
			    Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0]);
		    }if(args.length == 2){
		        Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1]);
	        }if(args.length == 3){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2]);
			}if(args.length == 4){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
			}if(args.length == 5){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
			}if(args.length == 6){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5]);
			}if(args.length == 7){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6]);
			}if(args.length == 8){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7]);
			}if(args.length == 9){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8]);
			}if(args.length == 10){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9]);
			}if(args.length == 11){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10]);
			}if(args.length == 12){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11]);
			}if(args.length == 13){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12]);
			}if(args.length == 14){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13]);
			}if(args.length == 15){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14]);
			}if(args.length == 16){
	            Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15]);
			}if(args.length == 17){
				Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16]);
		    }if(args.length == 18){
				Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17]);
		    }if(args.length == 19){
				Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17] + " " + args[18]);
		    }if(args.length == 20){
				Bukkit.broadcastMessage(ChatColor.GOLD + sender.getName() + ChatColor.RED + " shouts: " + ChatColor.RED + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17] + " " + args[18] + " " + args[19]);
		    }else if(commandLabel.equalsIgnoreCase("bitzshout")){
		    	 sender.sendMessage(ChatColor.BLUE + "-=========== " + ChatColor.GOLD + " Help for BitzShout " + ChatColor.BLUE + " ===========-"); 
				 sender.sendMessage(ChatColor.GOLD + "/bitzshout" + ChatColor.DARK_AQUA + " - " + ChatColor.BLUE + "Base command for BitzShout");
				 sender.sendMessage(ChatColor.GOLD + "/shout " + ChatColor.GRAY + "<message>" + ChatColor.DARK_AQUA + " - " + ChatColor.BLUE + " Shouts a message to the server.");
				 sender.sendMessage(ChatColor.BLUE + "-======================================================-"); 
		     }
		  }
		return false;
      }
	
   		
}
