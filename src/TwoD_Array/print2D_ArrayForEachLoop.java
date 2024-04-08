package TwoD_Array;

public class print2D_ArrayForEachLoop {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};

        for (int[] i : arr){ // 2d array arrow of array hota hai tho first ye array pe traverse krega {1,2,3}
            for (int ele : i){ // ye array ke ander ek pure aaray ko pring krega eske liye
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
