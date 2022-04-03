package com.fileIO.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        PrintWriter----------
        it is the most inhenced writen to write character data to the file.

        The main advantage of PrintWriter over FileWriter and BufferedWriter is we can write any type of primitive data directly to the file.

        CONSTRUCTOR.--

        PrintWriter pw=new PrintWriter(String fileName);

        PrintWriter pw=new PrintWriter(File f);

        PrintWriter pw=new PrintWriter(Writer w);

        NOTE>
        PrintWriter can communicate directly with the file and can communicate via some Writer Object also.

        Methods.
        1,
        write(int ch);

        2,
        write(String s);

        3,
        write(char[] ch);

        4,
        flush();

        5,
        close();



        print(char ch);
        print(int i);
        print(double d);
        print(boolean b);
        print(String s);
        ;;;;;

        println(char ch);
        println(int i);
        println(double d);
        println(boolean b);
        println(String s);
        ;;;;;

        eg.
        FileWriter fw=new FileWriter("abc.txt");
        PrintWriter out=new Printwriter(fw);
        out.write(100);D
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("durga");
        out.flush();
        out.close();

        what is different between write(100) and print(100);

        in the case, write(100)=> the corresponding character will be added into the file.

        and in print method, the  int value will be added to the file directly.

        The most inhanced Writer to write character data to the file is PrintWriter.
        Whereas the most enhanced Reader to read character data to the file is BufferedReader.

        IN general, we can use readers and writers to handle character data (text data).Whereas we could use streams to handle binary data like images,PDF, video file etc.

        We can use OutputStream to write binary data to the file.
        and InputStream to read binary data to the file.

        Hierarchy.

        Refer Image.


        WAP to merge data from two file into a three file.

        WAP to merge the file where merging should be done alternately.




        */
    }
    
}
