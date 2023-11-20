package Observer;

public class Mobile2 implements MobileClient{

    @Override
    public void name() {
        System.out.println("My name is mobile2");
    }

    @Override
    public void displayWeather(int weather) {
        System.out.println("Mobile2 "+ weather);
    }
}
