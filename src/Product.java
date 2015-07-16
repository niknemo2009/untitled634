import java.util.Date;
import java.util.Vector;

/**
 * Created by admin on 29.06.2015.
 */
enum GrupProduct{Molochka,Fish,Meat

}
public class Product {
    GrupProduct grupProduct;
    String name;
    String proizvod;
    Date dateIzg;
    int price;
    private static Vector<Product> sprProduct=new Vector();

    public static Vector<Product> getSprProduct() {
        return sprProduct;
    }

    static {
     sprProduct.add(new Product(GrupProduct.Molochka,20,new Date(),"Bashtanka","Kefir"));
        sprProduct.add(new Product(GrupProduct.Molochka,26,new Date(),"Bashtanka","Smetana"));
        sprProduct.add(new Product(GrupProduct.Fish,20,new Date(),"Nov Svet","bychky"));
    }

    public Product(GrupProduct grupProduct, int price, Date dateIzg, String proizvod, String name) {
        this.grupProduct = grupProduct;
        this.price = price;
        this.dateIzg = dateIzg;
        this.proizvod = proizvod;
        this.name = name;
        sprProduct.add(this);
    }

}
