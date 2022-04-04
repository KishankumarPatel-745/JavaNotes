package com.serialization.scjp;

public class Java07{
    public static void main(String[] args) {
        /*
        serialVersionUID.

        In serialization, both sender and receiver need not be same person, need not to use same machine and need not be from the same location.
        The person may be different, the locations maybe different.

        In serialization, both sender and receiver should has .class file at the beginning only just state of object is traveling from sender to receiver.

        At the time of serialization, with every object sender side JVM will save a unique identifier.JVM is responsible to generate this unique ID based on .class file.

        At the time of deserialization, receiver side JVM will compare Unique ID associated with Object with local class unique ID.If both are matched then only deserialization will be performed otherwise we will get RuntimeExceptio saying InvalidClassException.

        This unique ID is nothing but serialVersionUID.

        Problems of depending on default serialVersionUID generated by JVM.

        1, Both sender and receiver should use same JVM with respect to vendor,platform and version, otherwise receiver unable to deserialize because of different serialVersionUID.

        2,
        Both sender and receive should use same .class file version. After serialization ,if there is any change in .class file at receiver side the receiver unable to deserialize.

        3,
        To generate serialversionUID internally JVM may use complex algorithm,which may create performance problems.

        We can solve above problems by configuring our own serialversionUID.
        We can configure our own serialVersionUID as follows 

        private static final long serialVersionUID=1l;

        import java.io.*;
        class Dog01 implements Serializable{
            private static final long serialVersionUID=1l;
            int i=10;
            int j=20;
        }

        import java.io.*;
        class Sender{
            main(){
                Dog01 d1=new Dog01();
                FileOutputStream fos=new FileOutputStream("abc.ser");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(d1);
            }
        }

        import java.io*;
        class Receiver{
            main(){
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ser"));
                Dog01 d2=(Dog01)ois.readObject();
                SOP(d2.i+"----"+d2.j);
            }
        }

        In the above programm,after serialization if we perform any change to the .class file at receiver side we won't get any problem at the time of deserialization.

        In this case,sender and receiver not required to mentain same JVM versions.

        NOte.

        some IDEs prompt programmer to enter serialversionUID explicitly.
        
        Some IDEs may generate serialVersionUID automatically.
        */
    }
}

