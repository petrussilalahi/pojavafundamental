package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 03/07/23 21.03
@Last Modified 03/07/23 21.03
Version 1.0
*/

import java.util.Scanner;

public class ProgramUpperLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String strKalimat = scanner.nextLine();

        char charKarakter = strKalimat.charAt(0);

        if(charKarakter >= 65 && charKarakter <= 90) {
            System.out.println("Kalimat tersebut merupakan huruf besar");
        } else if(charKarakter >= 97 && charKarakter <= 122) {
            System.out.println("Kalimat tersebut merupakan huruf kecil");
        } else {
            System.out.println("Kalimat tersebut bukan merupakan huruf");
        }
    }
}
