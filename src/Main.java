
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuj
 */
public class Main {
    public static void main(String[] args){
        WordPattern twoSum = new WordPattern();
        int[][] arr = 
        {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(twoSum.wordPattern("abba", "dog dog dog dog"));
    }
}
