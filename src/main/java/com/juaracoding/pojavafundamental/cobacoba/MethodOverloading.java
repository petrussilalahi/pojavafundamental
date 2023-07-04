package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 04/07/23 15.06
@Last Modified 04/07/23 15.06
Version 1.0
*/

public class MethodOverloading {
    public static void main(String[] args) {
        myMethod("Petrus");
        myMethod("Petrus", 5);
    }
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

}
