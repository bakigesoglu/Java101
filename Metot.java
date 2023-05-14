import java.util.Scanner;

public  class Metot {
   static int power (int base,int exp) { //return metot yazdık
        int total=1;
        for (int i=1; i<=exp; i++)
        {
            total*=base;
        }
        return total;
    }
    static void sum(int base, int exp){ //void metot yazdık

     System.out.print(base+exp);
    }
    static int power(float base,float exp) {
       // power adında zaten bi metodumuz vardı içindeki parametreleri vs değiştirince
       // - overloading yöntemiyle aynı isimde metot olusturabiliriz.
       int total=1;
       for (int i=1; i<=base; i++)
       {
           total*=base;
       }
       return total;
    }
    public static void main (String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = inp.nextInt();
        System.out.print("Kuvveti giriniz: ");
         int exp = inp.nextInt();

        System.out.println(power(base,exp));

        sum (base,exp);

    }
}
