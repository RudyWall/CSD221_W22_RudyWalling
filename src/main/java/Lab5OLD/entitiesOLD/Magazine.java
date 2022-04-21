/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.entitiesOLD;

import java.io.Serializable;



/**
 *
 * @author rudyw
 */
public class Magazine extends Publication implements Serializable{
    private int orderQty;


    public int getQuantity() {
        return orderQty;
    }

    public void setQuantity(int orderQty) {
        this.orderQty = orderQty;
    }
}
