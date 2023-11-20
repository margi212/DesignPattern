package Decorater;

public class FarmHousePizza implements Item{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Added Extra Farmhouse";
    }
}
