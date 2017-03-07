/*
Given an integer, write a function to determine if it is a power of two. 
*/
public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        return(Math.pow(2,30) % n == 0);
        // The number should be less than int
        // 2^31 is more than integer
    }
}
