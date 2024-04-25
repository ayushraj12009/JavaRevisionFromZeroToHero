package Recurssion;

public class SumReturnType {

    public static int sum(int n){
        if( n == 1){
            return 1;
        }
        int temp = n + sum(n-1);
        return temp;
    }

    public static void main(String[] args) {
        int ans = 5;
        System.out.println(sum(ans));

    }
}
