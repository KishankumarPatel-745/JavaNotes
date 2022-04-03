package com.fileIO.scjp;

import java.io.File;

/**
 * Java01
 */
public class Java01 {

    public static void main(String[] args) {
        File f=new File("E:\\");
        String[] s=f.list();
        int count=0;
        for (String string : s) {
            // if(new File("E:\\",string).isFile()){
            // count++;
            // System.out.println(string);

            // }
            if(new File("E:\\",string).isDirectory()){
            count++;
            System.out.println(string);

            }
            
        }
        System.out.println(count);
        /*
        1,File.
        2,FileWriter
        3,FileReader
        4,BufferedWriter
        5,BufferedReader
        6,PrintWriter.

        File f=new File("abc.txt");
        
        This line won't create any physical file,first it will check is there any physical file named with abc.txt is available or not.

        If it is available then f simply refers that file.
        If it is not available then we are just creating Java file Object to represent the name abc.txt.
        
        eg,
        File f=new File("abc.txt");
        SOP(f.exists());
        f.createNewFile(); //here the file is created.
        SOP(f.exists());

        1st run
        false 
        true

        2nd run
        true
        true

        We can use Java File Object to represent directory also.
        eg.
        File f=new File("durga123");
        SOP(f.exists()); false
        f.mkdir();
        SOP(f.exists());//true

        In UNIX,everything is treated as a file.Java file IO concept is implemented based on UNIX operating System.

        Hence Java file Object can be used to represent both files and directories.


        File classes constructors 

        File f= new File(String name);

        Creates a Java file object to represent name of the file or directory in current working directory.

        File f=new File(String subDirName,String name);

        Create a java File Object to represent name of the file or directory present in specified sub directory.

        File f=new File(File subDir,String name);

        Eg01.
        Write code to create a file named with abc.txt in current Working directory.

        File f=new File("abc.txt");
        f.createNewFile();

        In CWD-->abc.txt


        EG02
        Write code to create directory named with Durga123 in current working directory and create file named with demo.txt in that directory.

        File f=new File("Durga123");
        f.mkdir();
        File f1=new File("Durga123","demo.txt");
        OR
        File f1=new File(f,"demo.txt");
        f1.createNewFile();

        EG03
        Write Code to create a file named with abc.txt in E:\\xyz
        Folder.

        File f= new File("E:\\xyz","abc.txt");
        f.createfile();

        Assume that E:\\xyz folder is already availble in our system.


        Important Method present in File class.

        boolean exists();
        Returns true if the specified file or directory availble.

        boolean createNewFile();

        First this method will check whether the specified file is already available or not. If it is already availble then this method returns false without creating Any physical file.
        If the file is not already availble then this method will create a new file and returns true.

        boolean mkdir();

        boolean isFile();
        return true if the specified file object pointing to physical file.

        boolean isDirectory();

        String[] list();
        returns the names of all files and subdirectories present in specified directory.

        long length();

        return number of character present in the specified file.

        boolean delete();
        To delete specified file or directory.


        Eg.
        WAP to display the name of all files and directories present in C:DurgaClasses..

        Refer the current file example.


        To display only file names.
        Refer the  code 






    
        */
    }
}