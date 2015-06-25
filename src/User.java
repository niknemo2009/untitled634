import java.util.Vector;

/**
 * Created by admin on 25.06.2015.
 */
public class User {
   String  name;
    String emeil;
    int telefon;
   private static  Vector<User> sprUser=new Vector<User>();

    public User(String name, String emeil, int telefon) {
        this.name = name;
        this.emeil = emeil;
        this.telefon = telefon;
        sprUser.add(this);
    }

    public static Vector<User> getSprUser() {
        return sprUser;
    }

    @Override
    public String toString() {
        return name ;
    }
}
