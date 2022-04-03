package com.fileIO.scjp;

import java.io.FileWriter;

import java.io.IOException;

public class Java02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("demoWriter.txt");
        fw.write(100);
        fw.write("urga\nSoftwareSolutions");
        fw.write('\n');
        char[] ch1={'a','b','c'};
        fw.write(ch1);
        fw.flush();
        fw.close();

        /*
        In the above programm,FileWriter can perform overridding of existing data.

        Instead of overriding if we want append operation then we have to create FileWriter Object as follows>

        FileWriter fw=new FileWriter("demoWriter.txt",true);

        The main problem with FileWriter is we have to insert Line separator manually which is varied from System to System.
        It is difficult to the programmer.
        We can solve this problem by using BufferedWriter and PrintWriter classes.
        */
        /*
        FileWriter and FileReader.

        We can use FileWriter to write character data to the file.

        Constructors.

        FileWriter fw=new FileWriter(String fileName);

        FileWriter fw=new FileWriter(File f);

        The Above FileWriter meant for overriding of existing data.InsteadOf overriding if we want append operation then we have to create filewriter by using the following constructor.

        FileWriter fw=new FileWriter(String fileName,boolean append);

        FileWriter fw=new FileWriter(File f,boolean append);

        If the specified file is not already available then all the above constructor will create that file.


        Methods.

        write(int ch);
         To write a single character

        write(char[] ch)
            To write an array of characters.

        write(String s)
            TO write String to the file.

        flush()
            To give the gaurantee that total data including the last character will be written to the file.

        close();
            To close the writer.

        Code.




        */
    }
}
