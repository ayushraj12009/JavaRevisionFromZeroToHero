package Basic_of_Array;

public class largestThreeEle {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i : arr){
            first = Math.max(first, i);
        }

        for (int i : arr ){
            if(i != first){
                second = Math.max(second, i);
            }
        }

        for (int i : arr){
            if (i != first && i != second){
                third = Math.max(third, i);
            }
        }


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
