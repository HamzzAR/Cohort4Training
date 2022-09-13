public class CurrentAccount extends Accounts{

    private int accountNumber;
    private String accountName;
    private double balance;
    private float rateOfInterest;
    private float overDraftLimit;

    public CurrentAccount(String accountType, String branch, int accountPin, int accountNumber, String accountName, float balance, float rateOfInterest, float overDraftLimit) {
        super(accountType, branch, accountPin);
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
        this.overDraftLimit = overDraftLimit;
    }

    private boolean checkPin(int pin){
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
        } else {
            System.out.println("Error - Wrong pin");
        }
        return balance;
    }

    @Override
    public double withDraw(double amount, int pin) {
        if(checkPin(pin)) {
            balance -= amount;
        }else {
            System.out.println("Error - Wrong pin");
        }
        return balance;
    }

    @Override
    public float getBalance() {
        return 0;
    }

    @Override
    public String transferFunds(int amount, String recipient) {
        balance -= amount;
        return "Your money has been sent to "+recipient;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public float getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(float overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", overDraftLimit=" + overDraftLimit +
                '}';
    }
}
