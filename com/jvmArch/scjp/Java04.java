package com.jvmArch.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        Need of customized class loader.

        Default class loader will load .class file only once eventhough we are using multiple times that class in our programm.

        After loading .class file, if it is modified outside then defaul class loader won't load updated version of class file,because .class file already available in method area.

        We can resolve this problem by defining our own customized class loader. The main advantage of customized classloader is , we can control class loading mechanism based on our requirement.
        for eg.
         we can load .class file separately every time so that updated version available to our programm.

         refer image.. of default class loading anf customized class loading...


        How to define customized class loader?

        we can define our own customized class loader by extending java.lang.ClassLoader class.

        eg.
        public class CustClassLoaded extends ClassLoader{
            public Class loadClass(String cname){
                check for updates and load updated and returns corresponding Class.

            }
        }

        class Client{
            main(){
                Dog d1=new Dog();
                //loaded by default class loader 

                CustClassLoader cl=new CustClassLoader();
                ---
                --
                cl.loadClass("Dog");
                //loaded by customized class loader.
                ----
                ----
                cl.loadClass("Dog");
                ---
                ---

            }
        }

        NOte..
        While designing/developing web server and application server usually we can go for customized class loader to customized class loading mechanism.

        Que.
        what is the need or use of class loader class?

        we can use java.lang.ClassLoader class to define our own customized class loader.

        Every class Loader in java should be child class of java.lang.ClassLoader class, either directly or indirectly.
        Hence this class acts as base class for all custumized class loader.

        various memory areas present inside JVM?
        
        Whenever jvm loaded and runs a java programm, it needs memory to store various things like Bytecode, Object, variable etc.

        Total Jvm memory organized into following five categaries.
        1, Method Area
        2, Heap Area.
        3, Stack Area.
        4, PC registers.
        5. Native method stacks.

        Method Area.
        For every JVM, one method area will be available.

        Method area will be created at the time of JVM start up.

        Inside method area, class level binary data including static variable will be stored.

        Constant pools of a class will be stored inside method area.

        method area==> stored various class level data..

        method area can be accessed by multiple threads simantaneously.

        Hence it is not Thread-safe.



        
        
        */
    }
    
}
