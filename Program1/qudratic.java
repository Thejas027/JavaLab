import java.util.Scanner;

public class qudratic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double D = b*b - (4* a * c);

    if(D > 0){
      double root1 =(-b + Math.sqrt(D))/(2*a);
      double root2 = (-b - Math.sqrt(D))/(2*a);
      System.out.println("roots are real ");
      System.out.println(root1);
      System.out.println(root2);
    }
    else if(D == 0){
      double root = -b /(2*a);
      System.out.println("roots are real and equal");
      System.out.println(root);
    }
    else{
      double realPart = -b / (2*a);
      double imgPart = Math.sqrt(-D/(2*a));
      System.out.println(realPart + "+i"+imgPart);
    }
    sc.close();
  }
}
