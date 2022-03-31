package com.javaLangpackage.scjp;

import java.lang.reflect.Method;

public class Java04 {

    public static void main(String[] args) {
        int count=0;
        Object o=new String("Kishan");
        Class c=o.getClass();

        System.out.println("Fully Qualified name :- "+c.getName());
        Method[] m=c.getDeclaredMethods();
        for (Method method : m) {
            count++;
            System.out.println(method.getName());
        }
        System.err.println("Total:- "+count);
        /*
        Object class method

        4,getClass() method

        We can use getClass() to get runtime class defination of an Object.

        public final class getClass();

        BY using this Class class object, we can access class level proprties like fully qualified name of the class, method info, constructor info, etc.

        eg.
        To display Db vendor Specific connection interface implemented class name.

        eg.
        Connection con=DriverManager.getConnection("------");

        SOP(con.getClass().getName());


        NOTE:
        1,
        After loading every .class file, JVM will create an Object of the type Java.Lang.Class in the heap Area.

        Programmer can use this class Object to get Class level Information.

        2,
        We can use getClass() very frequently in reflection.


        6,finalize() method.

        Just before destroying an Object,GC calls finalize() to perform clean up activites.

        Once finalize method completes automatically GC destroy that Object.

        7,
        wait(),notify(),notifyAll()

        We can use this methods for inter-thread communication.

        The Thread which is expecting updation, it is responsible to call wait() method.Then immediately the thread will enter into waiting state.
        The thread,which is responsible to perform updation, after performing updation, the thread can call notify() method.

        The waiting thread will get that notification and continue its execution with those updates.


        
        
        
        */
    }
}
