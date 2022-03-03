package com.languageFundamental.scjp;
public class Java06 {
    public static void main(String[] args) {
        /*
        -------------------------------
        Arrays:
        1,Introduction
        2,Array Declaration
        3, Array Creation
        4,Array Initialization
        5,Array Declaration,Creation,and Initialization in a single Line.
        6, length VS Length()
        7,Anonymous Arrays
        8,Array element assignments
        9,Array Variable assignments
        -------------------------------
        
        An array is an indexed collection of fixed number of homogeneous data element.

        The main advantage if array is we can represent huge number values by using singal variable so that readability of the code will be improved.
        But the main disadvantage of array is fixed in size that is once we creates an array there is no change of increasing and decreasing the size based on requirement.
        Hence to use Array concept compulsory we should know the size in advance, which maynot possible always.



        Array Declaration..

        1D array declaration.
        int[] x;  valid 
        int  []x; valid
        int x[];  valid

        int[] x --> recommanded because name is clearly separated from type.

        at the time of declaration, we cannot specify the size otherwise we will get Compile time error.
        int[6] x; CTE

        int[] x; valid

        2D Array Declaration:-
        int[][] x; valid
        int [][]x; valid
        int x[][]; valid
        int[] []x; valid
        int[] x[]; valid
        int []x[]; valid

        Which of the following are valid?
        int[] a,b;  a=1D,b=1D
        int[] a[],b;  a=2D,b=1D
        int[] a[],b[];  a=2D,b=2D
        int[]  []a,b;  a=2D,b=2D
        int[]  []a,b[];  a=2D,b=3D
        int[]  []a,[]b;  CTE Compile time error

        If we want to specify dimention before the variable that facility is applicable only for first variable in a declaration.If we are trying to apply for reminging variables we will get compile time error..

        eg.
        int[] []a,[]b,[]c;
        a valid, b not , c not so will get CTE


        3D Array declaration.

        int[][][] x;
        int [][][]x;
        int x[][][];
        int[] [][]x;
        int[] x[][];
        int[] []x[];
        int[][] []x;
        int [][]x[];
        int []x[][];

        Array Creation..
        every array in Java is an Object only hence we can create array by using new operator.
        eg.
        int[] a=new int[3];
        a is a reference for that array object..

        for every array type corresponding classes are availble, and these classes are part of java language and not availble to the programmer level.



        arrayType --> Corresponding class Name
        int[]-->[I
        int[][]-->[[I
        int[][][]-->[[[I
        double[]-->[D
        short[]-->[S
        byte[]-->[B
        boolean[]-->[Z

        loophole--------------

        at the time of array creation, compulsory we should specify the size otherwise we will get compile time error.
        int[] x=new int[]; NOT VALID
        int[] x= new int[5]; Valid

        it is legal to have an array with the size O in Java.
        eg. int[] x=new int[0];

        if we are trying to specify array size with some negative int value then we will get runtime exception saying java.lang.NegativeArraySizeException.
        eg. int[] x=new int[-3]; RTE: java.lang.NegativeArraySizeException

        To specify array size, the allowed datatypes are byte,short,char and int. if we are trying to specify any other type then we will get CTE.
        eg.
        int[] x=new int[10]; Valid
        int[] x=new int['a']; Valid
        byte b=20;
        int[] x=new int[b]; Valid
        short s=18;
        int[] x=new int[s]; Valid
        int[] x=new int[10l]; CTE loss of precision..


        The maximun allowed array size is 2147483647*4, which is the maximun value of int datatype.
        RTE: memoryOutOfBoundException. if enough memory is not availble.

        */ 
        int[] x=new int[-4];
        int[] xs=new int[4];
        int[][] x1=new int[4][2];
        int[][][] x2=new int[4][2][2];
        System.out.println(x);
        System.out.println(xs.getClass().getName());
        System.out.println(x1.getClass().getName());
        System.out.println(x2.getClass().getName());
        System.out.println(args.length);
        // System.out.println(new int[2147483648]); integer too large CTE
    }
    
}
