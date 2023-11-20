package Decorater;

public class ExtraCheese implements Item{
    Item item;
    ExtraCheese(Item item){
        this.item = item;
    }

    @Override
    public int cost() {
        return this.item.cost() + 20;
    }

    @Override
    public String description() {
        return item.description()+" "+"Added Extra Cheese";
    }
}
