package com.collections.scjp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;



// import java.util.Hashtable;

// class Temp{
//     int i;
//     @Override
//     public int hashCode() {
//         return i;
//     }
//     Temp(int i){
//         this.i=i;
//     }
//     @Override
//     public String toString() {
//         return i+"";
//     }
// }
public class Java14 {
    public static void main(String[] args) throws Exception {
        // Hashtable h=new Hashtable(25);
        // h.put(new Temp(5), "A");
        // h.put(new Temp(2), "B");
        // h.put(new Temp(6), "C");
        // h.put(new Temp(15), "D");
        // h.put(new Temp(23), "E");
        // h.put(new Temp(16), "F");
        // System.out.println(h);

        //refer image also. 
        //Properties

        Properties p=new Properties();
        FileInputStream fi=new FileInputStream("per.properties.txt");
        p.load(fi);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        p.setProperty("profilepassword", "karsandas");

        System.out.println(p);
        FileOutputStream fos=new FileOutputStream("per.properties.txt");
        p.store(fos, "kishan lal");

        fi.close();
        fos.close();
        


        /*
        hashtable and property legacy character

        The underlying data structure is hashtable.
        Insertation order is not preserved and it is based on Hashcode of keys.

        Duplicate keys are not allowed and values can be duplicated.

        Heterogeneous object are allowed for both keys and values.

        null is not allowed for both key and value otherwise we will get RTE saying NullPointerException.

        It implement Serializable and Cloneable interfaces but not RandomAccess.

        Every method present in hashtable is synchronized and hence Hashtable object is Thread-safe.

        Hashtable is the best choice if our frequent operation is retrival/Search operation.


        Constructors.

        Hashtable h=new Hashtable();

        Creates an empty hashtable object with default initial capacity 11 and default fill ratio 0.75.

        Hashtable h=new Hashtable(int initialCapacity).

        Hashtable h=new Hashtable(int initialCapacity, float fillRatio);

        Hashtable h=new Hashtable(Map m);


        If we change hashcode method of Tempt class as 
        public int hashcode(){
            return i%9;
        }
        the output is 
        {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}

        If we confifure initial capacity as 25 that is
        Hashtable h=new Hashtable(25);

        then the output is.
        {23=E, 16=F, 15=D, 6=C, 5=A, 2=B}


        Properties.

        In our programm,if anything,which changes frequently ,like username,password and mailID and mobileNumber etc, are not recommoanded to hard code in java programm, because if there is any change to reflect any change, we have to do recompilation, rebuild and redeploy applications are required.
        Even sometimes, Server restarts also required,which creates a big business impact to the client.

        We can overcome this problem by using Properties file.Such type of variable things, we have to configure in the properties file.
        From that Properties file, we have to read into Java program.
        And we can use those properties.
        The main advantage of this approach is if there is a change in properties file to reflect that change just redeployment is enough, which won't create any business impact to the client.

        We can use Java properties objects to hold properties which are coming from Properties file.

        In normal Map (Like HashMap,Hashtable,TreeMap), key and value can be any type but in the case of properties, Key-Value should be String Type.

        Constructore.
        Properties p=new Properties();

        Methods.

        String setProperty(String pname,String pvalue);

        To set a new property.
        If the specified property already available.Then Old Value will be replaced with the new value and return oldvalue.

        String getProperty(String pname);
        To get value associated with specified property.If the specified property not available then this method returns null.

        Enumeartion propertyNames();
        Returns all property names present in property object.


        void load(InputStream is);

        To load properties from properties file into java properties object.

        void store(OutputStream os,String comment);

        To store properties from java properties object into properties file.

        refer image.

        Properties File.

        main{
            Properties p=new Properties();
            FIS fis=new FIS("db.properties");
            p.load(fis);
            String url=p.getProperty("url");
            String user=p.getProperty("user");
            String pwd=p.getProperty("pwd");
            Connection con=DriverManager.getConnection(url,user,pwd);

        }
    





        
        */
    }
}
