package com.enumClass.scjp;

enum Java02 {
    C,CPP,PYTHON,GO;
    public static void main(String[] args) {
            System.out.println("enum main method calls..");
        
        /*
        Enum vs inheritance..

        Every enum is always direct child class of Java.lang.Enum and hence our enum cannot extends any other Enum.
        because java wont provide support for multiple inheritance.

        Every Enum is always final implicitly and hence for our enum, we cannot create child enum.
        Because of above reasons, inheritance concept is not applicable for Enum explicitly and we cannot use extend keyword for Enum.


        case01
        enum x{

        }
        enum y extends x{

        } Invalid


        case02
        enum x extends java.lang.Enum{

        } Invalid

        case03
        class x{

        }
        enum y extends x{

        } invalid

        enum x{

        }
        class y extends x{

        }
        CTE01: cannot inherit from final x.

        CTE02: enum type are not extensible.

        Any way an enum can implement any number of interfaces.
        
        interface x{

        } 
        enum y implements x{

        } valid.

        java.lang.enum

        An enum can implement any number of interfaces.
        interface x{

        }
        enum y implements x{

        }

        java.lang.Enum...

        Every Enum in java is the direct child class of java.lang.enum and hence this class acts as base class for all java enum.

        it is an abstract class and it is a direct child class of object.
        it implements Serializable and Comparable interfaces.

        values() method.

        Every enum implicitly contains values() to list out all values present inside enum.

        eg.
        Beer[] b=Beer.values();

        note.
         values() not present in java.lang.Enum and Object classes.

         Enum keyword implicitly provides this method.

         ordinal() method.

         inside enum order of constant is important and we can represent this order by using ordinal value.

         we can find ordinal value of enum constant by using ordinal method.

         public final int ordinal();

         ordinal value is zero based like array index.

        eg.

        enum Beer{
            KF,KO,RC,FO;
        }
        class Test{
            main(){
                Beer[] b=Beer.values();
                for(Beer b1:b){
                    SOP(b1 +"-----"+b1.ordinal());
                }

            }
        }
        o/p
        KF---0
        KO---1
        RC---2
        FO---3.


        speciality of java enum.

        in old languages enum, we can take only constant but in java enum in addition to constant, we can take methods,constructor, normal variable etc. hence java enum is more powerful than old langs enum.

        even inside java enum, we can declare main method and we can run enum class directly from command prompt.


        refer code 
        javac Java02.java
        java Java02
        o/p enum main method call.

        In addition to constant, if we are talking any extra members like methods then list of constant should be in the first line and should ends with semi-colon.

        case01

        enum fish{
            STAR,GUPPY;
            public void m1(){

            }
        }//; is mandatory.

        case02
        enum fish{
            STAR,GUPPY
            public void m1(){

            }
        }// invalid ; is mandatory

        case03
        enum fish {
            public void m1(){
                
            }
            STAR,GUPPY; 
        }//invalid the constant has to be first statement in enum.

        case04
        enum fish{
            public void m1(){

            }
        }// not valid atleast ; needed as a constant.

        case05
        enum fish{
            ;
            public void m1(){

            }
        } valid.

        note.\
        inside enum if we are taking any extra member like a method compulsory the first line should contain list of constant atleast semi-colon.

        empty enum is valid java syntax.

        like 
        enum fish{

        } valid




        
        
        */
    }
}
