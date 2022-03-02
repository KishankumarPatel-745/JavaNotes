public class Java07 {
    public static void main(String[] args) {
        /*
        2D Array Creation: Array of arrays..
        In java, 2D array is not implemented in matrix style. SUN people followed array of arrays approach for multidimentional array creation. the main advantage of this approach is memory utilization will be improved.

        eg.
        int[][] x= new int[2][];
        x[0]=new int[2];
        x[1]=new int[3];

        eg2.
        int[][][] x=new int[2][][];
        x[0]=new int[3][];
        x[0][0]=new int[1];
        x[0][1]=new int[2];
        x[0][2]=new int[3];
        x[1]=new int[2][2];

      
        ARRAY INITIALIATION:-
        int[] x= new int[3];

        Once we create an array, every value is initialized with the default value.
        Wheneven we are trying to print any reference varible internally toString method will be called, which is implemented by default to retunr the string in the following form className@hashcode_in_Hexadecimal_Form.

        If we are trying to perform any operation on Null then we will get runtime Exception saying NullPointerException..

        Once we creates an array every element is initialized with default values.

        If we are not satisfied with the default values then we can override this values with customized values.

        int[] x=new int[3];
        x[0]=10;
        x[1]=20;
        x[2]=110;

        x[3]=12; Invalid
        RE:ArrayIndexOutOfBoundException.

        If we are trying to access element with out of range index(either positive or negative value) then we will get the runtime exception ArrayIndexOutOfBoundException.



        



        


       




        */
        int[] x= new int[3];
        System.out.println(x);//  clasaname@hexadecimal form of hashcode address eg. 
        System.out.println(x[0]);

        int[][] y=new int[2][3];
        System.out.println(y);//[[I@5c8da962
        System.out.println(y[0]);//[I@512ddf17
    
        System.out.println(y[0][0]);//0


        int[][] z=new int[2][];
        System.out.println(z);//[[I@232b2
        System.out.println(z[0]);//null
        System.out.println(z[0][0]);//NullPointerException

    }
}
