package com.jvmArch.scjp;

public class Java07 {
    public static void main(String[] args) {
        /*
        
        JVM execution engine.

        This is  the central component of JVM,execution engine is responsible to execute java class files.

        Execution engine mainly contains two component
        1, Interpreter 
        2, JIT compiler.

        Interpreter...
        It is responsible to read byte code and interpret into machine code/native code(binary).  and execute that machine code line by line..

        The problem with interpreter is, it interpretes every time, even some method invoked multiple time, which reduces performance of the system.

        TO Overcome this problem,SUN people introduced JIT compiler in 1.1 version.

        JIT compiler..
        The main purpose of JIT compiler is to improve performance internally JIT compiler maintain a separate count for every method.

        Whenever JVM come across any method call first that method will be interpreted normally by interpreter and JIT compiler increment the corresponding count variable.
        
        This process will be continued for every methods.
        Once if any method count reaches thresold value then JIT compiler identifies that that method is a repeatedly used method(Hotspot), immediatly JIT compiler compiles that methods and generates the corresponding native code.

        Next time JVM come across that method call then JVM uses native code directly and executes it instead of interpreting once again so that performance of the system will be improved.

        The Thresold count varied from JVM to JVM.

        Some advanced JIT compiler will recompile generated native code if count reaches thresold value second time so that more optimized machine code will be generated.

        Internally Profiler,which is the part of GIT compiler, is responsible to identify the hotspot.

        NOTE.

        JVM interpretes total programm at least once. JIT compilation is applicable only for repeatedly required method not for every methods.


        JNI(Java Native Interface)

        JNI acts as mediator for java method calls and correspondig native library that is JNI is responsible to provide information about native library to the JVM.

        Native method library holds native libraries' information.

        */
    }
    
}
