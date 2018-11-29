package week2;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit (double amount) {    // return type to boolean
        if (amount > 0.0) {                     // if statement to prevent deposits of 0 or less
            this.balance += amount;
            return true;                        // returning "true" if succeeded,
        }
        else {
            return false;                 // "false" if not...  please note, I only add comments because I have too :)
        }
    }

    public boolean withdraw (double amount) {   //return type from void to boolean
        if (amount > 0.0) {                     //if statement to prevent withdrawals of 0 or less
            if(this.balance - amount > 0 || this.hasOverdraft == true) {    /*if statement to prevent negative balance
                                                                     after withdrawal, unless hasOverdraft is positive*/
                this.balance -= amount;
                return true;                                 // return " true if succeeded etc..
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean addInterest (int interestRate) {    // same as above
        if(interestRate > 0 && this.balance > 0 ) {  /*if statement for 0 and negative interest rates
                                                          and to prevent applying interest on negative balance */
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }
        else{
            return false;         //return statements to mach our methods data type.
        }
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }
}
