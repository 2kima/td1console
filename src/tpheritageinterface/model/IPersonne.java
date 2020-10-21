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
public interface IPersonne {
    public void ajouter();
    public void modifier(int index);
    public void supprimer(int index);
    public void afficher();
}
