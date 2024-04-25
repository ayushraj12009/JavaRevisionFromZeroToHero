package BinarySearch;

public class SearchInRotateArray {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        //output should be 0

        int n = arr.length;
        int low =0;
        int high = n-1;
        int idx = 0;
        while (low <= high){
            int mid = low  + (high - low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid + 1]){
                idx = mid;
            }
        }



    }
}
