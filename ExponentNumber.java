import java.util.Scanner;
/*
@author alfonso
 */
public class ExponentNumber {
    public static void main (String [] Args) {
        int number,exponent;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inp.nextInt();

        System.out.print("Enter exponent: ");
        exponent = inp.nextInt();

        int total = 1;

        for (int i = 1; i<=exponent ; i++)
        {
            total*=number;
        }
        System.out.print(total);
    }

}
