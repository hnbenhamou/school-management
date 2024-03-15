package loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Account {
    private static final String passdb = "Ahsat0ut@";
    private static final String userdb = "root";
    private static final String connDB = "jdbc:mysql://localhost:3306/ecole_db";
    private static Connection sqlConn = null;
    private static  PreparedStatement pst = null;
    private static ResultSet rs = null;
    
    private static final String PASSWORD_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    // Generating random password 
    public static String generatePassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(PASSWORD_CHARS.length());
            password.append(PASSWORD_CHARS.charAt(index));
        }
        return password.toString();
    }
    // Finding Last id_doss and id_etud 
    public static String findLastID(int i) {
       String r=null;
   
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            if (i==1) {
            pst = sqlConn.prepareStatement("select id_doss from dossier order by id_doss desc limit 1");
            
            rs = pst.executeQuery();
            rs.next();
            ResultSetMetaData stData = rs.getMetaData();
            r= rs.getString("id_doss"); 
            }
            else {
            pst = sqlConn.prepareStatement("select id_etud from etudiant order by id_etud desc limit 1");
            
            rs = pst.executeQuery();
            rs.next();
            ResultSetMetaData stData = rs.getMetaData();
            r= rs.getString("id_etud"); 
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return Integer.toString(Integer.parseInt(r)+1); 
    }
       public static String findLastIDLogin() {
       String r=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("select id_login from login order by id_login desc limit 1");
            
            rs = pst.executeQuery();
            rs.next();
            ResultSetMetaData stData = rs.getMetaData();
            r= rs.getString("id_login");

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return Integer.toString(Integer.parseInt(r)+1); 
    }
    // Creating login account for new users
    public static void AccDB(String i, String user, String pass, String type) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("insert into login values(?,?,md5(?),?)");
            pst.setString(1, i);
            pst.setString(2, user);
            pst.setString(3, pass);
            pst.setString(4, type);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "His/her Login is : \n username:"+user+"\npassword:"+pass);
        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    // method to delete login account from our database
    public static void AccDB(String user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst=sqlConn.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            pst.execute();
            pst = sqlConn.prepareStatement("delete from login where username=?");
            pst.setString(1, user);
            pst.executeUpdate();
            pst=sqlConn.prepareStatement("SET FOREIGN_KEY_CHECKS=1");
            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
}
    

