/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String first = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("What is the second number? ");
        String second = b.nextLine();

        int one = Integer.valueOf(first), two = Integer.valueOf(second);
        int add = one + two;
        int sub = one - two;
        int mul = one * two;
        int div = one / two;

        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " * " + second + " = " + mul);
        System.out.println(first + " / " + second + " = " + div);

    }
}
