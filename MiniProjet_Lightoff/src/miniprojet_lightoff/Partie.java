/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightoff;

/**
 *
 * @author etane
 */
public class Partie {
    private GrilleDeJeu grille;
    int nbCoups;

    public Partie(){
        grille=new GrilleDeJeu(6,6);
        this.nbCoups=0;
    }
    
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(10);
        this.nbCoups=0;  
    }
    
    public void lancerPartie(){
        initialiserPartie();
        while(cellulesToutesEteintes()!=true){
            System.out.println("veuillez saisir la ligne/colonnne/diagonale a inversser");
            //scanner(valeur saisie)
            //activer l/c/diag(utiliser méthode classeGDJ)
            //maj grille
        }
        //afficher nombre de coup
    }
}