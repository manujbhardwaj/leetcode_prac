/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"

*/










/*
private int lo, maxLen;

public String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
	return s;
	
    for (int i = 0; i < len-1; i++) {
     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
     	extendPalindrome(s, i, i+1); //assume even length.
    }
    return s.substring(lo, lo + maxLen);
}

private void extendPalindrome(String s, int j, int k) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
	}
	if (maxLen < k - j - 1) {
		lo = j + 1;
		maxLen = k - j - 1;
	}
}
*/
public class LongestPalinSubStr {
    public String longestPalindrome(String s) {
        
        int count = 0;
        String s1 = new String();
        for(int i = 0; i < s.length(); i++)
        {
            int d = i;
            for(int j = d; j < s.length(); j++)
            {
                int c = checkPermutation(s.substring(d,j+1));
                //System.out.println(c);
                if(c > count)
                {
                    count = c;
                    s1 = s.substring(d,j+1);
                }
            }
        }
        return s1;
    }
    public static int checkPermutation(String s)
    {
        //System.out.println(s);
        int c = 0;
        for(int i = 0; i < s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                return 0;
            }
        }
        return s.length();
    }
}
