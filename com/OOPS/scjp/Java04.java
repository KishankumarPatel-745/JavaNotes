package com.OOPS.scjp;

public class Java04 {
    /*
    CASE01;
    Automatic promotion in Overloading 

    While resolving overloaded method if exact matched method is not availble then we wont get any compile time error immediately.

    First it will promote argument to the next level and check whether matched method is available or not.
    If matched method is availble then it will be considered.If matched method is not available then compiler promotes arguments to the next level.
    This process will be continued untill all possible promations.Still if the matched method is not availble then we will get CTE.

    the following are all possible promotions in overloading.
    byte->short->int->long->float->double

    char->int->long->float->double

    This process is called automatic promotion in overloading.
    eg
    class Test{
        public void m1(int i){
            SOP("int-arg");
        }
        public void m1(float i){
            SOP("float-arg");
        }
        main(){
            Test t=new Test();
            t.m1(10); int-arg
            t.m1(10.5f); float-arg
            t.m1('a'); int-arg
            t.m1(10l); float-arg
            t.m1(10.5); CTE:cannot find symbol
            symbol:method m1(double)
            location:Test

        }
    }

    CASE02: 
    Note:
    While resolving overloaded method compiler will always gives precedence for child type argument with compared with parent type argument.

    class Test{
        public void m1(String s){
            SOP("String Version");
        }
        public void m1(Object s){
            SOP("Object Version");
        }
        //Overloaded methods
        main(String[] args){
            Test t=new Test();
            t.m1(new Object());Object Version
            t.m1("Kishan");
            String Version
            t.m1(null);
            String Version
        }
    }

    CASE03
    eg2
    class Test{
        public void m1(String s){
            SOP("String Version");
        }
        public void m1(StringBuffer s){
            SOP("StringBuffer Version");
        }
        //Overloaded methods
        main(String[] args){
            Test t=new Test();
            t.m1(new StringBuffer("Jinal")); StringBuffer Version
            t.m1("Kishan");
            String Version
            t.m1(null);
            CTE reference to m1() is ambiguous.
            
        }
    }

    CASE04
    class Test{
        public void m1(int i,float f){
            SOP("int-float version");
        }
        public void m1(float f,int i){
            SOP("float-int version");
        }
        //Overloaded Methods

        main(){
            Test t=new Test();
            t.m1(10,10.5f);int-float version
            t.m1(10.5f,10);
            float-int version
            t.m1(10,10);
            CTE:reference to m1() is ambiguous
            t.m1(10,10.5f);
            CTE: cannot find symbol
            symbol:method m1(float,float)
            location:class Test

        }
    }

    CASE05

    class Test{
        public void m1(int x){
            SOP("General Methods");
        }
        public void m1(int... x){
            SOP("Var-arg Methods");
        }
        //Overloaded Methods
        main(){
            Test t=new Test();
            t.m1();//var-arg method
            t.m1(10,20);//var-arg methods
            t.m1(10);
            General methods.

            //In General var-arg method will get least priority means if no other method matched. Then only var-arg method will get the chance.
            It is exactly same as default case inside switch.

        }
    }

    CASE06
    class Animal{

    }
    class Monkey extends Animal{

    }

    class Test{
        public void m1(Animal a){
            SOP("Animal Version");
        }
        public void m1(Monkey a){
            SOP("Monkey Version");
        }
        //Overloaded methods

        main(){
            Test t=new Test();

            Animal a=new Animal();
            t.m1(a);Animal Version

            Monkey m=new Monkey();
            t.m1(m);Monkey Version

            Animal a1=new Monkey();
            t.m1(a1);Animal Version
        }
    }

    In overloading method resolution always takes care by compiler based on reference type.
    In overloading runtime object wont play any role.
    

    */
    
}
