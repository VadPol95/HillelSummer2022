public class Run {
    public static void main(String[] args) {
        SubscriberServiceImpl subscriberServiceImpl = new SubscriberServiceImpl();
        subscriberServiceImpl.checkTimeCityConversation(SubscriberGenerator.getSubscriber(), 15);
        subscriberServiceImpl.checkUsersWhoUseIntercityConnection(SubscriberGenerator.getSubscriber());
        subscriberServiceImpl.alphabetSort(SubscriberGenerator.getSubscriber(), 'P');
        System.out.println(subscriberServiceImpl.checkInternetTraffic(SubscriberGenerator.getSubscriber(), "Odessa") + " Gb.");
        System.out.println();
        System.out.println(subscriberServiceImpl.numberOfAbonentWithNegativeBalance(SubscriberGenerator.getSubscriber()));
    }
}
