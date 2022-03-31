package com.javaLangpackage.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        String Class..
        
        Case01.

        String s=new String("Durga");
        s.concat("Software");
        SOP(s);//Durga

        Once we create a String Object we cannot perform any changes in the existing object. IF we are trying to perform any change with those changes a new Object will be created.
        This non-changable behavious is nothing but Immutability of String.

        s-->Durga

        Durga Software -->eligible for GC




        StringBuffer sb=new StringBuffer("Durga ");
        sb.append("SOftware");
        SOP(sb);
        //Durga SOftware

        Once we create StringBuffer Object we can perform any change in the existing Object.THis changeable behavious is nothing but Mutability of StringBuffer Object.

        sb-->durga Software.

        Case 02.

        String s1=new String("Kishan");
        String s2=new String("Kishan");
        SOP(s1==s2); false
        SOP(s1.equals(s2)); true


        In string class,.equals() is overridden for content comparison, hence eventhrough objects are different if content is same .equals() returns true.

        In StringBuffer class, equals() method is not overridden for content comparison hence Object class's equals() method got executed,which is meant for address comparison due to this if Objects are different .equals return false eventhough content is same.

        StringBuffer sb1=new StringBuffer("Kishan");
        StringBuffer sb2=new StringBuffer("Kishan");
        SOP(sb1==sb2); false
        SOP(sb1.equals(sb2)); false

          Case03.

        String s= new String("Kishan");

        In this case,two Objects will be created one in the heap area and the other is in scp(String Constant Pool).
        and s is always pointing to heap object.


        

        String s="Kishan";

        In this case only one object will be created in SCP and s is always pointing to that object.

        NOTE:
        Object creation in SCP is optional. First it will check is there any object already present in SCP with required content.

        If Object already present then existing Object will be reused.

        If object not already available then only a new Object will be Created.

        BUt this rule is applicable only for SCP but not for the heap.

        NOTE:
        GC is not allowed to access SCP area hence eventhough object doesn't contain reference variable. It is not eligible for GC,if it is present in SCP area.


        ALL SCP objects will be destroyed automatically at the time of JVM shutdown.

        eg02.
        String s1=new String("Durga");
        String s2=new String("Durga");
        String s3="Durga";
        String s4="Durga";

        Total 3 objects will be created.

        Note:
        Whenever we are using new Operator compulsory a new Object will be created in the heap area.

        Hence there may be a chance of existing two objects with the same content in the heap area but not in SCP area.Means deplicate Objects are possible in the heap area but not in SCP.

        eg03
        String s1=new String("durga");

        s1.concat("Software");

        String s2=s1.concat("Solutions");

        s1=s1.concat("Soft");

        SOP(s1); durgasoft
        SOP(s2); durgasolutions

        Total 8 Objects got created.

        In Heap Area. 4 objects

        durga,
        durgaSoftware
        durgaSolutions
        durgasoft

        In SCP area, 4 Object.

        durga
        Software
        Solutions
        Soft
----------------------

        NOTE:

        For every String constant,One object will be placed in SCP area.

        Because of some runtime operation, If an Object is required to create that object will be placed only in the heap area but not in SCP area.

        eg04.

        String s1=new String("Spring");

        s1.concat("Summer");

        String s2=s1.concat("winter");

        s1=s1.concat("fall");
        SOP(s1); springfall
        SOP(s2); springwinter

        Total 8 objects got created 

        in heap 4 objs.
        spring
        springsummer
        springwinter
        springfall



        in SCP 4 objs.
        spring
        summer
        winter
        fall

        

        */
    }
}
