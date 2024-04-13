package String;

public class OccuringTheMaxChar {
    public static void main(String[] args) {
        String s = "abaaacrmnrra";

        int[] frequency = new int[26]; // ye es karn hai kyu ki letter tho 26 hi hota tho utna size ka array bana lo


        // loop ke thorugh travers kar ke jo jitna baat aya usko store kr do frequency me
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch-97; // 97 esk arn kyu ki total small letter hai ur 97 small a ka ascaii value hota h
            frequency[ascii]++; // ye frequency update ho rha kaun kitna baat aaya
        }
        int ans = 0;
        for (int ele : frequency){
            System.out.print(ele + " ");
            ans  = Math.max(ans,ele);
        }
        System.out.println();
        System.out.println(ans);

        for (int i=0; i<frequency.length; i++){
            if (frequency[i] == ans){
                char ch = (char)(i+97); // esse ye pata chal rha ki kaun sa word sabse jada aayah ia
                System.out.println(ch + " "); // matlb ki frequency 0 se 26 tak tha tho usme 97 add kar diye tho value aa gya
            }
        }



    }
}
