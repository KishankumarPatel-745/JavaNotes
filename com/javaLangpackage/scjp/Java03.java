package com.javaLangpackage.scjp;
/**
 * Java03
 */
class Student{
    int rollNo;
    String name;
    
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    @Override
    public boolean equals(Object obj) {
        try{
            String name1=this.name;
            int r1=this.rollNo;
            Student s=(Student)obj;
            String name2=s.name;
            int r2=s.rollNo;
            if(name1.equals(name2) && r1==r2){
                return true;
            }else{
                return false;
            }

        }catch(ClassCastException|NullPointerException e){
            return false;
        }
    }
}
public class Java03 {

    public static void main(String[] args) {

        Student s1=new Student("Kishan",101);
        Student s2=new Student("Jinal",102);
        Student s3=new Student("Kishan",101);
        Student s4=s1;
        System.out.println(s1.equals(s2)); //false  //false
        System.out.println(s1.equals(s3)); //false //true
        System.out.println(s1.equals(s4)); //true //true

        System.out.println(s1.equals(null));
        System.out.println(s1.equals("jinal"));
        /*

        We can use equals() method to ckeck equality of two objects.

        obj1.equals(obj2);

        IF our class doesnot contain equals() then object class equals() will be executed.

        In the above example,Object class equals() got executed, which is meant for reference comparison(Address comparison).
        If two reference point to the same reference then only that equals() returns true.

        Based on our requirement we can override equals() method for content comparison.

        While overriding equals() method for content comparison we have to take care about the following 

        1, what is the meaning of equality. Whether we have to check only name or only rollNumber or Both.

        2, If we are passing different type of Object ,our equals() should not raise classcastException that is we have to handle ClassCastException to return false.

        If we are passing null argument then our equals() should not raise NullPointerEXception, means we have to handle NullPointerException to return false.

        The following is a proper way of overriding equals() for student class content comparison

        public boolean equals(Object obj) {
        try{
            String name1=this.name;
            int r1=this.rollNo;
            Student s=(Student)obj;
            String name2=s.name;
            int r2=s.rollNo;
            if(name1.equals(name2) && r1==r2){
                return true;
            }else{
                return false;
            }

        }catch(ClassCastException|NullPointerException e){
            return false;
        }
    }


    More simplified version of equals() method.

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Student){
            Student s=(Student)obj;
            if(name.equals(s.name) && rollNo.equals(s.rollNo)){
                return true;
            }else{
                return false;
            }

        }
        return false
    }

    To make above method more efficient, we have to write the following code at the beginning inside equals() method.
    if(obj==this){
        return true;
    }
    If both references pointing to the same object then without performing any comparison equals() returns true directly.


    Case01

    eg1.
    String s1=new String("Kishan");
    String s2=new String("Kishan");
    SOP(s1==s2); false
    SOP(s1.equals(s2)); true

    In String class,equals() is overridden for content comparison hence eventhrough objects are different if content is same then .equals returns true.


    StringBuffer s1=new StringBuffer("Kishan");
    StringBuffer s2=new StringBuffer("Kishan");
    SOP(s1==s2); false
    SOP(s1.equals(s2)); false

    In StringBuffer, equals() is not overridden for content comparison hence if objects are different .equals method returns false eventhough content is same.

    






        
        */
    }
}