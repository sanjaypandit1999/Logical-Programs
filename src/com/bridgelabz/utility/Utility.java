package com.bridgelabz.utility;

/**
 * Calculate fibobacciseries
 *
 * @author Sanjay
 * @version 1.0
 * @since 13-08-2021
 */
public class Utility {
    public void series(int n1, int n2, int nth){
        int sum = 0;
        for (int i = 1; i <= nth; i++) {

            //sum of previous two terms
            sum = n1 + n2;
            //updating value of previous terms
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }
    }
}
