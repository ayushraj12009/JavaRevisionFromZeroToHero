package BinarySearch;

public class LowerBoundBinarySearch {
    public static void main(String[] args) {
        int[] arr= {10, 20, 30, 30, 40, 50, 60, 70};
                //  0    1   2  3    4   5   6   7
        int x = 35;

        int n = arr.length;
        int low = 0;
        int high = n-1;
        int lowerBoud = n;

        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                lowerBoud = Math.min(lowerBoud, mid);
                high = mid - 1;
                // agr high = mid -1 es krn hua kyu ki agr lower bound mil gya jyse 30
                // tho 40 se 70 ka kya hi kam woo tho higer me aa gya
                // es krn high = mid - 1 hai
             //   int[] arr= {10, 20, 30, 30, 40, 50, 60, 70};
                //  0    1   2  3    4   5   6   7
            }
            else low = mid +1;
        }

        System.out.println(lowerBoud);


        // uperbound

        int lo = 0;
        int hi = n-1;
        int upperBound = n;

        while (lo <= hi){
            int mi = lo + (hi - lo)/2;
            if(arr[mi] > x){
                upperBound = Math.min(upperBound, mi);
                hi = mi - 1;
            }
            else lo = mi +1;
        }

        System.out.println(upperBound);



    }
}
