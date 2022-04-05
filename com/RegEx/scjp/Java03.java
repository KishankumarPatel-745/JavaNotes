package com.RegEx.scjp;

import java.util.regex.Pattern;

public class Java03 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\s");
        for(String s:p.split("Kishan is a nice human")){
            System.out.println(s);
        };
        /*
        o/p
        Kishan
        is
        a
        nice
        human
        */
        /*

        Pattern class

        split() method

        we can use Pattern class split() to split the target string according to a particular pattern.

        eg.
        Pattern p=Pattern.compile("\\."); or [.]
        String[] s=p.split("www.durgaJobs.com");
        for(String s1:s){
            SOP(s1);
        }
        o/p
        www
        durgaJobs
        com


        String class also contains split methods to split the target string according to a particular pattern.

        eg.
        String s ="Durga Software Solution";
        String[] s1=s.split("\\s");
        for(String s2:s1){
            SOP(s2);
        }

        NOTE.

        Pattern class split method can take target string as argument.
        Whereas String class split method can take pattern as argument.

        StringTokenizer...

        It is a Specially designed class for tokenization activity.

        StringTokenizer present in java.util package.

        eg.
        StringTokenizer st=new StringTokenizer("Durga Software Solutions");
        while(st.hasMoreTokens()){
            SOP(st.nextToken());
        }
        o/p
        Durga
        Software
        Solutions

        Default pattern is space.

        The default RE for StringTokenizer is space.

        eg02

        StringTokenizer st=new StringTokenizer("19-09-1996","-");
        target string , pattern/delimiter/regular expression

        while(st.hasMoreTokens()){
            SOP(st.nextToken());
        }
        o/p
        19
        09
        1996

        eg01.
        RE for all mobile numbers

        every number should contain exactly 10 digit and 1st digit should be 7,8,9.

        [7-9][0-9]{9} for mobile number in india.

        (0/91)?[7-9][0-9]{9}

        eg02.
        Write a regular expression to represent all valid mailID.

        [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+

        Only Gmail id's

        [a-zA-Z0-9][a-zA-Z0-9_.]*@gmail.com

        Write a RE to represent all yava language identifiers.

        rules
        allowed characters are a to z A to Z 0 to 9 # 
        $ symbol

        lenght should be atleast two

        the first character should be lower case alphabet symbol from A-K
        a digit divisible by 3.

        [a-k][0369][a-zA-Z0-9#$]*


        

        
        
        */
    }
}
