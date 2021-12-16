/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnectivity {

    Connection con;
    Statement st;
    public ResultSet rs;

    public DatabaseConnectivity() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/biblioteca", "root", "enelreino11");

            st = con.createStatement();

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    public DatabaseConnectivity(String user, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", user, password);

            st = con.createStatement();

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }

    }

    public ResultSet executeQuery(String Query) {
        try {
            return st.executeQuery(Query);
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean execute(String query) {
        try {
            st.execute(query);
            return true;
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            return false;
        }

    }


}
