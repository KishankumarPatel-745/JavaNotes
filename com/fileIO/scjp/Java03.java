package com.fileIO.scjp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java03 {
    public static void main(String[] args) throws IOException {
    FileReader r=new FileReader("demoWriter.txt");

    BufferedReader br=new BufferedReader(r);
    String s=br.readLine();
    while(s != null){
        System.out.println(s);
        s=br.readLine();
    }
    // int i=r.read();

    // while(i != -1){
    //     System.out.println((char)i);
    //     i=r.read();

    // }
    // r.close();
        
    br.close();
    //Whenever we are closing BufferedReader underlying FileReader got closed.
    // and we are not required to close explicitly.
    // The most enhanced reader to read character data from the file is BufferedReader.
    }
    
    /*
    FileReader 
    We can use FileReader to read character data from the file.

    Constructor.

    FileReader fr=new FileReader(String fileName);

    FileReader fr=new FileReader(File f);

    Methods.

    int read();

    It attampts to read next character from the file and written its unicode value.

    If the new Character is not available then this method returns -1.

    As this method returns unicode value (int value) at the time of printing, we have to perform the type casting.

    eg/
    use code

    int read(char[] ch);

    It attempt to read enough characters from the file into char[] and returns number of character copied from the file.


    File f=new File("abc.txt");
    char[] ch=new char[(int)f.length()];
    FileReader fr=new FileReader(f);
    fr.read(ch);
    for(char c:ch){
        SOP(c);
    }

    void close();
    TO close the read resource.

    By using FileReader, we can read data character by character which is not convient to the programmer.

    Usage of FileWriter and FileReader is not recommanded because 
    1,
    While writing data by FileWriter, we have to insert line separator(\n) manually,which is varied from system to system.
    It is difficult to the programmer.

    2,
    BY using FileReader, we can read data character by character, Which is not convient to the programmer.

    To overcome this problem, we should go for BufferedWriter and BufferedReader.


    BufferedWriter__________________

    We can use bufferedWriter to write character Data to the file.

    Constructor.

    1,
    BufferedWriter bw=new BufferedWriter(Writer w);

    2,
    BufferedWriter bw=new BufferedWriter(Writer w,int bufferSize);

    NOte>
    BufferedWriter cannot communicate directly with the file. It can communicate via some writer Object.

    Which of the following are valid.

    BW bw=new BW("abc.txt"); Invalid
    BW bw=new BW(new File("abc.txt")); Invalid
    BW bw=new BW(new FW("abc.txt")); Valid
    BW bw=new BW(new BW(new BW(new FW("abc.txt"))); Valid Two-Level Buffering


    Methods.
    write(int ch);
    write(char[] ch);
    write(String s);
    flush();
    close();
    newLine();:- To insert a line separator.

    Extra method in BufferedWriter compared to FW.

    1,
    writing data to the file.

    2,
    close the file

    3,
    flushing the file

    4,
    inserting a new line character.


    NOte>
    Whenever we are closing BufferedWriter internally underlying FileWriter will be closed.And we are not required to close explicitly.

    bw.close();  underlying Writer will be closed automatically.


    BufferedReader ---------------
    We can use BufferedReader to read character data from the file.
    The main advantage of BufferedReader when compared with fileReader is we can read data line by line in addition to character by character.

    Constructor.

    1,
    BufferedReader br=new BufferedReader(Reader r);

    2,
    BufferedReader br=new BufferedReader(Reader r,int bufferSize);

    NoTe.
    BufferedReader cannot communicate directly with the file and it can communicate via some reader object.

    Methods.
    1,
    int read();

    2,
    int read(char[] ch);

    3,
    void close();

    4,
    String readLine();

    It attempts to read next line from the file and returns it.

    If the nextline not available then this method return null.









    */
}
