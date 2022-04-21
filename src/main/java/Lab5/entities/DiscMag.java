package Lab5.entities;

import javax.persistence.Entity;

/**
 * @author rudyw
 */

@Entity
public class DiscMag extends Magazine {
    public DiscMag(){
    
}
    public DiscMag(int q, String c, int copies, double price, String titles){
        super(q, c, copies, price, titles);
    }
}