
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
*/
public class AnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() == 0 || p.length() == 0 || p.length() > s.length())
        return list;
        int[] s1 = new int[26];
        int[] p1 = new int[26];
        
        for(int i = 0; i < p.length(); i++)
        {
            s1[s.charAt(i) - 'a']++;
            p1[p.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length()-p.length()+1; i++)
        {
            if(Arrays.equals(s1, p1))
            list.add(i);
            if(i == s.length()-p.length())
            {
                break;
            }
            s1[s.charAt(i) - 'a']--;
            s1[s.charAt(i+p.length()) - 'a']++;
        }
        return list;
    }
}
