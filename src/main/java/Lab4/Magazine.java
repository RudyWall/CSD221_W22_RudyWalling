/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;


/**
 *
 * @author rudyw
 */
public class Magazine extends Publication{
    private String title;
    private int orderQty;
    private double price;

    public Magazine() {
        title = "title to be input";
        orderQty = 10;
        price = 0.0;
    }

    Magazine(String n, int i, double p) {
        title = n;
        orderQty = i;
        price = p;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nQuantity: " + orderQty +"\nPrice: " + price;
    }

    public int getCopies() {
        return orderQty;
    }

    public void setCopies(int orderQty) {
        this.orderQty = orderQty;
    }
}
