
import java.util.HashMap;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/




















public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i : nums)
        {
            if(!map.containsKey(i))
            map.put(i, 1);
            else
            map.put(i, map.get(i)+1);    
            
            if(map.get(i) > nums.length/2)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
