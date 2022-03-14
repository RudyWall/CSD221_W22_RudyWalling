package Lab4;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author rudyw
 */
public class DiscMag{

    private String title;
    private int copies;
    private double price;

    public DiscMag(){
        title = "title to be input";
        copies = 0;
        price = 0.0;
    }
    public DiscMag(String t, int c, double p){
        title=t;
        copies=c;
        price=p;
    }
    @Override
    public String toString() {
        return "Title: "+ title + "\nCopies: "+ copies + "\nPrice: "+ price;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
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

    public void setCopies(int copies) {
        this.copies = copies;
    }
    public void sellCopy(){
        this.copies = this.copies-1;
    }

}
