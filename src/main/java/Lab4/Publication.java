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
public class Publication{

    private String title;
    private int copies;
    private double price;
    private Book author;

    public Publication(){
        title = "title to be input";
        copies = 0;
        price = 0.0;
        author = new Book("John Doe");
    }
    public Publication(String t, int c, double p, Book a){
        title=t;
        copies=c;
        price=p;
        author=a;
    }
    @Override
    public String toString() {
        return "Author: " + author + "\nTitle: "+ title + "\nCopies: "+ copies + "\nPrice: "+ price;
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
