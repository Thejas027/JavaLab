package Program8;
import java.util.Scanner;

class Book {
  Scanner sc = new Scanner(System.in);
  String BookName;
  int BookCode;
  double BookPrice;
  int Quantity;

  public Book(String BookName, int BookCode, double BookPrice, int Quantity) {
    this.BookName = BookName;
    this.BookCode = BookCode;
    this.BookPrice = BookPrice;
    this.Quantity = Quantity;
  }

  public double CalculateTotalPrz() {
    return BookPrice * Quantity;
  }

  public void display() {
    double totalPrice = CalculateTotalPrz();
    System.out.printf("%-20s %-20s %-20s %-25s %-20s\n", BookName, BookCode, BookPrice, Quantity, totalPrice);
  }
}

public class LibarayBook {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Book[] book = new Book[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter Book Nmae : ");
      String BookName = sc.nextLine();
      System.out.print("Enter Book Code :");
      int BookCode = sc.nextInt();
      System.out.print("Enter Book Price :");
      double BookPrice = sc.nextDouble();
      System.out.println("Enter Quantity :");
      int Quantity = sc.nextInt();
      sc.nextLine();
      book[i] = new Book(BookName, BookCode, BookPrice, Quantity);
    }
    System.out.printf("%-20s %-20s %-20s %-25s %-20s\n", "NAME", "CODE", "UNIT PRICE", "QUANTITY", "TOTAL PRICE");

    for (Book b : book) {
      b.display();
    }
    sc.close();
  }
}
