package com.bridgelabz;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number -");
        int n = sc.nextInt();
        Utility utility = new Utility();
        utility.Primecheck(n);
    }
}
