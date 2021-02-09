package BankingApplication;

import java.security.SecureRandom;

public class BankAccount {
    private int withdrawMoney;
    private int depositMoney;
    private String accountTypes;
    private String accountNumber;

    SecureRandom random = new SecureRandom();

    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(int accountTypes) {
        setAccountTypes(accountTypes);
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        String accountNumber = null;
        if (accountTypes.equals("Savings")) {
            accountNumber = "1010" + forSavings();
        }
        if (accountTypes.equals("Current")){
            accountNumber = "2020" + forSavings();
    }
        return accountNumber;
}
    private String forSavings() {
        String savingsAccountNumber = null;
        savingsAccountNumber = String.valueOf(random.nextInt(3));
        savingsAccountNumber += String.valueOf(random.nextInt(5));
        return savingsAccountNumber;
    }


    public int getWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(int withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }


    public int getBalance() {
        int balance = getDepositMoney() - getWithdrawMoney();
        return balance;
    }

    public void setAccountTypes(int accountTypes) {
        switch (accountTypes){
            case 1 -> this.accountTypes = "Savings";
            case 2 -> this.accountTypes = "Current";
        }

    }

    public String getAccountTypes() {
        return accountTypes;
    }

    @Override
    public String toString() {
        return String.format("Your account balance is %d and your account type is a %s account", getBalance(),getAccountTypes());
    }
}


