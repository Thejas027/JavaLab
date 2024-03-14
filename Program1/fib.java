public class fib {

  public static void main(String[] args) {
    int a=0,b=1,c;
    int n=8;
    for(int i=1; i<=n;i++){
      System.out.println(a+" ");
      c=a+b;
      a=b;
      b=c;
    }
  }
}

