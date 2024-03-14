import java.util.Scanner;

public class sumOfMatrix {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][n];
    int[][] b = new int[n][n];
    int[][] c = new int[n][n];
    int k = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = k++;
      }
    }
    
    System.out.println("matrix A elements are");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        b[i][j] = n * (i + j);
      }
    }
    System.out.println("matrix B elements are");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    System.out.println("the sum of a matrix is ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
