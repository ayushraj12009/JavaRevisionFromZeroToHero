package BinarySearch;

public class BasicOfBinarySearch {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 20;

        // binary search ka rule
        // ek low ek high then mid nikalo ur target ko match kro
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            // targer bara hai tho low ko mid pe lana hai
            else if(arr[mid] < target){
                low = mid +1;
            }
            // target chota hai tho high ko kam krna hai
            else if (arr[mid] > target ){
                high = mid -1;
            }


        }


    }
}
