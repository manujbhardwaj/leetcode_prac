/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string. 
*/
public class CountAndSay {
    public String countAndSay(int n) 
    {
        String res = "1";
        for(int i = 1; i < n; i++)
        {
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < res.length(); j++)
            {
                int count = 1;
                while(j+1 < res.length() &&
                      res.charAt(j) == res.charAt(j+1))
                {
                    count++;
                    j++;
                }
                str.append(count);
                str.append(res.charAt(j));
            }
            res = str.toString();
        }
        return res;
    }
}
