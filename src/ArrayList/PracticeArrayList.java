package ArrayList;

import java.util.ArrayList;

public class PracticeArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 20) {
                arr.set(i, 100);
            }
        }

        System.out.println(arr);
    }
}
