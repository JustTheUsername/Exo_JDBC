/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdddelamour;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Formation
 */
public class LaBDDdeLamour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            final String DB_URL="jdbc:mysql://localhost:3306/school";
        final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_USER = "school";
        final String DB_PASSWORD="azerty";
   
        try {

       
            Class.forName(DB_JDBC_DRIVER);
            
            Connection cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            Statement st =cn.createStatement();
            
            String requete = "SELECT nom,test.equipe,job.description FROM equipe JOIN test ON equipe.nom_equipe= test.equipe JOIN job ON equipe.job=job.id ";
            ResultSet rs = st.executeQuery(requete);
           /* 
            requete = "INSERT INTO test (nom,prenom,age) VALUES (?,?,?)";
            PreparedStatement pst = cn.prepareStatement(requete);
            pst.setString(1,"Charles");
            pst.setString(2, "Condom");
            pst.setInt(3, 70);
            
            pst.executeUpdate();
            pst.setString(1,"André");
            pst.setString(2, "Salami");
            pst.setInt(3, 87);
            

            pst.executeUpdate();
            */
            
            while(rs.next()){
            
                System.out.println(rs.getString("nom") + "    " + rs.getString("test.equipe")+"    "+rs.getString("job.description"));
                
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            
           ex.printStackTrace();
            
        } catch (SQLException ex) {
            Logger.getLogger(LaBDDdeLamour.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
