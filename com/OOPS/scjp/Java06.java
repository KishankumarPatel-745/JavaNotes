package com.OOPS.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        If child class method throws any checked exception compulsory parent class method should throw the same checked exception or its parent otherwise we will get compile time error.
        But there are no restriction for unchecked exception.


        eg.
        import java.io.*;
        class P{
            public void m1() throws IOException{}
        }
        class C extends P{
            public void m1() throws EOFException,InterruptedException{}

        }

        CTE: m1() in C cannot override m1 in P: overridden method doesnot throw java.lang.InterruptedException


        Overriding with respectto static method.
        We cannot override static method as non-static.
        Otherwise we will get compile time error.
        eg.
        class P{
            public static void m1(){

            }
        }
        class C extends P{
            public void m1(){

            }
            CTE m1() in C cannot override in m1() in P;Overridden method is static.

        }
        Similarly we cannot override a non-static method to static.

         If both parent and child class methods are static then we wont get any compile time error.

         It seems overriding concept applicable for static method but it is not overriding but it is method hiding.

         eg.
         class P{
             public static void m1(){

             }
         }
         class C extends P{
             public static void m1(){

             }
         }
         it is method hiding but not overridding.


         Method Hiding VS Overriding.

         class P{
             public static void m1(){
                 SOP("Parent");
             }
         }
         class C extends P{
             public static void m1(){
                 SOP("Child");
             }
             //It is method hiding but not overriding.

         }
         class Test{
             main(){
                 P p=new P();
                 p.m1();
             }
         }

         All rules of Method Hiding are exactly same as overriding except the following differences.

         1,
         Both parent and child class method should be static
         Both parent and child class method should be non-static.

         2,Compiler is responsible for method resolution based on reference type.
         JVM is always responsible for method resolution based on runtime object.

         3,it is also known as compile time polymorphism,static polymorphism,early binding.
         It is also known as runtime time polymorphism,dynamic polymorphism and late binding.

         eg
         class Test{
             main(){
                 P p=new P();
                 p.m1();  Parent

                 C c=new C();
                 c.m1();  Child

                 P p1=new C();
                 p1.m1(); Parent
             }
         }


         If both parent and child class methods are non-static then it will become overriding in this case the output only 
         parent
         child 
         child.


        */
    }
}
