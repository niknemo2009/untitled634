/**
 * Created by admin on 17.07.2015.
 */
import java.lang.String;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Саша
 */
public class My_conn {
    private String url;
    private String driver;
    private Connection con;
    My_conn(String driver,String url){
        this.driver=driver;
        this.url=url;

        try {
            Class.forName(this.driver).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(My_conn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Driver loading success!");
        try {
            this.con = DriverManager.getConnection(this.url,"yura","yura");
        } catch (SQLException ex) {
            Logger.getLogger(My_conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }/**
     * @param args the command line arguments/**
     * @param args the command line arguments
     */

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }


    public static void main(String[] args) throws SQLException {
       //  My_conn test=new My_conn("org.sqlite.JDBC","jdbc:sqlite:d:\\111\\Phone_Spravochnik.db");
        My_conn test=new My_conn("com.mysql.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8");



        Connection con1=test.con;
        Statement  stmt=con1.createStatement();
        ResultSet  rs=stmt.executeQuery("select * from User");
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
   }

}
