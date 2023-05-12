import java.util.Scanner;
/*
@author alfonso
 */
public class ArmstrongNumber {
    public static void main (String [] Args){
        int number,exponent=1,firstNumber,basValue,total,result=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inp.nextInt();
        firstNumber=number;

        while (firstNumber >= 10){
            firstNumber/=10;
            exponent++;
        }
        firstNumber= number;
        while (firstNumber !=0)
        {
            basValue = firstNumber %10;
            total = 1;
            for (int i =1; i <= exponent; i++)
            {
                total*=basValue;
            }
             result += total;
            firstNumber /=10;
        }
        if (result == number ) {
            System.out.print(number + " is a Armstrong number.");
        } else
        {
            System.out.print(number + "is not a armstrong number.");
        }
    }


}
