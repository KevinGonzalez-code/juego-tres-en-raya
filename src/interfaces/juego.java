package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Kevin
 */
public class juego extends javax.swing.JFrame {

//la matriz casillas sirve para llevar el recuento de click en el tres en raya    
    private boolean casillas[][] = new boolean[3][3];
    
//la variable turno que se ira asignado a cada jugador
    private String turno = "usuario1";
    
//la matriz turno para saber que jugador a hecho click sobre el boton
    //jugador1 = 1;   jugardor2 = 2; la matriz solo almacenara los numeros 1 y 2
    private int turnos[][] = new int[3][3];
    
//Declaramos las variables usuarios para almacenar los valores que nos llegan por parametro
//desde la ventana entradaJuego
    private String usuario1, usuario2;
    
//Esta variable llevaran el recuento de las veces que ha ganado cada jugador y los empates
    private int vecesGanador1 = 0, vecesGanador2 = 0, vecesEmpate = 0;

    public juego(String usuario1, String usuario2) {
       
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        setLocationRelativeTo(null);
        llenarCasillas();
        inicializarTurnos();
    }
    
    //Este metodo sirve para comprobar cual de los dos jugadores es el ganador
    // o si habiado un empate

    private void comprobarGanador() {
        
        //Inicializamos las varibles a false
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;

        //Llamamos al metodo comprobar, que se va a encargar determinar si se ha hecho 3 en raya
        // si es asi devolvera el valor booleano true
        ganador1 = comprobar(1);
        ganador2 = comprobar(2);
        
        //Al devolver true entrara en uno de los if o si habido un empate en el else

        if (ganador1 == true) {
            //Le añade una victoria al jugador1
            vecesGanador1++;            
            ventanaGanador ventanaG = new ventanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            //Se crea una nueva ventana y se hace visible, que le dira al usuario que ha ganado
            //la partida dandole opcion de volver a jugar o abandonar el juego
            
            //Este metodo se encarga de reiniciar el juego
            reiniciarJuego();
            
        } else if (ganador2 == true) {
            //Le añade una victoria al jugador1
            vecesGanador2++;
            ventanaGanador ventanaG = new ventanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            //Se crea una nueva ventana y se hace visible, que le dira al usuario que ha ganado
            //la partida dandole opcion de volver a jugar o abandonar el juego
            
            //Este metodo se encarga de reiniciar el juego
            reiniciarJuego();
            
            //Hago un doble bucle for para recorrer la matriz
            //la matriz turnos la inicializo en 0, y recordamos que
            //solo debe de haber 1 o 2 entonces si es diferente de 0 
            //significa que la matriz esta llena por lo tanto hay un empate
        } else { 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (turnos[i][j] != 0) {
                        //Le va sumando uno por cada celda que no contine un 1 o 2
                        casillasEmpate++;
                    }
                }
            }
        }        
        //Para despues comprobar que efectivamente hay un empate 
        if (casillasEmpate == 9) {
            //Sumamos 1 al contador de empates
            vecesEmpate++;
            
            //Abrimos una ventana diciendole al jugador que habido un empate
            ventanaEmpate ventanaE = new ventanaEmpate(this, true);
            ventanaE.setVisible(true);            
            //Reiniciamos el juego
            reiniciarJuego();
        }

    }
    
