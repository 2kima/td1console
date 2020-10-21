/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpheritageinterface.model;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Employe extends Personne {

    Scanner sc = new Scanner(System.in);
    Employe[] employes;
    int tailleEmploye = 0;
    private String getNom;

    public Employe() {
    }

    public Employe(String nom, String prenom, String contact) {
        super(nom, prenom, contact);
    }

    @Override
    public void ajouter() {

        do {

            System.out.println("entrer le nombre d'employe");
            tailleEmploye = sc.nextInt();

        } while (tailleEmploye <= 0);
        sc.nextLine();

        employes = new Employe[tailleEmploye];

        String nom = "";
        String prenom = "";
        String contact = "";

        for (int i = 0; i < employes.length; i++) {
            do {

                System.out.println("entrer le nom" + i);
                nom = sc.nextLine();
                System.out.println("entrer le nom dans la table " + i + "svp");
            } while (nom.isEmpty());
            do {

                System.out.println("entrer le prenom" + i);
                prenom = sc.nextLine();
                System.out.println("enter le prenom dans la table" + i + "svp");
            } while (prenom.isEmpty());

            do {
                System.out.println("entrer le contact" + i);
                contact = sc.nextLine();
                System.out.println("entrer le contact dans la table" + i + "svp");

            } while (contact.isEmpty());

            Employe employe = new Employe(nom, prenom, contact);
            employes[i] = employe;
        }

    }

    @Override
    public void modifier(int index) {
        Employe employe = null;
        for (int i = 0; i < employes.length; i++) {
            if (employes[i].equals(index)) {

                do {

                    System.out.println("entrer le nouveau nom" + i);
                    nom = sc.nextLine();
                } while (nom.isEmpty());
                do {

                    System.out.println("entrer le nouveau prenom" + i);
                    prenom = sc.nextLine();
                } while (prenom.isEmpty());

                do {
                    System.out.println("entrer le nouveau contact" + i);
                    contact = sc.nextLine();
                } while (contact.isEmpty());

                employe = new Employe(nom, prenom, contact);
                employes[i] = employe;
            }
        }

    }


    @Override
    public void supprimer(int index) {
//        Employe[] newList = new Employe[employes.length - 1]; 
           Employe[] newList = null; 
        for (int i = 0; i < employes.length; i++) {

            if (index==i) {
                Employe employe = employes[index];
                for (int j = 0; j < employes.length-1; j++) {
                    employes[i] = employes[i +1];
                    i++;
                }
//                newList[j] = employes[i];
            }
        }
        newList = Arrays.copyOf(employes, employes.length-1);
        System.out.println(Arrays.toString(newList));
//        employes = newList;
//        for (int i = 0; i < employes.length; i++) {
//            Employe employe = employes[i];
//            System.out.println(employe.getNom()+ " "+ employe.getPrenom()+ " "+ employe.getContact());
//        }
    }
    
    
    @Override
    public void afficher() {
        for (int i = 0; i < employes.length; i++) {
            Employe employe = employes[i];
            System.out.println(employe.toString());

        }

    }

}
