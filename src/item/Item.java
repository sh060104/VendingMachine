package item;

public class Item {
    
    private ItemType itemtype;
    private  int price;

    public ItemType getType(){
        return this.itemtype;
    }
    public void setItemtype(ItemType itemType){
        this.itemtype=itemType;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }


}
