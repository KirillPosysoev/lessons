package homework4;

public class CustomerCreate {
    public static void main(String[] args) {
        Customer ivanov = new Customer("Иван", "Иванов", new Date(12, 12, 1999));
        System.out.println(ivanov.toString());
        DebitCard debitCardIvanov = new DebitCard("2200000000000001", new Date(12, 23), 10000, ivanov);
        System.out.println(debitCardIvanov.toString());
        CreditCard creditCardIvanov = new CreditCard("2200000000000002", new Date(12, 23), 10000, ivanov);
        System.out.println(creditCardIvanov.toString());
        debitCardIvanov.transfer(2000);
        System.out.println(debitCardIvanov.getBalance());
        creditCardIvanov.transfer(20000);
        System.out.println(creditCardIvanov.getBalance());

    }
}
