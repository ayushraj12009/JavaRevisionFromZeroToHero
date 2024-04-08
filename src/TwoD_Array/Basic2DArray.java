package TwoD_Array;

import java.util.Scanner;

public class Basic2DArray {
    public static void main(String[] args) {
        // how to initinilatiztion

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // row length
        int m = arr.length; // row ka
        int n = arr[0].length; // eska ye hai ki array 0 pe kitna lenth hai
        // example
        // 10 20 30   //arr[0][1] matlb 10 tho arr[0].length means 0 pee kitna number of coloumn hai ye pata chalta
        // 40 50 60  // 2d array me column same hi hota hai sab ka es krn
        // 70 80 90

        // print for loop
        for(int i=0; i<m; i++){ // note: first loop humesa row ke liye hota hai
            for (int j=0; j<n; j++){ // 2nd loop humesha column ke liye hota hai
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // taking input using scanner
        for(int i=0; i<m; i++){ // note: first loop humesa row ke liye hota hai
            for (int j=0; j<n; j++){ // 2nd loop humesha column ke liye hota hai
                arr[i][j] = sc.nextInt();
            }
        }

        // after taking input printing the 2d array
        for(int i=0; i<m; i++){ // note: first loop humesa row ke liye hota hai
            for (int j=0; j<n; j++){ // 2nd loop humesha column ke liye hota hai
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }
}
