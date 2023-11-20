package Decorater;

public class Client {
    public static void main(String[] args) {
        Item item = new ColdDrinks(new ExtraCheese(new FarmHousePizza()));
        System.out.println(item.cost());
        System.out.println(item.description());

        Item item1 = new ExtraCheese(new FarmHousePizza());
        System.out.println(item1.cost());
        System.out.println(item1.description());

        Item item3 = new ExtraTopings(new FarmHousePizza());
        System.out.println(item3.cost());
        System.out.println(item3.description());
    }
}
