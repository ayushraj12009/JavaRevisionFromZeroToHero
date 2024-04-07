package Basic_of_Array;

public class ProductCalucltte {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int ans = 1;

        for (int i: arr){
            ans = i * ans;
        }

        System.out.println(ans);
    }
}
