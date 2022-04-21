package Lab5.entitiesOLD;

import Lab5OLD.SaleableItem;
import java.io.Serializable;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author rudyw
 */
public abstract class Publication implements Serializable, SaleableItem{

    private String title;
    private int copies;
    private double price;

    
    
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
