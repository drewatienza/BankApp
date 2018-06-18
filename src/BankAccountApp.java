public class BankAccountApp {

    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Tom Wilson", "635928863", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "374885228", 2500);

        savacc1.showInfo();
        System.out.println("********************");
        chkacc1.showInfo();
        System.out.println("********************");

        savacc1.deposit(5000);
        System.out.println("********************");
        savacc1.withdraw(200);
        System.out.println("********************");
        savacc1.transfer("Brokerage", 3000);
        System.out.println("********************");


        // Read a CSV File then create new accounts based on that data
    }

}
