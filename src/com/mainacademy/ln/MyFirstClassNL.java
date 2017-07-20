package com.mainacademy.ln;

import java.util.Scanner;

/**
 * Created by 110-15 on 20.07.2017.
 */
public class MyFirstClassNL {
    public static void main(String[] args) {

        System.out.println("Hello Brain Academy!");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);


        int a = 1;
        int b = 4;
        int sum = a + b;
        System.out.println(sum);
        boolean boolExpr = a < b;
        // Two options
        if (boolExpr){
            System.out.println("a < b - true");
        } else {
            System.out.println("a < b - false");
        }







    }
}

