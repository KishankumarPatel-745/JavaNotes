package com.generics.scjp;

public class Java04 {
    public static void main(String[] args) {
        /*
        Generics method and wildcard character(?)

        1,
        m1(ArrayList<String> l);

        we can call this method by passing ArrayList of Only String Type.

        But within a method, we can add only String type of Object to the List by mistake if we are trying to add any other type then we will get CTE.

        m1(ArrayList<String> l){
            l.add("A");
            l.add(null);
            l.add(10); Not Valid CTE
        }


        m1(ArrayList<?> l);

        We can call thi method by passing ArrayList of any type.

        BUt within a method, we cannot add anything to the List except null because we don't know the Type Exactly.

        null is allowed because it is valid value for anytype.

        m1(ArrayList<?> l){
            l.add(10.5); Not valid CTE
            l.add("A"); Not valid CTE
            l.add(10); Not valid CTE
            l.add(null); valid
        }

        This type of methods are best suitable for read only operation.

        m1(ArrayList<? extends x> l)

        x can be either class or interface. if x is a class then we can call this method by passing ArrayList of either x type or its child classes.

        If x is an interface then we can call this method by passing Arraylist of either x type or its implementation classes.

        But within a method, we cannot add anything to the List except null because we don't know the type of X exactly.
        This type of method also best suitable for read only operation.

        m1(ArrayList<? super x> l);

        x can be either class or inteface, if x is a class then we can call this method by passing ArrayList of either x type or its super classes.

        If x is an interface then we can call this method by passing ArrayList of either x type or super class of implementation class of x.

        Runnable <--Thread
        Object<--Thread.

        But within a method, we can add x type of object and null to the list.

        Cases...

        ArrayList<String> l=new ArrayList<String>(); valid

        ArrayList<?> l=new ArrayList<String>(); valid

        ArrayList<?> l=new ArrayList<Integer>(); valid

        ArrayList<? extends Number> l=new ArrayList<Integer>(); valid

        ArrayList<? extends Number> l=new ArrayList<String>(); Invalid
        CTE:incompatible Types
        found:ArrayList<String>
        required:ArrayList<? extends Number>

        ArrayList<? super String> l=new ArrayList<Object>(); valid

        ArrayList<?> l=new ArrayList<?>(); Invalid
        CTE: unexpected type 
        found: ? 
        required: class or interface without bounds

        ArrayList<?> l=new ArrayList<? extends Number>();
        Invalid
        CTE: unexpected type 
        found: ? extends Number
        required: class or interface without bounds



        */
    }
    
}
