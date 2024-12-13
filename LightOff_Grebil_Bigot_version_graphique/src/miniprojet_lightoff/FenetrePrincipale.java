package miniprojet_lightoff;


import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import miniprojet_lightoff.CelluleLumineuse;
import miniprojet_lightoff.GrilleDeJeu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author damie
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    GrilleDeJeu grille;
    int nbCoups;
    GrilleDeJeu m = new GrilleDeJeu(10,10);
    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        PanneaudesLignes.setLayout(new GridLayout(nbLignes, 1));
        for (int i=0; i < nbLignes; i++) {
            CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][1], 36,36);
            PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            CelluleGraphique p =new CelluleGraphique(i,matriceCellules[i][1]);
            p.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(0);
                    repaint();

                }
            });
        }
        PanneaudesColonnes.setLayout(new GridLayout(1, nbColonnes));
        for (int i=0; i < nbColonnes; i++) {
            CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[1][i], 36,36);
            PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            CelluleGraphique p =new CelluleGraphique(i,matriceCellules[1][i]);
            p.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(0);
                    repaint();

                }
            });
        }
        PanneaudesColonnes.setLayout(new GridLayout(1, nbColonnes));
        for (int i=0; i <nbColonnes ; i++) {
            CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[1][i], 36,36);
            PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneaudesLignes = new javax.swing.JPanel();
        Diag = new javax.swing.JPanel();
        btndiag = new javax.swing.JButton();
        PanneaudesColonnes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 242));
        PanneauGrille.setLayout(new java.awt.GridLayout(1, 0));

        PanneaudesLignes.setBackground(new java.awt.Color(242, 242, 2));

        javax.swing.GroupLayout PanneaudesLignesLayout = new javax.swing.GroupLayout(PanneaudesLignes);
        PanneaudesLignes.setLayout(PanneaudesLignesLayout);
        PanneaudesLignesLayout.setHorizontalGroup(
            PanneaudesLignesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneaudesLignesLayout.setVerticalGroup(
            PanneaudesLignesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        Diag.setBackground(new java.awt.Color(242, 2, 242));

        btndiag.setText("jButton1");
        btndiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiagLayout = new javax.swing.GroupLayout(Diag);
        Diag.setLayout(DiagLayout);
        DiagLayout.setHorizontalGroup(
            DiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiagLayout.setVerticalGroup(
            DiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndiag, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        PanneaudesColonnes.setBackground(new java.awt.Color(242, 242, 100));
        PanneaudesColonnes.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Diag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanneaudesLignes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanneauGrille, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(PanneaudesColonnes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(555, 555, 555))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Diag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneaudesColonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanneauGrille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanneaudesLignes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiagActionPerformed
        
    }//GEN-LAST:event_btndiagActionPerformed

    
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }
    
    public class CelluleGraphique extends JButton {
        int largeur; // largeur en pixel de la cellule
        int hauteur; // hauteur en pixel de la cellule
        
        CelluleLumineuse celluleLumineuseAssociee; 
        
        // constructeur (appelé depuis FenetrePrincipale)
        public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l,int h) {
            this.largeur = l;
            this.hauteur = h;
            this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        }
        // Methode gérant le dessin de la cellule 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            this.setText(celluleLumineuseAssociee.toString());
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Diag;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel PanneaudesColonnes;
    private javax.swing.JPanel PanneaudesLignes;
    private javax.swing.JButton btndiag;
    // End of variables declaration//GEN-END:variables
}
