package com.innerclass.scjp;


public class Java04 {
    static class Nested{
        public static void main(String[] args) {
            System.out.println("Nested class");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        /*
        Normal Java class VS Anonymous Inner class

        1,
        A normal java can extend only class at a time of course anonymous inner class also can extend only one class at a time.

        2,
        A normal Java class can implement any number of interfaces simantaneously but anonymous innerclass can implement only one interface at a time.

        3,
        A normal Java class can extend a class and can implement any number of interfaces simantaneously.

        But anonymous innerClass can extend a class or can implement an interface but not both simantaneously.

        4,
        In normal Java class,we can write any number of constructors, but in anonymous inner classes, we cannot write any constructor explicitly(Because the name of the class and the name of the constructor must be same but anonymous inner classes not having any name).

        NOTE:
        If the requirement is standard and required several times then we should go for normal top level class.

        If the requirement is temporary and required only once(Instant use) then we should go for anonymous innerclass.

        Where anonymous innerclasses are best suitable?

        We can use anonymous inner classes frequetly in GUI based Application to implement event handling.

        eg.
        class MYGUIFrame extends JFrame{
            JButton b1,b2,b3;
            ;;;;
            b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //b1 specific functionality
                }
            });
            b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //b2 specific functionality
                }
            });
            
        }


        4,
        Static Nested Classes.

        Sometimes we can declare inner class with the static modifier such type of innerclasses are called static nested classes.

        In the case of normal/regular inner class,without existing outer class object.There is no chance of existing inner class object.

        Means inner class object is strongly associated with outer class object.

        But in the case of static nestd classes,without existing outer class object, there may be a chance of existing nested class object.
        Hence Static nested class object is not strongly associated with outer class object.

        eg.
        class Outer{
            static class Nested{
                public void m1(){
                    SOP("Static Nested class method");
                }
            }
            main(){
                Nested n=new Nested();
                n.m1();
            }
        }

        If you want to create nested class object from outside of Outer class,Then we can create as follow.

        Outer.Nested t=new Outer.Nested();

        In normal/regular inner classes, we cannot declare any static members.

        But in static nested classes, we can declare static members including main method.Hence we can invoke static nested class directly from command prompt.

        class Test{
            static class Nested{
                public static void main(String[] args){
                SOP("Static method of Nested class")
            }

            }
            public static void main(String[] args){
                SOP("Static method of main class")
            }
        }
        output:
        javac Test.java
        java Test
        o/p Static method of main class

        java Test$Nested
        o/p Static method of Nested class


        3,
        From normal and regular inner classes,we can access both static and non-static members of outer class directly.

        But from static nested classes, we can access static members of outer class directly and we cannot access non-static members.

        eg.
        class Test{
            int x=10;
            static int y=20;
            static class Nested{
                public void m1(){
                    SOP(x); CTE: non-static variable x cannot be referenced from a static context.
                    SOP(y);
                }
            }
        }

        Differences between normal/regular inner class and static nested inner classes.

        1, 
        Without existing outer class object, There is no chance of existing inner class object.Means inner class object is strongly associated with outer class object.

        Without existing Outer class object,There maybe a chance of existing static nested class object.Hence static nested class object is not strongly associated with outer class Object.

        2,
        in Normal innerclass, we cannot declare static member.
        In static nested classes, we can declare static members.

        3,
        In normal or regular inner class, we cannot declare main() method and hence we cannot invoke inner class directly from command prompt.

        In static nested classes, we can declare main() method , hence we can invoke nested class directly from command Prompt.

        4,
        From normal inner classes, we can access both static/Non-static members of outer class directly.

        From static Nested classes,we can access only static members of puter class.

        */
    }
}
