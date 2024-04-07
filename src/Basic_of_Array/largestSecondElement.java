package Basic_of_Array;

public class largestSecondElement {
    public static void main(String[] args) {
        int arr[] = {20, 30, 50, 230};

        int firstLargest = Integer.MAX_VALUE;

        for(int i : arr){
            firstLargest = Math.min(firstLargest, i);
        }
        System.out.println(firstLargest);

        int secondLarges = Integer.MAX_VALUE;
        for (int i : arr){
            if(i != firstLargest){
                secondLarges = Math.min(i, secondLarges);
            }
        }

        System.out.println(secondLarges);
    }
}
