/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final String pwd = "st8ofL|mb0";
        System.out.print( "What is the password? " );
        String pwdTry = input.next();

        if(pwdTry.equals(pwd)){
            System.out.print("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }

    }
}
