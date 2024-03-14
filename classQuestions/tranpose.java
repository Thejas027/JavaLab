public class tranpose {

  public static void main(String[] args) {
    int n;
    n = Integer.parseInt(args[0]);

    int [][] arr = new int[n][n];
    int k=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<n;j++){

        arr[i][j] = k++;
      }
    }
    System.out.println("the array elements are");
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

for(int i=0; i<n; i++){
  for(int j=i+1; j<n; j++){
 
      int temp = arr[i][j];
      arr[i][j] = arr[j][i];
      arr[j][i]=temp;
    
  }
}
    System.out.println("tranpose of a matrix is");
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}