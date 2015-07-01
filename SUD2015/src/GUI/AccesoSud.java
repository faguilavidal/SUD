package GUI;

import java.awt.event.KeyEvent;

public class AccesoSud extends javax.swing.JFrame {
    
    public AccesoSud() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jlblUser = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jlblContraseña = new javax.swing.JLabel();
        jpwContraseña = new javax.swing.JPasswordField();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jlblEstadoAcceso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 153));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(400, 369));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galaxy-wallpapers-10.png"))); // NOI18N

        jlblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUser.setForeground(new java.awt.Color(255, 255, 255));
        jlblUser.setText("Usuario");

        jtxtUser.setBackground(new java.awt.Color(0, 0, 0));
        jtxtUser.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUserFocusGained(evt);
            }
        });
        jtxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUserKeyTyped(evt);
            }
        });

        jlblContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlblContraseña.setText("Contraseña");

        jpwContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jpwContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jpwContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwContraseñaFocusGained(evt);
            }
        });
        jpwContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpwContraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwContraseñaKeyTyped(evt);
            }
        });

        jbtnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_24x24_1.png"))); // NOI18N
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });
        jbtnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAceptarKeyPressed(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel3232.png"))); // NOI18N
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/donramon3232.jpg"))); // NOI18N
        jButton1.setText("Crear Nuevo Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblEstadoAcceso.setForeground(new java.awt.Color(255, 255, 0));
        jlblEstadoAcceso.setText("  ");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jlblUser)
                        .addGap(4, 4, 4)
                        .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jlblContraseña)
                                .addGap(4, 4, 4)
                                .addComponent(jpwContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblEstadoAcceso)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblUser)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblContraseña)
                    .addComponent(jpwContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEstadoAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoAcceso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUserKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtUser.getText().length() == 20)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtUserKeyTyped

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        validarAcceso();
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jtxtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUserFocusGained
        jlblEstadoAcceso.setText("");
        this.jtxtUser.selectAll();
    }//GEN-LAST:event_jtxtUserFocusGained

    private void jpwContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwContraseñaFocusGained
        jlblEstadoAcceso.setText("");
        this.jpwContraseña.selectAll();
    }//GEN-LAST:event_jpwContraseñaFocusGained

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new RegistroUsuario().configAccesoRegistro();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jpwContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwContraseñaKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
    }//GEN-LAST:event_jpwContraseñaKeyPressed

    private void jbtnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAceptarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
    }//GEN-LAST:event_jbtnAceptarKeyPressed

    private void jpwContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwContraseñaKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwContraseña.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwContraseñaKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jtxtUser.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void validarAcceso(){
        String Usuario = jtxtUser.getText();
            char[] pwEntregada = jpwContraseña.getPassword();
            String passEntregada = new String(pwEntregada);
            BLL.Usuario u = new BLL.Usuario().buscarUser(Usuario);
            if(u != null)
            {
                String passDataBase = u.getContraseña();
                if (passEntregada.equals(passDataBase)) 
                {
                    ControlIngreso c = new ControlIngreso();
                    c.configControlSudFrame();
                    this.setVisible(false);
                }
                else{this.jlblEstadoAcceso.setText("su Contraseña no es Valida");}    
            }       
            else{this.jlblEstadoAcceso.setText("Usuario no Existe");}
    }
    
    public static void configAccesoSud(){
        AccesoSud a = new AccesoSud();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setTitle("Acceso SUD");
        a.jtxtUser.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(AccesoSud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoSud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoSud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoSud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccesoSud a = new AccesoSud();
                a.setVisible(true);
                a.setLocationRelativeTo(null);
                a.setTitle("Acceso SUD");
                a.jtxtUser.requestFocus();
                configAccesoSud();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblEstadoAcceso;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JPasswordField jpwContraseña;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
