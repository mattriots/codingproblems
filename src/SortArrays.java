import java.util.Arrays;

public class SortArrays {

   public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};
       int m = 3;
       int n = 3;

    //    int[] nums1 = {0,0,0,0,0};
    //    int[] nums2 = {1,2,3,4,5};
    //    int m = 0;
    //    int n = 5;

       Solution sol = new Solution();
       sol.merge(nums1, m, nums2, n);

   }

    static class Solution {
       public void merge(int[] nums1, int m, int[] nums2, int n) {

          for(int i = 0; i < nums2.length; i++){
              nums1[m + i] = nums2[i];
           }

           Arrays.sort(nums1);
           for(Integer num : nums1){
               System.out.println(num);
           }
       }
   }
}
