/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/

























public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0)
        {
            count = count + (n/5);
            n = n/5;
        }
        return count;
    }
}
