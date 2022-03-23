package com.multiThreading.scjp;

public class Java14 {
    public static void main(String[] args) {
        /*
         Green Thread.

         Java multithreading concept is implemented by using the following two model.
         1,Green Thread Model
         2,Native OS Model.

         1,
         Green Thread Model.

         The thread which is managed completely by JVM without taking underlying OS Support is called green thread.

         Very few OS like SUN Solaries provide support for green thread model.
         Anyway green thread model is deprecated and not recommanded to use.

        2,native OS model.
        The Thread which is managed by the JVM with the help of underlining OS is called native OS model.

        All windows based OS provides support for native OS model.

        How to stop a Thread?

        We can stop a thread execution by using stop method of thread class.

        public void stop();

        If we call stop method then immediately the thread will enter into dead state.
        Anyway stop method is deprecated and not recommanded to use.
        
        How to suspend and resume a thread?

        We can suspend a thread y using suspend method of thread class then immediately the thread will be entered into suspended state.
        We can resume a suspended thread by using resume() of thread class then suspended thread thread can continue its execution.

        public void suspend();
        public void resume();

        Anyway these methods are deprecated and not recommanded to use.


        Full IMAGE of Thread LifeCycle.
        


        eg.



        */
    }
}
