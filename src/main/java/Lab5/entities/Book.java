package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */

@Entity
public class Book extends Publication {

    @Basic
    private String author;

    public Book() {
    }

    public Book(String author, int copies, double price, String titles) {
        super(titles, copies, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    

}