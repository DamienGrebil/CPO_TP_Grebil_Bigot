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
        Scanner sc=new Scanner(System.in);
        initialiserPartie();
        while(grille.cellulesToutesEteintes()!=true){
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