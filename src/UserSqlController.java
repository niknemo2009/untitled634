import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * Created by admin on 17.07.2015.
 */
public class UserSqlController {
    My_conn myConn=new My_conn("com.mysql.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/test");
    Statement stmt= null;


    public UserSqlController() {
        try {
            stmt = myConn.getCon().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  boolean createUser(User user){
       boolean result=false;
       String sql="INSERT INTO `test`.`user` (`name`, `login`, `password`) VALUES ('"+user.name+
                   "', '"+user.login+"', '"+user.password+"');";
           System.out.println(sql);
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  result;
   }
    public  boolean deleteUser(User user){
        boolean result=false;
        String sql="delete from user where login='"+user.login+"';";
        System.out.println(sql);
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  result;
    }

    public boolean editUser(int pkeyUser,User user){
        boolean result=false;
        return  result;
    }

    Vector<User> firstLoadSprUser()  {
        Vector<User>  result=new Vector<>();
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from User");
            while(rs.next()){
                result.add(new User(rs.getString(2),
                        rs.getString(3),rs.getString(4),"",345678,Role.Pokupatel));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  result;
    }

}
