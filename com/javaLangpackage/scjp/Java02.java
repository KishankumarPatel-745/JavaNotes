package com.javaLangpackage.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        hashcode() method of Object class.

        For every object a unique number is generated by JVM,which is nothing but hashcode.

        hashcode won't represent address of Object.

        JVM will use hashcode while saving objects into hashing related DS like hashtable,hashMap,hashset etc.

        The main advantage of saving objects based on hashcode is search operation will become easy(The Most Powerful search algo. upto today is hashing).

        eg.
        public native int hashcode();

        If you are giving chance to Object class hashcode() method. It will generate hashcode based on address of the Object.
        It doesn't mean hashcode represent address of the Object.

        Based on our requirement, we can override hashcode() in our class to generate our own hashcode.

        Overriding hashcode method is said to be proper if for every object we have to generate an unique number as hashcode.

        improper way of defining a hashcode()

        class Student{
            ----
            -----
            public int hashcode(){
                return 100;
            }

        }

        This is improper way of overriding hashcode method because for all student objects, we are generating same number as hashcode.


        Proper way of defining a hashcode()

        class Student{
            ----
            -----
            public int hashcode(){
                return rollNo;
            }

        }
        This is proper way of overriding hashcode() method because we are  generating a different hashcode for every object.


        toString VS hashcode()

        If we are giving a chance to Object class toString(), it will internally call hashcode method.

        If we are overridding toString method then our toString() may not call hashcode() method.

        eg.

        class Test{
            int i;
            Test(int i){
                this.i=i;
            }
            main(){
                Test t1=new Test(10);
                Test t2=new Test(1000);
                SOP(t1);
                SOP(t2);
            }
        }




        
        
        */
    }
}
