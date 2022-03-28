package com.innerclass.scjp;

public class Java02 {
    public void innerExample() {
        class Utility {
            void sum(int x,int y){
                System.out.println("The Sum:- "+(x+y));
            }
        }
        System.out.println("This is instance method of Java02 with inner local class reusability example");
        Utility i=new Utility();
        i.sum(10, 20);
        ;;;;;
        i.sum(100, 200);
        ;;;;;;
        i.sum(1000, 2000);
        System.out.println("Here the instance method got completed..");
    }
    public static void main(String[] args) {

        Java02 t=new Java02();
        t.innerExample();
        /*
        Inner Class.

        From normal or regular inner class,we can access both static and non-static members of outer class directly.

        eg.
        class Outer{
            int x=10;
            static int y=20;
            class Inner{
                public void m1(){
                    SOP(x);
                    SOP(y);
                }
                public static void main(String[] args){
                    new Outer.new Inner().m1();
                    //The Output is 10 20.
                }
            }
        }

        Within the inner class,this always refers current inner class Object.

        If we want to refer current outer class object,we have to use OuterClassName.this

        eg.
        class Outer{
            int x=10;
            class Inner{
                int x=100;
                public void m1(){
                    int x=1000;
                    SOP(x); 1000
                    SOP(this.x); //100 or SOP(Inner.this.x); //100
                    SOP(Outer.this.x);
                    //10
                }
            }
            main(){
                new Outer().new Inner().m1();
            }
        }

        The only applicable modifier for outer classes are 
        public,
        default,
        final,
        abstract,
        strictfp.

        But for inner classes,Applicable modifiers are 
        public,
        default,
        final,
        abstract,
        strictfp,
        private,
        protected,
        static.



        Nesting of Inner classes.

        Inside inner class, we can declare another inner class that is nesting of inner classes are possible.

        eg.

        class A{
            class B{
                class C{
                    public void m1(){
                        SOP("Innermost class method");
                    }
                }
            }
            main(){
                A a=new A();
                A.B b=a.new B();
                A.B.C c=b.new C();
                c.m1();
            }
        }


        Method Local Inner class.

        Sometimes we can declare a class inside a method such type of inner classes are called method local inner classes.

        The main purpose of method local inner class is to define method specific repeatedly required functionality.

        Method local inner classes are best suitable to meet nested method requirement.

        We can access method local inner classes only within a method where we declared.
        Outside of the method, we cannot access.
        Because of its less scope,method local inner classes are most rarely used type of inner classes.
        
        eg.
        class Test{
            public void m1(){
                class Inner(){
                    public void sum(int x,int y){
                        SOP("The sum:"+(x+y));
                    }
                    Inner i=new Inner();
                    i.sum(10,20);
                    --
                    --
                    i.sum(100,200);
                    --
                    --
                    i.sum(1000,2000);
                    --
                    --

                    
                }
            }
            main(){
                Test t=new Test();
                t.m1();
            }
        }

        We can declare Method Local Inner Class inside both instance and static methods.

        If we declare inner class inside instance method then from that method local inner class,we can access both static and non-static members of outer class directly.

        If we declare inner class inside static method then we can access only static members of outer class directly from that method local inner class.

        eg.
        class Test{
            int x=10;
            static int y=20;
            public void m1(){ 
                class Inner(){
                    public void m2(){
                        SOP(x); line01
                        SOP(y);
                    }
                }
                Inner i=new Inner();
                i.m2();
            }
            main(){
                Test t=new Test();
                t.m1(); //10 20
            }
            In this example, if we declare m1() method as static then at line01 we will get CTE.
            saying 
            non-static variable x cannot be referenced from a static context.
        }


        VERY IMP*

        From method local inner class, we cannot access local variables of that method inwhich we declare inner class.
        If the local variable declared as final then we can access.

        class Test{
            public void m1(){
                int x=10;

                class Inner{
                    public void m2(){
                        SOP(x);
                    }
                    Inner i=new Inner();
                    i.m2();
                }
            }
            main(){
                Test t=new Test();
                t.m1();
            }
        }
        CTE.
        Local variable x is accessed from within inner class; needs to be declared final.

        If we declare x as final then we won't get any CTE.

        Consider the following code...

        class Test{
            int i=10;
            static int j=20;
            public void m1(){
                int k=30;
                final int m=40;
                class Inner{
                    public void m2(){
                        line01;
                    }
                }
            }

        }
        
        At line 01 we can access i,j and m variable.
        and k is not accessible.

        If we declare m1 method as static then at line01 we can access j and m.
        We cannot access i and k.


        If we declare m2 method as static then we will get CTE.
        because we cannot declare static method/variable/members inside InnerClass.

        Method Local InnerClasses.
        
        The only applicable modifier for method local innerclasses are final, abstract and strictfp.
        If we are trying to apply any other modifier then we will get CTE.



        

        */
    }
    
}
