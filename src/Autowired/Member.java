package Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
    private int id;
    @Autowired
    @Qualifier("memtype2")
    private MemberType memberType;
    @Value("salam everyone")
    private String message;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }



    public void showall(){
        System.out.println(this.id);
        System.out.println(this.memberType.getType());
        System.out.println(this.message);
        System.out.println(this.address);
    }

    public void setAddress(MemberType Address) {
    }
}
