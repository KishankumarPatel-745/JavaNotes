package com.OOPS.scjp;

public class Java07 {
    /*
    Overriding with respectTo var-arg method.

     We can override var-arg methods with another var-arg method only.
     If we are trying to override with the normal method then it will become overloading but not overriding.

     eg.
     class P{
         public void m1(int... x){
             SOP("Parent");
         }
     }
     class C extends P{
          public void m1(int x){
             SOP("Child");
         }
     }
     It it overloading but not overriding

     class Test{
         main(){
             P p=new P();
             p.m1(10);Parent

             C c=new C();
             c.m1(10);Child

             P p1=new C();
             p1.m1(10); parent

         }
     }

     In the above programm if we replace child method with var-arg method then it will become overriding.

     In this case, the output is Parent
     Child
     Child

     Overriding with respect to variable.

     Variable resolution always takes care by compiler based on reference type. irrespective of whether the variable is static or non-static.

     Overriding concept applicable only for methods but not for variables.

     eg.
     class P{
         int x=888;
     }
     class C extends P{
         int x=999;
     }
     class Test{
         main(){
             P p=new P();
             SOP(p.x); 888

             C c=new C();
             SOP(c.x); 999

             P p=new C();
             SOP(p.x); 888
         }
     }

     What is different between overloading and overriding.

     property->overloading->overriding
     
     methodName-must be same-must be same
     
     argument Type-must be different at least order.->must be same including order.

     method signature->must be different->must be same.

     return types->No restriction->must be same until 1.4 v and From 1.5v onwords co-variant return types also allowed.

     private,static ,final-> can be overloaded-> cannot be overridden

     access modifiers->no restriction->we cannot reduce scope of access modifier but we can increase the scope.

     throws clause->No Restriction-> If child class method throws any checked exception compulsory parent class method should throw same checked exception or its parent but no restriction for unchecked exception.

     method resolution->Always takes care by compiler based on reference type.
     ->always takes care by JVM by runtime object.

     It is also known as->compile time polymorphism/static polymorphism/early binding-> runtime polymorphism/dynamic polymorphism/late binding.

     NOTE:
     In overloading, we have to check only method names(Must be same) and argument type(Must be different).We are not required to check remainings like return types, access modifier etc.

     But in overriding everything we have to check like method name,argument types, return types, access modifier,throws class etc.

     Polymorphism.
     One name but multiple forms is a concept of polymorphism.

     eg.
     method name is the same but we can apply for different types of arguments.(Overloading)
     abs(int)
     abs(long)
     abs(float)

     Method signature is same but in parent class one type of implementation but in child class another type of implementation.
     Overridding 
     eg.
     class P{
         marry(){
             SOP("Subhulaxmi");
         }
     }
     class C extends P{
         marry(){
             SOP("3sha|9tara");
         }
     }

     Useage of parent reference to hold child object is the concept of polymorphism.

     eg.
     List l=new ArrayList();
     List l=new LinkedList();
     List l=new Stack();
     List l=new Vector();

     Parent class reference can be used to hold child object,but by using that reference we can call only the method availble in parent class.And we cannot call child specific methods.
     eg.P p=new C();
     p.m1();
     p.m2();CTE:cannot find symbol
     symbol:method m2()
     location:class P.


     But by using child reference we can call both parent and child class methods.
     eg.
     C c=new C();
     c.m1();
     c.m2();

     when we should go for parent reference to hold child object.

     If we dont know exact runtime type of object then we should go for parent reference.
     eg.
     The first element present in the arraylist can be any type.
     It maybe Customer object,String object etc.

     Hence the return type of get method is Object. which can hold any object.

     eg.
     Object o=l.get(0);
     
   
     C c=new C()  VS P p=new C();

     1, We can use this approach if we know exact runtime type of object.
     We can use this approach if we dont know exact runtime type of Object.

     BY using child reference, we can call both parent class and child class method.(This is the advantage of this approach).

     By using parent reference we can call only method availble in parent class and we cannot call child specific method this is a disadvantage of this approach.
     We can use child reference to hold only particular child class object.This is a disadvantage of this approach.

     We can use parent reference to hold any child class object this is a advantage of this approach.


     3 OOPS concept till now we have covered.

     1,Encapsulation :- Security
     2,Polymorphism:- flexibility
     3,Inheritance:- Reusability.

     three pillars of OOPS.

     Polymorphism
     ||
     static polymorphism/compile-time polymorphism/early binding
     eg. Overloading, Method Hiding.

     Dynamic Polymorphism/runtime polymorphism/late binding
     eg. overriding

     Beautiful defination of polymorphism.

    









    */
}
