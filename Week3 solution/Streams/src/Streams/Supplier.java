package Streams;

public class Supplier {
    public Integer id;
    public String sname;

    // Constructor
    public Supplier(Integer id, String sname) {
        this.id = id;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return sname;
    }
}
