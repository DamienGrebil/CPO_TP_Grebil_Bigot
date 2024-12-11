/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightoff;

import java.util.Scanner;

/**
 *
 * @author etane
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    int limiteCoups;

    public Partie(){
        grille=new GrilleDeJeu(6,6);
        this.nbCoups=0;
    }
    
     public void TailleGrille() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille de la grille : ");
        int largeur = sc.nextInt();
        grille = new GrilleDeJeu(largeur, largeur);
        System.out.println("Grille de taille " + largeur + "x" + largeur + " créée !");
    }
    
     public void NiveauDifficulte() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Choisissez un niveau de difficulté :");
    System.out.println("1 - Facile (aucune limite de coups)");
    System.out.println("2 - Intermédiaire (15 coups max)");
    System.out.println("3 - Difficile (10 coups max)");

    int niveau = sc.nextInt();

    if (niveau == 1) {
        limiteCoups = Integer.MAX_VALUE;
        System.out.println("Vous avez choisi le niveau Facile. Bonne chance !");
    } else if (niveau == 2) {
        limiteCoups = 15; 
        System.out.println("Vous avez choisi le niveau Intermédiaire. Limite : 15 coups.");
    } else if (niveau == 3) {
        limiteCoups = 10; 
        System.out.println("Vous avez choisi le niveau Difficile. Limite : 10 coups.");
    } else {
        limiteCoups = Integer.MAX_VALUE; // Par défaut, aucune limite
        System.out.println("Niveau invalide. Par défaut, le niveau Facile est sélectionné.");
    }
}

     
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(10);
        this.nbCoups=0;  
    }
    
    
    
    public void lancerPartie(){
        Scanner sc=new Scanner(System.in);
        TailleGrille();
        NiveauDifficulte();
        initialiserPartie();
        System.out.println(grille);
        while(grille.cellulesToutesEteintes()!=true){
            if (nbCoups >= limiteCoups) {
                System.out.println("Désolé, vous avez atteint la limite de coups !");
                System.out.println("Partie terminée. Essayez à nouveau !");
                return; // Fin de la méthode, la partie est perdue
            }
            System.out.println("taper 1pour ligne/2 pour colonnne/3 pour diagonale a inversser");
            int a=sc.nextInt();
            if (a==1){
                System.out.println("saisissez le numero de la ligne que vous voulez inverser");
                int b=sc.nextInt();
                grille.activerLigneDeCellules( b);
                nbCoups+=1;
            }else if(a==2){
                System.out.println("saisissez le numero de la colonne que vous voulez inverser"); 
                int b=sc.nextInt();
                grille.activerColonneDeCellules( b);
                nbCoups+=1;
            }else if(a==3){
                System.out.println("appuyer sur 1 pour la diagonale montante et 2 pour la descendante");
                int b=sc.nextInt();
                if(b==1){
                    grille.activerDiagonaleMontante();
                    nbCoups+=1;
                }else if(b==2){
                    grille.activerDiagonaleDescendante();
                    nbCoups+=1;
                }
            }
            System.out.println(grille);
           
        }
        System.out.println("vous avez effectué"+nbCoups+" coups");
    }
}