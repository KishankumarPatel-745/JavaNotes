package com.languageFundamental.scjp;

public class Java09 {
    public static void main(String[] args) {
        /*
        Array Variable Assignment:-

        Case01:Element level promotion is not applicable at array level.
        eg
        char element can be promoted to int type whereas char[] can not be promoted to int[].
        eg.
        char[] ch={'a','v','c'};
        int[] i=ch;CTE
        incompatible types

        String[]-->Object[] is valid BUt in the case of Object type Arrays, child class type array can be promoted to parent class type array.
        eg.
        String[] s={"a","b"};
        Object[] o=s;

        CASE02...
        
        whenever we are assigning one array to another array internal elements wont be copied, just a reference variable will be reassigned.
        eg.
        int[] a={10,20,21,1,1};
        int[] b={2,3};
        a=b. Valid
        b=a. Valid

        CASE03...

        Whenever we are assigning one array to another array the dimension must be matched. in the place of 1D array, we should provide the 1D array Only.
        If we are trying to provide any other dimention then we will get compile time array.

        int[][] a= new int[3][];
        a[0]=new int[4][3];CTE. incompatible type
        
        whenever we are assigning one array to another array both dimention and type must be matched but sizes are not required to match.


        int[][] a=new int[4][3]; /5
        a[0]=new int[4];/1
        a[1]=new int[2];/1
        a=new int[3][2];/4

        Total Howmany objects are created? :-- total 11 objects were created.
        Total howmany objects eligible for GC:- 7 objetcs were availble for GC.


        */
        for (int i = 0; i <= args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
