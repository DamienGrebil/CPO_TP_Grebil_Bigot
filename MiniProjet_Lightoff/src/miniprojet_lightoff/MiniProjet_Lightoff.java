/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojet_lightoff;

/**
 *
 * @author damie
 */
public class MiniProjet_Lightoff {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        //GrilleDeJeu grille = new GrilleDeJeu(3, 3);
        //System.out.println(grille.toString());
        Partie parti= new Partie() ;
        parti.initialiserPartie();
        parti.lancerPartie();
        
    }
    
}
