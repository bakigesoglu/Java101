import java.util.Scanner;
/*
@author alfonso
 */
public class Classpassingstatus {
    public static void main(String[] Args) {
        float math, phy, che, bio, geo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math test score: ");
        math = inp.nextFloat();
        System.out.print("Enter your physic test score: ");
        phy = inp.nextFloat();

        System.out.print("Enter your chemistry test score: ");
        che = inp.nextFloat();

        System.out.print("Enter your biology test score: ");
        bio = inp.nextFloat();

        System.out.print("Enter your geometry test score: ");
        geo = inp.nextFloat();
        float average;
        float sum = (math + phy + che + geo + bio);
        int i=5;


        if ((math < 0) || (math > 100)) {
            sum = sum-math;
            i--;
        }
        if ((phy < 0) || (phy > 100)) {
            sum = sum-phy;
            i--;
        }
        if ((che < 0) || (che> 100)) {
            sum = sum -che;
            i--;
        }
        if ((bio < 0) || (bio > 100)) {
            sum = sum-bio;
            i--;
        }
        if ((geo < 0) || (geo > 100)) {
            sum = sum-geo;
            i--;
        }
        average = sum/i;
        if ( average >= 55) {
            System.out.println(average);
            System.out.print("You passed the class... ");
        }
        else {
            System.out.println(average);
            System.out.print("Class repetition...");
        }

    }
}
