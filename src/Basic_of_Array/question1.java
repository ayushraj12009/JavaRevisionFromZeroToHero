package Basic_of_Array;

public class question1 {
    public static void main(String[] args) {
        int[] arr = {20, 50, 30, 85, 10, 40};

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] < 35){
                System.out.print(i + " ");
            }
        }


    }

}
