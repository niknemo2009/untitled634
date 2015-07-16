import java.util.Date;
import java.util.Vector;

/**
 * Created by admin on 29.06.2015.
 */
public class Order {
    String nomer;
    Date startDate;
   private Vector<Product> korzina=new Vector<Product>();
    User owner;

    public Order(String nomer, User owner) {
        this.nomer = nomer;
        this.startDate = new Date();
        this.owner = owner;
    }

    public void addProduct(Product pr,int count){

    }

}
