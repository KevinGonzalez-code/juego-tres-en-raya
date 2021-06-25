
package interfaces;

/**
 *
 * @author Kevin
 */
public class entradaJuego extends javax.swing.JFrame {

    //Declaro las varibles de los jugadores para almacenar su nick
    private String jugador1;
    private String jugador2;
    
    public entradaJuego() {
        initComponents();
        setLocationRelativeTo(null);
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        asignacionJugador2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreJugador2 = new javax.swing.JTextField();
        txtNombreJugador1 = new javax.swing.JTextField();
        jbAbandonar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        asignacionJugador1 = new javax.swing.JLabel();
        jbJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO AL JUEGO DE TRES EN RAYA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, 90));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grande2.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 310, 300));

        asignacionJugador2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        asignacionJugador2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(asignacionJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 400, 29));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Escribe el nombre del Jugador 1:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 370, 29));

        txtNombreJugador2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtNombreJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNombreJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 210, 40));

        txtNombreJugador1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtNombreJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNombreJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 210, 40));

        jbAbandonar.setBackground(new java.awt.Color(0, 51, 51));
        jbAbandonar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jbAbandonar.setForeground(new java.awt.Color(255, 255, 255));
        jbAbandonar.setText("Abandonar partida");
        jbAbandonar.setBorder(null);
        jbAbandonar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbandonarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAbandonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 210, 50));

        jbGuardar.setBackground(new java.awt.Color(0, 51, 51));
        jbGuardar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(null);
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 210, 30));

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Escribe el nombre del Jugador 2:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 360, 29));

        asignacionJugador1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        asignacionJugador1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(asignacionJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 360, 29));

        jbJugar.setBackground(new java.awt.Color(0, 51, 51));
        jbJugar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jbJugar.setForeground(new java.awt.Color(255, 255, 255));
        jbJugar.setText("Jugar partida");
        jbJugar.setBorder(null);
        jbJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbJugar.setVisible(false);
        jbJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugarActionPerformed(evt);
            }
        });
        jPanel1.add(jbJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbandonarActionPerformed
        //Cerramos el programa
        System.exit(0);
    }//GEN-LAST:event_jbAbandonarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
      //Obtengo los nombres de los usuarios
      jugador1 = txtNombreJugador1.getText();
      jugador2 = txtNombreJugador2.getText();
      
      //Una vez hecho click en el boton de guardar se oculta
      jbGuardar.setVisible(false);
      
      //Y le dice al usuario con que ficha juega cada jugador
      asignacionJugador1.setText(jugador1+" jugará primero con la ficha: X");
      asignacionJugador2.setText(jugador2+" jugará segundo con la ficha: O");
      jbJugar.setVisible(true);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugarActionPerformed
        
      //Se abre una nueva ventana, y le paso como parametro al constructor
      //Los jugadores
      juego vJuego= new juego(jugador1,jugador2);
      vJuego.setVisible(true);
      
      //Esconde la pantalla
      dispose();
    }//GEN-LAST:event_jbJugarActionPerformed

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
            java.util.logging.Logger.getLogger(entradaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entradaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entradaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entradaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entradaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asignacionJugador1;
    private javax.swing.JLabel asignacionJugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAbandonar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbJugar;
    private javax.swing.JTextField txtNombreJugador1;
    private javax.swing.JTextField txtNombreJugador2;
    // End of variables declaration//GEN-END:variables
}
