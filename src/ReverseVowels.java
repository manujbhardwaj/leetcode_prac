/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y". 
*/
public class ReverseVowels {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] str = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(i < j)
        {
            while(i < j && vowels.indexOf(s.charAt(i)) == -1)
            {
                i++;
            }
            while(i < j && vowels.indexOf(s.charAt(j)) == -1)
            {
                j--;
            }
            if(i < j)
            {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}
