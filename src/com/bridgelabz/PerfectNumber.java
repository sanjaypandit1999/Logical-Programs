package com.bridgelabz;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int p;
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number n1");
        int num = sc.nextInt();

        //creating an object
        Utility utility = new Utility();
        p = utility.isPerfect(num);         //calling method
        if (p == num) {
            System.out.println(num + " is perfect  number");
        }
            else
            System.out.println(num+ " is not a perfect number");
    }
}
