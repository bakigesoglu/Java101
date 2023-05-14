import java.util.Scanner;

public class RecursiveLearning {
    //Recursive metotlar bir metodun kendisini çağırma tekniğidir.
public static void main (String[] Args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter a n value: ");
    int n = inp.nextInt();

    System.out.println(f(n));
}
static int f(int n) {
    if (n <= 1 )// recursive metotta bir koşul return değeri ile infinity loop olusmasını engelleriz.
    {
        return 1; // koşul saglandıgında 1 değeri dönecek.
    }
    return f(n-1)+n; // girilen n sayıya kadar olan f fonksiyonlarının toplamını veren formül.

}
}
// f(n) = f(n-1) + n;
// ...
// f(3) = f(2)+3;
// f(2) = f(1)+2;
// f(1) = 1;
