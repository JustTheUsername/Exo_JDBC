/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datasave.Eleve;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class EleveDAO extends DAO{
    
    public EleveDAO() {
        super();
    }
    
    @Override
    public boolean creer(Object obj) {
        return false;
    }

    @Override
    public boolean supprimer(Object obj) {
        return false;
    }

    @Override
    public ArrayList getAll() {
        
        ArrayList<Eleve> listeEleve = new ArrayList<>();
        
    if(this.bddmanager.connect())
    {
            try {
                
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM eleves";
                ResultSet rs = st.executeQuery(requete);
            
                while(rs.next()){
                    Eleve el = new Eleve(rs.getInt("id"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("classe"));
                    listeEleve.add(el);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return listeEleve;
            }
        
        
    }
    return listeEleve;
    }

    @Override
    public Object get(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
