import java.util.*;

class Account {
    String customerName;
    String accountNumber;
    Boolean accountType;
    double balance;

    void ShowBalance(){
        System.out.println(balance);
    }

    Account(){
        this.customerName = "";
        this.accountNumber = "";
        this.accountType = false;
        this.balance = 0.0;
    }

    Account(String customerName, String accountNumber, Boolean accountType, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}

class CurrentAccount extends Account{
    int minimumBalance = 500;
    int penalty = 50;

    CurrentAccount(String customerName, String accountNumber, Boolean accountType, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    Boolean checkMinBalance(){
        if (balance < minimumBalance) {
            balance -= penalty;
            return false;
        }
        return true;
    }

    void DepositMoney(int money){
        balance += money;
    }

    void WithdrawMoney(int money){
        if (balance-money > minimumBalance){
            balance-=money;
        }
        else{
            System.out.println("Failed Transaction.");
        }
    }
}

class SavingAccount extends Account {
    double interest = 4.6;

    SavingAccount(String customerName, String accountNumber, Boolean accountType, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void updateBalance(int time){
        balance += balance*interest*time/100;
    }

    void DepositMoney(int money){
        balance += money;
    }

    void WithdrawMoney(int money){
        if (balance-money > 0){
            balance-=money;
        }
        else{
            System.out.println("Failed Transaction.");
        }
    }
}

class Q3{

    public static void main(String args[]){
        
        CurrentAccount currentAccount = new CurrentAccount("Aritro Paul", "001", true, 1000.0);
        SavingAccount savingAccount = new SavingAccount("Aritro Paul", "002", true, 1000.0);

        //a
        currentAccount.DepositMoney(5000); //6000
        //b
        currentAccount.ShowBalance(); // 6000
        //c
        savingAccount.updateBalance(1); // 1046.0
        savingAccount.ShowBalance(); // 1046.0
        //d
        currentAccount.WithdrawMoney(5900); //Failed Transaction
        currentAccount.WithdrawMoney(3000); // 3000
        savingAccount.WithdrawMoney(2000); //Failed Transaction
        currentAccount.ShowBalance(); // 3000
        savingAccount.ShowBalance(); // 1046.0
        //e
        currentAccount.balance = 400;
        System.out.println(currentAccount.checkMinBalance()); //false
        //f
        currentAccount.ShowBalance(); // 350

    }
}