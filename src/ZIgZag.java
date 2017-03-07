/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
*/

/*
1- 0,4,8,12
2- 1,3,5,7,9
3- 2,6,10,14
*/







public class ZIgZag {
    public String convert(String s, int numRows) {
        
        if(s.length() == 0 || s.length() == 1)
        return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for (int i = 0; i < numRows; i++) 
        {
            sb[i] = new StringBuilder("");
        }
        
        int d = 1, r = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            sb[r].append(s.charAt(i));
            
            if(r == numRows - 1)
            {
                d = -1;
            }
            if(r == 0)
            {
                d = 1;
            }
            if(d == 1)
            {
                r++;
            }
            if(d == - 1)
            {
                r--;
            }
        }
        
        StringBuilder s1 = new StringBuilder();
        
        for(int i = 0; i < numRows; i++)
        {
            s1.append(sb[i].toString());
        }
        
        return s1.toString();
    }
}
