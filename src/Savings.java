public class Savings extends Account {
    // List properties specific to savings account
    int depositBoxId;
    int depositBoxKey;

    // Constructor to initialize settings for the savings account
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to savings account
}
