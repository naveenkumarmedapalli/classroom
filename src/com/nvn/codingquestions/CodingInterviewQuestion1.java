package com.nvn.codingquestions;

// what is the difference between enum and Enumeration?

import java.util.Enumeration;
import java.util.Vector;

public class CodingInterviewQuestion1 {
    public static void main(String[] args) {

        //instantiating a Vector
        Vector<String> vec = new Vector<String>( );
        //Populating the vector
        vec.add("SUNDAY");
        vec.add("MONDAY");
        vec.add("TUESDAY");
        vec.add("WEDNESDAY");
        vec.add("THURSDAY");
        vec.add("FRIDAY");
        vec.add("SATURDAY");
        //Retrieving the elements using the Enumeration
        Enumeration<String> en = vec.elements();
        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        Days constants[] = Days.values();
        System.out.println("Value of constants: ");
        for(Days d: constants) {
            System.out.println(d);
        }
    }
}
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}