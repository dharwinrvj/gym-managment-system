/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author dharwin
 */
public class DbConnection {

    public static Connection getCon() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:gym.db");
            return con;
        } catch (Exception e) {
            return null;
        }
    }

}
