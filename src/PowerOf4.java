/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuj
 */
public class PowerOf4 {
    public boolean isPowerOfFour(int num) {
        if(num <= 0)
            return false;
        return (Math.pow(4,16)%num == 0) && ((num-1)%3 == 0);
    }
}
