/*
// *  UCF COP3330 Summer 2021 Assignment 16
// *  Copyright 2021 Steven Ortiz
// */

//What is your age? 15
//You are not old enough to legally drive.

//Or

//
//What is your age? 35
//You are old enough to legally drive.

package org.example;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    private static int age() {

        System.out.print("What is your age? ");

        String age1 = in.nextLine();

        return Integer.parseInt(age1);
    }
    public static void main(String[] args){

        int age = age();

        String output = ( age < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive.";

        System.out.println(output);
    }
}