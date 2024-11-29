/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightoff;

import java.util.Random;

/**
 *
 * @author damie
 */
public class GrilleDeJeu {

    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        CelluleLumineuse[][] matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    // crée un matrice de taille à définir 

    public void eteindreToutesLesCellules() {// passe toutes les cellules en état éteint
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);// choisit aléatoirement entre activer une ligne, une colonne ou la diagonale 

        switch (choix) {
            case 0: // Active une ligne aléatoire
                int ligne = random.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].activerCellule();
                }
                break;

            case 1: // Active une colonne aléatoire
                int colonne = random.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
                break;

            case 2: // Active une des deux diagonale aléatoirement   
                int diag = random.nextInt(2);
                if (diag == 1) {
                    for (int i = 0; i < nbLignes; i++) {
                        matriceCellules[i][i].activerCellule();
                    }
                } else {
                    for (int i = 0; i < nbLignes; i++) {
                        for (int j = 0; j < nbColonnes; j++) {
                            matriceCellules[i][nbColonnes - j].activerCellule();
                        }
                    }
                }
                break;
        }

    }


    public void melangerMatriceAleatoirement(int nbTours){//sert a effectuer un certain nombre de fois une activation pour melanger la matrice
        int nbtours=0;
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbtours;i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    public void  activerLigneDeCellules(int idLigne){//Active une ligne choisit
        for (int i=0; i<nbColonnes;i++){
            matriceCellules[idLigne][i].activerCellule();
        }
    }
    
    public void activerColonneDeCellules(int idColonne){//Active une Colonne choisit
        for (int i=0; i<nbLignes;i++){
            matriceCellules[idColonne][i].activerCellule();
        }
    }
    
    public void activerDiagonaleDescendante(){//Active la diagonale descendante
        for (int i=0; i<nbLignes;i++){
            matriceCellules[i][i].activerCellule();
        }
    }
    
    public void activerDiagonaleMontante(){//Active la diagonale montante
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][nbColonnes - j].activerCellule();
            }
        }
    }
    
    public Boolean cellulesToutesEteintes() {//dis si le toutes les cellules sont éteintes ou non
    boolean eteint =true;
        for (int i=0 ; i < nbLignes; i++ ){
            for (int j=0 ; j < nbColonnes; j++ ){
                if (matriceCellules[i][j].getEtat() == true){
                    eteint = false;
                }
            }
        }
    return eteint;
    }

    @Override
    public String toString() {
        // Affiche les indices des colonnes avec un alignement
        System.out.print("     "); // Espacement initial pour aligner avec les indices de ligne
        for (int j = 0; j < nbColonnes; j++) {
            System.out.printf("%3d ", j); // Indices des colonnes, formatés pour alignement
        }
        System.out.println();

        // Affiche une ligne de séparation initiale
        System.out.print("   +");
        for (int j = 0; j < nbColonnes; j++) {
            System.out.print("---+");
        }
        System.out.println();

        // Affiche chaque ligne de la grille
        for (int i = 0; i < nbLignes; i++) {
            // Affiche l'indice de la ligne
            System.out.printf("%3d |", i);
            // Affiche les cellules de la ligne
            for (int j = 0; j < nbColonnes; j++) {
                System.out.printf(" %s |", matriceCellules[i][j].isActive() ? "X" : "O");
            }
            System.out.println(); // Retour à la ligne après une ligne de données

            // Affiche une ligne de séparation après chaque ligne
            System.out.print("   +");
            for (int j = 0; j < nbColonnes; j++) {
                System.out.print("---+");
            }
            System.out.println();
        }
        return toString();
    }




}

