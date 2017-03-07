/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
*/























public class MaxSubArraySum {
    int maxSubArraySum(int a[], int size)
    {
       int max_so_far = a[0];
       int curr_max = a[0];

       for (int i = 1; i < size; i++)
       {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
       }
       return max_so_far;
    }
}
