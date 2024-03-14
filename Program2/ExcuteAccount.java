package Program2;

import java.util.Scanner;

class Account {
  String Name;
  String accNo;
  String bankType;
  double balance;

  // to track the total number of account holders

  private static int totalAccHolders = 0;

  public Account(String Name, String accNo, String bankType, double balance) {
    this.Name = Name;
    this.accNo = accNo;
    this.bankType = bankType;
    this.balance = balance;
    totalAccHolders++; // incrementing the account holder count
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited : $" + amount);
  }

  public void withDraw(double amount) {
    if (amount > balance) {
      System.out.println("Insuciffinent fund to withdraw");
    } else {
      balance -= amount;
      System.out.println("Withdrawn Amount :$" + amount);
    }
  }

  public void display() {
    System.out.println();
    System.out.println();
    System.out.println("Account Holder Name : " + Name);
    System.out.println();
    System.out.println("Account number : " + accNo);
    System.out.println();
    System.out.println("Account Type : " + bankType);
    System.out.println();
    System.out.println("Balance : $" + balance);
  }

  public static int gettotalAccHolders() {
    return totalAccHolders;
  }
}

public class ExcuteAccount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account[] account = new Account[2];
    String Name, bankType, accNo;
    double balance;

    for (int i = 0; i < 2; i++) {
      System.out.println("Enter details for account " + (i + 1) + ":");
      System.out.print("Depositer Name : ");
      Name = sc.nextLine();
      System.out.print("Account number : ");
      accNo = sc.nextLine();
      System.out.print("Account type : ");
      bankType = sc.nextLine();
      System.out.print("Enter intial balance : ");
      balance = sc.nextDouble();
      sc.nextLine();
      account[i] = new Account(Name, accNo, bankType, balance);
      System.out.println("------------------Account created sucessfully---------------");
    }

    for (Account acc : account) {
      acc.display();
    }
    System.out.println();
    System.out.println("Total number of account holders : " + Account.gettotalAccHolders());
    sc.close();
  }
}
