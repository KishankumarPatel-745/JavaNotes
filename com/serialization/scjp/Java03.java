package com.serialization.scjp;




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;




class Account implements Serializable{

    String uName="Kishan";
    transient String pwd="Kishan123";
    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        os.writeObject("123"+pwd);
  
    }
    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String s=(String)is.readObject();
        pwd=s.substring(3);
        
    }
}
public class Java03 {
    public static void main(String[] args) throws Exception {
        Account a=new Account();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("custser.ser"));
        oos.writeObject(a);
        System.out.println("=="+a.uName+"--"+a.pwd);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("custser.ser"));
        Account a1=(Account)ois.readObject();
        System.out.println("Deserialized "+a1.uName+"=="+a1.pwd);

        //output. refer image
        //==Kishan--Kishan123
        // Deserialized Kishan==Kishan123

       
        /*
        Customized Serialization
        During default serialization,there maybe a chance of loss of information because of transient keyword.


        The above eg. before serialization account object can provide proper username and password but after deserialization account object can provide only userName but not password.
        This is due to declaring password variable as transient.

        Hence during default serialization, there may be a chance of loss of information because of transient keyword to recover this loss of information, we should go for customized serialization.

        We can implement customized serialization by using the following two methods.

        private void writeObject(ObjectOutputStream os) throws Exception.
        
        This method will be executed automatically at the time of serialization.Hence at the time of serialization, if we want to perform any activity we have define that in this method only.


        private void readObject(ObjectInputStream is) throws Exception.

        This method will be executed automatically at the time of deserialization.Hence at the time of deserialization, if we want to perform any activity we have to define that in this method only.

        Note.
        The above methods are callback method because this are executed automatically by the JVM.

        While performing which object serialization, we have to do extra work in the corresponding class we have to define above methods.
        eg.
        While performing Account object serialization, if we required to do extra work in the account class we have to define above methods.

        refer code.

        NOte.

        Programmer cannot call private methods directly from outside of the class but JVM can call private method directly from outside of the class.
    


        

        */
    }
}
