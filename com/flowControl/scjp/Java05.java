package com.flowControl.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Flow Control
        for Loop
        for each loop

        For loop is the most commonly used loop in Java.

        If we know number of iteration in advance then for loop is the best choice.

        SYNTAx:

        for(initialization_section,conditional_check,increment/decrement_section){
            loop bosy
        }

        Curly braces are optional and without curly braces, we can take only one statement under for loop, which should not be declarative statement.

        for(int i=0:true;i++)
            sop("Hello");

        for(int i=0;i<10;i++);

        for(int i=0;i<10;i++)
            int i=10;
        CTE:- you cannot take the declarative statement.

        Initialization part will be executed only once in loop lifecycle.

        we can declare and initialize local variables of for loop.

        here we can declare any number of variable, but should be of the same type.
        By mistake, if we are trying to declare different datatype variables, then we will get Compile time error.

        eg.
        int i=0,j=0;
        int i=0,String s="Durga";
        int i=0,int j=0;

        in the initialization section, we can take any valid java statement.


        Conditional Check.
        :Here we can take any valid java expression but should be of the type boolean.

        This part is optional, and if we are not taking anything then compiler will always place true.

        Increment/Decrement Section.
        int i=0;
        In the increment/decrement section. we can take any valid java statement including SOP.

       for(;;){
           sop("Hello");
       }
       //Valid Infinity loop.

       for(;;);
        //Valid Infinity loop.

        All three part of for loop are independent from each other and optional.

        eg1.
        for(int i=0;true;i++){
            sop("Hello");
        }
        sop("Hi");
        CTE:Unreachable Statement

        eg.
        for(int i=0;false;i++){
            sop("Hello");
        }
        sop("Hi");
        CTE: Unreachable Statement

        eg.
        for(int i=0;;i++){
            sop("Hello");
        }
        sop("Hi");
        CE:unreachable Statement

        eg.
        int a=10,b=20;
        for(int i=0;a<b;i++){
            sop("Hello");
        }
        sop("Hi");
        O/P:Hello infinity time

        eg.
        int a=10,b=20;
        for(int i=0;a>b;i++){
            sop("Hello");
        }
        sop("Hi");
        O/p Hi


        eg.
        final int a=10,b=20;
        for(int i=0;a<b;i++){
            sop("Hello");
        }
        sop("Hi");
        CTE:- Unreachable statement

        eg.
        final int a=10,b=20;
        for(int i=0;a>b;i++){
            sop("Hello");
        }
        sop("Hi");
        CTE: Unreachable Statement.


        ForEach Loop(Enhanced for loop)
        1.5 version
        Arrays and Collection.
        Introduce in 1.5 version
        It is specialliy designed loop to retrieves array and collection.

        enhanced for loop
        to print element of 1-D array
        int[] x={10,20,30,40};
        for (int x1:x){
            sop(x1);
        }

        TO print elements of 2-D array.
        int[][] x={{10,20,30},{40,50}};

        for(int[] x1:x){
            for(int x2:x1){
                sop(x2);    
            }
        }

        eg. for each loop for 3D array.
        for(int[][] x1:x){
            for(int[] x2:x1){
                for(int x3:x2){
                    sop(x3);
                }
            }
        }

        ForEach loop is best choice to retrieve elements of array and collection.
        But its limitation is it is applicable only for array and collection. and it is not a general purpose loop.
        
        
        eg.
        for(int i=0;i<10;i++){
            sop(i);
        }
        i cannot write forEach loop directly for the above requirement.

        By using normal for loop, we can print arrays element either in original order or reverse order.

        But by using forEach loop, we can print arrays element in original order.but not in reverse order.

        eg.
        int[] x={10,20,30,40,50};
        for(int i=x.length-1;i>=0;i--){
            sop(x[i]);
        }
        eg. 50,40,30,20,10

        We cannot write an equivalent for-each loop directly.

        Iterable(I) interface.

        for(eachItem x: target){}

        ==> target:- can be Array/Collection.
        ==>target :- Iterable Object.

        The target element in forEach loop should be Iterable object.
        An object is said to be iterable if corresponding class implements Java.Lang.Iterable interface.

        Iterable introduces in 1.5 version and it contains onlt one methods.
        iterator();

        signature:
        public Iterator iterator();

        All array related classes and collection implemented classes already implement Iterable interface.

        Being a programmer,we are not required to do anything just we should aware the point.

        Differences between Iterator and Iterable.

        Iterator(I):-
        1,It is related to Collection.

        2,we can use to retrieve the element of Collection one by one

        3,present in Java.Util package.

        4,Iterator(I) has 3 methods.
        hasNext(),next(),remove()

        
        Iterable(I):-
        1,It is related to for-each loop

        2,The target element in for-each loop should be Iterable.

        3,present in Java.Lang package.

        4,only contains one methods
        iterator()











        */
    }
}
