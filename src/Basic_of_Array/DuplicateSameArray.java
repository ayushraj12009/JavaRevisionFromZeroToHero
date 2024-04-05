package Basic_of_Array;

import java.util.Arrays;

public class DuplicateSameArray {
    public static void main(String[] args) {
        //statement ye hai ki arr ka same copy element bana hai
        int[] arr = {10, 20, 30, 40, 50};

        int[] temp = arr; // yeha pe referance aa gya
        // jisko hum sallow copy bolte hai

        // tarika
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        // esko deep copy bolte hai copy ban gya array ka


    }
}
