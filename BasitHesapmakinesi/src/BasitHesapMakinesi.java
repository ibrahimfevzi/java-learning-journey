/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ibrahimkayan
 */
public class BasitHesapMakinesi extends javax.swing.JFrame {

    private int say = 0;
    
    /**
     * Creates new form BasitHesapMakinesi
     */
    public BasitHesapMakinesi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arti = new javax.swing.JButton();
        eksi = new javax.swing.JButton();
        çarpı = new javax.swing.JButton();
        bölü = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        birinci_sayi = new javax.swing.JTextField();
        ikinci_sayi = new javax.swing.JTextField();
        sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arti.setText("+");
        arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artiActionPerformed(evt);
            }
        });

        eksi.setText("-");
        eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksiActionPerformed(evt);
            }
        });

        çarpı.setText("x");
        çarpı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çarpıActionPerformed(evt);
            }
        });

        bölü.setText("/");
        bölü.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bölüActionPerformed(evt);
            }
        });

        jLabel1.setText("Birinci Sayı :");

        jLabel2.setText("İkinci Sayı :");

        jLabel3.setText("Sonuç : ");

        ikinci_sayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikinci_sayiActionPerformed(evt);
            }
        });

        sonuc.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birinci_sayi)
                            .addComponent(ikinci_sayi)
                            .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arti, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(çarpı, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bölü, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ikinci_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(çarpı, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bölü, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ikinci_sayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikinci_sayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ikinci_sayiActionPerformed

    private void artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artiActionPerformed
       
        int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi + ikinci_sayi));
        
        
        
    }//GEN-LAST:event_artiActionPerformed

    private void eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksiActionPerformed
         int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi - ikinci_sayi));
    }//GEN-LAST:event_eksiActionPerformed

    private void çarpıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çarpıActionPerformed
        
         int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi * ikinci_sayi));
    }//GEN-LAST:event_çarpıActionPerformed

    private void bölüActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bölüActionPerformed
        
         int birinci_sayi = Integer.valueOf(this.birinci_sayi.getText());
        int ikinci_sayi = Integer.valueOf(this.ikinci_sayi.getText());
        
        sonuc.setText(String.valueOf((double)birinci_sayi / ikinci_sayi));
    }//GEN-LAST:event_bölüActionPerformed

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
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasitHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arti;
    private javax.swing.JTextField birinci_sayi;
    private javax.swing.JButton bölü;
    private javax.swing.JButton eksi;
    private javax.swing.JTextField ikinci_sayi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton çarpı;
    // End of variables declaration//GEN-END:variables
}