import java.util.Scanner;
/*
@author alfonso
 */
public class SumOfDigits {
    public static void main (String [] Args) {

        Scanner inp = new Scanner(System.in);
        int number,remain,total=0;
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        while (number != 0)
        {
            remain = number % 10 ;
            total+=remain;
            number/=10;
        }
          System.out.print(total);
    }
}
