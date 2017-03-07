
import java.util.ArrayList;
import java.util.HashMap;

/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:

    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.
*/
public class IntersectionTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1)
        {
            if(map.get(i) != null)
            map.put(i,map.get(i)+1);
            else
            map.put(i,1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums2)
        {
            if(map.containsKey(i) && map.get(i) > 0)
            {
                arr.add(i);
                map.put(i,map.get(i)-1);
            }
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
