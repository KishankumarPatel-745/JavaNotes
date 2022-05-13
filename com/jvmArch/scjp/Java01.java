package com.jvmArch.scjp;

import java.lang.reflect.Method;

class Student{
    public String getName(){
        return "kishan";

    }
    public int getRollNo(){
        return 10;
    }
}

class Test{
    public static void main(String[] args) throws ClassNotFoundException {
        int count=0;
        Class c=Class.forName("com.jvmArch.scjp.Student");
        Method[] m=c.getDeclaredMethods();
        for (Method m1:m){
            ++count;
            System.out.println(m1.getName());

        }
        System.out.println("The total methods :- "+count);
    }
        
    
}
public class Java01 {
    public static void main(String[] args) {
        /*
        JVM architecture

        Agenda...

        Virtual Machine.
        Type of Virtual Machine.
        1, Hardware based VM
        2. Application based VM

        Basic Architecture of JVM.

        class loader subsystem
        1, loading
        2, linking 
        3. Initialization

        Types of class loaders.
        1, Bootstrap class loaders
        2, Extension class loaders
        3. Application class loaders

        How class loader works.
        what is the need of customized class loader.
        pseudo code for customized class loader.

        Various memory areas of JVM.
        1, Method Area
        2, Heap Area
        3. stack Area.
        4, PC register
        5. Native method stack .

        program to display heap memory statistics.
        how to set maximum and minimum heap size?

        Execution Engine.
        1, Interpreter.
        2, JIT Compilers

        Java Native Interface(JNI)
        complete architecture diagram of JVM
        Class File Structure.

        ===================================


        Virtual Machine...

        It is a software simulation of a machine, which can perform operation like a physical machine.

        There are two types of virtual machine.

        1,Hardware based/ system based virtual machine.
        2, application based/ process based virtual machine..

        Hardware based/ system based VM.
        It provide several logical system on the same computer with strong isolation from each other.

        That is, on one physical machine, we are defining multiple logical machine.
        The main advantage of hardware based VM is hardware resources sharing and improve utilization of H/W resources.

        KVM: kernal based VM.
        for linux system.

        VMWarw,Xen,cloud computing etc.

        Application based/Process based VM.

        These VM acts as runtime engines to run particular programming language application.

        JVM:- java virtual machine 
        acts as runtime engine to run java based applications.
    

        PVM:- pirate virtual machine acts as runtime engine to run perl based applications.

        CLR:- common language runtime acts as runtime engine to run .net based application.


        JVM ....
        jvm is a part of JRE and it is responsible to load and run java class files.

        Basic Architecture diagram of JVM.

        refer image.
        Basic arch image of JVM

        class loader subsystem.

        class loader subsystem is responsible for the following three activities.
        1,Loading 
        2, Linking
        3, initialization.

        Loading.
        Loading means reading class file and store corresponding binary data in method area.

        For each class file,JVM will store corresponding information in method area.

        1,fully qualified name of class.
        2,fully qualified name of immediate parent class.
        3, methods information.
        4, variable info.
        5, constructor information.
        6, modifiers information.
        7, constant pool information
        etc...

        After loading .class file, immediately JVM creates an object for that loaded class in the Heap memory of type java.lang.Class.

        refere Class class object creation Image ......

        Class class object can be used by programmer to get class level information like methods info, variables info, constructor infos, etc..

        How to use Class class object.

        eg.
        class Student{
            public String getName(){

            }
            public int getRollNo(){
                return 10;
            }
        }

        class Test{
            main(){
                int count=0;
                Class c=Class.forName("Student");
                Method[] m=c.getDeclaredMethods();
                for (Method m1:m){
                    ++count;
                    SOP(m1.getName());

                }
                SOP("The total methods :- "+count);
            }
        }


        conclusion..

        For every loaded type, only one class object will be created even though, we are using that class multiple time in our programm.
        
        class Test{
            main(){
                Student s1=new Student();
                Class c1=s1.getClass();
                Student s2=new Student();
                Class c2=s2.getClass();
                SOP(c1.hashcode()); 321321421
                SOP(c2.hashcode()); 321321421
                SOP(c1==c2);true
            }
        }
        even though we are using Student class multiple times only one Class class object created for Student class.





        


        
        */
    }
    
}
