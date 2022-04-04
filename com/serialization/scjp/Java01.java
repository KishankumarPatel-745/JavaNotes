package com.serialization.scjp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i=10;
    int j=20;
}
public class Java01 {
    public static void main(String[] args) throws Exception {
        Dog d1=new Dog();
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+"---"+d2.j);
        oos.close();
        ois.close();
        /*
        Serialization..

        Agenda.
        1,Introduction
        2, Object Graphs in Serialization.
        3,customized Serialization
        4,Serialization with respect to inheritance 
        5, Externalization
        6, serialVersionUID.

        1, Introduction.

        Serialization.
        

        The process of writing state of an object to a file is called serialization.

        But strictly speaking, it is the process of converting an object from java supported form into either file supported form or network supported form.

        By using FileOutputStream and ObjectOutputStream classes, we can achieve/implement serialization.

        Deserialization 

        The process of reading state of an object from the file is called deserialization.
        But strictly speaking it is the process of converting an object from either file supported form or network supported form into Java supported form.

        By using FileInputStream and ObjectInputStream classes, we can implement deserialization.

        code.

        We can serialize only serializable objects.
        An object is said to be serializable if the corresponding class implements serializable interface.

        Serializable interface present in java.IO package and it doesnot contains any methods.
        It is a marker interface.
        If we are trying to serialize a non-serializable object then we will get Runtime Exception saying.
        NotSerializableException.

        transient keyword.
        transient modifier applicable only for variables but not for methods and classes.

        At the time of serialization,if we don't want to save the value of a particular variable to meet security constaint then we should declare that variable as transient.

        While performing serializable,JVM ingores original value of transient variable and save default value to the file.

        Hence transient means not to serialize.

        transient VS static.

        static variable is not part of Object state and hence it won't participate in Serialization.
        Due to this static variable as transient, there is no use.

        Final VS transient.

        final variable will be participated in serialization directly by the value.
        Hence declaring a final variable as transient, there is no impact.

        Summary.
        Declaration and o/p

        eg.
        int i=10;
        int j=20;===> 10---20

        transient int i=10;
        int j=20;==> 0---20

        transient static int i=10;
        transient int j=20; ==> 10 ---0

        transient int i=10;
        transient final int j=20;
        0---20

        transient static int i=10;
        transient final int j=20;

        10---20

       
        */
    }
    
}