//Este metodo se encarga de comprobar si un jugador a hecho 3 en raya
//pasandole por parametro un numero en caso del jugador1 un 1 y en el caso 
// del jugador2 un 2
    
    public boolean comprobar(int numero) {
        boolean ganador = false;

        if (turnos[0][0] == numero && turnos[0][1] == numero && turnos[0][2] == numero) {
            ganador = true;
        } else if (turnos[1][0] == numero && turnos[1][1] == numero && turnos[1][2] == numero) {
            ganador = true;
        } else if (turnos[2][0] == numero && turnos[2][1] == numero && turnos[2][2] == numero) {
            ganador = true;
        } else if (turnos[0][0] == numero && turnos[1][0] == numero && turnos[2][0] == numero) {
            ganador = true;
        } else if (turnos[0][1] == numero && turnos[1][1] == numero && turnos[2][1] == numero) {
            ganador = true;
        } else if (turnos[0][2] == numero && turnos[1][2] == numero && turnos[2][2] == numero) {
            ganador = true;
        } else if (turnos[0][0] == numero && turnos[1][1] == numero && turnos[2][2] == numero) {
            ganador = true;
        } else if (turnos[0][2] == numero && turnos[1][1] == numero && turnos[2][0] == numero) {
            ganador = true;
        }

        return ganador;
    }

    private void llenarCasillas() {
        /*
        Inicializo toda la matriz en true para que una vez hecho click en un boton
        su valor sea false, y asi no permitimos que se pueda dar click varias veces
        y cambiar la imagen
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = true;
            }
        }
    }

    private void inicializarTurnos() {
        /*
        Inicializo toda la matriz en 0 para que pueda llevar un control
        del usuario que ha ganado.
        El jugador1 tendra como referencia el numero 1
        El jugador2 tendra como referencia el numero 2
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                turnos[i][j] = 0;
            }
        }
    }

    //Se encargar de dibujar la imagen de la X del tres en raya
    //en el boton pasado por parametro insertando la imagen en el boton
    
    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Img/x.png")));
    }

    
    //Se encargar de dibujar la imagen de la O del tres en raya
     //en el boton pasado por parametro insertando la imagen en el boton
    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Img/o.png")));
    }

    
    //Este metodo se encarga de reiniciar el juego que lo que hace basicamente
    // es dejar las casillas por defecto igual que cuando se abre el juego por primera vez
    private void reiniciarJuego() {
        llenarCasillas();
        inicializarTurnos();

        //Por defecto el usuario1 siempre empieza jugando
        turno = "usuario1";

        jbArribaIzq.setIcon(null);
        jbArribaCentro.setIcon(null);
        jbArribaDerch.setIcon(null);
        jbMedioIzq.setIcon(null);
        jbCentro.setIcon(null);
        jbMedioDerch.setIcon(null);
        jbAbajoIzq.setIcon(null);
        jbAbajoDerch.setIcon(null);
        jbMedioAbajo.setIcon(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbArribaIzq = new javax.swing.JButton();
        jbArribaCentro = new javax.swing.JButton();
        jbArribaDerch = new javax.swing.JButton();
        jbMedioIzq = new javax.swing.JButton();
        jbCentro = new javax.swing.JButton();
        jbMedioDerch = new javax.swing.JButton();
        jbAbajoIzq = new javax.swing.JButton();
        jbMedioAbajo = new javax.swing.JButton();
        jbAbajoDerch = new javax.swing.JButton();
        jMenu = new javax.swing.JMenuBar();
        jmJuego = new javax.swing.JMenu();
        jmComenzarNuevo = new javax.swing.JMenuItem();
        jmTablaResultado = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jbArribaIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArribaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArribaIzqActionPerformed(evt);
            }
        });
        jPanel1.add(jbArribaIzq);

        jbArribaCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArribaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArribaCentroActionPerformed(evt);
            }
        });
        jPanel1.add(jbArribaCentro);

        jbArribaDerch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArribaDerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArribaDerchActionPerformed(evt);
            }
        });
        jPanel1.add(jbArribaDerch);

        jbMedioIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMedioIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMedioIzqActionPerformed(evt);
            }
        });
        jPanel1.add(jbMedioIzq);

        jbCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCentroActionPerformed(evt);
            }
        });
        jPanel1.add(jbCentro);

        jbMedioDerch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMedioDerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMedioDerchActionPerformed(evt);
            }
        });
        jPanel1.add(jbMedioDerch);

        jbAbajoIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAbajoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbajoIzqActionPerformed(evt);
            }
        });
        jPanel1.add(jbAbajoIzq);

        jbMedioAbajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMedioAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMedioAbajoActionPerformed(evt);
            }
        });
        jPanel1.add(jbMedioAbajo);

        jbAbajoDerch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAbajoDerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbajoDerchActionPerformed(evt);
            }
        });
        jPanel1.add(jbAbajoDerch);

        jmJuego.setText("Juego");
        jmJuego.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        jmComenzarNuevo.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jmComenzarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reintentar.png"))); // NOI18N
        jmComenzarNuevo.setText("Comenzar de nuevo");
        jmComenzarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComenzarNuevoActionPerformed(evt);
            }
        });
        jmJuego.add(jmComenzarNuevo);

        jmTablaResultado.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jmTablaResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tabla.png"))); // NOI18N
        jmTablaResultado.setText("Mostrar tabla de resultados");
        jmTablaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTablaResultadoActionPerformed(evt);
            }
        });
        jmJuego.add(jmTablaResultado);
        jmJuego.add(jSeparator1);

        jmSalir.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir.png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmJuego.add(jmSalir);

        jMenu.add(jmJuego);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cuando pulsamo en el boton del menu que pone comenzar de nuevo reinicia el juego
    //pero ademas deja los marcadores a 0
    
    private void jmComenzarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComenzarNuevoActionPerformed
        vecesGanador1 = 0;
        vecesGanador2 = 0;
        vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_jmComenzarNuevoActionPerformed

    //Cierra el juego al pulsar al salir en la barra de men
    
    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    
    
    private void jbCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCentroActionPerformed

        if (casillas[1][1] == true) { //Comprobamos si esta marcada la casilla
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbCentro);
                turnos[1][1] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbCentro);
                turnos[1][1] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[1][1] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();

    }//GEN-LAST:event_jbCentroActionPerformed

    private void jbArribaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArribaIzqActionPerformed

        if (casillas[0][0] == true) { //Comprobamos si esta marcada la casilla
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbArribaIzq);
                turnos[0][0] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbArribaIzq);
                turnos[0][0] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1

            }
        }

        casillas[0][0] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbArribaIzqActionPerformed

    private void jbArribaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArribaCentroActionPerformed

        if (casillas[0][1] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbArribaCentro);
                turnos[0][1] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbArribaCentro);
                turnos[0][1] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[0][1] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbArribaCentroActionPerformed

    private void jbArribaDerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArribaDerchActionPerformed

        if (casillas[0][2] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbArribaDerch);
                turnos[0][2] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbArribaDerch);
                turnos[0][2] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[0][2] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbArribaDerchActionPerformed

    private void jbMedioIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMedioIzqActionPerformed

        if (casillas[1][0] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbMedioIzq);
                turnos[1][0] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbMedioIzq);
                turnos[1][0] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[1][0] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbMedioIzqActionPerformed

    private void jbMedioDerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMedioDerchActionPerformed

        if (casillas[1][2] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbMedioDerch);
                turno = "usuario2"; //Pasamos el turno al usuario2
                turnos[1][2] = 1;
            } else {//usuario2
                dibujarO(jbMedioDerch);
                turnos[1][2] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[1][2] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbMedioDerchActionPerformed

    private void jbAbajoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbajoIzqActionPerformed

        if (casillas[2][0] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbAbajoIzq);
                turnos[2][0] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbAbajoIzq);
                turnos[2][0] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[2][0] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbAbajoIzqActionPerformed

    private void jbMedioAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMedioAbajoActionPerformed
        if (casillas[2][1] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbMedioAbajo);
                turnos[2][1] = 1;
                turno = "usuario2"; //Pasamos el turno al usuario2
            } else {//usuario2
                dibujarO(jbMedioAbajo);
                turnos[2][1] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[2][1] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbMedioAbajoActionPerformed

    private void jbAbajoDerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbajoDerchActionPerformed
        if (casillas[2][2] == true) { //Comprobamos si esta marcada la casilla            
            if (turno.equals("usuario1")) { //Comprobamos el usuario que tiene el turno
                dibujarX(jbAbajoDerch);
                turno = "usuario2"; //Pasamos el turno al usuario2
                turnos[2][2] = 1;
            } else {//usuario2
                dibujarO(jbAbajoDerch);
                turnos[2][2] = 2;
                turno = "usuario1"; //Pasamos el turno al usuario1
            }
        }

        casillas[2][2] = false; //Dejamos la casilla marcada para que no se pueda cambiar la imagen
        comprobarGanador();
    }//GEN-LAST:event_jbAbajoDerchActionPerformed

    //Se encarga de abrir una nueva ventana que mostrara una tabla con los marcadores
    // de los jugadores
    private void jmTablaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTablaResultadoActionPerformed
        //Al crear la ventana le paso por parametros los usuarios que me hacen falta en el modelo de la tabla
        // y los contadores de las veces que ha ganado cada usuario y los empates
        ventanaResultados ventanaR = new ventanaResultados(this, true, usuario1, usuario2, vecesGanador1, vecesGanador2, vecesEmpate);
        ventanaR.setVisible(true);
    }//GEN-LAST:event_jmTablaResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbAbajoDerch;
    private javax.swing.JButton jbAbajoIzq;
    private javax.swing.JButton jbArribaCentro;
    private javax.swing.JButton jbArribaDerch;
    private javax.swing.JButton jbArribaIzq;
    private javax.swing.JButton jbCentro;
    private javax.swing.JButton jbMedioAbajo;
    private javax.swing.JButton jbMedioDerch;
    private javax.swing.JButton jbMedioIzq;
    private javax.swing.JMenuItem jmComenzarNuevo;
    private javax.swing.JMenu jmJuego;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JMenuItem jmTablaResultado;
    // End of variables declaration//GEN-END:variables
}
