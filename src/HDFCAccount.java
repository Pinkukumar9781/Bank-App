import java.util.UUID;

public class HDFCAccount implements BankAccountInterface {
     private String name;
     private String accountNo;

     private String password;
     private double balance;
     final double rateOfInterest = 7.1;
     final String IFSCCode = "HDFC374873";
   // default constructor
    public HDFCAccount() {
    }

    // parametrize constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "your balance is: " +  this. balance;
        }
     return " incorrect password !!! ";
    }

    @Override
    public String addMony(double amount) {
        this.balance += amount;
        return "Amount added sucsesfully. new balance is:  " + this.balance;
    }

    @Override
    public String WithdrowMoney(double amount, String password) {
        if(this.password.equals(password)){
           if(this.balance < amount){
               return " Insufficient alance ";
           }
           this.balance -= amount;
           return "Amount  deducted sucsesfully new balance is: " + this.balance;
        }
    return "Incorrect password!!! ";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
         this.password = newPassword;
         return "chang Password sucsesfully";
        }
    return "Inccorect password!!! ";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*year* rateOfInterest) / 100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance='" + balance + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
