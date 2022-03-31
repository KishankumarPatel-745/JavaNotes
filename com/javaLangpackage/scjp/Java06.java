package com.javaLangpackage.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        String Class Constructor.
        ------------------------

        Constructor of String Class.

        String s=new String();
        
        Create an empty String Object.

        String s=new String(String Literal);

        Create a string object in the heap for the given string literal.

        String s= new String(StringBuffer sb);

        Creates an equalvalent String Object for the given StringBuffer.

        
        String s=new String (char[] ch);

        Creates an equivalent String Object for given char array.

        eg.
        char[] ch={'a','b','c','d'};
        String s=new String(ch);
        SOP(s);

        String s=new String(byte[] b);

        Creates an equivalent String Object for the given byte array.

        eg.
        byte[] b={100,101,102,103};
        String s=new String(b);
        SOP(s); //defg


        Important Methods of String Class.

        1,
        public char charAt(int index);

        Returns the character locating at Specified Index.

        eg.
        String s="Durga";
        SOP(s.charAt(3));
        SOP(s.charAt(30));
        RTE: StringIndexOutOfBoundsException.

        public String concat(String s);

        The overloaded + and += operators also meant for concatenation purpose only.

        String s="Kishan";
        s=s.concat("Software");
        // s=s+"Software";
        // s+="Software";
        SOP(s)//KishanSoftware.

        public boolean equals(Object o);

        To perform content comparison where case is important.
        This is overridding version of Object class equals() method.

        public boolean equalsIgnoreCase(String s);

        To perform content comparison where case is not important.

        eg.
        String s="java";
        SOP(s.equals("JAVA"));//false

        SOP(s.equalsIgnoreCase("JAVA"));//true

        NOTE:
        In general, we can use equalsIgnoreCase Method to validate usernames,where case is not important.Whereas we can use equals() method to validate password, where case is important.

        public String substring(int begin);
            return substring from begin index to end of the String.

        public String substring(int begin,int end);
            return substring from begin index to end-1 index.
        
        eg.
        String s="abcdefg";
        SOP(s.substring(3)); //defg
        SOP(s.substring(2,6)); //cdef


        Public int length();

        Return number of character present in the String.

        String s="durga";
        SOP(s.length);// CTE cannot find symbol 
        symbol: variable length
        location: class Java.lang.String

        SOP(s.length());5

        NOTE.
        length variable applicable for array but not for String object,Where as length() applicable for String Objects but not for arrays.

        public String replace(char oldChar,char newChar);

        eg.
        String s="ababa";
        SOP(s.replace('a','b'));
        //"bbbbb"

        public String toLowerCase();
        public String toUpperCase();

        public String trim();

        To remove blank spaces present at beginning and end of the string but not middle blank spaces.

        public int indexOf(char ch);
        returns index of first occurrence of specified character.

        public int lastIndexOf(char ch);

        returns index of last occurrence of specified character.
        
        eg
        String s="ababa";
        SOP(s.indexOf('a'));//0
        SOP(s.lastIndexOf('a'));//4

        NOTE***
        Becauseof runtime operation if there is a change in the content then with those changes a new object will be created in the Heap area.
        If there is no change in the content then existing object will be reused.
        And new Object wob't be created.

        Whether the object present in heap or SCP, the rule is same.

        eg.
        String s1=new String("durga");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        String s5=s4.toLowerCase();
        SOP(s1==s2); false
        SOP(s1==s3); true

        total 5 objects created.

        in heap 4 and in SCP 1

        s1 and s3 refers to durga object

        s2-->DURGA
        s4-->durga
        s5-->DURGA


        in SCP 
        durga

        eg2
        String s1="durga";
        String s2=s1.toString();
        SOP(s1==s2);true
        String s3=s1.toLowerCase();
        String s4=s1.toUpperCase();
        String s5=s4.toLowerCase();

        heap area:
        DURGA<-- s4
        durga<--s5


        SCP area:
        s1-->durga<--s2
                ^s3


    ====================
     How to create our own immutable class?

     Once we creates an object,we cannot perform any changes in that Object.

     If we are trying to perform any change and if there is a change in the content then with those changes a new Object will be created.

     If there is no change in the content then existing object will be reused.This behaviour is nothing but immutability.

     eg.
     String s1=new String("durga");
     String s2=s1.toUppeCase();
     String s3=s1.toLowerCase();

     we can create our own immutable class.

     eg.
     final public class Test{
         private int i;
         Test(int i){
             this.i=i;
         }
         public Test modify(int i){
             if(this.i==i){
                 return this;
             }else {
                 return new Test(i);
             }
         }
     }
     Test t1=new Test(10);
     Test t2=t1.modify(100);
     Test t3=t1.modify(10);
     SOP(t1==t2);false
     SOP(t1==t3);true

     Once we creates a Test object we cannot perform any change in the existing object.If we are trying to perform any change and if there is a change in the content then with those changes a new Object will be created.

     If there is no change in the content then existing object will be reused.

    +++++++++++

    final VS immutability.

    final applicable for variables but not for Objects, where as immutability applicable for objects but not for variables.

    BY declaring a reference variable as final, we won't get any immutability nature.

    Eventhought the reference variable is a final we can perform the changes in the underlying Object.
    But we cannot perform reassignment for that variable.

    Hence final and immutable both are different concepts.

    eg.
    final StringBuffer sb=new StringBuffer("durga");
    sb.append("software");
    SOP(sb); durgasoftware

    sb=new StringBuffer("solutions");
    CTE: cannot assign a value to final variable sb.

    Which of the following is meaningful.

    final variable -valid
    immutable variable -Invalid
    final object:- invalid
    immutable object:= valid

        


        
        
        */
    }
}
