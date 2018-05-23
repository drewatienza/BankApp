public class Checking extends Account {
    // List properties specified to a checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("NEW CHECKING ACCOUNT");
    }

    // List any methods specific to the checking account
}
