package UAS;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Made Artha
 * TGL 17 Mei 2025
 */
public class dbkoneksi {
    static String DB_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_HOST="jdbc:mysql://localhost:3306/db_nilai";
    static String DB_USER="root";
    static String DB_PASSWORD="";

     public static Connection koneksi(){
        try{
            Class.forName(DB_DRIVER);
            return DriverManager.getConnection(DB_HOST, DB_USER, DB_PASSWORD);
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Gagal koneksi ke DBMS MySQL");
        }
        return null;
    }
    
    
    
}