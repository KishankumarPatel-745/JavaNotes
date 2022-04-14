package com.GarbageCollector.scjp;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args) {
        /*
        Grabage Collector.
        1, Introduction.
        2, The ways to make an object eligible for GC.
        3, The methods for requesting JVM to run GC
        4, Finalization.

        IN OLD LANGUAGES like CPP, programmer is responsible to creates new Object and to destroy useless object.
        Usually programer taking very much care while creating object while neglecting destruction of useless object.Because of his neglectance, at certain point creation of new Object, enough memory may not be available.
        Because total memory filled with useless objects only.
        And total application will be down with the memory problem.
        Hence OutOfMemoryError is very comman problem in old languages like CPP.

        But in java, programmer is responsible only for creation of Objects and Programmer is not responsible to destroy useless objects.

        SUN people provided one assitance to destroy useless objects.The assitance is always running in the background(Daemon Thread) and destroy useless Objects.
        Just because this assitance the chance of failing Java program with memory problem is very very low.
        This assitance is nothing but Garbage Collector.
        Hence the main objective of Garbage Collector is to destroy useless Object.
        


        */
    }
}