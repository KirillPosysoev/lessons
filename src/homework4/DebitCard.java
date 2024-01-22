package homework4;

public class DebitCard extends PlasticCard {

    public DebitCard(String cardNumber, Date issueDate, int limitOperation, Customer cardHolder) {
        super(cardNumber, "дебетовая", issueDate, 4, limitOperation, cardHolder);
    }
}
