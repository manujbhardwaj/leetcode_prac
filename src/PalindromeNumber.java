/*
Determine whether an integer is a palindrome. Do this without extra space.
*/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
        return false;
        int ans = 0;
        for(int i = x; i != 0; i=i/10 )
        {
            if((ans*10) + (i%10) > Integer.MAX_VALUE/10 && i/10 != 0 ||
               (ans*10) + (i%10) < Integer.MIN_VALUE/10 && i/10 != 0)
               return false;
            ans = (ans*10) + (i%10);
        }
        return (ans == x);
    }
}
