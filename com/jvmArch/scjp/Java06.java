package com.jvmArch.scjp;

public class Java06 {
    public static void main(String[] args) {
        /*
        Stack memory


        for every thread,JVM will create a separate stack at the time of Thread creation.every method call performed by that thread will be stored in the stack including local variable also.

        After completing a method, the corresponding entry from the stack will be removed.
        After completing all method call, the stack will become empty and that empty stack will be destroyed by the JVM. just before terminating the Thread.

        Each entry in the stack is called Stack frame or activation record.

        The data stored in the stack is available only for corresponding thread, and not available to the remaining thread.Hence this data is thread-safe.

        Stack Frame Structure.

        Each stack frame contains three parts.

        1, Local variable array
        2, operand stack
        3, frame data

        Local variable array..
        it contains all parameter and local variables of the methods.

        each slot in the array is of 4 bytes.
        values of type int, float and  reference occupies one entry in the array.

        values of double and long occupy two consequetive entry in the array.

        byte,short and char value will be converted to int type before storing and occupy one slot, but the way of storing boolean value is varied from jvm to jvm.

        But most of the JVM follows one slot for boolean value.

        eg.
        public void m1(int i, double d, Object o, float f){
            long x;
            ----

        }
        
        in local variable array, the above all local variable is stored.
        

        Operand Stack.

        JVM uses operand stack as work space. some instruction can push values to the operand stack.
        and some instruction can pop values from operand stack, and some instruction can perform required operation.

        Frame Data..
        Frame data contains all symbolic references related to this method.

        Also contains a reference to exception table,which provide corresponding catch block information in case of exception.


        4, PC registers.
        (Programm counter register)

        For every Thread, a separate PC register will be created at the time of Thread creation.

        PC register contains the address of current executing instruction.Once instruction execution completes automatically PC register will be incremented to hold the address of next instruction.

        Native method Stack.

        For every thread, JVM will create a separate native method stack, all native method call invoked by the thread will be stored in the corresponding native method stack.

        Conclusion..
        Method area, Heap area and stack area are considered as important memory area with respect to programmer.
        
        Method area and heap area are per JVM.

        Whereas Stack area , pc register and native method stack are per Thread.

        For every jvm --> one heap area 
                      --> one method area


        For every thread--> one stack area
                        --> one pc register 
                        --> one native method stack.

        
        Static variable--> method area

        instance variable--> heap area

        local variable--> stack area.

        eg.
        refer image for this eg.

        class Test{
            Student s1=new Student();
            static Student s2=new Student();
            main(){
                Test t=new Test();
                Student s3=new Student();
            }
        }
        
        */
    }
    
}
