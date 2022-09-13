public class SavingsAccount extends Accounts {
    private int accountNumber;
    private String accountName;
    private float balance;
    private float rateOfInterest;

    public SavingsAccount(int accountNumber, String accountName, float balance, float rateOfInterest, String accountType, String branch, int accountPin) {
        super(accountType, branch, accountPin);
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    public boolean checkPin(int pin){
        if(pin == this.getAccountPin()){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public double deposit(double amount, int pin) {
        if(checkPin(pin)) {
            balance += amount;
        }
        return balance;
    }

    @Override
    public double withDraw(double amount, int pin) {
        if(checkPin(pin)) {
            balance -= amount;
        }
        return balance;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String transferFunds(int amount, String recipient) {
        balance -= amount;
        return "Your money has been sent to "+recipient;
    }

    @Override
    public double calculateInterest() {
        return this.balance * 0.02;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                '}';
    }
}
