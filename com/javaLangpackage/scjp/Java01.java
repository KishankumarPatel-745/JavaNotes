package com.javaLangpackage.scjp;

class Student{
    int num;
    String name;
    Student(int num,String name){
        this.num=num;
        this.name=name;
    }
    @Override
    public String toString() {
        return name+"-----"+num;
    }

}
public class Java01 {
    public static void main(String[] args) {
        Student s1=new Student(10,"Kishan");
        System.out.println(s1);

        /*
        JAVA.Lang Package.

        1, Introduction
        2, Object Class
        3, String Class
        4, StringBuffer Class
        5, StringBuilder Class
        6, Wrapper Classes.
        7, Autoboxing and Autounboxing.
        

        Introduction.

        For writing any Java programm, whether it is simple or complex.The most commonly required classes and interfaces are grouped into a separate package which is nothing but Java.Lang package.

        We are no required to import java.lang package explicitly because all classes and interfaces present in Lang package bydefault available to every java programm.

        java.Lang.Object class

        The most commonly required methods for every java class(whether it is predefined class or customized class) are defined in a separate class,which is nothing but object class.

        Every class in Java is the child class of Object either directly or indirectly so that Object class method by default available to every java class.
        Hence Object class is considered as root of all java classes.

        NOte:
        If our class doesnot extend any other class then only our class is the direct child class of Object.
        eg.
        class A{

        }
        Object <--- A

        If our class extends any other class then our class is indirect child class of Object.
        eg.
        class A extends B{

        }
        Object <---B <---A

        Multi-level Inheritance.

        COnclusion 
        Either directly or inderectly java won't provide support for multiple inheritance with respect to classes.


        Object class defines the following 11 methods.

        1,
        public String toString();

        2,
        public native int hashCode();

        3,
        public boolean equals(Object o);

        4,
        protected native Object clone() throws CloneNotSupportedException

        5,
        protected void finalize() throws Throwable

        6,
        public final Class getClass();

        7,
        public final void wait() throws InterruptedException

        8,
        public final native void wait(long ms) throws InterruptedException

        9,
        public final void wait(long ms,int ns) throws InterruptedException

        10,
        public native final void notify()

        11,
        public native final void notifyAll()

        NOte:
        strictky speaking Object class contains 12 methods.
        The extra method is registerNatives();

        private static native void registerNative();

        This method internally required for Object class and not available to the child classes.Hence we are nor required to consider this method.

        1, toString() method of Object class.

        We can use toString() to get string representation of an Object.

        String s=obj.toString();

        Whenever we are trying to print object reference internally toString() method will be called.

        eg.
        Student s=new Student();
        SOP(s); === sop(s.toString());

        eg.

        class Student{
            String name;
            int rollNo;

            Student(String name,int rollNo){
                this.name=name;
                this.rollNo=rollNo;

            }
            main(String[] args){
                Student s1=new Student("Kishan",12);
                Student s2=new Student("JInal",123);

                SOP(s1);
                SOP(s1.toString());
                SOP(s2);
            }

        }
        If our class doesn't contain toString then Object class toString() got executed.

        eg. output

        In the above example, Object class toString() got executed.
        Which is implemented as follows 

        public String toString(){
            return getClass().getName()+"@"+Integer.toHexString(hashCode());
        }

        ClassName@HashCodeInHexaDecimalForm.


        Based on our requirement,we can override toString() to provide our own string representation.
        eg.
        Whenever we are trying to print student object reference to print his name and rollNo we have to override toString() method as follows.

        public String toString(){
            return name +"-----"+rollNo;
        }


        In all wrapper classes, in all collection classes, string class, StringBuffer and StringBuilder classes toString method is overridden for meaningful string representation.
        Hence it is highly recommanded to override toString() method in our class also.

        eg.
        class Test{
            public String toString(){
                return "Test";
            }

            main(){
                String s=new String("Kishan");
                SOP(s); Kishan
                Integer i=new Integer(10);
                SOP(i); 10
                ArrayList l=new ArrayList();
                l.add("A");
                l.add("B");
                SOP(l); [A,B]
                Test t=new Test();
                SOP(t); Test
            }
            
        }

        



        */
        
    
    }


}
