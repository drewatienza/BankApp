public class Savings extends Account {
    // List properties specific to savings account
    int depositBoxId;
    int depositBoxKey;

    // Constructor to initialize settings for the savings account
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("ACCOUNT NUMBER " + this.accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to savings account
}
