package Lab5.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author rudyw
 */

@Entity
public class Ticket implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String description;
    @Basic
    private String client;
    @Basic
    private int copies;
    @Basic
    private double price;
    @Basic
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ticket() {
    }

    public Ticket(Long id, String description, String client, int copies, double price, String title) {
        this.id = id;
        this.description = description;
        this.client = client;
        this.copies = copies;
        this.price = price;
        this.title = title;
    }
    

}