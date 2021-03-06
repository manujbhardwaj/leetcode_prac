/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True

Example 2:

Input: 14
Returns: False
*/
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        for(int i = 1; num > 0; i=i+2)
        {
            num = num - i;
        }
        return (num == 0);
    }
}
