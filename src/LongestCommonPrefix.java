/*
Write a function to find the longest common prefix string amongst an array of strings. 
*/
/*
public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0)
    return "";

    StringBuilder result = new StringBuilder();

    Arrays.sort(strs);

    char [] a = strs[0].toCharArray();
    char [] b = strs[strs.length-1].toCharArray();

    for (int i = 0; i < a.length; i ++)
    {
        if (b.length > i && b[i] == a[i])
        {
            result.append(b[i]);
        }
        else 
        {
            return result.toString();
        }
    }
    return result.toString();
}
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        return "";
        int i = 1;
        String pre = strs[0];
        while(i < strs.length)
        {
            while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0, pre.length()-1);
            i++;
        }
        return pre;
    }
}
