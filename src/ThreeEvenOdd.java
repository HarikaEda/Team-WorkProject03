import java.sql.Array;

public class ThreeEvenOdd {
     /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*
   TASK ->
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true return eden threeEvenOrOdd method create ediniz.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {
        int[] array=new int[4];
        threeEvenOrOdd(array);



    }

    private static boolean threeEvenOrOdd(int[] array) {
        int counter=0;
        int[] array1 = {2, 1, 3, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2==0) {
                counter++;
                if (counter==3)
                return true;
               else return false;
            } else if (array[i]%2!=0) {
                counter++;if (counter==3){
                    return true;
                }else
                    return false;

            }
        }

        return false;
    }
}
