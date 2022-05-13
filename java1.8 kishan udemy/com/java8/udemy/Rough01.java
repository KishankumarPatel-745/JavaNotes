package com.java8.udemy;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Rough01
 */
class Employee{
    int eno;
    String name;
    Employee(int eno,String name){
        this.eno=eno;
        this.name=name;
    }
    @Override
    public String toString() {
        return eno+"---"+name;
    }
}

class lambdaDemo{
    public static void main(String[] args) {
        TreeSet<Employee> l=new TreeSet<Employee>((e1,e2)-> e1.eno>e2.eno?-1:e1.eno<e2.eno?1:0);
        l.add(new Employee(100, "ram"));
        l.add(new Employee(200, "sita"));
        l.add(new Employee(300, "ravan"));
        l.add(new Employee(400, "shanti"));
        l.add(new Employee(500, "krishan"));
        System.out.println(l);
        
        // Runnable r=()->{
        //     for (int i = 0; i < 12; i++) {
        //         System.out.println("lambda child call "+i);
        //     }
        // };
        // new Thread(r).start();
        // for (int i = 0; i < 12; i++) {
        //     System.out.println("lambda Main thread call "+i);
        // }

        //Lambda for collection.

        
        
        /*
        lambda expression.

        anonymous functions.

        not having name ,modifier and any return type.
        
        */
    }
}
