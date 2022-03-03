
package com.languageFundamental.scjp;
public class Java10 {
    int x=10;//Instance Variable
    public void printKare() {
        System.out.println("From the Instance Methods "+x);
    }

    public static void main(String[] args) {
        /*
        Types of Variables----
        Division1 :- based on value of varibles.

        Based on type of value represented by a variable all variables are divided into two types:
        1) Primitive Variable:- to represent a primitive values.
        int x=10;

        2) Reference Variable:-
        Can be used to refer an Objects.
        eg. Student s= new Student();
        s is pointing to an Object.

        Division2:- based on position of declaration variables,

        Based on Position of declaration and behaviour all variables are divided into three types.
        1) Instance Variables
        2) Static Variables 
        3) Local Variables

        1)Instance Variables:
        - If the value of a variable is varied from Object to Object, such type of variables are called instance variable.
        - for every object a separate copy of instance variable will be created.
        -Instance variable should be declared within the class directly but outside of any method/block/constructor.

        - Instance variable will be created at the time of Object Creation and destroy at the time of Object destruction.
        Hence the scope of instance variable is exactly same as the scope of Object.

        -Instance Variable will be stored in the heap memory as the part of Object.

        -We cannot access instance variables directly from static area but we can access by using Object Reference.
        But we can access instance variable directly from instance area.

        For Instance Variable,JVM will always  provide default values and we are not required to perform initialization explicitly.

        Instance variables are also known as Object Level variable and attribute.
         
        2) Static Variables...

        If the value of the Variable is not varied from object to object then it is not recommoended to declare varible as instance variable, we have to declare such type of variable as class level by using static modifier.

        In the case of instance varible, for every object a separate copy got created but in the case of static variable, a single copy will be created at the class level and shared by every object of th class.

        Static variable should be declared within the class directly but outside of any method/block/constructor.

        Static variable will be created at the time of class loading and destroy at the time of class unloading. Hence scope of static varible is exactly same as scope of that Class File.

        Steps required to run the Test java code..
        Java Test
        1, Start JVM
        2, Create and start main Thread
        3, Locate Test.class File
        4, Load Test.class(Static   Variable Creation)
        5, execute main() method
        6, Unload  Test.class(Static variable Destruction.)
        7, Terminate main Thread 
        8, Stutdown the JVM.

        Static variable is stored in method area.

        local variable is stored in Stack memory.

        we can access static variable either by Object reference or by class name but recommoanded to use class name. Within the same class it is not required to use classname and we can access directly.

        eg
        class Test{
            static int x=10;
            public static void main(String[] args){
                Test t=new Test();
                sop(t.x);
                sop(Test.x);
                sop(x);
            }
            public void m1(){
                sop(x);
            }
        }

        We can access static variable directly from both instance and static areas.

        For static variable,JVM will provide default value and we are not required to perform initialization explictly.

        class Test{
            static int x;
            static double d;
            static String s;
            public static void main(String[] args){
                sop(x);
                sop(d);
                sop(s);
            }
        }

        Static Variable is alos known as Class Level Variables or Fields.

        Any object can update static variable value and then this value get reflected in the other Object value.-- writen by me




























        */
    // System.out.println(new Java10().x);
    new Java10().printKare();
}
}
