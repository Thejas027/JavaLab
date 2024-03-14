// import java.util.Scanner;

// public class fibbonaci {
//   public static void main(String[] args) {
//     int a = 0, b = 1;
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     System.out.println(a);
//     System.out.println(b);
//     while (n > 2) {
//       int c = a + b;
//       System.out.println(c);
//       a = b;
//       b = c;
//       c = a + b;
//       n--;
//     }
//     sc.close();
//   }
// }

import java.util.Scanner;

/**
 * fibbonaci
 */
public class fibbonaci {

  public static void main(String[] args) {
    int n, a = 0, b = 1, c;
    System.out.println("Enter n value");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(a);
      c = a + b;
      a = b;
      b = c;
    }
    s.close();
  }
}