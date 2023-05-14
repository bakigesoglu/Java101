import java.util.Scanner;

public class advencedCalculator {

    static void plus() {
        int number,result = 0,i = 1;
        Scanner inp = new Scanner(System.in);

    while (true) { // true dedik döngü sürekli olacak cıkmak isterse if ile döngü bitirme veriyoruz.

        System.out.print(i++ + ". number :");
        number = inp.nextInt();

        if ( number == 0)
        {
            break;
        }
        result += number;
    }
    System.out.println("Result: " +result);
    }
    static void minus() { // hata var
        int number,result=0, i=1;
        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print(i++ + " . number : ");
            number = inp.nextInt();


            if (number == 0)
            {
                break;
            }
            result-=number;
        }
        System.out.println("Result : " + result);
    }
    static void multiply() {
        int number,result=1,i=1;
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print(i++ + ". number : ");
            number = inp.nextInt();

            if (number ==0) {
                break;
            }
            result *= number;
        }
        System.out.println("Result : "+ result);
    }
    static void divide() { // hata var.
        Scanner inp = new Scanner(System.in);
        int number,result=0,i=1,temp;
        while (true){
            System.out.println(i++ +". number: ");
            number = inp.nextInt();

            temp= number;
            if ( temp == 0)
            {

                break;
            }

            result = temp / number;
        } System.out.println("Result: " + result);
    }

    static void power() {
        Scanner inp = new Scanner(System.in);
        int base,exp,result=1;
        System.out.print("Enter a base value: ");
        base = inp.nextInt();
        System.out.print("Enter a exponent value: ");
        exp = inp.nextInt();

        for (int i=1; i<=exp; i++)
        {
            result*=base;
        }
        System.out.println("Result: "+ result);
    }
    static  int f(int n){

        if (n==1) {
            return 1;
        }
     return f(n-1)*n;
    }
    static void mod(){
        Scanner inp = new Scanner(System.in);
        int number,k,result;
        System.out.print("Enter a number: ");
        number = inp.nextInt();
        System.out.print("Enter a mod number:  ");
         k= inp.nextInt();
        if (number == 0)
        {
            System.out.println("İnfinity");
        }
        result = number % k;
        System.out.println("Result "+ result);
    }
    static void rect() {
        Scanner inp = new Scanner(System.in);
        int shortEdge,longEdge,perimeter,area;

        System.out.print("Enter Short Edge length of rectangle : ");
        shortEdge = inp.nextInt();
        System.out.print("Enter Long Edge length of rectangle : ");
        longEdge = inp.nextInt();

        perimeter= (shortEdge+longEdge)*2;
        area = (shortEdge*longEdge);

        System.out.println("Perimeter of rectangle: "+ perimeter);
        System.out.println("Area of rectangle: "+ area);

    }


    public static void main (String [] Args) {
        Scanner inp = new Scanner(System.in);
        int select;

        do {
            System.out.print("Addition -> 1\nSubtraction -> 2\nMultiplication -> 3\nDivision -> 4\nExponent-> 5\nFactorial -> 6\nMod -> 7\nRectangle perimeter and area -> 8");
            select = inp.nextInt();
            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> multiply();
                case 4 -> divide();
                case 5 -> power();
                case 6 -> {
                    System.out.print("Enter a number: ");
                    int n = inp.nextInt();
                    System.out.println(f(n));
                }
                case 7 -> mod();
                case 8 -> rect();
            }
        } while (select!=0);
        System.out.println("See you soon...");
    }
}
