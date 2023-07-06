package com.juaracoding.pojavafundamental.testharian.pratikum3;
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
import java.util.Arrays;
import java.util.Scanner;

public class Pratikum3 {
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
        String result;
        StringBuilder stringBuilder = new StringBuilder();

        // loop mencari rata - rata
        for (int b : arrTemp) {
            dobResults += b;
        }
        dobResults = dobResults / arrTemp.size();

         // convert data arraylist to string
        String strConvert = arrTemp.toString().substring(1,arrTemp.toString().length()-1);
        String [] strElement = strConvert.split(",");



        // loop untuk mengganti koma dengan kata "dan"
        for(int i = 0; i < strElement.length; i++) {
            stringBuilder.append(strElement[i]).append(',');
        }
        stringBuilder.append(" dan").append(strElement[strElement.length-1]);
        result = stringBuilder.toString();


        System.out.println("User Melakukan Input Sebanyak " + arrTemp.size() + " Kali");
        System.out.println("Dengan data sebagai berikut : " + result + " ");
        System.out.println("Nilai rata - rata : " + dobResults);

    }
}
