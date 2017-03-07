/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer. 
*/


/*
    public int climbStairs(int n) {
        if(n < 0)
        return 0;
        if(n == 0 || n == 1 || n == 2)
        return n;
        
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for(int i = 2; i < n; i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n-1];
    }
*/

/*
If there are three steps that can be taken.
Add previous three instead of just two steps.
*/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 0)
        return 0;
        if(n == 1)
        return 1;
        if(n == 2)
        return 2;
        
        int ans = 2;
        int prev = 2;
        int prev_two = 1;
        for(int i = 3; i <= n; i++){
            ans = prev + prev_two;
            prev_two = prev;
            prev = ans;
        }
        return ans;
    }
}
