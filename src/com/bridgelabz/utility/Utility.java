package com.bridgelabz.utility;

/**
 * Calculate fibobacciseries
 *
 * @author Sanjay
 * @version 1.0
 * @since 13-08-2021
 */
public class Utility {
    public int isPerfect(int num){
        int sum=0;               //executes until the condition becomes false
        for(int i=1; i <= num/2; i++) {
            if (num % i == 0) {
                //calculates the sum of factors
                sum = sum + i;
            }
        }
        return sum;
    }
}
