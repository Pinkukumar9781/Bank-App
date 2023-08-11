public interface BankAccountInterface {

     String fetchBalance(String password);

     String addMony(double amount);

     String WithdrowMoney(double amount , String password);

     String changePassword(String oldPassword, String newPassword);

     double calculateInterest(int year);

    }
