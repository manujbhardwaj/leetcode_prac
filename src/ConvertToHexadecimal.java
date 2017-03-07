/*
 Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

    All letters in hexadecimal (a-f) must be in lowercase.
    The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
    The given number is guaranteed to fit within the range of a 32-bit signed integer.
    You must not use any method provided by the library which converts/formats the number to hex directly.
*/
public class ConvertToHexadecimal {
    public String toHex(int num) {
        
        if(num == 0)
        return "0";
        
        StringBuilder ans = new StringBuilder();
        
        while(num != 0)
        {
            int d = num%16;
            switch(d){
                case 10:
                ans.append("a");
                break;
                case 11:
                ans.append("b");
                break;
                case 12:
                ans.append("c");
                break;
                case 13:
                ans.append("d");
                break;
                case 14:
                ans.append("e");
                break;
                case 15:
                ans.append("f");
                break;
                default:
                ans.append(d);
                break;
            }
            num = num/16;
        }
        
        return ans.reverse().toString();
    }
}
