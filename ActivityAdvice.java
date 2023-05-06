import java.util.Scanner;
/*
@author alfonso
 */
public class ActivityAdvice {
    public static void main (String [] Args) {

        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter air temperature: ");
        heat = inp.nextInt();

        if (heat <= -10) {
            System.out.println("You can watch on Netflix at home.");
        }
        else if (heat <=25){
            if (heat <=3 ) {
                System.out.println("You can go to skiing.");
            }

            if (heat > 0) {
                System.out.println("you can go to cinema.");
            }
            if (heat >10) {
                System.out.println("You can go to picnic");
            }

          } else {
            System.out.println("You can go swimming.");
        }

    }
}
