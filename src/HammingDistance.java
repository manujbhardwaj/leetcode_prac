/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/







/*
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
*/

/*
    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        int l1 = x1.length()-1;
        int l2 = y1.length()-1;
        int count = 0;
        while(l1 >= 0 && l2 >= 0)
        {
            if(x1.charAt(l1) != y1.charAt(l2))
            count++;
            
            l1--;
            l2--;
        }
        while(l1 >= 0)
        {
            if(x1.charAt(l1) == '1')
            count++;
            
            l1--;
        }
        
        while(l2 >= 0)
        {
            if(y1.charAt(l2) == '1')
            count++;
            
            l2--;
        }        
        return count;
    }
*/


/*
	var hammingDistance = function(x, y) {
		let mask = x ^ y;
		let count = 0;

		while (mask > 0) {
			count += mask & 1;
			mask >>= 1;
		}

		return count;
	}
	So every time we found 1 at the end of the mask we increase count by 1 and in the end we shift number by one to the right.
*/

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }
}
