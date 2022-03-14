package com.declarationAndAccessModifier.scjp;

public class Java13 {
    public static void main(String[] args) {
        /*
        Marker Interface..
         If an interface doesnot contain any method and by implementing this interface If our object gets some ability such type of interfaces are called marker interfaces.

         eg.
         Serializable(I)
         Cloneable(I)
         RandomAccess(I)
         SingleThreadModel(I)

         There are marked for some ability.

         or 
         Ability interface/Tag interface..

         1, BY implemeating serializable interface, our objects can be saved to the file and can travel across network.

         2,By implementing clonable interface, our objects are in possible to produce exactly deplicate cloned object.

         Without having any methods how the objects will get some ability in marker interfaces.

         Internally JVM is responsible to provide required ability.

         Why JVM is providing required ability in marker interfaces?

         To reduce complexity of programming and to make Java language as simple.

         Is it possible to create our own marker interface?

         YES, but custumization of JVM is required.

         Adepter Classes.
         Adepter class is a simple java class that implement an interface with only empty implementation.

         interface x{
             m1();
             m2();
             -----
             m100();
         }

         abstract class AdepterX implements x{
             m1(){};
             m2(){};
             -----
             m100(){};
         }

         If we implement an interface for every method of an interface we have to provide an implementations whether it is required or not required.

         class Test implements x{
             m3(){

                //10 line
             }
             remaining all methods

         }

         The problem in this approach is it increases length of code and reduces readibility.
         We can solve this problem by using adeptor classes.

         Instead of implementing interface, if we extends adeptor class we have to provide implementation only for required method and we are not responsible to provide implementation for every method of an interface so that length of the code will be reduced.

         class Sample extends AdeptorX{
             m4(){
                 
             }
         }

         class A extends AdeptorX{
             m10(){

             }
         }

         class B extends AdeptorX{
             m7(){

             }
         }


         We can develop a servlet in the following three way 
         1.by implementing Servlet(I).
         2.by extending GenericServlet(AC).
         3.by extending HttpServlet(AC).

         If we implement servlet interface for each and every methods of Servlet interface we should provide implementation. It increase lenght of the code and reduces readibility.

         Insteadof implementing Servlet Interface directly if we extends GenericServlet. We have to provide implementation for Service method.For remaining method we are not required to provide implementation.

         Hence more or less GenericServlet acts as adeptor class for servlet interface..

         NOTE:- Marker interface and adeptor classes simplify complexity of programming and these are best utilities to the pregrammer and programmers life will become simple.
         

        */
    }
}
