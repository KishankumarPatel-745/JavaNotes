import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rough05 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(14);
        l.add(20);
        l.add(80);
        System.out.println(l);
        System.out.println(l.stream().filter(i->i%2==0).collect(Collectors.toList()));

        System.out.println(l.stream().map(i->i*2).collect(Collectors.toList()));

        Stream<Integer> s= Stream.of(9,99,899,99,999,1999);
        s.forEach(System.out::println);
        
        /*
        Stream concept.
        Filtering Mechanism..
        If we want to filter elements from the collection based on some boolean condition then we should go for filter.
         
        We can filter by using filter 

        prototype.

        Stream filter(Predicate<T> t);
        it can be boolean valued function.

        Stream s1=c.stream().filter(i->i%2==0);


        collect()
        count(). - the number of elements present in the stream.
        
        public long count();

        Date and Time API.
        Joda API.

        


        */
    }
}
