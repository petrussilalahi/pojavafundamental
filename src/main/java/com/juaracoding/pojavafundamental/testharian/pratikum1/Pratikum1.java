package com.juaracoding.pojavafundamental.testharian.pratikum1;

/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 26/06/23 19.30
@Last Modified 26/06/23 19.30
Version 1.0
*/

import java.util.Scanner;
public class Pratikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strInput = " ";
        int intInput = 0;
        char charInput = 'a';
        int intToAscii = 0;

        System.out.println("Masukan Kata: ");
        strInput = input.nextLine();

        for (int i = 0; i < strInput.length(); i++) {
            charInput = strInput.charAt(i);
            intToAscii = (int) charInput;

            if(
                    (intToAscii >= 32 && intToAscii <= 47) ||
                    (intToAscii >= 58 && intToAscii <= 64) ||
                    (intToAscii >= 48 && intToAscii <= 57) ||
                    (intToAscii >= 65 && intToAscii <= 90)
             )
            {
                intInput  += intToAscii;
            }

        }


        System.out.println("Total ASCII: " + intInput);

    }
}
