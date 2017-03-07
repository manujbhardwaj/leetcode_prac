/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
*/























public class ReverseString {
    public String reverseString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--)
        {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
