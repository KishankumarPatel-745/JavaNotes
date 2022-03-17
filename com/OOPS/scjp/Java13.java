package com.OOPS.scjp;

public class Java13 {
    {
        System.out.println("First instance block");
    }
    static{
        System.out.println("First static Block");
    }
    Java13(){
        System.out.println("Constructor call");
    }

    public static void main(String[] args) {
         /*
         Static and instance control flow.

         NOTE:
         From static area, we cannot access instance member directly because while executing static area JVM may not identify instance members.

         class Test{
             int x=10;
             main(){
                 SOP(x);
             }
         }
         CTE:non-static variable x cannot be referenced from a static member.

         ***IMP  In howmany ways, we can create an object in java?
         or
         In howmany ways we can get Object in java?

         1,
         By using new operator.

         Test t=new Test();

         2,By using newInstance method.

         Test t=(Test)Class.forName("Test").newInstance();

         3,By using factory method.
         eg.
         Runtime r=Runtime.getRuntime();

         DateFormat df=DateFormat.getInstance();

         4,By using clone method.
         Test t1=new Test();
         Test t2=(Test)t1.clone();

         5,By using Deserialization.

         FileInputStream fis=new FileInputStream("abc.ser");

         ObjectInputStream ois=new ObjectInputStream(fis);

         Dog d1=(Dog)ois.readObject();
         





         
         */
        Java13 t1=new Java13();
        System.out.println("Main method");
        Java13 t2=new Java13();
    }
    static{
        System.out.println("second static  block");
    }
    {
        System.out.println("Second Instance Block");
    }
}

class Init1{
    private static String m1(String msg) {
        System.out.println(msg);
        return msg;
    }
    Init1(){
        m=m1("1");
    }
    {
        m=m1("2");
    }
    String m=m1("3");
    public static void main(String[] args) {
        Object o=new Init1();
    } 
}
class Init2{
    private static String m1(String msg) {
        System.out.println(msg);
        return msg;
    }
    static String m=m1("1");
    
    {
        m=m1("2");
    }
    static{
        m=m1("3");
    }
    
    public static void main(String[] args) {
        Object o=new Init2();
    }
}


