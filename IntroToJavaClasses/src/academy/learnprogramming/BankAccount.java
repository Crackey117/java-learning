package academy.learnprogramming;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount() {
        this("12345", 2.50, "Default name", "Default address", "Default phone");
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber){
        this("12345", 2.50, customerName, customerEmailAddress, customerEmailAddress);
    }
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    private void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available, unable to process withdrawal");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, remainder: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
