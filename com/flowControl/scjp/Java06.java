package com.flowControl.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        break
        continue

        break:
        we can use break statement in the following places.

        Inside switch to stop fall-through

        eg.
        int x=0;
        switch(x){
            case 0:
                sop(0);
            case 1:
                sop(1);
                break;
            
            default:
                sop("Def");
        }

        Inside loops
        To break loop execution based on some condition.

        eg
        for(int i=0;i<10;i++){
            if(i==5)
                break;
            sop(i);
        }
        output
        0
        1
        2
        3
        4

        Inside Labeled block:
        To break block execution based on some condition.

        eg.
        class Test{
            public static void main(String[] args){
                int x=10;
                l1:
                {
                    SOP("begin");
                    if(x==10)
                        break l1;
                    Sop("End");
                }
                SOP("Hello");
            }
        }

        o/p
        begin
        hello



        These are the only places,where we are using break statement.(switch and loop statement)

        eg.
        class Test{
            public static void main(String[] args){
                int x=10;
                if(x==10)
                    break;

                System.out.println("Hello");
            }
        }
        break outside switch or loop: error


        continue statement
        we can use continue statement inside loops to skip the current iteration and continue for the next iteration.
         
        eg.
        for(int i=0;i<10;i++){
            if(i%2==0)
                continue;
            Sop(i);
        }

        we can use continue statement only inside loops if we are using anywhere else we will get Compile time error saying
        CTE continue outside of loop.
        eg
        class Test{
            public static void main(String[] args){
                int x=10;
                if(x==10)
                    continue;
                System.out.println("Hello");
            }
        }
        CTE:- continue outside of Loop.


       labelled break and continue.

       we can use labelled break and continue to break or continue a particular loop in nested loops.

       l1:
       for(------){
           ------
           l2:
           for(-------){
               ------
               for(---------){
                   break l1;
                   break l2;
                   break;
               }
           }
       }
       eg.
       l1:
       for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               if(i==j){ 
                   continue l1;
                   //break l1;
                   //break;
                   //continue;

               }
           }
       }

       do-while vs continue..
       (Dangerous.)

       EG.
       int x=0;
       do{
           x++;
           sop(x);
           if(++x<5)
                continue;
            x++;
            sop(x);
       }while(++x<10);

       o/p
       1
       4
       6
       8
       10

       






        */
    }
}
