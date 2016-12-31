package PocketMoney;

/**
 *
 * @author PikyCZ
 */
import cn.nukkit.utils.Config;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.Config;

import PocketMoney.constants.PlayerType;
import PocketMoney.event.MoneyUpdateEvent;
import PocketMoney.event.TransactionEvent;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public class PocketMoney extends PluginBase implements Listener {

   @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.GREEN + "Economy loaded!");
        
     /* @var Config */
    private users;
    /* @var Config */
    private system;
    
    private messages;
    
    // <- API
    /**
     * @api
     *
     * return if $account is registered
     *
     * @param string $account
     * @return bool
     */
    public void isRegistered(account)
    {
        return this.users.exists(account);
    }

     public void onEnable() {

    }

     
     
    }
    
}
