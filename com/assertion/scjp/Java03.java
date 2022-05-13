package com.assertion.scjp;

public class Java03 {
    public static void main(String[] args) {
        /*
        Various runtime flags  applicable for Assertion.

        -ea / -enableassertions
        To enable assertions in every non-system class(our own classes).

        -da / -disableassertions
        To disable assertions in every non-system class.

        -esa / -enablesystemassertions
        To enable assertions in every system class(predefined classes).

        -dsa / -enablesystemassertions
        To disable assertion in every system class.

        we can use above flags simantaneously then JVM will consider this flags from left to right.

        eg.
        java -ea -esa -ea -dsa -da -esa -ea -dsa Test

        non-system : enable
        system:- disable.

        At the end, assertion will be enable in every non-system class and disable in every system class.

        case study 

        pack1 has A.class B.class and pack2

        pack2 has C.class and D.class.

        1, to enable assertions only in B class.

        java -ea:pack1.B
        
        2,To enable assertions in both B and D classes.

        java -ea:pack1.B -ea:pack1.pack2.D

        3, to enable assertion in every class of pack1.

        java -ea:pack1...

        4, To enable assertions in every class of pack1 except B class.

        java -ea:pack1... -da:pack1.B

        5, To enable assertions in every class of pack1 except pack2 classes.

        java -ea:pack1... -da:pack1.pack2...

        we can enable and disable assertions either class wise or package wise also.


        Appropriate and inappropriate use of assertions.

        1,
        It is always inappropriate to mix programming logic with assert statement because there is no gaurantee to execute assert statement at runtime.

        eg.
        public void withdraw(double amount){
            if(amount<100){
                throw new IllegalRequestException();
            }
            else 
            {
                process request
            }
        }
        appropriate way.

    
        public void withdraw(double amount){
            assert(amount>=100){
                process request.
            }
        }
        inappropriate way.

        2,
        while performing debugging, in our programm,if there is any place where the control is not allowed to reach, there is a best place to use assertion.

        switch(x){
            case 1:
                SOP("JAN");
                break;

            case2:
                SOP("FEB");
                break;

            case12:
                SOP("DEC");
                break;

            default:
                assert(false);
                //RTE AssertionError
        }

        3, It is always inappropriate for validating public method argument by using assertion because outside person doesn't aware whether assertion is enable or disable in our system.

        it is always appropriate to validate private method argument by using assertion because local person can aware whether assertion is enable or disable in our system.

        
        4,
        It is always inappropriate for validating command line argument by using assertion because this are arguments to main method, which is public.
        

        Ques.


        class Test{
            int z=5;
            public void m1(int x){
                assert(x>10); not appropriate
                switch(x){
                    case 1:
                        SOP("JAN");
                        break;

                    case2:
                        SOP("FEB");
                        break;

                    case12:
                        SOP("DEC");
                        break;

                    default:
                        assert(false); appropriate 

                }
            }

            private void m2(int x){
                assert(x<10);-- appropriate
            }
            private void m3(){
                assert(m4()); -- inappropriate because programming logic mixed with assert.
            }
            private boolean m4(){
                z=6;
                return true;
            }
        }






        
        */
    }
}
