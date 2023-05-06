import java.util.Scanner;
public class FindingZodiacSign {
    public static void main (String [] Args){
        Scanner inp = new Scanner(System.in);
        int month,day;
        String months;
        System.out.print("Which month were you born ? : ");
        month = inp.nextInt();
        months =inp.nextLine();
        System.out.print("Which day of the month were you born ? : ");
        day = inp.nextInt();

        if ((month == 1) || (months == "January")){
            if (day<=21){
                System.out.print("Your Zodiac Sign is : "+ " Capricorn ");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Aquarius");
            }
        }
        if ((month == 2) || (months == "February")){
            if (day<=19){
                System.out.print("Your Zodiac Sign is : "+ " Aquarius ");
            }
            else if (day >29){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Pisces");
            }
        }
        if ((month == 3) || (months == "March")){
            if (day<=21){
                System.out.print("Your Zodiac Sign is : "+ " Pisces");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Aries");
            }
        }
        if ((month == 4) || (months == "April")){
            if (day<=20){
                System.out.print("Your Zodiac Sign is : "+ " Aries ");
            }
            else if (day >30){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Taurus");
            }
        }
        if ((month == 5) || (months == "May")){
            if (day<=21){
                System.out.print("Your Zodiac Sign is : "+ " Taurus");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Gemini");
            }
        }
        if ((month == 6) || (months == "June")){
            if (day<=22){
                System.out.print("Your Zodiac Sign is : "+ " Gemini ");
            }
            else if (day >30){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Cancer");
            }
        }
        if ((month == 7) || (months == "July")){
            if (day<=22){
                System.out.print("Your Zodiac Sign is : "+ " Cancer");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Leo");
            }
        }
        if ((month == 8) || (months == "August")){
            if (day<=22){
                System.out.print("Your Zodiac Sign is : "+ " Leo ");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Virgo");
            }
        }
        if ((month == 9) || (months == "September")){
            if (day<=22){
                System.out.print("Your Zodiac Sign is : "+ " Virgo ");
            }
            else if (day >30){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Libra");
            }
        }
        if ((month == 10) || (months == "October")){
            if (day<=22){
                System.out.print("Your Zodiac Sign is : "+ " Libra ");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Scorpio");
            }
        }
        if ((month == 11) || (months == "November")){
            if (day<=21){
                System.out.print("Your Zodiac Sign is : "+ " Scorpio ");
            }
            else if (day >30){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Sagittarius");
            }
        }
        if ((month == 12) || (months == "December")){
            if (day<=21){
                System.out.print("Your Zodiac Sign is : "+ " Sagittarius ");
            }
            else if (day >31){
                System.out.print("Incorrect Day");
            }
            else {
                System.out.print("Your Zodiac sign is :" + "Capricorn");
            }
        }
    }
}
