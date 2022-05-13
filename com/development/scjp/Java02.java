package com.development.scjp;

import java.util.Properties;

public class Java02 {
    public static void main(String[] args) {
        Properties p=System.getProperties();
        p.list(System.out);
        /*
        Jar file 

        all third party software plug-ins are available in the form of jar file only.

        eg.

        to develop a servlet, all dependent classes are available in servlet-api.jar.

        we have to place this jar file in classpath to compile a servlet programm.

        eg.
        To run jdbc programm, all depandant classes are available in ojdbc14.jar.
        To run jdbc programm, we have to place this jar file in classpath.

        eg.

        To use log4j in our application,depandant classes are available in log4j.jar

        we have to place this jar file in the classpath then only log4j based application can run.



        How to create a jar file..

        Various commands..

        To create a jar file..(Zip file)

        jar -cvf durgacalc.jar Test.class

        jar -cvf durgacalc.jar A.class B.class C.class

        jar -cvf durgacalc.jar *.class

        jar -cvf durgacalc.jar *.*


        2, to extract(unzip) a jar file(unzip jar)

        jar -xvf durgacalc.jar


        3, To display table of content:

        jar -tvf durgacalc.jar

    
        eg.

        service provider role..

        public class DurgaColorfulCalc{
            public static void add(int x,int y){
                SOP(x*y);
            }
            public static void multiply(int x,int y){
                SOP(x*y*2);
            }
        }

        javac DurgaColorfulCalc.java
        jar -cvf durgacalc.jar DurgaColorfulCalc.class

        note :-
        to place .class file in classpath just location is enough but to make jar file available in classpath location is not enough, compulsory we have to specify name of the jar file also.

        Shortcut way to place jar file in classpath.

        if we place jar file in the following location then all classes and interfaces present in the jar file bydefault available to java compiler and JVM. we are not required to set classpath explicitly.


        JDK-->JRE-->lib-->ext-->*.jar

        System properties.

        For every system some persistant system will be maintained in the form of system properties. this include name of the OS, Java version, JVM vendor, user country,etc 

        demo programm to print the system properties.
        

         refer code ..

         we can set System property explicitly from the command prompt by using -D option.

         java -Ddurga=ocjp Test;

         -D to set a system property.


         The main advantage of setting system property is , we can customize behaviour of java programm.

         eg.
         class Test{
             public static void main(String[] args){
                 String course=System.getProperty("course");
                 if(course.equals("scjp")){
                     SOP("SCJP information");
                 }
                 else{
                     SOP("Other course information");
                 }
             }
         }

         java -Dcourse=scjp Test
         o/p scjp information

         java -Dcource=scwcf Test
         o/p Other course information



        




        
        */
    }
    
}
