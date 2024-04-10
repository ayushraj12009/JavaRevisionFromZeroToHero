package TwoD_Array;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid1 = new int[3][3];
        int m1 = grid1.length;
        int n1 = grid1[0].length;

        // 1 2 3        //  1 1 1
        // 4 5 6        //  1 1 1
        // 7 8 9        //  1 1 1

        int[][] grid2 = new int[3][3];
        int m2 = grid2.length;
        int n2 = grid2[0].length;


        for (int i = 0; i <m1 ; i++) {
            for (int j = 0; j <n1 ; j++) {
                grid1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <m2 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                grid2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[3][3];
        int row = grid1.length;
        int col = grid2[0].length;


        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                sum[i][j] = grid1[i][j] + grid2[i][j];
            }
        }

        int sumR = sum.length;
        int sumC = sum[0].length;

        for (int i = 0; i <sumR ; i++) {
            for (int j = 0; j <sumC ; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }





    }
}
