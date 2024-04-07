package Basic_of_Array;

public class GreaterToX {
    public static void main(String[] args) {
        int x = 10;

        int[] arr = {20 , 10, 50,40,200,30,2,1};

        int count = 0;
        for (int i : arr){
            if(i >= x) count++;
        }

        System.out.println(count);
    }
}
