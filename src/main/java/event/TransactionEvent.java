package PocketMoneyEvent;

import cn.nukkit.Player;
import PocketMoney.PocketMoney;
import cn.nukkit.event.HandlerList;

public class TransactionEvent extends PocketMoneyEvent{
{
  
   public static HandlerList handlerList = new HandlerList;
  
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
}
