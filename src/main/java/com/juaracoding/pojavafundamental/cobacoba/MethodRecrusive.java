package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 04/07/23 15.12
@Last Modified 04/07/23 15.12
Version 1.0
*/

public class MethodRecrusive {
    public static void main(String[] args) {
        int result = factorRecrusive(5);
        System.out.println(result);
        loop(1000);
    }

    static int factorRecrusive(int n){
        if(n == 1){
            return 1;
        }else {
            return n * factorRecrusive(n - 1);
        }
    }

    static void loop(int n){
        if(n == 0){
            System.out.println("selesai");;
        }else {
            System.out.println("Loop" + n);
            loop(n - 1);
        }
    }
}
