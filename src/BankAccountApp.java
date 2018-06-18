import java.io.IOException;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {
        String file = "/Users/drewatienza/Downloads/NewBankAccounts.csv";

//        Checking chkacc1 = new Checking("Tom Wilson", "635928863", 1500);
//        Savings savacc1 = new Savings("Rich Lowe", "374885228", 2500);
//
//        savacc1.compound();
//        System.out.println("********************");
//
//        savacc1.showInfo();
//        System.out.println("********************");
//        chkacc1.showInfo();
//        System.out.println("********************");


        // Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }

    }

}
