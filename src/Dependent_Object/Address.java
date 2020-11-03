package Dependent_Object;

import org.springframework.stereotype.Component;


public class Address {
    private String city;

    public Address(String s) {
        this.city = s;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
