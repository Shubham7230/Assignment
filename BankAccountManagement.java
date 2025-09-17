class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("------------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: $" + interest);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------------");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Smith", 5000.0, 3.5);

        account1.displayAccountDetails();
        savingsAccount.displaySavingsAccountDetails();

        System.out.println("Accessing public accountNumber from subclass: " + savingsAccount.accountNumber);
        System.out.println("Accessing protected accountHolder from subclass: " + savingsAccount.accountHolder);
        System.out.println("Accessing balance through public method: $" + savingsAccount.getBalance());

        savingsAccount.deposit(1000.0);
        savingsAccount.applyInterest();
        savingsAccount.displaySavingsAccountDetails();

        savingsAccount.setBalance(7000.0);
        System.out.println("Updated Balance: $" + savingsAccount.getBalance());
    }
}