package com.enumClass.scjp;

public class Java03 {

    enum Lang{
        C(9),CPP(10),PYTHON(8),JS(8),JAVA;
        int rating;
        Lang(int rating){
            this.rating=rating;
        }
        Lang(){
            this.rating=9;
        }
        public int getRating() {
            return rating;
        }
    }
    public static void main(String[] args) {
        Lang[] L=Lang.values();
        for (Lang lang : L) {
            System.out.println(lang+"---"+lang.getRating());
        }
        /*
        Enum..

        An enum can contain constructor.
        enum constructor will be executed separately for every enum constant at the time of enum class loading automatically.


        eg.
        enum Beer{
            KF,KO,RC,FO;
            Beer(){
                SOP("Constructor call.");
            }
        }
        class Test{
            main(){
                Beer b=Beer.KO; line01
                sop("hello");
            }
        }

        java test

        constructor call
        constructor call
        constructor call
        constructor call
        hello
        

        if we comment line 01 then the output is hello.

        we cannot create enum object directly and hence we cannot invoke enum constructor directly.

        Beer b=new Beer();

        CTE: enum type may not be instantiated.

        refer code 
        o/p
        C---9
        CPP---10
        PYTHON---8
        JS---8


        note .
        CPP ==> public static final Lang CPP=new Lang();
        
        CPP(10) ==> public static final Lang CPP=new Lang(10);

        inside enum, we can declare method but should be concret method onlt and we cannot create abstract method.

        case01.

        every enum constant represent an object of the type enum. hence whatever methods we can apply on normal java object, can be applicable on enum constant also.
        
        eg.
        Beer.KF.equals(Beer.RC) valid 

        Beer.KF.hashcode() > Beer.RC.hashcode() valid 
        
        Beer.KF > Beer.RC not valid.

        Beer.KF.ordinal() < Beer.RC.ordinal();

        case02.

        if we want to use any class or interface directly from outside package and the required import is normal import.

        If we want to access static member without class name, then the required import is static import.

        eg.
        import static java.lang.Math.sqrt;
        import java.util.ArrayList;

        class Test{
            main(){
                ArrayList l=new ArrayList();
                SOP(sqrt(16));
            }
        }

        eg01

        package pack1
        public enum Fish{
            STAR,GUPPY;
        }


        package pack2;
        public class Test1{
            main(){
                Fish f=Fish.GUPPY;  
                SOP(f);
            }
        }
        The required import is import pack1.Fish;
         or
        import pack1.*;


        package pack3;
        public class Test2{
            main(){
                SOP(STAR);
            }
        }
        the required import is 

        import static pack1.Fish.STAR
        or.
        import static pack1.Fish.*;
        


        package pack4;
        public class Test3{
            main(){
                Fish f=Fish.STAR;
                SOP(GUPPY);
            }
        }

        The required imports are 
        import pack1.Fish;
        or.
        import pack1.*;

        and 

        import static pack1.Fish.GUPPY;
        or
        import static pack1.Fish.*;



        Case03.

        enum Color{
            BLUE,RED,GREEN;
            public void info(){
                SOP("Universal Color");
            }
        }

        class Test{
            main(){
                Color[] c=Color.values();
                for(Color c1:c){
                    c1.info();
                }
            }
        }

        o/p 
        Universal Color
        Universal Color
        Universal Color



        enum Color{
            BLUE,RED{
                public void info(){
                    SOP("Dangerous Color");
                }
            },GREEN;
            public void info(){
                SOP("Universal Color");
            }
        }

        class Test{
            main(){
                Color[] c=Color.values();
                for(Color c1:c){
                    c1.info();
                }
            }
        }

        o/p 
        Universal Color
        Dangerous Color
        Universal Color


        enum vs Enum vs Enumeration.

        enum :- 

        enum is a keyword in java, which can be used to define a group of named constant.

        Enum:- 
        Enum is a class in java present in java.lang package.
        Every enum in java should be direct child class of Enum class.
        Hence this class acts as base class for all java enum.

        Enumeration:-

        Enumeration is an interface present in java.util package.
        We can use Enumeration object to get Object one by one from the collections.










        */
    }
    
}
