
import java.util.HashMap;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring. 
*/














/*
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
*/
public class LongestSubStrNonRepeatChar {
    public int lengthOfLongestSubstring(String s) {
        
        int count = 0, count1 = 0;
        
        HashMap<Character, Integer> set = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(set.get(s.charAt(i)) != null)
            {
                if (count < count1)
                    count = count1;
                
                i = set.get(s.charAt(i));
                count1 = 0;
                set = new HashMap();
            }
            else
            {
                count1++;
                set.put(s.charAt(i),i);    
            }
        }
        if (count < count1)
            count = count1;
        
        return count;
    }
}
