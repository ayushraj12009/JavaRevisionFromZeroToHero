package Basic_of_Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20, 50, 30, 85, 10, 40};

        int n = arr.length;
        int maximum = Integer.MIN_VALUE;

        // Step 1: sabse pahile maximum fina kar lo
        for(int i=0; i<n; i++){
            maximum = Math.max(arr[i], maximum);
        }

        int secondMaximum = Integer.MIN_VALUE;

        // step 2: agr arr[i] maximum value ke barabar hoga tab hi if condition work karega
        // es karn se jo first maximum tha usko skip kar diye tho ans aa jayega 2nd maximum
        for (int i=0; i<n; i++){
            if(arr[i] != maximum ){
                secondMaximum = Math.max(arr[i], secondMaximum);
            }
        }

        System.out.println(secondMaximum);


    }
}
