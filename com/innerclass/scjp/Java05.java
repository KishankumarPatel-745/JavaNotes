package com.innerclass.scjp;

public class Java05 {
    public static void main(String[] args) {
        /*
        Various combinations of nested classes and interfaces.

        case:-1,
        Class inside a class.

        Without existing one type of object,if there is no change of existing another type of object then we can declare a class inside a class.

        eg.
        University consists of several departments.Without existing university,There is no chance of existing department hence we have to declare department class inside university class.
        eg.
        class University{
            class Department{

            }
        }
        
        case02
        Interface inside a class.

        Inside a class,if we required multiple  implementation of an interface and all this implementations are related to a particular class then we can define interface inside a class.


        eg.
        class VehicleTypes{
            interface vehicle{
                public int getNoOfWheel();
            }
            class Bus implements Vehicle{
                public int getNoOfWheel(){
                    return 6;
                }
            }
            class Auto implements Vehicle{
                public int getNoOfWheel(){
                    return 3;
                }
            }
            ;;;
            ;;;
            ;;;
        }


        case03

        Interface inside an Inferface.

        We can declare interface inside interface.
        eg.
        A map is a group of Key-Value pairs and each kwy-value pair is called an entry.
        Without existing map object,There is no chance of existing entry object.Hence interface entry is defined inside a map interface.

        eg.
        interface Map{
            interface Entry{

            }
        }
        
        Every Interface present inside an interface is always public and static whether we are declaring or not.
        Hence we can implement inner interface directly without implementing outer interface.
        Similarly whenever we are implementing outer interface, we are not required to implement inner interface.Means we can implement outer and inner interfaces independently.

        eg.
        interface Outer{
            public void m1();
            interface Inner{
                public void m2();
            }
        }

        class Test1 implements Outer{
            public void m1(){
                SOP("Outer Interface method Implementation");
            }     
        }

        class Test2 implements Outer.Inner{
            public void m2(){
                SOP("Inner Interface method Implementation");
            }   

        }
        class Test{
            main(){
                Test1 t1=new Test1();
                t1.m1();

                Test2 t2=new Test2();
                t2.m2();

            }
        }



        case 04
        class inside an interface.

        If a functionality of a class is closely associated with interface then it is highly recommanded to declare class inside interface.

        eg.
        interface EmailService{
            public void sendMail(EmailDetails e);

            class EmailDetails{
                String to_List;
                String cc_list;
                String subject;
                String body;
           
            }
        }

        In the above example,email details is required only for email service and we are not using anywhere else.
        Hence EmailDetails class is recommanded to declare EmailService interface.

        We can also define a class inside an interface to provide default implementation for that interface.

        eg.
        interface Vehicle{
            public int getNoOfWheels();

            class DefaultVehicle implements Vehicle{
                public int getNoOfWheels(){
                    return 2;
                }
            }
        }
        class Bus implements Vehicle{
            public int getNoOfWheels(){
                return 6;
            }
        }
        class Test{
            main(){
                Vehicle.DefaultVehicle v=new Vehicle.DefaultVehicle();
                SOP(v.getNoOfWheels()); //2

                Bus b=new Bus();
                SOP(v.getNoOfWheels()); //6
            }
        }

        In the above example, DefaultVehicle is a default implementation of Vehicle interface.

        Whereas Bus is customized implementation of vehicle interface.

        NOte:

        The which is declared inside interface is always public,static whether we are declaring or not.Hence we can create class Object directly without having outer interface type object.

        CONCLUSIONS----
        _________________

        Among classes and interfaces, we can declare anything inside anything.

        C:01
        class A{
            class B{

            }
        } valid


        C:02
        class A{
            interface B{

            }
        } valid


        C:03
        interface A{
            interface B{

            }
        } valid

        C:04
        interface A{
            class B{

            }
        } valid

        The interface which is declared inside interface is always public and static whether we are declaring or not.

        The class which is declared inside interface is always public and static whether we are declaring or not.

        The interface which is declared inside a class, is always static but need not be public.
        






        */
    }
}
