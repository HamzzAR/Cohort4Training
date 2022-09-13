public abstract class Accounts {

    private String accountType;
    private String branch;
    private final int accountPin;

    public Accounts(String accountType, String branch, int accountPin) {
        this.accountType = accountType;
        this.branch = branch;
        this.accountPin = accountPin;
    }

    public abstract double deposit(double amount, int pin);

    public abstract double withDraw(double amount, int pin);

    public abstract float getBalance();
    public abstract String transferFunds(int amount, String recipient);

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public abstract double calculateInterest();

    @Override
    public String toString() {
        return "Accounts{" +
                "accountType='" + accountType + '\'' +
                ", branch='" + branch + '\'' +
                ", accountPin=" + accountPin +
                '}';
    }
}
