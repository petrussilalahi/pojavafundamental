package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 04/07/23 20.01
@Last Modified 04/07/23 20.01
Version 1.0
*/

public class ConsOne {
    private String strName;
    private int intAngka;

    public ConsOne() {
        System.out.println("Constructor One tanpa parameter");
    }
    public ConsOne(String strName, int intAngka) {
        this.strName = strName;
        this.intAngka = intAngka;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrName() {
        return strName;
    }

    public void setIntAngka(int intAngka) {
        this.intAngka = intAngka;
    }

    public int getIntAngka() {
        return intAngka;
    }


}
