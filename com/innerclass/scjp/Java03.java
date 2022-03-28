package com.innerclass.scjp;

class PopCorn{
    void taste(){
        System.out.println("Salty");
    }
}

public class Java03 {
    public static void main(String[] args) {
        PopCorn p=new PopCorn();
        p.taste();
        System.out.println(p.getClass().getName());
        PopCorn p1=new PopCorn(){
            @Override
            void taste() {
                System.out.println("Sweet Implemantation");
            }
        };
        p1.taste();
        System.out.println(p1.getClass().getName());
        PopCorn p2=new PopCorn(){
            @Override
            void taste() {
                System.out.println("Spicy Implementation");
            }
        };
        p2.taste();
        System.out.println(p2.getClass().getName());

        // Thread t=new Thread(){
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //             System.out.println("This is a CHILD thread:- "+i);
        //         }
        
        //     }
        // };
        // Runnable t1=new Runnable(){
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //         System.out.println("This is a CHILD thread by using runnable interface :- "+i);
        //      }
        //     }

        // };
        // Thread t=new Thread(t1);
        // t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("This is a thread with anonymous innerclass at argument level:- "+i);
                }
                
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("This is a main thread:- "+i);
        }


        /*
        Anonymous inner class.

        Sometimes we can declare inner class without name such type of inner classes are called anonymous inner classes.

        The main purpose of anonymous inner classes is just for instant use(one time usage).

        Based on declarationa and behaviour there are 
        Three Types of anonymous innerclass.

        1, Anonymous Inner class that extends a class

        2, Anonymous Inner class that implements an interface.

        3, Anonymous Inner class That defined inside arguments.


        1, Anonymous Inner class that extends a class.

        The Generated .class files are 
        Popcorn.class
        Java03.class
        Java03$1.class
        Java03$2.class

        refer example in the current file code.
        output:

        Salty
        com.innerclass.scjp.PopCorn
        Sweet Implemantation
        com.innerclass.scjp.Java03$1
        Spicy Implementation
        com.innerclass.scjp.Java03$2

        Analysis_______

        1, PopCorn p=new PopCorn();

        Just we are creating PopCorn Object.

        2,
        PopCorn p=new PopCorn
        {

        };

        2.1, we are declaring a class that extends PopCorn without name(Anonymous InnerClass).

        2.2, For that child class,we are creating an Object with parent reference.

        3, PopCorn p=new PopCorn()
        {
            public void taste(){
                SOP("Spicy");
            }
        };

        3.1 we are declaring a class that extends PopCorn without name(Anonymous Inner class).

        3.2 In the child class, we are overriding taste method.
        For that child class,we are creating an object with the parent reference.

        eg.
        Defining a thread by extending Thread Class.

        Anonymous innerclass that implements an interface.
        eg.
        Defining a thread by implementing the Runnable interface.


         3, Anonymous Inner class That defined inside arguments.













        */
    }
}
