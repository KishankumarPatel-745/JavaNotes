package com.fileIO.scjp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Java05 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("duplicate.txt"));

        PrintWriter wr=new PrintWriter("output.txt");
        
        

        String line=br.readLine();
        while (line !=null) {
            boolean available=false;
            BufferedReader br01=new BufferedReader(new FileReader("output.txt"));
            String innerLine=br01.readLine();
            while (innerLine != null){
                System.out.println(line);
                System.out.println(innerLine+"--");
                if(line.equals(innerLine)){
                    available=true;
                    break;
                }
                innerLine=br01.readLine();
            }
            System.out.println(available+"***");
            if(available==false){
                wr.println(line);
                wr.flush();
            }
            line=br.readLine();
            br01.close();
        }
        
        wr.close();
        br.close();
        

        /*
        WAP to perform file extraction operation.


        WAP java programm to remove duplicate data from given input file
        */
    }
    
}
