package com.jvmArch.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        How class loader works?

        refer classer works image.

        Class loader follows delegation hierarchy principle.

        When ever jvm come across a particular class first it will check whether a particular .class file already loaded or not.

        If it is already loaded in method area then JVM will consider that loaded class.

        If it is not loaded then jvm required class loader subsystem to load that particular class.

        Then classloader subsystem  handover that request to application class loader.

        Application classloader delegates that request to extension class loader, which in turn delegates request to bootstrap class loader.

        Then Bootstrap class loader will search in bootstrap classpath, if it is available then the corresponding .class will be loaded by bootstrap class loader, if it is not available then Bootstrap classloader delegates the request to extension class loader.

        Extension class loader will search in extension classpath.If it is available then it will be loaded, otherwise extension class loader delegates request to application class loader.

        Application class loader search in application classpath.If it is available then it will be loaded otherwise we will get RTE saying NoClassDefFoundError or ClassNotFoundException.


        eg.
        class Test{
            main(){
                SOP(String.class.getClassLoader());

                SOP(Test.class.getClassLoader());

                SOP(Customer.class.getClassLoader()); put Customer.class in JDK/JRE/lib/ext.
            }
        }

        Assume Customer.class present in both extension and application class paths and Test.class present in only application classpath.

        o/p
        null 
        sun.misc.Launcher$AppClassLoader@21312
        sun.misc.Launcher$ExtClassLoader@1212


        For String.class

        Bootstrap classLoader from BootStrap classpath.

        null because it is not implemented in java.

        for Test.class
        application class loader from application class path.
        o/p
        sun.misc.Launcher$AppClassLoader@21312
        sun.misc.

        for Customer.class
        
        Extension class loader from Extension classpath 

        o/p 
        sun.misc.Launcher$ExtClassLoader@1212

        NOte.

        Bootstrap class loader is not java object hence we got null in the first case but extension and application classloaders are java object, hence we are getting output for remaining two SOP.

        Class loader subsystem will get the highest priority for bootstrap classpath then extension classpath and then followed by extension class path.

        




        
        */
    }
}
