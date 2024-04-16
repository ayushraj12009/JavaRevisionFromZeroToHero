package String;

public class CompressString {
    public static void main(String[] args) {

        //solution based on two pointer
        String s = "aaabbccaab";
        char[] arr = s.toCharArray();
        //output: a4b2cd2ef2a3;

        //StringBuilder sb = new StringBuilder();

        String ans = "";
        int i=0, j=0;

        while (j <arr.length){
            if(arr[i] == arr[j]) j++;
            else {
                ans += arr[i];
                int len = j -i; // length nikal gya kitna i element h
                if(len > 1){
                    ans += len;
                    i = j;
                }
            }
        }
        // ye extra es karn rhe hai kyu ki j last me end ho jata last bala element ko add krne keliye ye hai
        // kyu ki loop jab end hoga tho i v pata hai ur j v es krn
        ans += arr[i];
        int len = j -i; // length nikal gya kitna i element h
        if(len > 1){
            ans += len;
        }


        System.out.println(ans);



    }
}
