/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;
import java.util.Objects;

/**
 *
 * @author rudyw
 */
public class Book {
    private String author;
    public Book(){
            author="to be input";
}
    Book(String m){
        author=m;
    }
    @Override
    public String toString(){
        return "Author: "+author;
    }
}