import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, i, f, combination, nfac = 1, rfac = 1, cfac = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("n değeri girin: ");
        n = inp.nextInt();
        System.out.println("r değeri girin: ");
        r = inp.nextInt();
        f = n - r;
        for (i = 1; i <= n; i++)
            nfac = nfac * i;
        for (i = 1; i < r; i++)
            rfac = rfac * i;
        for (i = 1; i < f ; i++)
            cfac = cfac * i;
        combination = nfac / (rfac * cfac);
        System.out.println("combination ("+n+","+r+"): " + combination);
    }

}
