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
public class Book extends Publication implements Serializable{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}