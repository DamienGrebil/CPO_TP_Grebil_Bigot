/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_lightoff;

/**
 *
 * @author damie
 */
public class CelluleLumineuse {
    private Boolean etat;
    
    public CelluleLumineuse(){//initialise l'etat de la cellule à éteint
        this.etat=false;
    }
    
    public void activerCellule(){//inverser l'etat de la cellule
        if(etat==false){
            this.etat=true;
        }else{
            this.etat=false;
        }
    }
    
    public void eteindreCellule(){//etient la cellule
        if(etat==true){
            this.etat=false; 
        }
    }
    
    public Boolean estEteint(){//dit si la cellule est eteinte
        if(etat==true){
            return false;
        }else{
            return true;
        }
    }
    
    public Boolean getEtat(){//donne l'etat de la cellule
        if(etat==true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {//permet de savoir si la cellule est allumée ou eteinte
        if (etat==true){
            return "X";
        }else{
            return"O";     
        }
    }
    
     
}