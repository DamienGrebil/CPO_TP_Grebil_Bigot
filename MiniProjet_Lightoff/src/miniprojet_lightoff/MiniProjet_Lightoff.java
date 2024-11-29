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
        CelluleLumineuse cel1=new CelluleLumineuse();
        System.out.println(cel1.toString());
        cel1.activerCellule();
        System.out.println(cel1.toString());
        cel1.eteindreCellule();
        System.out.println(cel1.toString());    
        
    }
    
}
