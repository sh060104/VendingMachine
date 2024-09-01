import item.*;
import vendingmachine.*;


public class App {
    public static void main(String[] args) throws Exception {
        // int value=Coin.fifty.getValue();
        // System.out.println(value);
        VendingMachine vendingMachine=new VendingMachine();
        System.out.println("fill the inventory");
        fillInventory(vendingMachine);
        displayInventory(vendingMachine);
    }
    private static void fillInventory(VendingMachine vendingMachine){
        Itemshelf[] itemShelfSlots = vendingMachine.getInventory().getInventory();
        for(int i=0;i<itemShelfSlots.length;i++) {
            Item item = new Item();
            if (i == 0 || i == 8) {
                item.setItemtype(ItemType.oreo);
                item.setPrice(30);
            } else if (i == 1 || i == 9) {
                item.setItemtype(ItemType.juice);
                item.setPrice(40);
            } else if (i == 2) {
                item.setItemtype(ItemType.coke);
                item.setPrice(45); 
            } else if (i == 3) {
                item.setItemtype(ItemType.soda);
                item.setPrice(20); 
            } else if (i == 4) {
                item.setItemtype(ItemType.chips);
                item.setPrice(20); 
            } else if (i == 5) {
                item.setItemtype(ItemType.chocolate);
                item.setPrice(60); 
            } else if (i == 6) {
                item.setItemtype(ItemType.candy);
                item.setPrice(5); 
            } else if (i == 7) {
                item.setItemtype(ItemType.gum);
                item.setPrice(5); 
            }
            itemShelfSlots[i].setItem(item);
            itemShelfSlots[i].setsoldout(false);
        }


    }
    private static void displayInventory(VendingMachine vendingMachine){
        Itemshelf[] itemShelfSlots = vendingMachine.getInventory().getInventory();
        System.out.println(itemShelfSlots.length);
        for(Itemshelf shelf: itemShelfSlots) {
            System.out.println("Item Code: " + shelf.getItemcode() + " Item: " + shelf.getItem().getType() +" Price: " + shelf.getItem().getPrice() + 
            " isAvailable:" + !shelf.isSoldout());
        }
    }
}
            