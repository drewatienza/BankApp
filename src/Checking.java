public class Checking extends Account {
    // List properties specified to a checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW CHECKING ACCOUNT\n");
    }

    // List any methods specific to the checking account
}
