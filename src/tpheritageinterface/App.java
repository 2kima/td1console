/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpheritageinterface;

import java.util.Scanner;
import tpheritageinterface.model.Employe;

/**
 *
 * @author hp
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO code application logic here
        Employe employe = new Employe();

        int choix;
        int reponse = 1;

        do {

            System.out.println(" 1 - (A): ajouter employe ");
            System.out.println(" 2 - (B): modifier employe ");
            System.out.println(" 3 - (C): supprimer employe");
            System.out.println(" 4 - (C): afficher employe");
            System.out.println("fait votre choix");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    employe.ajouter();
            
                            
                    break;
                case 2:
                    System.out.println("Entrer le numero");
                    int ix = sc.nextInt();
                    employe.modifier(ix);
                    break;
                case 3:
                    System.out.println("Saisir l'index de l'element");
                    int index = sc.nextInt();
                    employe.supprimer(index);
                    break;
                case 4:

                    employe.afficher();
            }
            System.out.println("Voulez vous continuer ");
            System.out.println("1 : oui - 0 : non");
            reponse = sc.nextInt();

        } while (reponse != 0);

    }
}
