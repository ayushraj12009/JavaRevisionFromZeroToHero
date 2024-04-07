package Basic_of_Array;

public class missingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3, 5};
        int n = arr.length-1;

        int ans = 0;
        for (int i=0; i<n; i++){
            if(arr[i] != arr[i+1]){
                ans = arr[i] + 1;
            }
        }

        System.out.println(ans);
    }

}
