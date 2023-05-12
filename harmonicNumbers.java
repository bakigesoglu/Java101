import java.util.Scanner;
/*
@author alfonso
 */
public class harmonicNumbers {
    public static void main (String [] Args) {
         Scanner read = new Scanner(System.in);
         int number;
         double result = 0;

         System.out.print("Enter a number for Harmonic numbers: ");
         number = read.nextInt();

      for (int i =1; i <= number; i++ )
      {
          result+=(1.0/i);
      }
        System.out.println(result);

    }
}
