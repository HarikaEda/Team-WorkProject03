import java.util.Scanner;

public class SubtractionSquare {
 /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /* TASK ->
    Girilen iki tamsayı değerine kadar olan sayıların toplamının karalerinin toplamını return eden substSquare
    method create ediniz.

   Örnek:

    int 1 = 10; -> (1+2+3+...+10)^2=3025

    int 2 = 5;  -> (1+2+3+...+5)^2=225

    3025 + 225 = 3250
    return 3250
    */

    public static void main(String[] args) {


        int kareToplam = 0;
        getSumOfSquares(kareToplam);
        System.out.println(getSumOfSquares(kareToplam));
    }
    private static int getSumOfSquares(int kareToplam) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. tam sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2. tamsayıyı giriniz");
        int sayi2 = input.nextInt();
            int toplam = 0;
            int toplam2 =0;
            int kare1 = 0;
            int kare2 = 0;
            for (int i = 1; i < sayi1; ++i) {
                toplam += i;
                kare1 = toplam * toplam;
            }
            System.out.println("kare = " + kare1);
            for (int j = 1; j < sayi2; ++j) {
                toplam2 += j;
                kare2 = toplam2 * toplam2;
            }
            System.out.println("kare = " + kare2);
            kareToplam = kare1 + kare2;
            System.out.println("kareToplam = " + kareToplam);
            return kareToplam;
        }

    }




