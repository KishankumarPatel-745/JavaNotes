package com.serialization.scjp;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizationDemo implements Externalizable{
    String s;
    int i;
    int j;
    ExternalizationDemo(String s,int i,int j){
        this.s=s;
        this.i=i;
        this.j=j;
    }
    public ExternalizationDemo(){
        System.out.println("Exterbalizable demo constructor call");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
        
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s=(String)in.readObject();
        i=(int)in.readInt();
    }
    @Override
    public String toString() {
        return s+"---"+i+"---"+j;
    }
}
public class Java06 {
    public static void main(String[] args)throws Exception{
        ExternalizationDemo e=new ExternalizationDemo("Kishan", 26, 40);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("exterDemo.ser"));
        oos.writeObject(e);
        oos.close();


        ObjectInputStream in=new ObjectInputStream(new FileInputStream("exterDemo.ser"));
        ExternalizationDemo eNew=(ExternalizationDemo)in.readObject();
        System.out.println(eNew);
        in.close();

        /*
        o/p
        Exterbalizable demo constructor call
        Kishan---26---0
        
        */




        /*
        Externalization..

        In serialization, everything takes care by JVM and programmer doesn't have any control.

        In serialization, it is always possible to save total object to the file.
        And it is not possible to save part of the Object, which may creates performance problem.

        To overcome this problem, we should go for externalization, The main advantage of externalization over serialization is everything takes case by programmer and JVM doesn't have any control.

        Based on our requirement, we can save either total object or part of the Object, which improves performance of the system.

        To provide externalizable ability for any java object compulsory the corresponding class implements externalizable interface.

        externalizable interface defines two methods,

        writeExternal();
        readExternal();

        externalizable is child interface of Serializable(I).

        public void writeExternal(ObjectOutput out) throws IOException

        This method will be executed automatically at the time of serialization.

        Within this method, we have to write code to save required variable to the file.

        public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException

        This method will be executed automatically at the time of deserialization.
        With in this method, we have to write code to read required variable from the file and assign to current Object.

        But strictly speaking at the time of deserialization, JVM will create a separate new Object by executing public no-arg constructor.

        On that Object,JVM will call readExternal() method.

        Hence every externalizable implemented class should compulsory contain public no-arg constructor.Otherwise we will get RTE saying 
        InvalidClassException.


        If the class implements seriaalizable then total object will be saved to the file. In this case the output is 

        Kishan--26--40

        If the class implements externalizable then only required variable will be saved to the file in this case output is 

        Exterbalizable demo constructor call
        Kishan---26---0

        NOTE...

        In serialization transient keyword will play role, but in externalization transient keyword won't play any role.

        Ofcource transient keyword not required in externalization.



        Differences between serialization and externalization.

        1,
        It is meant for default serialization.
        It is meant for customized serialization.

        2,
        Here everything takes care by JVM and programmer doennot have any control.
        Here everything takes case by programmer and JVM doesn't have any control.

        3,
        In this case, it is always possible to save total object to the file.
        And it is not possible to save part of the object.

        based on our requirement we can save either total object or part of the object.

        4,
        Relatively performance is low,
        Relatively performance is high.

        5,
        It is the best choice if we want to save total object to the file.
        It is the best choice if we want to save part of the object to the file.

        6,
        Serializable interface doesnot contain any methods and it is a marker interface.

        Externalizable interface contains two methods 
        writeExternal,readExternal.

        Hence it is not a marker interface.

        7,
        Serializable implemented class not required to contain public no-arg constructor.
        Externalizable implemented class should compulsory contain public no-arg constructor, otherwise we will get RTE saying InvalidClassException.

        8,
        transient keyword will play role in serialization.
        transient keyword won't play any role in externalization ofcource it won't be required.
        




        
        */
    }
}
