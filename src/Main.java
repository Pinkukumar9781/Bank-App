// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      HDFCAccount pinkuAcc;
        pinkuAcc = new HDFCAccount( "pinku","Pinku@123",2000);
        System.out.println(pinkuAcc); // printed the attribute via tostring;

      // fetchbalance
        System.out.println(pinkuAcc.fetchBalance("Pinku@123"));
        System.out.println(pinkuAcc.fetchBalance("random"));

       // add money
        System.out.println(pinkuAcc.addMony(100000));

        // withdrow money
        System.out.println(pinkuAcc.WithdrowMoney(2000000,"Pinku@123"));
        System.out.println(pinkuAcc.WithdrowMoney(50000,"Pinku@123"));
        System.out.println(pinkuAcc.WithdrowMoney(50000,"random"));

        // change password
        System.out.println(pinkuAcc.changePassword("Pinku@123","pinkukumar9781"));
        System.out.println(pinkuAcc.fetchBalance("pinkukumar9781"));
   // calculate interest
        System.out.println("Interest for 5 year on current balance will be " + pinkuAcc.calculateInterest(5));

    }
}