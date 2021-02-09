package BankingApplication;

import java.security.SecureRandom;

public class BankAccount{
    private int depositAmount;
    private int withdrawAmount;
    private String accountTypes;
    private String accountNumber;
    private int accountBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    SecureRandom random= new SecureRandom();
    public BankAccount() {
    }

    public BankAccount(int accountTypes) {
        setAccountTypes(accountTypes);
        this.accountNumber = generateAccountNumber();
    }
    public BankAccount(int accountTypes,int depositAmount) {
        setAccountTypes(accountTypes);
        this.accountNumber = generateAccountNumber();
        this.accountBalance= depositAmount;
    }



    private String generateAccountNumber() {
        String accountNumber = null;
      if (accountTypes.equals("Savings")){
            accountNumber ="1010" + forSavings();
        }
      if(accountTypes.equals("Current")){
          accountNumber= "2020"+forCurrent();
      }
      return accountNumber;
    }

    private String forCurrent() {
        String currentAccountNumber = null;
        currentAccountNumber =String.valueOf(random.nextInt(3));
        currentAccountNumber +=String.valueOf(random.nextInt(5));
        return currentAccountNumber;

    }

    private String forSavings() {
       String savingsAccountNumber = null;
        savingsAccountNumber =String.valueOf(random.nextInt(3));
        savingsAccountNumber +=String.valueOf(random.nextInt(5));
         return savingsAccountNumber;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
         accountBalance=  accountBalance + depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount =withdrawAmount;
        accountBalance= accountBalance -withdrawAmount;
    }

    public int getBalance() {
        return accountBalance;
    }
    public void setAccountTypes(int accountTypes){
        switch (accountTypes){
            case 1->this.accountTypes="Savings";
            case 2->this.accountTypes="Current";
        }
        this.accountNumber = generateAccountNumber();
    }

    public String getAccountTypes() {
        return accountTypes;
    }

    @Override
    public String toString() {
        return String.format("%nThe account balance is %d%nThe account Type is %s%nThe account Number is %s%n}",getBalance(),getAccountTypes(),getAccountNumber());
    }
}
