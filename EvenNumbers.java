import java.util.Scanner;
public class EvenNumbers {
    public static void main (String [] Args) {
        int number,i=1,sum=0,k=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number :  ");
        number = inp.nextInt();

        while(i <= number) // i den number a kadar hesap yapacak olan döngü
        {
            if (i%3==0 && i%4==0) //3 e ve 4 e tam bölünme şartı
            {
                System.out.println(i);
                sum=sum+i; // terimlerin toplamını bulmak için işlem.
                k=k+1;    // Terim sayısını bulmak için sayaç.

            }
          i++;

        }

        System.out.print("Avarage: " + sum/k);
    }
}
