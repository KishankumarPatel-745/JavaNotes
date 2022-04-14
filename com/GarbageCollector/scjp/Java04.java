package com.GarbageCollector.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        finalization...

        Just before destroying an object gc call finalize method to perform clean up activites.
        Once finalize method completes automatically gc destroys that object.

        finalize() method present in object class with the following declaration.

        protected void finalize() throws Throwable.

        we can override finalize method in our class to define our own clean-up activities.

        Case01
        Just before destroying an object, gc calls finalize method on the Object,which is eligible for GC then the corresponding class finalize method will be executed.

        For example.
        If String object eligible for GC then String class finalize() will be executed but not Test class finalize method.

        eg.
        class Test{
            main(){
                String s=new String("Kishan");
                s=null;
                System.gc();
                SOP("End of main");
            }
            public void finalize(){
                SOP("Finalize method called");
            }
        }
        In the above example,String Object eligible for gc and hence String class finalize method got executed which has empty implementation.Hence the output is 
        End of main.

        if we replace String Object with Test Object then Test class finalize() will be executed.
        In this case, the output is 
        End of main
        finalize method called

        or
        finalize method called 
        End of main.


        based on our requirement, we can call finalize method explicitly then it will be executed just like normal method call.and Object won't be destroyed.

        class Test{
            main(){
                Test t=new Test();
                t.finalize();
                t.finalize();
                t=null;
                System.gc();
                SOP("End of main");
            }
            public void finalize(){
                SOP("finalize method called");
            }

        }
        In the above programm, finalize() got executed 3 times in that 2 time explicitly by the programmer and 1 time by the GC.

        In this case the output is 
        finalize method called
        finalize method called
        end of main
        finalize method called

        If we are calling finalize method explicitly then it will be executed like normal method call and Object won't be destroyed.

        If gc calls finalize method then Object will be destroyed.


        Note.
        init(),service() and destroy() are considered as life cycle methods of servlet.
        Just before destroying servlet object, web container calls destroy object to perform clean-up activities.
        
        BUt based on our requirement, we can call destroy method from init and service method then destroy method will be executed just like a normal method call and servlet object won't be destroyed.




        */
    }
    
}
