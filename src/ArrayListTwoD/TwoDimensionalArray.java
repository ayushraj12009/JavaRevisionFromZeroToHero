package ArrayListTwoD;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(70); d.add(80); d.add(90); d.add(100);

        /// list of list ka matlb ek arraylist me list
        // example esii ko le lete hai
        // a,b,c,d ye char arraylist hai ur listOfList arraylist ka arraylist hai
       // {{a}, {b}, {c}, {d}}

        List<List<Integer>> listOfList = new ArrayList<>();
        // list of list add krna

        listOfList.add(a);
        listOfList.add(b);
        listOfList.add(c);
        listOfList.add(d);

        // print list of list using loop
        for (int i = 0; i <listOfList.size() ; i++) {
            List<Integer> temp = listOfList.get(i); // basically ek list ke ander ke list ko temp me store kar diya
            for (int j = 0; j <temp.size() ; j++) { // ur simple print list laga diye ye logic easy to use hai remember
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }












    }
}
