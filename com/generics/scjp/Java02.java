package com.generics.scjp;

public class Java02<T> {

    T obj;
    Java02(T t){
        obj=t;
    }
    void show(){
        System.out.println("The Type of Object is :- "+ obj.getClass().getName());
    }
    T getObj(){
        return obj;
    }
    public static void main(String[] args) {
        Java02<String> s1=new Java02<String>("Kishan");
        System.out.println(s1.getObj());
        s1.show();

        Java02<Integer> i1=new Java02<Integer>(10);
        System.out.println(i1.getObj());
        i1.show();

        Java02<Double> d1=new Java02<Double>(10.3);
        System.out.println(d1.getObj());
        d1.show();
        /*
        continue from file 01

        Hence through Generics we are getting Type-Safety.


        At the time of Retrival, we are not required to perform type-casting.

        ArrayList<String> l=new ArrayList<String>();
        l.add("durga");

        String name01=l.get(0);

        Type-casting is not required.

        Hence through Generics, we can solve type casting problems.

        AL(); Vs AL<String>();

        1,
        It is a non-generic version of ArrayList Object.
        It is a generic version of ArrayList Object.

        2,
        For this ArrayList, we can add any type of Object.
        And Hence it is not Type-safe.

        For this arrayList, we can add only String Type of Object, hence it is Type-Safe.

        3,
        At the time of retrival, compulsory we have to perform type-casting.
        At the time of retrival, we are not required to perform typecasting.
        
        
        Conclusion 01.
        Polymorphism concept applicable only for the base type but not for parameter type.
        usage of parent reference to hold child object ==> Polymorphism.

        ArrayList<String> l=new ArrayList<String>(); valid

        ArrayList is a base Type and String is a Parameter Type.

        List<String> l=new ArrayList<String>(); valid

        Collection<String> l=new ArrayList<String>(); valid

        ArrayList<Object> l=new ArrayList<String>(); not valid. CTE:
        incompatible type
        found:ArrayList<String>
        required:ArrayList<Object>

        Conclusion 02

        For the type parameter, we can provide any class or interface name but not primitive. If we are trying to provide primitive then we will get compile time error.

        eg.
        ArrayList<int> x=new ArrayList<int>();

        CTE:Unexpected Type
        Found: int 
        required: reference


        Generic classes.

        Until 1.4 version, a non-generic version of ArrayList class is declared as follows.

        class ArrayList{
            add(Object o);
            Object get(int index);
        }

        The argument to add() is Object hence we can add any type of Object to the ArrayList due to this we are missing type safety.
        The return type of get() is Object,hence at the time of retrival we have to perform type casting.

        But in 1.5 version, a Generic version of Array list class is declared as follows.

        class ArrayList<T>
        {
            void add(T t);

            T get(int index);
        }

        Based on our runtime requirement T will be replace with our provided type.

        For example, to hold only String type of Objects. A Generic version of ArrayList Object can be created as Follows.

        eg.
        ArrayList<String> l=new ArrayList<String>();
        
        for this requirement,Compiler considered version of ArrayList class is as follows.

        class ArrayList<String>{
            add(String s);
            String get(int index);
        }

        The argument to add method is String type, hence we can add only String Type of Object.
        By mistake, if we are trying to add any other type we will get CTE.

        l.add("durga");
        l.add(new Integer(19));

        CTE:Cannot find symbol
        symbol: method add (java.lang.Integer)
        location:class ArrayList<String>

        Hence through Generics we are getting Type-safety.

        The return type of get() is String and hence at the time of retrival, we are not required to perform type casting.

        String name1=l.get(0);
        Type casting is not required.

        In Generics, we are associating a type parameter to the class.
        Such type of Parameterized classes are nothing but Generic Classes or Temple classes.

        Based on our requirement we can define our own Generic classes also.

        eg.
        class Account<T>
        {

        }

        Account<Gold> a1=new Account<Gold>();

        Account<Platinum> a1=new Account<Platinum>();


        our own Generic class code...











        */
    }
}
