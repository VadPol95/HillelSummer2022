public class Subscriber {

    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private int phoneNumber;
    private int contractNumber;
    private double balance;
    private int timeCityConversation;
    private int timeIntercityConversation;
    private double internetTraffic;

    public Subscriber() {

    }

    public Subscriber(int id, String name, String surname, String patronymic, String city,
                      int phoneNumber, int contractNumber, double balance,
                      int timeCityConversation, int timeIntercityConversation, double internetTraffic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.timeCityConversation = timeCityConversation;
        this.timeIntercityConversation = timeIntercityConversation;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTimeCityConversation() {
        return timeCityConversation;
    }

    public void setTimeCityConversation(int timeCityConversation) {
        this.timeCityConversation = timeCityConversation;
    }

    public int getTimeIntercityConversation() {
        return timeIntercityConversation;
    }

    public void setTimeIntercityConversation(int timeIntercityConversation) {
        this.timeIntercityConversation = timeIntercityConversation;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", contractNumber=" + contractNumber +
                ", balance=" + balance +
                ", timeCityConversation=" + timeCityConversation +
                ", timeIntercityConversation=" + timeIntercityConversation +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}

