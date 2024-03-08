import java.util.*;

class ATM {
    private int id;
    private BankAccount bankaccount;

    public ATM(int id, BankAccount bankaccount) {
        this.id = id;
        this.bankaccount = bankaccount;
    }

    public boolean withdraw(double amount) {
        return bankaccount.withdraw(amount);
    }

    public void deposit(double amount) {
        bankaccount.deposit(amount);
    }

    public double checkBalance() {
        return bankaccount.getBalance();
    }

}

class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount B = new BankAccount(1234, 5000);  //Here Initial Amount=5000 because the minimum balance to open account
        ATM A = new ATM(1, B);
        while (true) {
            System.out.println("Enter your choice : \n1- Withdraw\n2- Deposit\n3- Check Balance\n4-Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to withdraw : ");
                    double amount = sc.nextDouble();
                    if (A.withdraw(amount)) {
                        System.out.println(amount + " amount is successfully withdrawn ");
                        break;
                    } else {
                        System.out.println("Not enough balance ");
                        break;
                    }

                case 2:
                    System.out.print("Enter the amount you want to deposit : ");
                    double depositAmount = sc.nextDouble();
                    A.deposit(depositAmount);
                    System.out.println(depositAmount + " amount is successfully deposited ");
                    break;
                case 3:
                    System.out.println("Your current balance : "+A.checkBalance());
                    break;
                case 4:
                	System.out.print("Thank you !! for using ATM");
                	System.out.close();
                default:
                    System.out.println("Invalid choice");
                    break;
            }
           }
           
    }

}
