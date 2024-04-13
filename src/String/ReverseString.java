package String;

public class ReverseString {

    public static void reverse(StringBuilder sb, int i, int j){
        while (i <= j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("i am ayush raj");

       int i =0;
       int j =0;

       int n = sb.length();

       while (j <n ){
           if(sb.charAt(j) != ' ') j++;
           else {
               reverse(sb, i, j-1);
               i = j+1;
               j = i;
           }
       }
        reverse(sb, i, j-1);


        System.out.println(sb);

    }
}
