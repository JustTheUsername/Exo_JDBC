/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdddelamour;

import bddsql.ConnectionBDD;
import datasave.Eleve;
import java.sql.*;
import java.util.ArrayList;
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

     ConnectionBDD maBDD = ConnectionBDD.getInstance();
     boolean testConnection = maBDD.connect();
     ArrayList<Eleve> listeEleve = new ArrayList <>();
        try {
            
            Statement st = maBDD.getConnectionManager().createStatement();
//            String requete = "Select * FROM Eleves JOIN classes ON eleves.classe = classes.id WHERE classes.nom = \"terminale\"";
            String requete ="SELECT * FROM Eleves ORDER BY nom";
            ResultSet rs = st.executeQuery(requete);
            
            while(rs.next()){
            
                Eleve paul = new Eleve(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("classe"));
//                System.out.println("N° étudiant "+ rs.getInt("id") + " -> " +rs.getString("nom")
//                +" "+rs.getString("prenom"));
                listeEleve.add(paul);
                System.out.println(paul.getNom());
                
               
            } System.out.println("Nombre d'élève dans cette école : "+ listeEleve.size());
            System.out.println("Le nom de l'élève 92 est :" + listeEleve.get(91).getPrenom());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
