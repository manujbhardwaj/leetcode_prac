/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2. 
*/






















/*
    int xor = 0;
    for (int i = 0; i < nums.length; i++) 
    {
            xor = xor ^ i ^ nums[i];
    }

    return xor ^ i;
*/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums)
        {
            sum = sum + i;
        }
        int len = nums.length;
        return (len*(len+1)-2*sum)/2;
    }
}
