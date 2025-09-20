public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    
    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public static void setBankName(String name) {
        bankName = name;
    }
    
    public static String getBankName() {
        return bankName;
    }
    
    public void displayAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------");
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void displayIfBankAccount(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            account.displayAccountDetails();
        } else {
            System.out.println("Error: The provided object is not a BankAccount instance");
        }
    }
    
    public static void main(String[] args) {
        BankAccount.setBankName("International Bank Ltd.");
        
        BankAccount account1 = new BankAccount("John Doe", "123456789", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", "987654321", 2500.0);
        
        System.out.println("Displaying account details with instanceof check:");
        BankAccount.displayIfBankAccount(account1);
        BankAccount.displayIfBankAccount(account2);
        
        String testString = "Not a bank account";
        BankAccount.displayIfBankAccount(testString);
        
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
        
        System.out.println("\nPerforming transactions:");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayAccountDetails();
    }
}