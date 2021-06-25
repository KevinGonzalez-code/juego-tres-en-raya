
package interfaces;

/**
 *
 * @author Kevin
 */
public class ventanaGanador extends javax.swing.JDialog {

    private String usuario;
    
    public ventanaGanador(java.awt.Frame parent, boolean modal,String usuario) {
        super(parent, modal);
        this.usuario=usuario;
        initComponents();
        setLocationRelativeTo(null);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSi = new javax.swing.JButton();
        jbAbandonar = new javax.swing.JButton();
        txtFelicitaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ganador.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Quieres intentarlo de nuevo?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 664, 60));

        jbSi.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jbSi.setText("Si");
        jbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiActionPerformed(evt);
            }
        });
        jPanel1.add(jbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 110, 30));

        jbAbandonar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jbAbandonar.setText("Abandonar");
        jbAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbandonarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAbandonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 110, 30));

        txtFelicitaciones.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        txtFelicitaciones.setForeground(new java.awt.Color(0, 51, 51));
        txtFelicitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFelicitaciones.setText("Felicidades "+usuario);
        jPanel1.add(txtFelicitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 680, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Cierra el juego
    private void jbAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbandonarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbAbandonarActionPerformed

    //Esconde la ventana y permite volver al juego
    private void jbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiActionPerformed
        dispose();
    }//GEN-LAST:event_jbSiActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaGanador dialog = new ventanaGanador(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAbandonar;
    private javax.swing.JButton jbSi;
    private javax.swing.JLabel txtFelicitaciones;
    // End of variables declaration//GEN-END:variables
}
