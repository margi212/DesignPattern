package Decorater;

public class ExtraTopings implements Item{
    Item item;
    ExtraTopings(Item item){
        this.item = item;
    }
    @Override
    public int cost() {
        return item.cost() + 15;
    }

    @Override
    public String description() {
        return item.description()+" "+"Added Extra Topings";
    }
}
