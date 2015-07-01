package GUI;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistroUsuario extends javax.swing.JFrame {
    
    public RegistroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jlblNewUser = new javax.swing.JLabel();
        jlblNewPassword = new javax.swing.JLabel();
        jtxtNewUser = new javax.swing.JTextField();
        jpwNewPassword = new javax.swing.JPasswordField();
        jlblConfirmNewPassword = new javax.swing.JLabel();
        jpwConfirmNewPassword = new javax.swing.JPasswordField();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxtRut = new javax.swing.JTextField();
        jlblRut = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jlblEjemploRutContratarEmpleados = new javax.swing.JLabel();
        jlblEstadoContraseña = new javax.swing.JLabel();
        jlblEstadoContraseñasIguales = new javax.swing.JLabel();
        jlblEstadoRut = new javax.swing.JLabel();
        jbtnReestablecerFormulario = new javax.swing.JButton();
        jlblBannerSUD = new javax.swing.JLabel();
        jlblAño = new javax.swing.JLabel();
        jcboAño = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro en NotNull");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 153));

        jlblNewUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNewUser.setForeground(new java.awt.Color(255, 255, 255));
        jlblNewUser.setText("NUEVO USUARIO");

        jlblNewPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblNewPassword.setText("NUEVA CONTRASEÑA");

        jtxtNewUser.setBackground(new java.awt.Color(0, 0, 0));
        jtxtNewUser.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNewUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNewUserFocusGained(evt);
            }
        });
        jtxtNewUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNewUserKeyTyped(evt);
            }
        });

        jpwNewPassword.setBackground(new java.awt.Color(0, 0, 0));
        jpwNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpwNewPasswordFocusLost(evt);
            }
        });
        jpwNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwNewPasswordKeyTyped(evt);
            }
        });

        jlblConfirmNewPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblConfirmNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblConfirmNewPassword.setText("CONFIRM CONTRASEÑA");

        jpwConfirmNewPassword.setBackground(new java.awt.Color(0, 0, 0));
        jpwConfirmNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwConfirmNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwConfirmNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpwConfirmNewPasswordFocusLost(evt);
            }
        });
        jpwConfirmNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwConfirmNewPasswordKeyTyped(evt);
            }
        });

        jbtnRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar2424.png"))); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jbtnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnRegistrarKeyPressed(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close2424.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jtxtRut.setBackground(new java.awt.Color(0, 0, 0));
        jtxtRut.setForeground(new java.awt.Color(255, 255, 255));
        jtxtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtRutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtRutFocusLost(evt);
            }
        });
        jtxtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRutKeyTyped(evt);
            }
        });

        jlblRut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblRut.setForeground(new java.awt.Color(255, 255, 255));
        jlblRut.setText("RUT");

        jlblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombre.setText("NOMBRE");

        jtxtNombre.setBackground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });

        jlblEjemploRutContratarEmpleados.setText("Ej. 12345678-9");

        jlblEstadoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoContraseña.setText(" ");

        jlblEstadoContraseñasIguales.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoContraseñasIguales.setText(" ");

        jlblEstadoRut.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoRut.setText(" ");

        jbtnReestablecerFormulario.setBackground(new java.awt.Color(0, 102, 102));
        jbtnReestablecerFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReestablecerFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recycle2424.png"))); // NOI18N
        jbtnReestablecerFormulario.setText("REESTABLECER");
        jbtnReestablecerFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReestablecerFormularioActionPerformed(evt);
            }
        });

        jlblBannerSUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galaxy-wallpapers-10.png"))); // NOI18N

        jlblAño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblAño.setForeground(new java.awt.Color(255, 255, 255));
        jlblAño.setText("AÑO");

        jcboAño.setBackground(new java.awt.Color(0, 0, 0));
        jcboAño.setForeground(new java.awt.Color(255, 255, 255));
        jcboAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jlblBannerSUD, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblRut, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblConfirmNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblNewUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblAño, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEjemploRutContratarEmpleados)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblEstadoContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblEstadoContraseñasIguales, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jtxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblEstadoRut))
                                        .addComponent(jpwNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                        .addComponent(jpwConfirmNewPassword)
                                        .addComponent(jtxtNombre)
                                        .addComponent(jtxtNewUser))
                                    .addGap(11, 11, 11)))
                            .addComponent(jcboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jbtnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnCancelar))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jbtnReestablecerFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jlblBannerSUD, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlblNewUser))
                    .addComponent(jtxtNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNewPassword)
                    .addComponent(jpwNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblEstadoContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblConfirmNewPassword)
                    .addComponent(jpwConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEstadoContraseñasIguales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRut)
                    .addComponent(jlblEstadoRut)
                    .addComponent(jtxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblEjemploRutContratarEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAño)
                    .addComponent(jcboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnReestablecerFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jlblNewUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtNewUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblConfirmNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwConfirmNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEjemploRutContratarEmpleados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoContraseñasIguales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnReestablecerFormulario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblBannerSUD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcboAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new AccesoSud2015().configAccesoSud();
    }//GEN-LAST:event_formWindowClosing

    private void jbtnReestablecerFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReestablecerFormularioActionPerformed
        ReestablecerFormularioRegistroDeUsuario();
    }//GEN-LAST:event_jbtnReestablecerFormularioActionPerformed

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jtxtNombre.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        this.jtxtNombre.selectAll();
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRutKeyTyped
        char caracter = evt.getKeyChar();
        if(! (Character.isDigit(caracter) || caracter == KeyEvent.VK_MINUS
            || caracter == 'k' || caracter == 'K'))
        {
            evt.consume();
        }
        if (this.jtxtRut.getText().length() == 11)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtRutKeyTyped

    private void jtxtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutFocusLost
        if(validarRut())
        {
            this.jlblEstadoRut.setForeground(Color.white);
            this.jlblEstadoRut.setText("Rut válido");
        }
        else
        {
            this.jlblEstadoRut.setForeground(Color.yellow);
            this.jlblEstadoRut.setText("Rut Inválido");
        }
    }//GEN-LAST:event_jtxtRutFocusLost

    private void jtxtRutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutFocusGained
        this.jtxtRut.selectAll();
    }//GEN-LAST:event_jtxtRutFocusGained

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
        new AccesoSud2015().configAccesoSud();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        registrarUsuarios();
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jpwConfirmNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwConfirmNewPassword.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwConfirmNewPasswordKeyTyped

    private void jpwConfirmNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordFocusLost
        validarIgualdadContraseñas();
    }//GEN-LAST:event_jpwConfirmNewPasswordFocusLost

    private void jpwConfirmNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordFocusGained
        this.jpwConfirmNewPassword.selectAll();
    }//GEN-LAST:event_jpwConfirmNewPasswordFocusGained

    private void jpwNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwNewPasswordKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwNewPassword.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwNewPasswordKeyTyped

    private void jpwNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwNewPasswordFocusLost
        validarContraseñaLetrasyNumeros();
    }//GEN-LAST:event_jpwNewPasswordFocusLost

    private void jpwNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwNewPasswordFocusGained
        this.jpwNewPassword.selectAll();
    }//GEN-LAST:event_jpwNewPasswordFocusGained

    private void jtxtNewUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNewUserKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtNewUser.getText().length() == 20)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNewUserKeyTyped

    private void jtxtNewUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNewUserFocusGained
        this.jtxtNewUser.selectAll();
    }//GEN-LAST:event_jtxtNewUserFocusGained

    private void jbtnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnRegistrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarUsuarios();
        }
    }//GEN-LAST:event_jbtnRegistrarKeyPressed

    private boolean validarIgualdadContraseñas(){
        char[] pw1 = jpwNewPassword.getPassword();
        char[] pw2 = jpwConfirmNewPassword.getPassword();
        String pass1 = new String(pw1);
        String pass2 = new String(pw2);
        if (pass1.equals("") || pass2.equals("")) 
        {
            jlblEstadoContraseñasIguales.setForeground(Color.yellow);
            jlblEstadoContraseñasIguales.setText("Campo(s) vacio(s)");
            return false;
        }
        else 
        {
            if (pass1.equals(pass2))
            {
                jlblEstadoContraseñasIguales.setForeground(Color.white);
                jlblEstadoContraseñasIguales.setText("Ok");
                return true;
            } 
            else 
            {
                if(pass2.length() < 6)
                {       
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("minimo 6 caracteres");
                return false;
                }
                else
                {
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("Las contraseñas no coinciden");
                return false;
                }    
            }
        }
    }
    
    private void registrarUser(){
        try
        {
            /* captura usuario*/
            String nuevoUser = this.jtxtNewUser.getText();
            if(nuevoUser.length() == 0)
            {
                nuevoUser = null;
            }
            /*captura de contraseña*/
            char[] pw = this.jpwNewPassword.getPassword();
            String pwNuevoUser = new String(pw);
            if (pwNuevoUser.length() == 0)
            {
                pwNuevoUser = null;
            } 
            /* caputa rut*/
            String rutDV = this.jtxtRut.getText();
            int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
            /*captura nombre*/
            String nombre = this.jtxtNombre.getText().trim();
            if(nombre.length() == 0)
            {
                nombre = null;
            }
            /*captura de año*/
            int año = Integer.parseInt(this.jcboAño.getSelectedItem().toString());

            int resultado = new BLL.Usuario().registrarUsuarioBLL(nuevoUser,pwNuevoUser,rut,nombre,año);
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            new AccesoSud2015().configAccesoSud();
                            break;
                case 1048: JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1062: JOptionPane.showMessageDialog(null, "Persona ya registrada", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1406: JOptionPane.showMessageDialog(null, "Datos exceden la longitud máxima permitida", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;  
                default: JOptionPane.showMessageDialog(null, "Error desconocido. Contacte a Cordinador SUD: " + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRut, "Ingrese el rut Correctamente","Registros",JOptionPane.WARNING_MESSAGE);
            this.jtxtRut.requestFocus();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRut, "Debe seleccionar una Fecha Valida","Registros",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private boolean validarRut(){
        try
        {
            String rut = this.jtxtRut.getText();
            String[] rut_dv = rut.split("-");
            if (rut_dv.length == 2)
            {
                int rutValor = Integer.parseInt(rut_dv[0]);
                String DV = rut_dv[1].substring(0).toUpperCase();
                char dv = DV.charAt(0);
            
                // Validamos que sea un rut valido según la norma
                int m = 0, s = 1;
                for (; rutValor != 0; rutValor /= 10)
                {
                    s = (s + rutValor % 10 * (9 - m++ % 6)) % 11;
                }
            
                return dv == (char) (s != 0 ? s + 47 : 75);    
            }
            return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
    }
    
    private boolean validarContraseñaLetrasyNumeros(){
        char[] Contraseña = this.jpwNewPassword.getPassword();
        if(Contraseña.length >=6)
        { 
            int numeros = 0; 
            int letras = 0;
            
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >47) && Contraseña[x]<58)
                { 
                    numeros++; 
                } 
            }
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >64) && Contraseña[x]<123)
                { 
                    letras++; 
                } 
            }
            if(numeros>0 && letras>0)
            { 
                jlblEstadoContraseña.setForeground(Color.white);
                jlblEstadoContraseña.setText("Su contraseña es Segura.");
                return true;
            }
            else
            { 
                jlblEstadoContraseña.setForeground(Color.yellow);
                jlblEstadoContraseña.setText("inserte letras y numeros.");
                return false;
            } 
        }
        else
        { 
            jlblEstadoContraseña.setForeground(Color.orange);
            jlblEstadoContraseña.setText("minimo 6 caracteres");
            return false;
        }
    }
    
    private void ReestablecerFormularioRegistroDeUsuario(){
    jpwConfirmNewPassword.setText(null);
    jpwNewPassword.setText(null);
    jtxtNewUser.setText(null);
    jtxtNombre.setText(null);
    jtxtRut.setText(null);
    jcboAño.setSelectedIndex(0);
    jlblEstadoContraseña.setText(" ");
    jlblEstadoContraseñasIguales.setText(" ");
    jlblEstadoRut.setText(" ");
    jpwConfirmNewPassword.setBackground(Color.black);
    jpwNewPassword.setBackground(Color.black);
    jtxtNewUser.setBackground(Color.black);
    jtxtNombre.setBackground(Color.black);
    jtxtRut.setBackground(Color.black);;
    jcboAño.setBackground(Color.black);
    }
    
    private boolean validarFormularioRegistroUsuarios(){
        int validaciones = 0; 
        if(this.jtxtNewUser.getText().trim().isEmpty())
        {
            this.jtxtNewUser.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtNewUser.setBackground(Color.black);
        }
        if (! validarContraseñaLetrasyNumeros()) 
        {
            this.jpwNewPassword.setBackground(Color.cyan);
            this.jpwConfirmNewPassword.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jpwNewPassword.setBackground(Color.black);
            this.jpwConfirmNewPassword.setBackground(Color.black);
        }
        if(! validarRut())
        {
            this.jtxtRut.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtRut.setBackground(Color.black);
        }
        if(this.jtxtNombre.getText().trim().isEmpty())
        {
            this.jtxtNombre.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtNombre.setBackground(Color.black);
        }
        if(this.jcboAño.getSelectedIndex() == -1)
        {
            this.jcboAño.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jcboAño.setBackground(Color.black);
        }
        return validaciones == 0;
    }
    
    private void registrarUsuarios(){
        if (validarFormularioRegistroUsuarios())
        {
            registrarUser();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los valores que se indican...", "Registro SUD", JOptionPane.WARNING_MESSAGE);
            this.jtxtNewUser.requestFocus();
        }
    }
    
    public void configAccesoRegistro(){
        RegistroUsuario u = new RegistroUsuario();
        u.setTitle("Registro SUD");
        u.setLocationRelativeTo(null);
        u.setVisible(true);
        u.jlblNewUser.requestFocus();
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnReestablecerFormulario;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JComboBox jcboAño;
    private javax.swing.JLabel jlblAño;
    private javax.swing.JLabel jlblBannerSUD;
    private javax.swing.JLabel jlblConfirmNewPassword;
    private javax.swing.JLabel jlblEjemploRutContratarEmpleados;
    private javax.swing.JLabel jlblEstadoContraseña;
    private javax.swing.JLabel jlblEstadoContraseñasIguales;
    private javax.swing.JLabel jlblEstadoRut;
    private javax.swing.JLabel jlblNewPassword;
    private javax.swing.JLabel jlblNewUser;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblRut;
    private javax.swing.JPasswordField jpwConfirmNewPassword;
    private javax.swing.JPasswordField jpwNewPassword;
    private javax.swing.JTextField jtxtNewUser;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtRut;
    // End of variables declaration//GEN-END:variables
}
//ok