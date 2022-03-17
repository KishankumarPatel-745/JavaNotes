package com.AbstractClassAnsInterFaceLoopHole;

public class Java02 {
    public static void main(String[] args) {
        /*
        whenever we are creating child class object automatically parent constructor will be executed to perform initialization for the instance variables.
        Which are inheriting from parent.

        eg.
        class Person{
            String name;
            int age;
            Person(String name,int age){
                this.name=name;
                this.age=age;
            }
        }
        class Student extends Person{
            int rollNo;
            int marks;
            Student(4 props){
                super(name,age);
                this.rollNo=rollNo;
                this.marks=marks;
            }
        }
        Student s=new Student('Kishan',45,22,90);

        name and age initialized from Parent 

        rollno and marks initialized by Child const.

        in the above programm,both parent and child constructor got executed for child Object initialization only.

        whenever we are creating child class object parent constructor will be executed but parent object wont be created.

        In the above example,just created in child class object.But both parent and child constructor executed for the child class object.


        Anyway we cannot create object for abstract class either directly at indirectly but abstract class create an constructoe?

        Initializing the abstract class instance varible.

        If everything is abstract then it is highly recommanded to go for interface,but not abstract class.

        We can replace interface with abstract class, but it is not a good programming practise. THis is sth like recruiting IAS officer for sweeping purpose.

        While implementing interface we can extend any other classes.Hence we wont miss inheritance benefit.
        in interface, object creation is not costly.

        While extending abstract class, we cannot extends any other class hence we are missing inheritance benefit.in abstract class, it is costly comparatively.
        

        */
    }
    
}
