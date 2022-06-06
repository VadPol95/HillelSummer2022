public class Run {
    public static void main(String[] args) {
        SubscriberServiceImpl subscriberServiceImpl = new SubscriberServiceImpl();
        subscriberServiceImpl.checkTimeCityConversation(SubscriberGenerator.getSubscriber(), 15);
        subscriberServiceImpl.checkUsersWhoUseIntercityConnection(SubscriberGenerator.getSubscriber());
        subscriberServiceImpl.alphabetSort(SubscriberGenerator.getSubscriber(), 'P');
        subscriberServiceImpl.checkInternetTraffic(SubscriberGenerator.getSubscriber(), "Odessa");
        subscriberServiceImpl.numberOfAbonentWithNegativeBalance(SubscriberGenerator.getSubscriber());
    }
}
