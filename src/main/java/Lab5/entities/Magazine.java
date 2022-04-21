package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */

@Entity
public class Magazine extends Publication {

    @Basic
    private int orderQty;
    @Basic
    private String currIssue;

    public Magazine() {
    }

    public Magazine(int q, String c, int copies, double price, String titles) {
        super(titles, copies, price);
        this.orderQty = q;
        this.currIssue = c;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public String getCurrIssue() {
        return currIssue;
    }

    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }

}