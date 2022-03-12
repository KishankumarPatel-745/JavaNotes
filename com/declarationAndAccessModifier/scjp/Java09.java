package com.declarationAndAccessModifier.scjp;
public class Java09 {
    public static void main(String[] args) {
        /*
        static is a modifier applicable for methods and variables but not for classes. we cannot declare top level class with static modifier.
        But we can declare inner class as static.(Such type of inner classes are called static nested classes.)

        In the case of instance variable for every object, a separate copy will be created but in case of static variable, a single copy will be created at class level and shared by every object of that class.

        class Test{
            static int x=10;
            int y=20;
            main(){
                Test t1= new Test();
                t1.x=888;
                t1.y=999;
                Test t2=new Test();
                sop(t2.x+" ---- "+t2.y)
            }
        }
        answer: 888 ---- 20

        we cannot access instance members directly from static area, but we can access from instance area directly.
        We can access static member from both instance and static areas directly.


        que.
        consider the following declaration. 
        1,int x=10;
        2,static int x=10;
        3,public void m1(){
            sop(x);
        }
        4.public static void m1(){
            sop(x);
        }
        which of the above declaration we can take simantaneously.
        1, 1 and 3
        2, 1 and 4 CTE non-static variable x cannot be reference from a static content.
        3, 2 and 3
        4. 2 and 4
        5, 1 and 2 :- variable x is already defined in Test
        6, 3 and 4 :- m1() is already defined in Test.

        CASE01
        Overloading concept applicable for static method including main methods but JVM can always call String[] main method only.

        eg.
        class Test{
            public static void main(String[] args){
                SOP("String");
            }
            public static void main(int[] args){
                SOP("String");
            }
        }
        //OverLoaded Methods..

        Other overloaded methods,we have to call like a normal method call.


        Case02

        class P{
            main(){
                SOP("parent main")
            }
        }
        class C extends P{

        }
        javac P.java

        two .class file got generated.

        Inheritance concept applicable including main method hence while executing child class if child doesnot contain main() method then parent class main() method got executed.
        eg.
        class P{
            main(){
                SOP("parent main");
            }
        }
        class C extends P{
            main(){
                SOP("Child Main");
            }
        }
        It is method hiding but not overridding.
        It seems overriding concept applicable but it is not overriding but it is method hiding.

        For static method, Overloading and inheritance concept are applicable but overriding concept are not applicable but instead of overriding, method hiding concept is applicable.

        Inside method implementation, if we are using atleast one instance variable then that method talk about a particular object.Hence we should declare method as instance methods.

        Inside method implementation if we are not using any instance variable then this method know way related to a particular object. Hence we have to declare such type of method as static method.irrespect of whether we are using static variable or not.

        eg.
        class Student {
            String name;
            int rollNumber;
            int marks;
            static String sname;

            Instance methods of that class

            getStudentInfo(){
                return name+"---"+marks
            }

            getCompleteInfo(){
                return x+y/2;
            }


            Static methods 
            ==========
            getCollegeInfo(){
                return sname;
            }

            getAverage(int x,int y){
                return x+y/2;
            }
        }

        for static method implementation should be availble where as for abstract method implementation is not availble hence abstract-static combination is illegal for methods.

        ==>synchronized modifier.
        Only for methods and blocks.

        synchronized is the modifier applicable for methods and blocks but not for classes and variables.

        If multiple threats are trying to operate simantaniously on the same java object then there maybe a chance of data inconsistance problem.This is called race condition. we can overcome this problem by using synchronized keyword.
        If a method or block declared as synchronized then at a time only one threat is allowed to execute that method or block on given object.So that data inconsistence problem will be resolved but the main disadvantage of synchnonized keyword is it increases waiting time of thread and creates performance problem hence of there is no specific requirement then it is not recommaanded to use synchronized keyword.

        synchronized method should compulsory contain implementation where as abstract method doesnot contain any implementation hence abstract-synchronized is illegal combination of modifier for methods.

        

   
        */
    }
}
