package com.juaracoding.pojavafundamental.oop;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 04/07/23 16.52
@Last Modified 04/07/23 16.52
Version 1.0
*/

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Petrus";
        person.address = "Jakarta";
        System.out.println("Name: " + person.name);
        System.out.println("Address: " + person.address);
        System.out.println("Country: " + person.country);
    }
}
