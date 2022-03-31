package com.javaLangpackage.scjp;

public class Java14 {
    /*
    String Class SCP area.

    Refer Image for more Details.

    String s1=new String("you cannot change me!");
    String s2=new String("you cannot change me!");
    SOP(s1==s2); false

    String s3="you cannot change me!";
    SOP(s1==s3);false

    String s4="you cannot change me!";
    SOP(s3==s4); true

    String s5="you cannot"+"change me!"; line 1

    SOP(s3==s5);true

    String s6="you cannot";
    String s7=s6+"change me!"; line 2

    SOP(s3==s7); false

    final String s8="you cannot";
    String s9=s8+"change me!"; line 3
    SOP(s3==s9); true 
    SOP(s6==s8); true   

    
    AT line 1, this operation will be performed at compile-time only because  both arguments are compile-time constants.

    AT line 2, this operation will be performed at runtime only because at least one argument is normal variable.

    At line 3, this operation will be performed at compile time only because both arguments are compile time constant.


    Interning of String Objects.
    
    We can use intern() method to get corresponding SCP object reference by using Heap Object reference.
    Or.
    By using heap object reference,if we want to get corresponding SCP object reference then we should go for intern() method.
    eg,
    String s1=new String("durga");
    String s2=s1.intern();
    SOP(s1==s2); false
    String s3="durga";
    SOP(s2==s3); true

    If the corresponding SCP object is not available then intern() method itself will create the corresponding SCP object.

    eg.
    String s1=new String("durga");
    String s2=s1.concat("software");
    String s3=s2.intern();
    SOP(s2==s3);false
    String s4="durgasoftware";
    SOP(s3==s4);true.

    Importance of SCP(String Constant Pool).
    Refer Image

    In our programm,if a string object repeatedly require then it is not recommended to create separate object for every requirement,because it creates perfomance and memory problems.

    Instead of creating a separate object for every requirement, we have to create only one object and we can reuse the same object for every requirement so that performance and memory utilization will be improved.

    This thing is possible because of SCP hence the main advantages of SCP are memory utilization and performance will be improved.

    But the main problem with SCP is as several references pointing to the same object, by using one reference, if we are trying to change the content then remainging references will be affected.

    To overcome this problem, SUN people implemented String Objects as immutable that's once we creates a String Object. we cannot perform any changes in the existing object. If we are trying to perform any changes, with those changes, A new String object will be created.

    Hence SCP is the only reason for immutibility of String objects.

    FAQs.
    what is SCP?
    it is a specially desiged memory area for String Objects.

    why SCP is for String but not for StringBuffer?

    String is the most commanly used Objects, hence SUN people provided special memory management for string object.But stringBuffer is not commanly used object and hence special memory management is not required for StringBUffer.


    In the case of String, because of SCP, a single object can be referenced by multiple references.
    BY using one reference if we are allow to change the content of that object, all remaining references are going to be affected. To overcome this problem,SUN peoplr implemented String Objects as Immutable.

    According to this, once we create a string object.we cannot perform any changes in that String Object.if we are trying to perform any changes, with those changes a new Object will be created.

    StringBuffer theory.
    But in StringBuffer, there is no concept like SCP. Hence for every requirement a separate object will be created by using one reference if we are trying to change the content then there is no affect on remaining references. Hence immutibility concept is not required for stringBuffer.

    In addition to String Object any other objects are immutable in java?

    All wrapper class,
    String,


    final VS immutable 
    



    */
}
