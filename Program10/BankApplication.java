
package Program10;

import java.util.Scanner;

abstract class Bank {
  protected String bankType;
  protected double interest;

  abstract void getRoi();

  public void deposit() {
    System.out.println("deposit functionality in bank");
  }

  public void offerCreditCard() {
    System.out.println("offering credit cad");
  }
}

class NationalBank extends Bank {

  // constructor
  public NationalBank() {
    bankType = "National";
  }

  void getRoi() {
    int termDeposit;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter term deposit : ");
    termDeposit = sc.nextInt();

    if (termDeposit >= 3) {
      interest = 0.7;
      System.out.println("interset rate for national bank : " + interest + "%");
    } else {
      System.out.println("Term deposit must be of atleast for 3 years");
    }
  }
}

class InterNationalBank extends Bank {
  // constructor
  public InterNationalBank() {
    bankType = "InterNational";
  }

  void getRoi() {
    System.out.println("Interset rate  for international bank : " + 0.8 + "%");
  }

  @Override
  public void offerCreditCard() {
    System.out.println("Platinum card offered");
  }
}

public class BankApplication {
  public static void main(String[] args) {

    Bank nationalBank = new NationalBank();
    Bank internationalBank = new InterNationalBank();

    System.out.println("\n-----National Bank------ \n");
    nationalBank.getRoi();
    nationalBank.offerCreditCard();

    System.out.println("\n------International Bank------\n");
    internationalBank.getRoi();
    internationalBank.offerCreditCard();
  }
}