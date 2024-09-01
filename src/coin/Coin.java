package coin;

public enum Coin {
    one(1), two(2),five(5),ten(10),twenty(20),fifty(50),hundred(100);
    private final int value;
    Coin(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }

}
