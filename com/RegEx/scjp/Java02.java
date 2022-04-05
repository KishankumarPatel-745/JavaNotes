package com.RegEx.scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java02 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("a*");
        Matcher m=p.matcher("abaabaaab");
        while(m.find()){
            System.out.println(m.start()+"-----"+m.group());
        }
        /*
        Character Classes.

        [abc]=>either a or b or b.

        [^abc]=> except 'a' and 'b' and 'c'

        [a-z]=> any lowercase alphabet symbol from a to z

        [A-Z]=> any uppercase alphabet symbol A to Z.

        [a-zA-Z]=> any alphabet symbol.

        [0-9]=> any digit from 0 to 9.
        
        [0-9a-zA-Z]=> any alphanumeric symbol.

        [^0-9a-zA-Z]=> except alphanumeric symbol means special symbol

        Pre-defined Character classes.

        \s: space character.

        \S:except space character.

        \d:any digit from 0-9

        \D:except digit,any character

        \w:any word character      [0-9a-zA-Z]

        \W:Except word character(special character)

        . any character

        
        Quantifiers.

        we can use quantifier to specify number of occurrences to match.

        a => exactly one 'a'

        a+ => atleast one 'a'

        a* => anu number of a's including zero number

        a? => atmost one 'a';
        
        
        */
    }
}
