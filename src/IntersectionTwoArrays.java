
import java.util.HashSet;
/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:

    Each element in the result must be unique.
    The result can be in any order.
*/
















public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1)
        {
            set.add(i);
        }
        HashSet<Integer> arr = new HashSet<>();
        for(int i : nums2)
        {
            if(set.contains(i))
            arr.add(i);
        }
        int[] ans = new int[arr.size()];
        int m = 0;
        for(int i : arr)
        {
            ans[m++] = i;
        }
        return ans;
    }
}
