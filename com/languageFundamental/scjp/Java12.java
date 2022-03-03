package com.languageFundamental.scjp;

public class Java12 {
    public static void main(String[] args) {
            /*
            var-arg method(Variable Number of Argument Methods)
            came in 1.5 Version.

            Until 1.4Version, we cannot declare a method with variable number of argument, if there is change in number of argument compulsory we should go for new method, it increases length of the code and reduce readability.

            To over come this,Sun people introduce in 1.5v according to this we can decalre a method,which can take variable number of augument such type of methods are called Var-arg methods

            we can declare a ve-arg methods as follows.

            m1(int... x);
            we can call this method any number of int value including zero number.
            eg
            m1();
            m1(10);
            m1(10,20);
            m1(10,20,20);

            Internally var-arg parameter will be converted into 1D array hence within the var-arg method we can differentiate value by using index.

            =========
            class Test{
                public static void main(String[] args){

                }
            }
            ==========

            CASE01
            which of the following valid var-arg method declaration:
            m1(int...  x); VALID
            m1(int  ...x); VALID
            m1(int...x); VALID
            m1(int. ..x);InValid
            m1(int  .x..); Invalid

            Case02:
            we can mix var-arg parameter with normal parameter.
            eg
            m1(int x.int... y);
            m1(String x.double... y);

            CASE03
            If we mix normal parameter with fixed parameter then var-arg parameter should be last parameter.

            m1(double... d,String s); INvalid

            m1(String s,double... d);Valid

            Case 04
            Inside var-arg method, we can take only one var-arg parameter and we cannot take more than one var-arg parameter.
            eg.
            m1(int... x,double... y):Invalid.

            case05
            Inside a class,we cannot declare var-arg method and corresponding 1D array method simantaneously otherwise we will gwt compile time error.

            class Test{
              
                public static void m1(int... x){
                    sop("var-arg")

                }
                public static void m1(int[  ] x){
                    sop("1D Array")

                }
            }

            CTE:- cannot declare both m1(int[]) and m1(int...) in Test.

            Case06
            In General var-arg method will get least priority that's if no other method matched then only var-arg method got change. it is exactly some as default case inside switch.

            class Test{
                public static void m1(int... args){
                    sop("Var-Arg");
                }
               
                public static void m1(int args){
                    sop("General Methods");
                }
                public static void main(String[] args){
                    m1();/Var-Arg
                    m1(10,20);/Var-Arg
                    m1(10);/General Methods   
                }
            }


            EQUAVALENCE BETWEEN VAR-Arg Parameter and 1D array.

            CASE01:
            Whereever 1D Array presents we can replace with var-arg parameter.
            eg..

            m1(int[] x)-->m1(int... x)

            m1(new int[]{10});-->m1(10)
            m1(new int[]{10,20});-->m1(10,20);
            m1(new int[]{10,20,30});-->
            m1(10,20,30);

            main(String[] args)--> main(String... args)
            can be replaced with var-args.

            Whereever var-arg parameter present we cannot replace with 1D array.
            
            eg
            m1(int... x)==>m1(int[] x);
            InValid replacement.

            NOTE:-
            m1(int... x)=> int[] x
            we can call this method by passing a group of int values. And x will become 1D Array.

            m1(int[]... x)=> we can call this method by passing a group of 1D int arrays.and x will become 2D int array.

            class Test{
                public static void main(String[] args){
                    int[] a={10,20,30};
                    int[] b={40,50,60};
                    m1(a,b);
                }
                public static void m1(int[]... x){
                    for(int[] x1:x){
                        sop(x1[0]);
                    }

                }
            }












            





            */
    }
}
