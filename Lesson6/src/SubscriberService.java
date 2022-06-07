import java.util.ArrayList;

public interface SubscriberService {
    void checkTimeCityConversation(ArrayList<Subscriber> subscriber, int timeCity);

    void checkUsersWhoUseIntercityConnection(ArrayList<Subscriber> subscriber);

    void alphabetSort(ArrayList<Subscriber> subscriber, char letter);

    int checkInternetTraffic(ArrayList<Subscriber> subscriber, String city);

    int numberOfAbonentWithNegativeBalance(ArrayList<Subscriber> subscriber);
}
