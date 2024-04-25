package Recurssion;

import java.util.Scanner;

public class SumUsingRecursion {
    public static void sum(int n, int s){
        if(n == 0){
            System.out.println(s);
            return;
        }

        sum(n-1,s+n);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        //int ans = 5;
        sum(n,0);
        //System.out.println(sum(ans,0));

    }
}
