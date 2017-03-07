
import java.util.Arrays;
import java.util.HashMap;

/*
Given scores of N athletes, find their relative ranks 
and the people with the top three highest scores, 
who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:

    N is a positive integer and won't exceed 10,000.
    All the scores of athletes are guaranteed to be unique.
*/









public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        String[] ans = new String[len];
        
        for(int i = 0; i < len; i++)
        {
            map.put(nums[i], i);
        }
        
        Arrays.sort(nums);
        
        for(int i = 0; i < len/2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[len - 1 - i];
            nums[len - 1 - i] = temp;
        }
        
        ans[map.get(nums[0])] = "Gold Medal";
        if(len > 1)
            ans[map.get(nums[1])] = "Silver Medal";
        if(len > 2)
            ans[map.get(nums[2])] = "Bronze Medal";
        
        for(int i = 3; i < len; i++)
        {
            ans[map.get(nums[i])] = Integer.toString(i + 1);
        }
        return ans;
    }
}
