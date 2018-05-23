public class Savings extends Account {
    // List properties specific to savings account
    int depositBoxId;
    int depositBoxKey;

    // Constructor to initialize settings for the savings account
    public Savings(String name) {
        super(name);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to savings account
}
