package AnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {
    private int personid;
    private String name;
    private int age;
    @Autowired
    private PersonType personType;
    private Address address;
    @Autowired
    @Qualifier("num_two")
    private Degree degree;

    public void showall() {
        System.out.println(address.getAddress());
        System.out.println(personType.getPersontype());
        System.out.println(getAge());
        System.out.println(getPersonid());
        System.out.println(degree.getDegree());
        System.out.println(getName());
    }


    public String getName() {
        return name;
    }
    @Value("bahram")
    public void setName(String name) {
        this.name = name;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
