/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpheritageinterface.model;

/**
 *
 * @author hp
 */
public abstract class Personne implements IPersonne{
    String nom;
    String prenom;
    String contact;

    public Personne(String nom, String prenom, String contact) {
        this.nom = nom;
        this.prenom = prenom;
        this.contact = contact;
    }

    public Personne() {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", contact=" + contact + '}';
    }
    
    
}
