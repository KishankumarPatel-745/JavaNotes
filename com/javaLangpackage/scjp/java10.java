package com.javaLangpackage.scjp;

public class java10 {
    public static void main(String[] args) {
        /*
        AutoBoxing

        Automatic Convertion of primitive to wrapper Object by compiler is called autoboxing.

        eg.
        Integer i=10;

        Compiler converts int to Integer Automatically by AutoBoxing.
        
        After compilation the above line will become 
        Integer i=Integer.valueOf(10);

        That's internally autoboxing concept is implemented by using valueOf() method.

        AutounBoxing:

        Automatic conversion of wrapper object to primitive by compiler is called autoUnBoxing.

        eg.
        Integer i=new Integer(10);
        int inum=i;

        compiler converts integer to int automatically by autoUnBoxing.

        After compilation the above line will become 
        
        int inum=i.intValue();

        means AutoUnBoxing concept is implemented by using XxxValue();.


        Primitive --->wrapper object is known as Autoboxing(using valueOf()).

        Wrapper Object-->primitive value is known as AutoUnBoxing(using xxxValue()).

        eg.
        class Test{
            static Integer I=10; AutoBoxing
            main(){
                int i=I; AutoUnBoxing
                m1(i); AutoBoxing
                
            }
            public static void m1(Integer K){
                int m=k; AutoUnBoxing
                SOP(m);10
            }
        }

        It is valid in 1.5 Version but invalid in 1.4 version.

        Note>
        Just because of AutoBoxing and AutoUnboxing we can use primitive and wrapper Object interchangeability from 1.5Version onwords.

        eg2.

        class Test{
            static Integer I=0;
            main(){
                int m=I;
                SOP(m); 0
            }
        }

        class Test{
            static Integer I;
            main(){
                int m=I; RTE:NullPointerException.
                SOP(m);
            }
        }

        NOte
        On null reference,if we are trying to perform autounboxing then we will get RTE saying NullPointerException.

        eg3.
        Integer x=10;
        integer y=x;
        x++;
        SOP(x); 11
        SOP(y); 10
        SOP(x==y); false.

        NOte.
        All wrapper Objects are immutable means once we creates wrapper class object we cannot perform any changes in thay Object.
        If we are trying to perform any changes with those changes a new Object will be created.

        eg4.
        1,
        Integer x=new Integer(10);
        Integer y=new Integer(10);
        SOP(x==y); false

        2,
        Integer x=new Integer(10);
        Integer y=10;
        SOP(x==y); false

        3,
        Integer x=10;
        Integer y=10;
        SOP(x==y); true

        4,
        Integer x=100;
        Integer y=100;
        SOP(x==y); true

        3,
        Integer x=1000;
        Integer y=1000;
        SOP(x==y); false

        CONCLUSION.

        Internally to provide support for autoboxing, A buffer of wrapper Objects will be created at the time of wrapper class loading.
        BY Autoboxing if an Object is required to create first JVM will check whether this object already present in the buffer or not.
        If it already present in the buffer then existing buffer object will be used.

        If it is not already availble in the buffer then the JVM will create anew Object.
        
        class Integer{
            static{
                -128 to 127 buffer.
            }
        }

        BUt Buffer concept is available only in following range..

        Byte --> ALways
        Short--> -128 to 127
        Integer --> -128 to 127
        Long --> -128 to 127
        Character --> 0 to 127.
        Boolean --> always.

        except this range in all remaining cases a new Object will be created.

        eg.

        1,
        Integer x=127;
        Integer y=127;
        SOP(x==y); true

        2,
        Integer x=128;
        Integer y=128;
        SOP(x==y); false

        3,
        Boolean x=false;
        Boolean y=false;
        SOP(x==y); true
        
        4,
        Double x=10.0;
        Double y=10.0;
        SOP(x==y); false


        internally autoboxing concept is implemented by using valueOf() method hence buffering concept is applicable for valueOf method also.

        eg.

        1,
        Integer x=new Integer(10);
        Integer y=new Integer(10);
        SOP(x==y); false

        2,
        Integer x=10;
        Integer y=10;
        SOP(x==y); true

        3,
        Integer x=Integer.valueOf(10);
        Integer y=Integer.valueOf(10);
        SOP(x==y); true

        4,
        Integer x=10;
        Integer y=Integer.valueOf(10);
        SOP(x==y); true

        */
    }
}
