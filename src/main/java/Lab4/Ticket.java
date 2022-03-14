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
public class Ticket implements SaleableItem{
    private String description;
    private String client;
    private int copies;
    private double price;

    public Ticket(){
        description = "description to be input";
        client = "to be inputted";
        copies = 0;
        price = 0.0;
    }
    public Ticket(String t, String l, int c, double p){
        description=t;
        client = l;
        copies=c;
        price=p;
    }
    @Override
    public String toString() {
        return "\nTitle: "+ description + "\nClient: " + client + "\nCopies: "+ copies + "\nPrice: "+ price;
    }
    public String getTitle(){
        return description;
    }
    public void setTitle(String description){
        this.description = description;
    }
    public String getClient(){
        return description;
    }
    public void setClient(String client){
        this.description = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void sellCopy(){
        System.out.println("******************************");
        System.out.println("         Ticket Voucher       ");
        System.out.println(toString());
        System.out.println("******************************");
        System.out.println();
    }

}
