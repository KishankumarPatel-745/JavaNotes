package com.enumClass.scjp;

/**
 * Java01
 */
public class Java01 {
    enum Beer{
        RC,Diago,KFC;
    }

    public static void main(String[] args) {
        Beer b=Beer.KFC;
        System.out.println(b);
        switch (b) {
            case Diago:
                System.out.println("Top class bread:");
                break;
            
            case RC:
                System.out.println("this is children's bread");
                break;
            case KFC:
                System.out.println("not that much kick");
                break;
        
            default:
            System.out.println("not recommanded");
                break;
        }

        /*
        Enum concept.

        if we want to represent a group of named constant then we should go for Enum.

        enum Month{
            JAN,FEB,MAR,....,DEC;
        }

        enum Beer{
            KF,RC,KO,FO;
        }

        ; semi colon is optional.

        The main objective of Enum is to define our own Data types(Enumarated data type).

        Enum concept introduced in 1.5 version, when compared with old languages enum, java enum is more powerful.

        Internal implementation of Enum...

        enum Beer{
            KF,RC;
        }

        Every Enum is internally implemented by using class concept.
        every enum constant is always public static final.

        every enum constant represent an object of the type enum.

        eg.
        enum Beer{
            KF,RC;
        }

        internally 
        
        class Beer{
            public static final Beer KF=new Beer();
            public static final Beer RC=new Beer();
            
        }

        enum declaration and usage.

        Every Enum constant is always public static final and hence we can access enum constant by using enum name.

        enum Beer{
            KF,KO,RC,FO;
        }
        class Test{
            main(){
                Beer b=Beer.RC;
                SOP(b); RC o/p
            }
        }

        Inside enum toString method is internally implemented to return name of the constant.

        We can declare enum either within a class or outside of the class but not inside a method.

        If we are trying to declare inside a method then we will get compile time error, saying enum types must not be local.

        case01 
        enum x{

        }
        class y{

        } valid

        case02
        class x{
            enum y{

            }
        } valid

        case03
        class X{
            public void m1(){
                enum y{

                }
            }
        } invalid 
        CTE:
        enum types must not be local.


        if declare enum outside of the class,The applicable modifiers are public,default, strictfp.
        
        if declare enum inside a class, the applicable modifiers are public,default,strictfp, private ,protected and static.
        
        enum vs switch

        until 1.4 version, the allowed argument types for the switch statement are byte, short ,char,int. but from 1.5 version onwords, corresponding wrapper classes and enum types are allowed.

        from 1.7 version onwords, String type also allowed.

        Hence 1.5 version onwords, we can pass enum type as argument to switch statement 


        if we pass enum type as an argument to switch statement then every case label should be enum type constant, otherwise we will get CTE.

        switch(b){
            case KF;
            case KO;
            case RC;
            case KALYANI; CTE: unqualified enumeration constant name required.
        }
        */
    }
}