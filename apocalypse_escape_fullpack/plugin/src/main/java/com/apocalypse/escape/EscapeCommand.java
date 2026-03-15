
package com.apocalypse.escape;

import org.bukkit.command.*;

public class EscapeCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        sender.sendMessage("Apocalypse Escape command working");
        return true;
    }
}
