package String;

public class StringIsomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        //Note: Isomorphic ka matlb ye hota hai ki agr string a ka value string 2nd bale string ke sath change ho sakta ya nahi
        // esme ye dyan dene ki jarrut hoti hai ki ek string 2 ko map nahi karna chaye matlb jo e hai wo same time pe 2 ko indicate nahi kar sakta

        //coding logic
        // 128 ka frequecny array le lo
        // Step 2: ek string ka asscai value nikal ke uske charater pe store kar do
        // Step 3: 2nd bale string ke sath match karo ki wo match ho rha ya nahi agr ho rha tho tho autoamtically loop chalega
        // step 4: agr nahi ho rha tho return false kyu ki ek string 2ko map nahi kr sakta


        char [] freq = new char[128]; // 128 kyu ki assaci value me 128 hi character hai tho maximum le liye


        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char sh = t.charAt(i);
            int idx = (int) ch;
         if(freq[idx] =='\0') freq[idx] = sh;
         else{
             if(freq[idx] != sh) System.out.println("false");
         }
        }

        System.out.println("true");
    }
}
