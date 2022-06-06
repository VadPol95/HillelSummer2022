import java.util.ArrayList;

/**
 * метод - checkTimeCityConversation проверяет пользователей у которых время разговора превышает заданное
 * метод - checkUsersWhoUseIntercityConnection проверяет пользователей которые пользовались междугородной связью
 * метод - alphabet выводит сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
 * метод - checkInternetTraffic выводит на экран суммарное потребление трафика интернета для определенного города
 * метод - numberOfAbonentWithNegativeBalance выводит на экран список абонентов у которых отрицательный баланс
 */
public class SubscriberServiceImpl implements SubscriberService {
    @Override
    public void checkTimeCityConversation(ArrayList<Subscriber> subscriber, int timeCity) {
        System.out.println("Users whose city talk time exceeds the specified: ");
        System.out.println();
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getTimeCityConversation() > timeCity) {
                System.out.println(subscribers);
            }
        }
        System.out.println();

    }

    @Override
    public void checkUsersWhoUseIntercityConnection(ArrayList<Subscriber> subscriber) {
        System.out.println("Users who used inter city communication: ");
        System.out.println();
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getTimeIntercityConversation() > 0) {
                System.out.println(subscribers);
            }
        }
        System.out.println();
    }

    @Override
    public void alphabetSort(ArrayList<Subscriber> subscriber, char letter) {
        System.out.println("Displaying subscribers whose patronymic starts with a letter: " + letter);
        for (Subscriber subscribers : subscriber) {
            char[] arrPatronymic = subscribers.getPatronymic().toCharArray();
            if (arrPatronymic[0] == letter) {
                System.out.println("Patronymic: " + subscribers.getPatronymic() + ". First name: " +
                        subscribers.getName() + ". Surname: " + subscribers.getSurname() +
                        ". Number of phone: " + subscribers.getPhoneNumber() + ". Balance: " + subscribers.getBalance());
            }
        }
        System.out.println();

    }

    @Override
    public void checkInternetTraffic(ArrayList<Subscriber> subscriber, String city) {
        System.out.println("The summary internet traffic: ");
        System.out.println();
        double result = 0;
        for (Subscriber subscribers : subscriber) {
            if(subscribers.getCity().equals(city)){
                result += subscribers.getInternetTraffic();
            }

        }
        System.out.println(result);
        System.out.println();
    }

    @Override
    public void numberOfAbonentWithNegativeBalance(ArrayList<Subscriber> subscriber) {
        System.out.println("Users who have negative balance: ");
        System.out.println();
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getBalance() < 0) {
                System.out.println(subscribers);
            }
        }
        System.out.println();
    }
}
