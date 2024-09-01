package item;

public class Itemshelf {
    private int itemcode;
    private Item item;
    private boolean soldout;

    public Item getItem(){
        return this.item;
    }
    public void setItem(Item item){
        this.item=item;
    }
    public int getItemcode(){
        return this.itemcode;
    }
    public void setItemCode(int itemcode){
        this.itemcode=itemcode;
    }
    public boolean isSoldout(){
        return  this.soldout;
    }
    public void setsoldout(boolean soldout){
        this.soldout=soldout;
    }
}
