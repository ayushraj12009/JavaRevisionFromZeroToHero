package TwoD_Array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] grid = {{10,20},{30,10},{50,10}};
        int m = grid.length;
        int n = grid[0].length;

        for (int[] ele : grid){
            for(int i : ele){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j =0; j<n; j++){
            for (int i =0; i<m;i++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }






    }
}
