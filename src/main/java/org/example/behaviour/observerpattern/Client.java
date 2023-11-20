package Observer;

import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GoogleWeather googleWeather = new GoogleWeather();
        MobileClient mobileClient1 = new Mobile1();
        MobileClient mobileClient2 = new Mobile2();

        googleWeather.addClient(mobileClient1);
        googleWeather.addClient(mobileClient2);

        googleWeather.updateWeather();

        TimeUnit.SECONDS.sleep(5);

        googleWeather.updateWeather();

        TimeUnit.SECONDS.sleep(5);

        googleWeather.updateWeather();
    }
}
