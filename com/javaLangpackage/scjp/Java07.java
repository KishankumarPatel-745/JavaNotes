package com.javaLangpackage.scjp;

public class Java07 {
    public static void main(String[] args) {
        /*
        StringBuffer class.

        If the content is fixed and won't change frequently then it is recommanded to go String.

        If the content is not fixed and keep on changing then it is not recommanded to use String, because for every change a new Object will be created which affect performance of the System.

        To handle this requirement, we should go for StringBuffer the main advantage of StringBuffer over String is all required changes will be performed in the existing Object only.

        StringBuffer
        Constructor and Method.
        =====================

        1,
        StringBuffer sb=new StringBuffer();

        Creates an empty StringBuffer Object with default initial capacity 16.
        Once StringBuffer reaches its max capacity, A new StringBuffer Object will be created with the 
        new Capacity=(current capacity+1)*2;

        eg.
        StringBuffer sb=new StringBuffer();
        SOP(sb.capacity()); 16
        sb.append("abcdefghijklmnop");
        SOP(sb.capacity()); 16
        sb.append("q");
        SOP(sb.capacity()); 34


        StringBuffer sb=new StringBuffer(int initialCapacity);

        creates an empty StringBuffer object with the specified initial capacity.

        StringBuffer sb=new StringBuffer(String S);

        this constructor creates StringBuffer Object For the given String with capacity = s.length() + 16.

        eg.
        StringBuffer sb=new StringBuffer("durga");
        SOP(sb.capacity());16+5=21

        Important Methods of StringBuffer.

        public int length();
        public int capacity();
        public char charAt(int index);

        eg.
        StringBuffer sb=new StringBuffer("durga");
        SOP(sb.charAt(3)); // g
        SOP(sb.charAt(30)); //RTE:StringIndexOutOfBoundException

        public void setCharAt(int index,char ch);
        To replace the character located at specified index with provided character.


        public StringBuffer append(String s);
        public StringBuffer append(int i);
        public StringBuffer append(long l));
        public StringBuffer append(boolean b);
        public StringBuffer append(char ch);
        -----

        Overloaded Method.

        eg.
        StringBuffer sb=new StringBuffer();
        sb.append("PI value is :");
        sb.append(3.14);
        sb.append(" it is exactly: ");
        sb.append(true);
        SOP(sb);
        o/p
        PI value is : 3.14 it is exactly: true


        Public StringBuffer insert(int index,String s);

        Public StringBuffer insert(int index,int i);

        Public StringBuffer insert(int index,char ch);

        Public StringBuffer insert(int index,long l);

        Public StringBuffer insert(int index,boolean b);

        Overloaded method insert()

        eg.
        StringBuffer sb=new StringBuffer("abcdefgh");
        sb.insert(2,"xyz");
        SOP(sb);
        o/p
        abxyzcdefgh

        public StringBuffer delete(int begin,int end);
        to delete characters located from begin index to end-1;

        public StringBuffer deleteCharAt(int index);
        to delete the character located at specified index.

        public StringBuffer reverse();

        eg.
        StringBuffer sb=new StringBuffer("durga");
        SOP(sb.reverse());agrud

        public void setLength(int length);

        eg.
        StringBuffer sb=new StringBuffer("aiswaryaabhi");
        sb.setLength(8);
        SOP(sb);//airwarya  

        public void ensureCapacity(int capacity);

        to increase capacity on fly based on our requirement.

        eg.
        StringBuffer sb=new StringBuffer();
        SOP(sb.capacity());
        sb.ensureCapacity(1000);
        SOP(sb.capacity()); //1000


        public void trimToSize();

        To deallocate extra allocated free memory.

        eg.
        StringBuffer sb=new StringBuffer(1000);
        sb.append("abc");
        sb.trimToSize();
        SOP(sb.capacity());//3


        StringBuilder
        ======================

        Every method present in StringBuffer is synchronized,hence only one thread is allowed to operate on StringBuffer Object at a time,which may creates performance problem.
        To handler this requirement SUN people introduced StringBuilder Concept in 1.5 Version.


        StringBuilder is exactly same as StringBuffer except the following differences.

        StringBuffer -->every method present in StringBuffer is synchronized.

        Every method present in StringBuilder is non-synchronized.

        At a time only one thread is allowed to operate on StringBuffer Object,hence StringBuffer Object is Thread-safe.

        At a time multiple threads are allowed to operate on StringBuilder Object and hence StringBuilder is not Thread-Safe.

        Threads are required to wait to operate on StringBuffer object.Hence relativaly performance is low.

        Threads are not required to wait to operate on StringBuilder Object ,Hence relatively performance is high.

        StringBuffer: introduced in 1.0 version.

        StringBuilder:- introduced in 1.5 version.


        except the above deifferneces everything is a same in stringbuffer and StringBuilder(Including methods and constructors).


        String VS StringBuffer VS StringBuilder.

        If the content is fixed and won't change frequently then we should go for String.

        If the content is not fixed and keep on changing but thread safety required then we should go for StringBuffer.

        If the Content is not fixed and keep on changing but thread safety is not required then we should go for StringBuilder.

        Method Chaining 

        For most of the method in String/StringBuffer/StringBuilder return types are same type hence after applying a method and on the result we can call another method, which forms method chaining.

        eg.
        sb.m1().m2().m3().m4().....

        In method chaining, method calls will be executed from left to right.

        eg.

        StringBuffer sb=new StringBuffer();
        sb.append("HI durga").append("sds").insert(2,"dsss");
        SOP(sb)









        */
    }
}
