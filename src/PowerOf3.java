/*
 Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion? 
*/
public class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
        return false;
        return (Math.pow(3,19) % n == 0);
        // The number should be less than int
        // 3^20 is more than integer
    }
}
