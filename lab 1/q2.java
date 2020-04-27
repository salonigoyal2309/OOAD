import java.util.Scanner;
import java.io.*;
public class q2 {
    public static void main(String args[]) {
     
      Scanner in = new Scanner(System.in);
      System.out.print("enter size of square matrix : ");
      System.out.println();
      int n = in.nextInt();
      int m = in.nextInt();
     
      int a[][] = new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              a[i][j] = in.nextInt();
          }
      }
     
      System.out.print("Enter size of sub-matrix : ");
      int k = in.nextInt();
      System.out.println();
     
      int i=0,j=0,cnt=1;
     
      while(i+k<=n){
         
          while(j+k<=m){
             
              System.out.println(cnt+ ":" );
              cnt+=1;
              for(int p=i;p<i+k;p++){
                 
                  for(int q=j;q<j+k;q++){
                     
                      System.out.print(a[p][q]+" ");
                     
                  }
                  System.out.println();
              }
              j+=k;
          }
          i+=k;
          j=0;
      }
    }
}


