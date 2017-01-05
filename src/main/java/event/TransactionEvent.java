package PocketMoneyEvent;

import cn.nukkit.Player;
import PocketMoney.PocketMoney;
import cn.nukkit.event.HandlerList;

public class TransactionEvent extends PocketMoneyEvent{
{
  
   public static HandlerList handlerList = null;
  
  const TRANSACTION_PAY = 0;
  
  private String sender;
  private String receiver;
  private int amount;
  
  public TransactionEvent(PocketMoney plugin,Strign _sender,String _receiver,int _amount) {
    this.sender = _sender;
    this.receiver = _receiver;
    this.amount = _amount;
    super(plugin);
  }
  
  // Get sender name
  // Return string 
  public String getSender() {
   return sender; 
  }
  
  // Get receiver name
  // Return string 
  public String getReceiver() {
    return receiver;
  }
  
  // Get amount 
  // Return integer 
  public int getAmount() {
    return amount; 
  }
    //public static $handlerList = null;
    ///** @var string $sender */
    //private $sender;
    ///** @var string $receiver */
    //private $receiver;
    ///** @var int amount */
    //private $amount;
    ///** @var int $transactionType */
    //private $transactionType;
    ///**
    // * @param PocketMoney $plugin
    // * @param string $sender
    // * @param string $receiver
    // * @param int $amount
    // * @param int $transactionType
    // */
    //public function __construct(PocketMoney $plugin, $sender, $receiver, $amount, $transactionType)
    //{
    //    $this->sender = $sender;
    //    $this->receiver = $receiver;
    //    $this->amount = $amount;
    //    $this->transactionType = $transactionType;
    //    parent::__construct($plugin);
    //}
    //public function getSender()
    //{
    //    return $this->sender;
    //}
    //public function getReceiver()
    //{
    //    return $this->receiver;
    //}
    //public function getAmount()
    //{
    //    return $this->amount;
    //}
    //public function getTransactionType()
    //{
    //    return $this->transactionType;
    //}
//} 
