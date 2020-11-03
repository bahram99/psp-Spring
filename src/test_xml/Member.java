package test_xml;

public class Member {
    private int id;
    private String name;
    private Membertype memtype;


    public Membertype getMemtype() {
        return memtype;
    }

    public void setMemtype(Membertype memtype) {
        this.memtype = memtype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
