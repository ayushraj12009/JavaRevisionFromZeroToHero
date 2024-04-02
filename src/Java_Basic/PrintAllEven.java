package Java_Basic;

import java.util.Scanner;

public class PrintAllEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=0; i<=input; i++){
            if(i%2 == 0){
                System.out.println("Even "+ i);
            }
            if(i%2 == 1){
                System.out.println("Odd " + i);
            }

        }
    }
}
