package com.juaracoding.pojavafundamental.testharian.pratikum2;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 02/07/23 08.54
@Last Modified 02/07/23 08.54
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Pratikum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // call method
        results(scan);


    }
    public static void results(Scanner scan) {
        boolean boolRun = true;
        ArrayList<Integer> intTemp = new ArrayList<>();
        try
        {
            while (boolRun)
            {
                // input
                System.out.print("Masukkan angka : ");
                intTemp.add(scan.nextInt());
            }
        } catch (Exception e)
        {
            // loop , sum and average
            sum(intTemp);
        }

    }

    public static void sum(ArrayList<Integer> arrTemp) {
        double dobResults = 0;
        for (int b : arrTemp) {
            dobResults += b;
        }
        dobResults = dobResults / arrTemp.size();
        System.out.println("Nilai rata - rata : " + dobResults);
    }
}
