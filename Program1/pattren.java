import java.util.Scanner;

public class pattren {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      for(int j=0; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}


// // inverted pyramid
// import java.util.Scanner;

// public class pattren {

//   public static void main(String args[]){
//   Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     for(int i=n; i>=1; i--){
//       for(int j=1; j<=i; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     sc.close();
//   }
// }


// // hollow rectangle
// import java.util.*;
// public class pattren {

//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//     int m = sc.nextInt();
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=m; j++){
//           if(i == 1 || j == 1 || i == n || j == m){
//             System.out.print("*");
//           } else{
//             System.out.print(" ");
//           }
//         }
//         System.out.println();
//       }
//       sc.close();
//   }
// }
