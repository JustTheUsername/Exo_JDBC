/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddsql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class ConnectionBDD {
   
    private static final String DB_URL="jdbc:mysql://localhost:3306/school";
    private static final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "school";
    private static final String DB_PASSWORD="azerty";
    
    private Connection cn = null;
   
    private ConnectionBDD() {
        
        try {
            
            Class.forName(ConnectionBDD.DB_JDBC_DRIVER);
            
        } catch (ClassNotFoundException ex) {
            
           ex.printStackTrace();
           System.exit(1);
           
        }
        
        
    }
    
    public static ConnectionBDD getInstance() {
        return ConnectionBDDHolder.INSTANCE;
    }
    
    private static class ConnectionBDDHolder {

        private static final ConnectionBDD INSTANCE = new ConnectionBDD();
    }
    
    public boolean connect(){
    // si on a jamais été connecté on se connecte, sinon refresh la connection    
        if(this.cn == null){
        
            try {
                
                this.cn = DriverManager.getConnection(ConnectionBDD.DB_URL, ConnectionBDD.DB_USER, ConnectionBDD.DB_PASSWORD);
            
            } catch (SQLException ex) {
                
                return false;
                
            }
        }
        else{
            
            try {
            
                Statement st = this.cn.createStatement();
                String requete ="SELECT 1";
                st.executeQuery(requete);
            //si ici ca ne marche pas c'est quon est  plus connecté, alors on se reconnecte    
            } catch (SQLException ex) {
                try {
                    
                    this.cn = DriverManager.getConnection(ConnectionBDD.DB_URL, ConnectionBDD.DB_USER, ConnectionBDD.DB_PASSWORD);
                
                } catch (SQLException ex1) {
                    
                    ex1.printStackTrace();
                    return false;
                
                }
            
            }
        
        
        }
    
    return true;
    }
    
    public Connection getConnectionManager(){
    
    return this.cn;
    
    }
}
