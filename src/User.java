import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Created by admin on 25.06.2015.
 */
public class User implements  Comparable<User> {
   String  name;
    String login;
    String password;
    String emeil;
    int telefon;
    private Role userRole=Role.Gost;

  // private static Set<User> sprUser=new TreeSet<User>();

    public User(String name, String emeil, int telefon) {
        this.name = name;
        this.emeil = emeil;
        this.telefon = telefon;
       // userSqlController.createUser(this);
        //sprUser.add(this);
    }

    public User(String name, String login, String password, String emeil, int telefon, Role userRole) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.emeil = emeil;
        this.telefon = telefon;
        this.userRole = userRole;
       // userSqlController.createUser(this);
       // sprUser.add(this);
    }



    public Role getUserRole() {
        return userRole;
    }

//   // public static Set<User> getSprUser() {
//        return sprUser;
//    }

    @Override
    public String toString() {
        return name + " Login - "+login;
    }

    @Override
    public int compareTo(User user) {
        return this.login.compareTo(user.login)*111+this.emeil.compareTo(user.emeil);
    }

//    public Order createOrder(String nameZakaza){
//       return new OrderBuilder().setNomer(nameZakaza).setOwner(this).createOrder();
//    }
}
