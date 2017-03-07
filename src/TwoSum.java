
import java.util.HashMap;
import java.util.LinkedList;

/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/











/*
What if the array is sorted
We can use binary search method

public int[] twoSum(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while(start < end)
    {
        if(nums[start] + nums[end] == target)
            break;
        else if(nums[start] + nums[end] > target)
        {
            end--;
        }
        else
        {
            start++;
        }
        return new int[] {start+1, end+1};
    }
}
*/

/*
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) 
    {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) 
    {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) 
        {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
