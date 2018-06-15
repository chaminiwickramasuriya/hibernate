package lk.ijse.maven.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ireshika Chamini on 6/13/2018.
 */
@Entity
public class Customer {
    @Id
    private  String cid;
    @Column(nullable=false)
    private  String name;
    @Column(nullable = false)
    private String address;

    public Customer(String cid, String name, String address) {
        this.cid = cid;
        this.name = name;
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "customer{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
