import java.util.Arrays;
import java.util.Scanner;
/*
@author alfonso
 */
public class NumberSorting {
    public static void main (String [] Args) {
         int a;
         Scanner inp = new Scanner(System.in);

         System.out.print("How many numbers do you want to sort ? : ");
         a= inp.nextInt();
         int [] numbers = new int[a];
         int i,k=1;
         for (i=0; i<a ; ++i) {
             System.out.print("Enter "+ k+"."+" number: ");
             numbers [i] = inp.nextInt();
             k++;
         }
        Arrays.sort(numbers);
         System.out.println("Numbers: ");
         for (int s : numbers){
             System.out.print(s+ "");
         }
         }




    }

