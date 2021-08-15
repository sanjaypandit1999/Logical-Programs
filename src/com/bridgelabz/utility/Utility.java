package com.bridgelabz.utility;

/**
 * Calculate fibobacciseries
 *
 * @author Sanjay
 * @version 1.3
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
    //UC3prime number check
    public void Primecheck(int n){
        int flag = 0;
        for (int i=2;i<=n;i++){
            if (n % i == 0){
                System.out.println(n+ " is not a prime number");
                break;
            }
            if (n % i == 1) {
                System.out.println(n + " is prime number");
                break;
            }
        }
    }
}
