package vendingmachine;
import java.util.*;
import item.Item;
import coin.Coin;

public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("currently machine is in idle state");
    }

    public void clickonStartProductselectbutton(){
        System.out.println("vending machine is in HasMoneyState");
    }

    public void insertCoin(VendingMachine vendingMachine,Coin coin){
        System.out.println("vending machine is in HasMoneyState");
        System.out.println("Accepthed the coin");
        vendingMachine.getCoinList().add(coin);
    }


    public List<Coin> refundMoney(VendingMachine vendingMachine){
        System.out.println("returned the full amount back in the coin dispense tray");
        vendingMachine.setVendingmachinestate(new VendingMachineState());
        return vendingMachine.getCoinList();
    }

    public void updateInventory(VendingMachine vendingMachine,Item item,int itemcodeNumber){
        vendingMachine.getInventory().addItem(item, itemcodeNumber);
    }

    public void dispenseProduct(VendingMachine vendingMachine,int itemcodeNumber){
        System.out.println("currently vending machine is in dispense state");
        System.out.println("product has been dispense");
        vendingMachine.getInventory().updatesoldeOut(itemcodeNumber);
        vendingMachine.setVendingmachinestate(new VendingMachineState());

    }

    
    public void chooseProduct(VendingMachine vendingMachine,int itemcodeNumber){
        Item item=vendingMachine.getInventory().getItem(itemcodeNumber);
        int paidByuser=0;
        for(Coin coin :vendingMachine.getCoinList()){
            paidByuser=coin.getValue();
        }
        if(item.getPrice()>paidByuser){
            refundMoney(vendingMachine);
            return;
        }else{
            getChange(item.getPrice(), paidByuser);
            dispenseProduct(vendingMachine,itemcodeNumber);
            return;
        }
    
    }
    public void getChange(int itemPrice,int paidByuser){
        System.out.println("returned the change in the coin dispense tray: "+(paidByuser-itemPrice));
    }


}
