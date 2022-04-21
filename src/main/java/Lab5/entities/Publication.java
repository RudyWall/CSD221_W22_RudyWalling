package Lab5.entities;

import Lab5.SaleableItem;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author rudyw
 */

@Entity
public class Publication implements SaleableItem, Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String titles;
    @Basic
    private int copies;
    @Basic
    private double price;

    public Publication() {
    }

    public Publication(String t, int c, double p) {
        titles = t;
        copies = c;
        price = p;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void sellCopy() {
        this.copies = this.copies - 1;
    }

    

}