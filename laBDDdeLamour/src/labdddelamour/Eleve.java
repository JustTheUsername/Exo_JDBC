/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdddelamour;

/**
 *
 * @author Formation
 */
public class Eleve {
    int id;
    int classe;
    String nom;
    String prenom;
    
    public Eleve(int id, String nom,String prenom,int classe){
    this.classe = classe;
    this.id = id;
    this.prenom = prenom;
    this.nom = nom;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
}
