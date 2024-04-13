package String;

import java.util.Arrays;

public class Angram {

   public static boolean isAngram(String s, String t){
       char[] temp1 = s.toCharArray();
       char[] temp2 = t.toCharArray();

       Arrays.sort(temp1);
       Arrays.sort(temp2);

       String final1 = new String(temp1);
       String final2 = new String(temp2);

       System.out.println(temp1);
       System.out.println(temp2);

       //return Arrays.equals(temp1,temp2);
       return final1.equals(final2);
   }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 =  "nagara";


        System.out.println(isAngram(s1,s2));

    }
}
