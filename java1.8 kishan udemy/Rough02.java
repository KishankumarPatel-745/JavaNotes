import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

interface  Interf{
    default void m1(){
        System.out.println("Default method call");
    }
    public static void name() {
        System.out.println("called inerface static method");
    }
    public static void main(String[] args) {
        System.out.println("LOl it is possible to call inteface from cmd");
        Predicate<Integer> i=p->p>10;
        System.out.println(i.test(10));

        Predicate<Collection> l=c->c.isEmpty();
        ArrayList a=new ArrayList<Integer>();
        // a.add(10);
        System.out.println(l.test(a));
    }
}
public class Rough02 implements Interf {
    
    @Override
    public void m1() {
        System.out.println("This is my own implementation");
    }
    public static void main(String[] args) {
        Rough02 t=new Rough02();
        t.m1();
        Interf.name();
        /*
        Anonymous inner class..

        this keyword in lambda function.

        Default method in java 1.8 version.



        */
    }
}
