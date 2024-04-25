package Basic_of_Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {11, 33, 42,72 };
        int[] nums2 = {26,54,69,81};

        int n = nums1.length;
        int m = nums2.length;

        int i = m-1;
        int j = n-1;
        ;int k = nums1.length - 1;

        while(j>=0){
            if(i >=0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }


    }
}
