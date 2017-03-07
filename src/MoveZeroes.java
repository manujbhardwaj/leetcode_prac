
import java.util.ArrayList;

/*
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
*/















/*
public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] ans = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++)
        {
            if(nums[i] == 0)
            count++;
            else
            ans[m++] = nums[i];
        }
        
        for(int i = 0; i < count; i++) 
        {
            ans[m++] = 0;
        }
        for(int i = 0; i < n; i++) 
        {
            nums[i] = ans[i];
        }
    }
*/
/*
    public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int m = 0;
        for (int i = 0; i < n; i++)
        {
            if(nums[i] != 0)
            {
                nums[m++] = nums[i];
            }
            else
            count++;
        }
        
        for(int i = 0; i < count; i++) 
        {
            nums[m++] = 0;
        }
    }
*/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len =  nums.length;
        
        for(int i = 0; i < len ; i++)
        {
            if(nums[i] == 0)
            {
                int n = i;
                for(int j = i+1; j < len; j++)
                {
                    if(nums[j] != 0)
                    {
                        int temp = nums[j];
                        nums[j] = nums[n];
                        nums[n] = temp;
                        n++;
                    }
                }
            }
        }
    }
}
