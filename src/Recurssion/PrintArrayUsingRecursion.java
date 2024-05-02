package Recurssion;

public class PrintArrayUsingRecursion {

    public static void printArray(int [] arr, int i){

        if(i == arr.length){
           // System.out.println(arr[i]);
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i+1);
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        printArray(arr,0);
    }
}
