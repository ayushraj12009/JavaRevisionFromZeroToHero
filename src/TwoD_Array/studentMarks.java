package TwoD_Array;

import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[][] grid = new int[4][2];

        int row = grid.length;
        int col = grid[0].length;



        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }


        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }



    }
}
