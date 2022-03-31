package com.javaLangpackage.scjp;

public class Java13 {
    /*
    clone() method of Object.

    protected native Object clone() throws CloneNotSupportedException;

    The process of Creating exactly duplicate object is called cloning.

    The main purpose of cloning is to maintain back-up copy and to preserve state of an object.

    We can perform cloning by using clone() method of Object class.

    protected native Object clone() throws CloneNotSupportedException;

    eg.
    class Test implements Cloneable{
        int i=10;
        int j=20;
        main()throws CloneNotSupportedException{
            Test t1=new Test();
            Test t2=(Test)t1.clone();
            t2.i=888;
            t2.j=999;
            SOP(t1.i+"-----"+t1.j);
            o/p 10----20    
        }
    }

    We can perform cloning only for cloneable Objects.
    An object is said to be cloneable if the corresponding class implements cloneable interface.

    cloneable interface present in Java.Lang package.

    and it doesnot contain any methods. Itis a marker interface.
    If we are trying to perform cloning for non-cloneable objects then we will get RTE saying CloneNotSupportedException.

    Shallow Cloning and Deep Cloning.

    Refer the Image of shallow and deep cloning.

    The process of creating bitwise copy of an Object is called Shallow cloning.

    If the main Object contains primitive variable then exactly duplicate copies will be created in the cloned object.

    If the main Object contains any reference variable the corresponding Object won't be created just a duplicate reference variable will be created, pointing to old contained object.

    Object class clone() method meant for shallow cloning.

    shallow cloning example.

    class Cat{
        int j;
        Cat(int j){
            this.j=j;
        }
    }
    class Dog implements Cloneable{
        Cat c;
        int i;
        Dog(Cat c,in t){
            this.c=c;
            this.i=i;
        }
        public Object clone() throws CloneNotSupportedException{
            return super.clone()
        }
    }
    class Test{
        main() throws CloneNotSupportedException{
            Cat c=new Cat(20);
            Dog d1=new Dog(c,10);
            SOP(d1.i+"----"+d1.c.j);
            Dog d2=(Dog)d1.clone();
            d2.i=888;
            d2.c.j=999;
            SOP(d1.i+"-----"+d1.c.j);
        }
    }

    In shallow cloning by using cloned object reference if we perform any change in the contained Object then those changes will be reflected to the main Object.

    To overcome this problem, we should go for deep cloning.


    Deep cloning

    The process of creating exactly deplicate independent copy including contained Object is called deep cloning.

    In deep cloning, if the main Object contains any primitive variable then in the cloned object duplicate copies will be created.

    If the main object contains any reference variable then the corresponding contained object will be created in the cloned copy.

    By default Object class clone method meant for shallow cloning but we can implement deep cloning explicitly by overriding clone method in our class.

    eg. of deep cloning.

    class Cat{
        int j;
        Cat(int j){
            this.j=j;
        }
    }
    class Dog implements cloneable{
        Cat c;
        int i;
        Dog(Cat c,int i){
            this.c=c;
            this.i=i;
        }
        public Object clone() throws CloneNotSupportedException{
            Cat c2=new Cat(c.j);
            Dog d2=new Dog(c2,i);
            return d2;
        }
    }
    class DeepCloningDemo{
        main() throws CloneNotSupportedException{
            Cat c=new Cat(20);
            Dog d1=new Dog(c,10);
            SOP(d1.i+"----"+d1.c.j); o/p 10 ---- 20
            Dog d2=(Dog)d1.clone();
            d2.i=888;
            d2.c.j=999;
            SOP(d1.i+"----"+d1.c.j);//o/p 10 ---- 20

        }
    }

    By using cloned object reference, if we perform any change to the contained object then those change won't be reflected to the main object.

    Which cloning is best?

    If Object contains only primitive variables then shallow cloning is the best choice.

    If object contains reference variable then deep cloning is the best choice.
    









    */
}
