package com.GarbageCollector.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        The ways to make an object eligible for GC.

        Even though programmer is not responsible to destroy the useless Object, it is highly recommanded to make the object eligible for GC, if it is no longer required.

        An object is said to be eligible for GC if it doesnot contain any reference variable . The following are various ways to make an object eligible for GC.

        Nullifing the reference variable.
        If an object no longer required then assign null to all its reference variable then that object automatically eligible for GC.
        This approach is nothing but nullifiing the reference variable.

        Student s1=new Student();
        Student s2=new Student();

        s1=null;

        s2=null;

        Both objects are eligible for GC.
        By nullifing them.

        Reassigning the reference Variable.

        If an object no longer required then reassign its reference variable to some other object then old object by default eligible for GC.

        Student s1=new Student();
        Student s2=new Student();

        s1=new Student();
        s2=s1;

        two object is eligible for GC.

        
        Objects created inside a method.

        The objects which are created inside a method are bydefault eligible for GC once method completes.
        eg.
        class Test{
            main(){
                m1();
            }
            public static void main(){
                Student s1=new Student();
                Student s2=new Student();
            }

            //Two objects eligible for GC after completion of method.

        }


        Another eg.
        class Test{
            main(){
                Students=m1();
            }
            public static Student m1(){
                Student s1=new Student();
                Student s2=new Student();
                return s1;

            }
        }
        //Only one object is eligible for GC.

        class Test{
            main(){
                m1();
            }
            public static Student m1(){
                Student s1=new Student();
                Student s2=new Student();
                return s1;

            }
        }

        //Two objects are eligible for GC.

        class Test{
            Static Student s;
            main(){
                Students=m1();
            }
            public static Student m1(){
                s=new Student();
                Student s2=new Student();
           
            }
        }

        //Only one object is eligible for GC.


        4th ways.

        Island of Isolation.

        class Test{
            Test i;
            main(){
                Test t1=new Test();
                Test t2=new Test();
                Test t3=new Test();
                t1.i=t2;
                t2.i=t3;
                t3.i=t1;
                t1=null;
                t2=null;
                //At this point no objects are eligible for GC
                t3=null;

                //Here 3 Objects eligible for GC.

                Refer Image

            }
        }
        

        If an object doesnot contains any reference variable then it is eligible for GC always.

        Eventhough Object having references sometimes it is eligible for GC(If all references are internal references, eg island of isolation).



        
        
        */
    }
    
}
;