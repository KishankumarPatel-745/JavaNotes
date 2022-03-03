package com.languageFundamental.scjp;

// package com.kishanJava.scjp;
//JAVA CODING STANDARDS...
class Calculator {
    public static int add(int... num){
        int sum=0;
        for(int n:num){
            sum+=n;
        }
        return sum;
    }
    public static void main(String[] args) {
        /*
        Java Coding Standards.

        whenever we are writing JAVA Code it is highly recommoended to follow coding standards.
        whenever we are writing any component we have to write the name such that reflect the functionlity. the main advantage of the approach is to improve the readability and maintainibility.

        Coding Standard for Classes!

        String 
        StringBuffer
        ====Nouns...
        ---Starts with Uppercase

        Usually class names are nouns.
        Should starts with uppercase  and if it contains multiple words then every innerword starts with the Uppercase Character.
        eg
        String, StringBuffer, Account, Dog.


        Coding Standard for Interfaces...
        Runnable
        Serializable
        Comparable
        ===Adjectives
        --starts with Uppercase.

        Usually interface names are adjectives.
        Should starts with uppercase character and if it contains multiple words then every innerword starts with the Uppercase Character.
        eg.
        Runnable
        Serializable
        Comparable

        Coding Standards for methods.
        
        Usually method names are verbs or verb-noun combination.
        Should starts with lowercase alphabet character and if it contains multiple words then every innerword starts with the Uppercase Character(CamelCase Convention).

        eg.
        print()
        sleep()
        run()
        getName()
        getSalary()--,verb-noun conbination.

        Coding Standards for variables.

        Usually variable names are nouns.

        Should starts with lowercase alphabet character and if it contains multiple words then every innerword starts with the Uppercase Character(CamelCase Convention).
        eg salary, mobileNumber

        Coding Standards for constance.

        usually constant names are nouns. should contain only Upper case character and if it contains multiple words then this words are separated with _ symbol.
        eg
        MAX_VALUE
        MAX_PRIORITY
        MIN_PRIORITY
        PI

        we can declare constance with public static and final modifiers.

        Java Bean Coding Standards.

        A javabean is a simple java class with private property and public getter and setter method.

        Coding Standards for Listeners.
        Case01:
        To register a Listener:-

        public void addMyActionListener(MyActionListener l);

        Method name should be prefixed with add.

        eg.
        public void registerMyActionListener(MyActionListener l); Invalid.

        CASE02
        To unregister a Listener:-
        public void removeMyActionListener(MyActionListener l); Valid


        public void unregisterMyActionListener(MyActionListener l); InValid.

        Method name should be prefixed with remove.




        



        


        
        
        
        */
        System.out.println(Calculator.add(10,21,1,1));
    }
}

class StudentBean{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /*
     A javabean is a simple java class with private property and public getter and setter method.

     className ends with 'Bean' is not official convention from Sun Micro.

     Syntax for setter.
     it should be public method. The return type should be void. Method name should be prefixed with set. it should take some argument means it should not be no-arg method.

     Syntax for getter.
     It should be public method. The return type should not be void. Method name should prefixed with get. it should not take any argument.


     NOTE:
     For boolean properties,getter method name can be prefixed with either get or is ,but recommanded to use is.

     private boolean empty;
     public boolean getEmpty(){
         return empty;
     }
     public boolean isEmpty(){
         return empty;
     }



    */
}