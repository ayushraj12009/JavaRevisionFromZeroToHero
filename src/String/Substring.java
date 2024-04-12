package String;

public class Substring {
    public static void main(String[] args) {
        // substring matlb ki ek string ka continuous part that is said  to be substring
        // substring koi v chota sa part ur wo continuous hona chaiye

        String s = "abcd";
        for (int i = 0; i <=s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.print(s.substring(i,j) + " " );
            }
            System.out.println();
        }


        // integer to string convert
        int a = 500;
        String ab = Integer.toString(a); //Integer to string builtin function h
        System.out.println(ab);





    }
}
