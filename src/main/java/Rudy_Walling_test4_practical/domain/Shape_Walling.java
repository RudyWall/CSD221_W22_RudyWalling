package Rudy_Walling_test4_practical.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author rudyw
 */
@Entity
public class Shape_Walling implements ShapeInterface, Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}