package Decorater;

public class ColdDrinks implements Item{
    Item item;

    ColdDrinks(Item item){
        this.item = item;
    }
    @Override
    public int cost() {
        return item.cost() + 40;
    }
    @Override
    public String description() {
         return item.description()+" "+"Added Cold Drinks";

    }
}
