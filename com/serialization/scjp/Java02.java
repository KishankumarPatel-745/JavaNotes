package com.serialization.scjp;

public class Java02 {
    public static void main(String[] args) {
        /*
        NOte.
        We can serialize any number of Objects to the file but in which order, we serialized in the same order only. we have to deserialize means order of objects is important in serialization.

        If we don't know order of objects in serialization then how we can handle?

        FIS fis=new FIS("abc.ser");
        OIS ois=new OIS(fis);
        Object o=ois.readObject();
        if(o instanceof Dog){
            Dog d2=(Dog)o;
            //perform Dog specific functionality
        }else if(o instanceof Cat){
            Cat c2=(Cat)o;
            //Perform Cat specific functionality
        }else if(o instanceof Rat){
            ----
        }

        Object Graphs in Serialization.

        Whenever we are serializing an object, the set of all objects which are reacheable from that object will be serialize automatically this group of object is nothing but Object Graph.

        In Object Graph, every object should be serializable. If atleast one object is not serializable then we will get RTE saying NotSerializableException: className.


        import java.io.*;
        class Dog implements Serializable{
            Cat c=new Cat();
        }
        class Cat implements Serializable{
            Rat r=new Rat();
        }
        class Rat implements Serializable{
            int j=20;
        }
        class SerializableDemo{
            main(){
                Dog d1=new Dog();
                FileOutputStream fos=new FileOutputStream("abc.ser");
                oos.writeObject(d1);

                FileInputStream fis=new FileInputStream("abc.ser");
                Dog d2=(Dog)ois.readObject();
                SOP(d2.c.r.j);
            }
        }

        In the above programm, whenever we are serializing Dog object automatically Cat and Rat object got serialized. Because these are part of Object Graph of Dog.
        Among Dog,Cat and Rat Object, if at least one object is not serializable then we will get RTE saying 
        NotSerializableException.
        

        
        */
    }
}
