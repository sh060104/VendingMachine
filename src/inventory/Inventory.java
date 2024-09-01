package inventory;
import item.Itemshelf;
import item.Item;

public class Inventory {
    private Itemshelf []inventory;
    
    public Inventory(int n){
        inventory=new Itemshelf[n];
        initialEmptyinventory();
    }

    public Itemshelf[] getInventory(){
        return this.inventory;
    }

    public void setInventory(Itemshelf[]inventory){
        this.inventory=inventory;

    }

    public void initialEmptyinventory(){
        int startcode=101;
        for(int i=0;i<inventory.length;i++){
            Itemshelf itemshelf=new Itemshelf();
            itemshelf.setItemCode(startcode);
            itemshelf.setsoldout(true);
            inventory[i]=itemshelf;
            startcode++;
        }
    }
    public void addItem(Item item,int itemcode){
        for(Itemshelf shelf:inventory){
            if(shelf.getItemcode()==itemcode){
                if(shelf.isSoldout()==true){
                    shelf.setItem(item);
                    shelf.setsoldout(false);
                }
            }
        }

    }
    public Item getItem(int itemcode){
        for(Itemshelf shelf:inventory){
            if(shelf.getItemcode()==itemcode){
                if(shelf.isSoldout()){
                    System.out.println("item is already soldout");
                    return new Item();
                }
                else{
                    return shelf.getItem();
                }
            }
        }System.out.println("Invalid item code");
        return new Item();
    }
    public void updatesoldeOut(int itemcodeNumber){
        for(Itemshelf shelf:inventory){
            if(shelf.getItemcode()==itemcodeNumber){
                shelf.setsoldout(true);
            }
        }
    }



}
