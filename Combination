import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
       int n,r,k=0,t=1,total=1,a=0;
    Scanner inp = new Scanner(System.in);
  System.out.print("Enter First number: ");
    n= inp.nextInt();

   System.out.print("Enter second number");
    r= inp.nextInt();
      int [] numbers= new int[r];
      int [] num = new int[r];
    
    for (int i=1; i<=r ; i++)
    {
      
      numbers [k] = n;
      n-=1;
      k++;
      
    }
    for (int j=0; j<r ; j++)
      {
        t*=numbers [j];
      }
    
    for (int i=r; i >= 1 ; i--)
    {
      
      num [a] = i;
      a++;
      
    }
    for (int j=0; j<r ; j++)
      {
        total*=num [j];
      }
    int c = t/total;
    System.out.print("Combination: " + c);
    
  }
}
