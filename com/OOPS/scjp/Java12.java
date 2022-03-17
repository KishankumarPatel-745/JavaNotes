package com.OOPS.scjp;

public class Java12 {
    int i=10;
    {
        m1();
        System.out.println("First Instance Block");
    }
    Java12(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        /*
        
        Instance Control Flow..

        Whenever we are executing a java class first static control flow will be executed. In the static control flow if we are creating an object the following sequence of events will be executed as a part of instance control flow.

        1,
        Identification of instance members from top to bottom

        2,
        Execution of instance variable assignments and instance blocks from top to bottom.

        3,
        Execution of constructor.

        ==========================
        If we dont create an object then the output is "Main Methods"


        Note:
        static control flow is one-time activity,which will be performed at the time of class loading but instance control flow is not one-time activity and it will be performed for every object creation.

        Object creation is most costly operation.If there is no specific requirement then it is not recommanded to create object.

        Instance control flow in parent to child relationship.







        
    
        */
        Java12 j=new Java12();
        System.out.println("Main Methods");
        Java12 j1=new Java12();
    }
    public void m1() {
        System.out.println(j);
        
    }
    {
        System.out.println("Second Instance Block");
    }
    int j=20;

}


/*
output:-
0
First Instance Block
Second Instance Block
Constructor
Main Methods
*/

/*
Whenever we are creating child class object the followinf sequence of events will be performed automatically as a part of instance control flow.

1, 
Identification of instance member from parent to child

2,
Execution of instance variable assignments and instance blocks only in parent class.

3,
Execution of parent constructor.

4,
Execution of instance variable assignments and instance block in child class.

5,
execution of child constructor.

*/
class Parent1{
    int i=101;
    {
        m1();
        System.out.println("Parent Instance block");
    }
    Parent1(){
        System.out.println("Parent Constructor");
    }
    public static void main(String[] args){
        Parent1 p=new Parent1();
        System.out.println("Parent Main Method");
    }
    public void m1() {
        System.out.println(j);
    }
    int j=20;
}

/**
 * InnerJava12
 */
class Child1 extends Parent1 {
    int x=1000;
    {
        m2();
        System.out.println("Child First instance block");
    }
    Child1(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        Child1 c=new Child1();
        System.out.println("Child main method");
    }
    public void m2() {
        System.out.println(y);
    }
    {
        System.out.println("Child Second instance block");
    }
    int y=200;

    
}
/*
output:
0
Parent Instance block
Parent Constructor
0
Child First instance block
Child Second instance block
Child Constructor
Child main method
*/