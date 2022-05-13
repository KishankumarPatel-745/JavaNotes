import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    String city;
    String Desigantion;
    int salary;
    Employee(String name, String city, String desigantion, int salary) {
        this.name = name;
        this.city = city;
        Desigantion = desigantion;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee (Desigantion=" + Desigantion + ", city=" + city + ", name=" + name + ", salary=" + salary
                + ")";
    }

    

}
public class Rough03 {
    static void populate(ArrayList<Employee> l){
        l.add(new Employee("Kishan", "Mehsana", "Coder", 100));

        l.add(new Employee("Karan", "Mehsana", "Manager", 500));

        l.add(new Employee("Milap", "Unjha", "Manager", 100));

        l.add(new Employee("Nilhil", "Ahmedabad", "Sale", 1000));

        l.add(new Employee("Drake", "AHmedabad", "Cyber", 1002));

        l.add(new Employee("Darshan", "Mehsana", "Manager", 800));

        l.add(new Employee("Savita", "Mehsana", "Coder", 1009));

        l.add(new Employee("Sita", "Ahmedabad", "Coder", 1000));

    }
    static void display(Predicate<Employee> p, ArrayList<Employee> e){
        for (Employee employee : e) {
            if(p.test(employee)){
                System.out.println(employee);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<Employee>();
        populate(l);

        // System.out.println("city is Mehsana");

        // display(e->e.city.equals("Mehsana"), l);

        // System.out.println("All coder are :");

        // display(e->e.Desigantion.equals("Coder"), l);

        System.out.println("All coder are :");

        display(e->e.Desigantion.equals("Coder"), l);





        // Predicate<String> p=s->s.startsWith("K");

        // String[] str={"Kishan","Karan","shiva","jinal","kam"};
        // for (String str1 : str) {
        //     System.out.println(p.test(str1)+" -- "+str1);

        
        // Predicate<String> p1=s->{try {
        //     if(s.trim().length()==0)
        //         return false;
        //      return true;   
        // } catch (NullPointerException e) {
        //     return false;
        // }};

        // String[] s={"Durga","    ","",null,"ravi","","shiva",null};
        
      
        // for(String s1:s){
        //     if(p1.test(s1)){
        //         System.out.println(s1);
        //     }

        
        // }
        
            

        }
    }
