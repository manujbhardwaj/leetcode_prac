
import java.util.HashMap;

/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory? 
*/


















/*
    int result = 0;
    for (int i = 0; i<n; i++)
    {
	result = result ^ A[i];
    }
    return result;
*/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            if(map.get(i) == null)
            map.put(i, 1);
            else
            map.put(i, 2);
        }
        int ans = 0;
        for(int i : map.keySet())
        {
            if(map.get(i) == 1)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
