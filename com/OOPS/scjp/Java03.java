package com.OOPS.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        HAS-A relationship

        Has-A relationship is also known as composition.aggregation.

        There is no specific keyword to implement has-a relation but most of the time we are depanding on new keyword.

        The main advantage of HAS-A relationship is reusability of the code.

        eg.
        class Car{
            Engine e=new Engine;
            ---
            ---

        }

        Car has a Engine reference.

        Difference between composition and aggregation.

        Without existing container object,if there is no chance of existing contained object.
        Then container and contained objects are strongly associated and this strong association is nothing but composition.

        University consists of several departments   without existing university there is no chance of existing department.Hence University and departments are strongly associated.
        And this strong association is nothing but composition.

        Aggregation
        Without existing container object, If there is a chance of existing contained object.Then container and contained objects are weakly associated. and this weak association is nothing but aggregation.

        eg.
        Department consists of several professors.
        Without existing department there maybe a chance of existing professor objects.
        Hence departments and professor objects are weakly associated. and this week association is nothing but aggregation.

        NOTE:
        In composition Objects are strongly associated where as in aggregation Objects are weakly associated.
        
        In composition, container object holds directly contained objects.
        Whereas in aggregation container object holds just references of contained objects.

        IS-A VS HAS-A
        =========

        If we want total functionality of a class automatically then we should go for IS-A relationship.

        Person class 
        IS_A relationship
        Student class.

        If we want part of the functionality then we should go for HAS-A relationship.
        Test class
        contain 100 methods

        HAS-A
        class Demo{
            Test t=new Test();
            t.m1();
            t.m2();
        }

        Method Signature.
        
        In java method signature consists of method names followed by argument types.

        eg.
        public static int m1(int i,florat f);
        ==> m1(int, float);

        return type is not part of method signature in java.

        Test t=new Test();
        t.m1(10)

        Compiler will use method signature to resolve method calls.

        class Test{
            public void m1(int i){}
            public void m2(String s){}
        }

        t.m1(10);
        t.m2("Durga");
        t.m3(10.5);CTE cannot find symbol
        symbol:method m3(double)
        location: class Test


        Within a class two method with the same signature not allowed.
        eg.
      
        class Test{
            public void m1(int i){
                
            }  m1(int)
            public int m1(int i){

            }  m1(int) CTE
        }

        CTE :- m1(int) is already defined in Test class.

        Overloading IMP Concept.

        Two methods are said to be overloaded if both methods having same name but different argument type.
        means different signature with same name.

        In C language.
        Method overloading concept is not availble hence we cannot declare multiple methods with the same name.
        But different argument types.
        If there is change in argument type compulsory we should go for new method name,which increases complexity of programming.
        C
        abs(int i)=>abs(10);
        labs(long l)=>labs(10l);
        fabs(float i)=>fabs(10.6f);
        But in java, we can declare multiple method with the same name but different argument types.
        Such type of methods are called overloaded methods.

        abs(int i);
        abs(long l);
        abs(float f);
        Overloaded methods

        Having overloading concept in java reduces complexity of programming.

        ** In overloading method resolution always takes care by compiler based on reference type Hence overloading is also considered as compile time polymorphism or early binding.
        eg.
        class Test{
            public void m1(){
                SOP("No-args");
            }
            public void m1(int i){
                SOP("int-args");
            }
            public void m1(double d){
                SOP("double-args"); 
            }
            main(){
                Test t=new Test();
                t.m1(); No-args
                t.m1(10); int-args
                t.m1(10.5); double-args
            }
        }

        




        */
    }
}
