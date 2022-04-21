package Rudy_Walling_test4_practical.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */
@Entity
public class Square_Walling extends Shape_Walling {

    @Basic
    private String theLength;
    @Basic
    private String width;

    public String getTheLength() {
        return theLength;
    }

    public void setTheLength(String theLength) {
        this.theLength = theLength;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

}