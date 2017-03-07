/*
*/

public class ReverseInt {
    public int reverse(int x) {
        if(x > Integer.MAX_VALUE || 
           x < Integer.MIN_VALUE)
        return 0;
        
        int ans = 0;
        for(int i = x; i != 0; i=i/10)
        {
            int mod = i%10;
            if( (ans*10 + mod > Integer.MAX_VALUE/10) && i/10 != 0 ||
                (ans*10 + mod < Integer.MIN_VALUE/10)  && i/10 != 0)
            {
                return 0;
            }
            ans = ans*10 + mod;
        }
        return ans;
    }
}
