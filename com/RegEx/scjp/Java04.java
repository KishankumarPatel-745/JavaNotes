package com.RegEx.scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java04 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(args[0]);
        if(m.find() && m.group().equals(args[0])){
            System.out.println("valid mobile number");

        }else{
            System.out.println("InValid mobile number");

        }
        /*
        WAP to check whether the given number is valid mobile number or not?

        WAP to check whether email id is valid or not.

        replace mobile regex to email regex.


        eg.
        WAP to extract mobile number and emailID from a file.


        

        
        
        */
    }
}
