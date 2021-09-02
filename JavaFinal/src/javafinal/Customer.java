package javafinal;
import Javainterface.*;

public  abstract class Customer implements AccountOperations {
    private String name;
    private int nid;
     Account accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }  
}

