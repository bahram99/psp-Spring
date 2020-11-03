package AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class PersonType {
    private String persontype;

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }
}
