package com.javaLangpackage.scjp;

public class Java11 {
    public static void main(String[] args) {
        /*
        AutoBoxing and AutoUnBoxing.

        OverLoading with respect to autoboxing,widening and var-arg method.

        Autoboxing VS widening

        eg1.
        class Test{
            public static void m1(Integer I){
                SOP("AutoBoxing")
            }
            public static void m1(long l){
                SOP("Widening")
            }
            main(){
                int x=10;
                m1(x); //widening
            }
        }

        Widening dominates autoboxing.


        widening VS var-Arg method

        class Test{
            public static void m1(int... x){
                SOP("Var-Arg method")
            }
            public static void m1(long l){
                SOP("Widening")
            }
            main(){
                int x=10;
                m1(x); //widening
            }
        }
        widening dominates var-arg method.

        eg3.
        Autoboxing Vs Var-arg.

        class Test{
            public static void m1(Integer I){
                SOP("AutoBoxing")
            }
            public static void m1(int... x){
                SOP("Var-Arg method")
            }
            main(){
                int x=10;
                m1(x); //AutoBoxing
            }
        }
        AUtoBoxing dominates var-arg methods.
        In general, var-arg method will get least priority.
        If no other method matched then only var-arg method will get the chance.It is exactly same as default case inside switch.

        widening>autoboxing>var-arg

        NOTE>
        While resolving overloaded method, compiler will always give the precedence in the following order.

        widening>autoboxing>var-arg

        class Test{
            public static void m1(Long l){
                SOP("Long");
            }
            main(){
                int x=10;
                m1(x);
            }
        }
        CTE m1(Java.Lang.Long) in Test cannot be applied to (int).  

        widening followed by autoboxing is not allowed in Java.
        where as autoboxing followed by widening is allowed.

        widening --> AB ,not-allowed

        AB-->widening ALlowed.

        eg.
        Long l=10;
        CTE: incompatible types
        found: int
        required:java.lang.Long


        long l=10;
        valid using widening concept.

        class Test{
            public static void m1(Object o){
                SOP("Object Version");
            }
            main(String[] args){
                int x=10;
                m1(x);
            }
        }o/p Object Version

        int --(AutoBoxing)--> Integer --(Widening)-->Object

        hence 
        Object o=10; valid
        Number n=10; valid


        Which of the following Assignments are legal.

        int i=10; valid
        Integer i=10; valid
        int i=10l; Invalid CTE
        Long l=10L; valid
        Long l=10; Invalid
        long l=10; valid
        Object o=10; valid
        double d=10; valid
        Double d=10; Invalid
        Nunber n=10; valid AB-->windening





        
        */
    }
}
