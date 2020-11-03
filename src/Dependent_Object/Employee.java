package Dependent_Object;

import org.springframework.stereotype.Component;


public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id , String name , Address add){
        super();
        this.id = id;
        this.name = name;
        this.address = add;
    }
    public void show(){
        System.out.println(id +" "+name+" "+address.getCity());
    }
}
