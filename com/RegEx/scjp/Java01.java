package com.RegEx.scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java01
 */
public class Java01 {
    public static void main(String[] args) {
        int count=0;
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abbabbba");

        while(m.find()){
            count++;
            System.out.println(m.start()+"----"+m.end()+"----"+m.group());
        }
        System.out.println(count);

        /*
        o/p
        0----2----ab
        3----5----ab
        2
        
        */
        /*
        Regular Expression.
        If we want to represent a group of string according to a particular pattern then we should go for regular Expression.

        eg.
        We can write RegEx to represent all mailID and mobile number.

        The main important application areas of regular expressions are ..
        1,
        To develop validation frameworks.

        2,
        To develop pattern matching applications. (ctrl f and grep in unix)

        3,
        To develop translator like Assembler,compiler,interpretors,etc

        4,
        To develop digital circuits

        5,
        To develop communication protocols like TCP/IP,UDP etc.

        REGEX application.

        eg.
        class RegExDemo{
            main(){
                int count=0;
                Pattern p=Pattern.compile('ab');
                //creating a Pattern Object.

                Matcher m=p.matcher("abbabbba");

                while(m.find()){
                    count++;
                    SOP(m.start());
                }
                SOP("The total number of occurences "+count);
            }
        }

        Pattern and Matcher is present in java.util.regex package.




        Pattern Object.
        Pattern object is a compiled version of regular expression.
        Means it is a Java equivalent object of Pattern.

        We can create a Pattern Object by using compile method of Pattern class.

        public static Pattern compile(String re);
        eg.
        Pattern p=Pattern.compile("ab");

        Matcher object..
        A Matcher object can be used to check whether the given Pattern is present in the given target String.

        We can create a matcher object by using matcher method of pattern class.

        public Matcher matcher(String target);

        eg.
        Matcher m=p.matcher("abbabbba");

        Important methods of Matcher class.

        boolean find();

        It attampts to find next match and returns true if it is available.

        int start();
        returns start index of the match.

        int end();
        returns end+1 index of the match.

        String group();
        returns the matched patterns.

        NOte>
        Pattern and Matcher classes present in java.util.regex package. and introduced in 1.4 version.
        
        
        */
    }
    
}