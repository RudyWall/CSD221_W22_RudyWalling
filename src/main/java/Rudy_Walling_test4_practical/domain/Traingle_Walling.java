package Rudy_Walling_test4_practical.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */
@Entity
public class Traingle_Walling extends Shape_Walling {

    @Basic
    private String base;
    @Basic
    private String height;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}