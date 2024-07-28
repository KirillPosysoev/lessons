package homework4;

public class CreditCard extends PlasticCard {

    public CreditCard(String cardNumber, Date issueDate,  int limitOperation, Customer cardHolder) {
        super(cardNumber, "кредитная", issueDate, 2, limitOperation, cardHolder);
    }
}
