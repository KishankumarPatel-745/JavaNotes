package com.languageFundamental.scjp;
public class Java08 {
    public static void main(String[] args) {
        
        /*
        Array Declaration,creation and initailization in a single line..

        int[] x; //declare
        x=new int[2]; //create
        x[0]=1; //Initialize
        x[1]=9;

        /in single line 
        int[] x={1,9};
        
        We can declare,create and initialize an array in a single line.


        int[] x={12,11,1}; in single line.
        char[] ch={'a','w'};

        We can use this shortcut for multidimentional array also.

        eg.
        int[][] x={{10,30},{1,2,23}};

        all activities in a single line, if we are trying to divide into multiple line then we will get the COmpile time Error..
        eg.
        int[] x;
        x={10,210,12};


        length vs length()

        length is a final variable applicable for arrays.
        length variable represents the size of the array.
        eg.
        int[] x=new int[7];
        sop(x.length()); //CTE cannot find symbol symbol:method length() location:class int[]

        sop(x.length); 7

        length() is a final method applicable for string Objects.

        length() returns number of character present in the string.
        eg.
        String s="Kishan";
        sop(s.length): CTE cannot finf symbol symbol:varible length  location:java.lang.String

        sop(s.length());

        length varible applicable for Arrays but not for String Object whereas length() method applicable for string object but not for array.

        eg.
        String[] s={"a","aa","aaa"};
        sop(s.length);//3
        sop(s.length());//CTE
        sop(s[0].length);//CTE
        sop(s[0].length());//1

        In maltidimentional array,length varible represent only basesize but not total size.
        eg.
        int[][] x=new int[6][3];
        sop(x.length);6
        sop(x[0].length);3

        There is no direct way to specify to find total length of multidimention array but indirectly we can find as follows.
        eg.
        x[0].length+x[1].length+....

        Anonymous Array..
        Sometimes we can declare an array without name such type of nameless arrays are called anonymous array.

        purpose of anonymous array :- just for instance use onetime usage.

        We can create anonymous arrays as follows
        new int[]{10,20,30,40};

        while creating anonymous array, we cannot specify the size otherwise we will get compile time error.
        eg.
        new int[3]{1,2,2}; invalid CTE
        new int[]{2,3,2};

        we can create multidimentional anonymous array also.
        eg.
        new int[][]{{232,1},{2,32,1}};

        based on our requirement we can give the name for anonymous array.Then it is no longer anonymous.
        eg.
        int[] x=new int[]{1,21,1};

        Array Element Assignment....
        case01:
        In the case of primitive type arrays as array element we can provide any type which can be implictly promoted to declared type.
        for int type allowed types are byte,short,char.

        int[] x=new int[5];
        x[0]=12;
        x[1]='a';

        In the case of float type arrays, the allowed datatypes are byte,short,char,int,long.

        Case02:
        In the case of Object type arrays, as an array element either we can add declared type object or its child class Object.
        eg.
        Object[] a=new Object[10];
        a[0]=new Object();
        a[1]=new String("Kishan");
        a[2]=new Integer(10);

        eg.
        Number[] n =new Number[10];
        n[0]=new Integer(10);
        n[1]=new Double(10.42);
        n[2]=new String("kisahn");CTE incompatible type

        Case03:
        Runnable r= new Runnble[10]; Valid

        For interface type arrays,as arrays element its implementaton class objects are allowed.

        r[0]=new Thread(); valid Implementation class of Runnable

        r[1]=new String("Ksaj"); CTE
        Incompatible type 


        Summary:-
        ArrayType---Allowed element tyeps
        ------------------------
        primitive arrays--any type which can be implicitly promoted to declared type

        Object type Arrays--either declared type or its child class objects

        Abstract Class Type Arrays-- its child class objects.

        interface type array--its implementation class objects are allowed..


        





        
        
        */
    }

    
}
