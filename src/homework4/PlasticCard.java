package homework4;

public class PlasticCard {
    private String cardNumber;
    private Customer cardHolder;
    private Date issueDate;
    private int balance;
    private final int validity;
    private int limitOperation;
    private Date expirationDate;
    private String type;

    public PlasticCard(String cardNumber, String type, Date issueDate, int validity, int limitOperation, Customer cardHolder) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.balance = 0;
        this.validity = validity;
        this.limitOperation = limitOperation;
        this.cardHolder = cardHolder;
        this.expirationDate = new Date(issueDate.getDay(),issueDate.getMonth(),issueDate.getYear()+validity);
        this.type = type;
    }

    public void transfer(int transferSum) {
        if (transferSum >= limitOperation) {
            System.out.println("Превышен лимит для операции");
        } else {
            balance = +transferSum;
            System.out.println("Карта успешно пополнена");
        }
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public int getBalance() {
        return balance;
    }

    public int getValidity() {
        return validity;
    }

    public int getLimitOperation() {
        return limitOperation;
    }

    public Customer getCardHolder() {
        return cardHolder;
    }

    public Date getIssueDate() {
        return issueDate;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }


    public void setCardHolder(Customer cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setLimitOperation(int limitOperation) {
        this.limitOperation = limitOperation;
    }

    @Override
    public String toString() {
        return "Номер карты: " + cardNumber +
                "\nТип: " + type +
                "\nДата выдачи: " + issueDate.toString() +
                "\nСрок действия до: " +expirationDate.toString() +
                "\nБаланс: " + balance;
    }
}
