package TwoD_Array;

import java.util.Scanner;

public class LargestElementIn2DArray {
    public static void main(String[] args) {

        // question largest element kya hai 2d array mein
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        int m = arr.length;
        int n = arr[0].length;

        // taking input from user 3 x 3 matrix
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = Integer.MIN_VALUE;

        // step loop chala rhe hai element pe aur usko answer se compare kar ke update kar de rhe hai

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
//                if (ans < arr[i][j]){
//                    ans = arr[i][j];
//                }
                // dono kar sakte ho compare ya inbuild funtion
                ans = Math.max(ans , arr[i][j]);
            }
        }

        System.out.println(ans);





    }
}
