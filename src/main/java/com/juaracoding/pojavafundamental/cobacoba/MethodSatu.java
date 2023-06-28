package com.juaracoding.pojavafundamental.cobacoba;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 28/06/23 20.53
@Last Modified 28/06/23 20.53
Version 1.0
*/

public class MethodSatu {
    public static void main(String[] args) {
        System.out.println(hitungLuasPersegi(5));
        System.out.println(hitungLuasLayangLayang(5.3, 100));
    }

    public static double hitungLuasPersegi(int dobs1)
    {
        int intresult = dobs1 * dobs1;
        return intresult;
    }

    public static double hitungLuasLayangLayang(double dobs2, double dobs3)
    {
        double dobresultLayang = (dobs2 * dobs3) / 2;
        return dobresultLayang;
    }
}
