package Observer;

public class Mobile1 implements MobileClient{

    @Override
    public void name() {
        System.out.println("My name is mobile1");
    }

    @Override
    public void displayWeather(int weather) {
        System.out.println("Mobile1 "+ weather);
    }


}
