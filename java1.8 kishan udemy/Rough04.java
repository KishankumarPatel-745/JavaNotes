
class Simple{
    int num;
    String name;
    Simple(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Hi this is a  simple constructor call");
    }
    
}
/**
 * 
 */
interface  lol{
    public Simple lelo(int num,String n);
}
public class Rough04 {
    public static void referkariche() {
        for (int i = 0; i < 12; i++) {
            System.out.println("child thread:- "+i);
        }
        
    }
    public static void main(String[] args) {
        // Function<String,Integer> l=s->s.length();
        // System.out.println( l.apply("Kishan"));
        // System.out.println(l.apply("Hiral Patel"));

        //consumer..

        /*
        Method reference and constructor reference.

        static method
        classname::method name 

        instance method 
        objectref :: method name

        eg.
        Test t=new Test();
        Interf t=t::m2;
        */
        lol l=Simple::new;
        System.out.println(l.lelo(100,"kishan lala"));
        new Thread(Rough04::referkariche).start();;
        for (int i = 0; i < 12; i++) {
            System.out.println("Main thread:- "+i);
        }
    }
    
}
