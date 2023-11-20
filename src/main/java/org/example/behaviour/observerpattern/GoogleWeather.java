package Observer;

import java.util.ArrayList;
import java.util.List;

public class GoogleWeather {
    List<MobileClient> listOfClients = new ArrayList<>();

    int weather = 10;

    public void addClient(MobileClient mobileClient){
        listOfClients.add(mobileClient);
    }

    public void updateWeather(){
        weather++;
        notifyAllClients();
    }

    public void notifyAllClients(){
        for(MobileClient client : listOfClients){
            client.displayWeather(weather);
        }
    }
}
