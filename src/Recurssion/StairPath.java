package Recurssion;

public class StairPath {

    public static int path(int n){
        if(n <=3 ){
            return n;
        }

        return path(n-1)+path(n-3);
    }

    public static void main(String[] args) {

        System.out.println(path(5));
    }
}
