package MoneyUpdateEvent;

import cn.nukkit.Player;
import Pocketmoney.PocketMoney;
import cn.nukkit.event.HandlerList;

public class MoneyUpdateEvent extends PocketMoneyEvent { 
    
    public static HandlerList handlerList = null;
    
    public static final int CAUSE_PAY = 0;
    public static final int CAUSE_GRANT = 1;
    public static final int CAUSE_SET = 2;
    
    private Player player;
    private int amount;
    private int cause;
    
    public MoneyUpdateEvent(PocketMoney plugin,Player _player,int _amount,int _cause) {
+        this.player = _player;
+        this.amount = _amount;
+        this.cause = _cause;
+        super(plugin);
+  }
    
    public Player getPlayer() {
        return this.player;   
    }
    
    public String getPlayerName() {
        return this.player.getName();   
    }
    
    public int getAmount() {
        return this.amount;   
    }
    
    public int getCause() {
        return this.cause;   
    }
    
    /*
    const CAUSE_PAY = 0;
    const CAUSE_GRANT = 1;
    const CAUSE_SET = 2;
    public static $handlerList = null;
    */
    /** @var string $player */
   //private $player;
   // /** @var int $amount */
   // private $amount;
    /** @var int $cause */
    //private $cause;
    /**
     * @param PocketMoney $plugin
     * @param string $player
     * @param int $amount
     * @param int $cause
     */
   // public function __construct(PocketMoney $plugin, $player, $amount, $cause)
   // {
   //     $this->player = $player;
   //    $this->amount = $amount;
   //     $this->cause = $cause;
   //     parent::__construct($plugin);
   // }
   // public function getPlayer()
   // {
   //    return $this->player;
   // }
   // public function getAmount()
   // {
   //     return $this->amount;
   // }
    
}
