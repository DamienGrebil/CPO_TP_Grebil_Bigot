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
    
    public CelluleLumineuse(){
        this.etat=false;
    }
    
    public void activerCellule(){
        if(etat==false){
            this.etat=true;
        }else{
            this.etat=false;
        }
    }
    
    public void eteindreCellule(){
        if(etat==true){
            this.etat=false; 
        }
    }
    
    public Boolean estEteint(){
        if(etat==true){
            return false;
        }else{
            return true;
        }
    }
    
    public Boolean getEtat(){
        if(etat==true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "CelluleLumineuse{" + "etat=" + etat + '}';
    }
    
     
}