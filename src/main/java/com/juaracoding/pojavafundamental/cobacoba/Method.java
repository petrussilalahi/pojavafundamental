package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 04/07/23 13.58
@Last Modified 04/07/23 13.58
Version 1.0
*/

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        myMethod("Petrus");
        String[] strArr =  {"Petrus", "Petrus", "Petrus"};
        String[] array = myArray(strArr);
        int[] intArra = myArray(90, 80, 70);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(intArra));
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }


    static String[] myArray(String... myArray) {
        return myArray;
    }

    static int[] myArray(int... intData) {
        return intData;
    }
}
