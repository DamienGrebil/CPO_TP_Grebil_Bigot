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
        CelluleLumineuse [][]matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        
        for (int i=0 ; i < nbLignes; i++ ){
            for (int j=0 ; j < nbColonnes; j++ ){
                matriceCellules[i][j] = new CelluleLumineuse(); 
            }
        }
    }
    // crée un matrice de taille à définir 
    
    public void eteindreToutesLesCellules(){// passe toutes les cellules en état éteint
        for (int i=0 ; i < nbLignes; i++ ){
            for (int j=0 ; j < nbColonnes; j++ ){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }   
    
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random random = new Random();
        int choix = random.nextInt(3);// choisit aléatoirement entre activer une ligne, une colonne ou la diagonale 
        
        switch(choix){
            case 0: // Active une ligne aléatoire
                int ligne = random.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j]. activerCellule();
                }
                break;

            case 1: // Active une colonne aléatoire
                int colonne = random.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne]. activerCellule();
                }
                break;
            
            case 2: // Active une des deux diagonale aléatoirement   
                int diag = random.nextInt(2);
                if (diag ==1) {
                    for (int i=0 ; i < nbLignes; i++ ){
                        matriceCellules[i][i].activerCellule();
                    }       
                }else{
                    for (int i=0 ; i < nbLignes; i++ ){
                        for (int j=0 ; j < nbColonnes; j++ ){
                            matriceCellules[i][nbColonnes-j].activerCellule();
                        }
                    }
                }
                break;
            }   
        
        }
    }  

    public melangerMatriceAleatoirement(int nbTours){
        int nbtours;
        matriceCellules[][].eteindreToutesLesCellules();
        for (int i=0; i<nbtours;i++){
            matriceCellules[][].activerLigneColonneOuDiagonaleAleatoire();
        }
    
    
    }
}
    
