package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class BasicOfString {

    public static void main(String[] args) {
        // takin input in string
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine(); // string sirf nextLine jata hai
//        System.out.println(str);



        //important
        // compareTO() is used to compare 2 given strings lexographically
        // lexographically matlb dictinonary jayse abcdefg starting me jo bara hoga uske according wo fit hoga
        // ur usi ko compareTO() thik karta hai


//        String s1 = "abc";
//        String s2 = "dbc";
//
//        System.out.println(s1.compareTo(s2));


        // string contains ka matlb ki koi v part exist krta hai ya nahi
        //example

        String str = "Learning Coding is good";
        System.out.println(str.contains("ood"));
        // simply contains true ya false return kar dega ur ye pura string
        // ys string ka khuch part ko include krta hai

        // startsWith -> eska mtlb ki jo staring ka element hai ya nahi
        System.out.println(str.startsWith("learn"));
        System.out.println(str.endsWith("ood"));


        String sort = "ayushraj";
        char[] s = sort.toCharArray();
        System.out.println(s);
        Arrays.sort(s);
        System.out.println(s);

        String finalAnswer = new String(s);


        System.out.println(finalAnswer);
        System.out.println(finalAnswer.getClass());


















    }







}
