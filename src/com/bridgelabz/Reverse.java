package com.bridgelabz;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        Utility utility = new Utility();
        System.out.println("Reverse number is " +utility.number(num));
    }
}
