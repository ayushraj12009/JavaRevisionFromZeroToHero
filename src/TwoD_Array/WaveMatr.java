package TwoD_Array;

import java.util.Scanner;

public class WaveMatr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] grid = new int[3][3];
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println();

//        for (int i = 0; i <m ; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print(grid[i][j] + " ");
//            }
//
//        }


        for (int i = 0; i <m ; i++) {
            if (i%2== 0){
                for (int j = 0; j <n ; j++) {
                    System.out.print(grid[i][j] + " ");
                }
            }else {
                for (int j =n-1; j>=0; j--){
                    System.out.print(grid[i][j] + " ");
                }
            }



        }




    }
}
