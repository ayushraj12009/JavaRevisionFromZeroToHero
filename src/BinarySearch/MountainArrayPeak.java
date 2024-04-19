package BinarySearch;

public class MountainArrayPeak {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0};
        // output 1
        int n = arr.length;
        int low =0;
        int high = n -1;

        while (low <= high){
            int mid = low + (high-low) /2;
            if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid +1]){
                System.out.println(mid);
                break;
            }
        }

    }
}
