import java.util.Scanner;

public class recursiveFibonacci {
    public static void main (String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.print(f(n));
    }
    static int f(int n) { // 0-1-1-2-3-5-8-13-21 şeklinde ilerleyen fibonacci serisi metodu.
        if (n == 1)  //f(1)=0
        {       return 0;
    }
        else if (n==2)  //f(2)=1  **Yani biz f(1) ve f(2) değerlerini biliyoruz.
        {
            return 1;
        }
   return f(n-1)+f(n-2);
}
}
