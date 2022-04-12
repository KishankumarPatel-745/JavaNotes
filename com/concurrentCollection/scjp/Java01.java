package com.concurrentCollection.scjp;

import java.util.ArrayList;
import java.util.Iterator;

public class Java01 {

    static ArrayList l=new ArrayList();;
    public static void main(String[] args) throws Exception {
        /*
        Limitation
        */
        
        Thread t=new Thread(){
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Hit the exception");
                }
                System.out.println("Thread updating the list");
                l.add("D");
            }
        };
        l.add("A");
        l.add("B");
        l.add("C");
        t.start();
        Iterator t0=l.iterator();
        while (t0.hasNext()) {
            System.out.println("Main thread iterating and current object is :- "+(String)t0.next());
            Thread.sleep(1000);
        }

    }
    //We got the ConcurrentModificationException, while performing modification on currently iterating Object.
    
    
}
