package com.innerclass.scjp;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args) {
        /*
        Inner Class.

        sometimes,we can declare a class inside another class such type of classes are called inner classes.

        Inner classes concept introduced in 1.1 Version to fix GUI bugs.
        as a part of event handling because of powerful feacture and benefits of innerclasses slowly programmer started using in regular coding also.


        without existing one type of Object if there is no chance of existing another type of object then we should go for inner classes.

        eg.
        University consists of several departmert without existing university there is no chance of existing department.Hence we have to declare department class inside university class.

        eg1.
        //Outer class
        class University{

            //Inner class
            class Department{

            }
        }

        eg2.
        Without existing car object there is no chance of existing engine object.Hence we have to declare engine class inside car class.

        eg.
        //outer class
        class Car{

            //Inner class
            class Engine{

            }
        }

        eg3.Java APi example.

        Map is a group of key-value pair and each key-value pair is called an entry.
        without existing Map object there is no chance of existing entry object.
        Hence interface entry is defined inside Map(I) interface.

        //outer interface
        interface Map{

            //inner interface
            interface Entry{

            }
        }

        NOTE:
        without existing outer class object, there is no chance of existing inner class object.
        
        The relation between outer class and inner class is not IS_A relation and it is HAS_A relationship.
        (Composition or aggregation).


    Base on position of declaration and behavious,all innerclasses are divided into 4 Types.
    
        1,Normal or Regular Inner class.

        2,Method local inner classes.

        3,Anonymous Inner Classes

        4, Static Nested classes.

        1,Normal or regular inner classes.


        Normal or regular Inner classes.

        If we are declaring any named class directly inside a class without static modifier such type of inner classses are called normal or regular innerclass.

        below is a normal/regular inner class.

        eg01.
        saved as Outer.java
        class Outer {

            class Inner{

            }
        }

        javac Outer.java

        got two classes

        Outer.class
        Outer$Inner.class

        java Outer
        RTE: NoSuchMethodError:main

        java Outer$Inner
        RTE: NoSuchMethodError:main

        Case.
        Inside inner class, we cannot declare any static members hence we cannot declare main() method and we cannot run inner class directly from command prompt.

        eg.
        class Outer{
            class Inner{
                Public static void main(String[] args){
                    SOP("Inner class main method");
                }
            }
        }
        CTE
        Inner classes cannot have static declaration.
        

        Case01,
        Accessing Inner class code from static area of outer class.

        eg.
        class Outer{
            class Inner{
                public void m1(){
                    SOP("Inner class Method");
                }
            }
            public static void main(String[] args){
                Outer o=new Outer();
                Outer.Inner i=o.new Inner();
                //new Outer.new Inner.m1();

            
            }
        }

        case02,

        Accessing inner class code from instance area of outer class.

        eg.
        class Outer{

            class Inner{
                public void m1(){
                    SOP("Inner class Method");
                }
            }
            public void m2(){
                Inner i=new Inner();
                i.m1();

            }
            public static void main(String[] args){

                Outer o=new Outer();
                o.m2();
            }
        }

        case03,

        Accessing inner class code outside of outer class.

        class Outer{
            class Inner{
                public void m1(){
                    SOP("Innerclass Method");
                }
            }
        }
        class Test{
            static main(){
                Outer o=new Outer();
                Outer.Inner i=o.new Outer();
                i.m1(); 
            }
        }

        Summary:
        Accessing Inner class code.

        1,3 from static area of outer class or
        from outside of outer class.

        Outer o=new Outer ();
        Outer.Inner i=o.new Inner();
        i.m1();


        2,
        From Instance area of outer class.

        Inner i=new Inner();
        i.m1();
        */
        System.out.println("Outer class Main method");
    }
    class Inner{

    }
}