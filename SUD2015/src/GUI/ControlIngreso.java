package GUI;

import java.awt.event.KeyEvent;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.io.File;

public class ControlIngreso extends javax.swing.JFrame {
    
    public ControlIngreso() {
        initComponents();
        jInternalFrameInfo.setVisible(false);
        jInternalFrameAgregarCiudad.setVisible(false);
        jInternalFrameAgregarIglesia.setVisible(false);
        jInternalFrameMovimientos.setVisible(false);
        jInternalFrameListadoMovimientos.setVisible(false);
        jInternalFrameListadoSud.setVisible(false);
        reestablecerFormularioRegistroPersona();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupEstadisticas = new javax.swing.ButtonGroup();
        jDesktopPaneSUD = new javax.swing.JDesktopPane();
        jInternalFrameRegistro = new javax.swing.JInternalFrame();
        jPanelRegistro = new javax.swing.JPanel();
        jLabelRut = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelContacto = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelIglesia = new javax.swing.JLabel();
        jLabelCancela = new javax.swing.JLabel();
        jtxtRutRegistro = new javax.swing.JTextField();
        jtxtNombreRegistro = new javax.swing.JTextField();
        jtxtContacto = new javax.swing.JTextField();
        jtxtCancela = new javax.swing.JTextField();
        jButtonIngresarRegistro = new javax.swing.JButton();
        jButtonReestablecerRegistro = new javax.swing.JButton();
        jcboCiudad = new javax.swing.JComboBox();
        jcboIglesia = new javax.swing.JComboBox();
        jbtnAgregarCiudadRegistro = new javax.swing.JButton();
        jLabelFolio = new javax.swing.JLabel();
        jtxtFolio = new javax.swing.JTextField();
        jLabelAlojamiento = new javax.swing.JLabel();
        jtxtAlojamiento = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jtxtCodigoMovimientoRegistro = new javax.swing.JTextField();
        jLabelAñoRegistro = new javax.swing.JLabel();
        jcboAñoRegistro = new javax.swing.JComboBox();
        jbtnAgregarIglesiaRegistro = new javax.swing.JButton();
        jbtnBuscarPersona = new javax.swing.JButton();
        jbtnActualizarPersona = new javax.swing.JButton();
        jbtnEliminarPersona = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlblBarraEstadoRegistro = new javax.swing.JLabel();
        jInternalFrameListadoSud = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListadoSudIngresados = new javax.swing.JTable();
        jlblCantidadPersonas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtnReportePersonasSUD = new javax.swing.JButton();
        jInternalFrameMovimientos = new javax.swing.JInternalFrame();
        jPanelMovimiento = new javax.swing.JPanel();
        jLabelTituloEstadisticas = new javax.swing.JLabel();
        jLabelCodigoEstadistica = new javax.swing.JLabel();
        jtxtCodigoMovimiento = new javax.swing.JTextField();
        jLabelGastosEstadistica = new javax.swing.JLabel();
        jtxtMontoMovimiento = new javax.swing.JTextField();
        jLabelDetalleEstadistica = new javax.swing.JLabel();
        jbtnIngresarMovimiento = new javax.swing.JButton();
        jLabelOpcionEstadistica = new javax.swing.JLabel();
        jrbtnEgreso = new javax.swing.JRadioButton();
        jrbtnIngreso = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtDetalleMovimiento = new javax.swing.JTextPane();
        jlblIconoMAS = new javax.swing.JLabel();
        jlblIconoMENOS = new javax.swing.JLabel();
        jcboañoMovimientos = new javax.swing.JComboBox();
        jLabelAño = new javax.swing.JLabel();
        jlblBarraEstadoMovimientos = new javax.swing.JLabel();
        jInternalFrameListadoMovimientos = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListadoMovimientos = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();
        jlblFondoSud = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jpaneltxtDetalleMovimiento = new javax.swing.JTextPane();
        jbtnReportePersonasSUD1 = new javax.swing.JButton();
        jInternalFrameInfo = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jInternalFrameAgregarCiudad = new javax.swing.JInternalFrame();
        jLabelCodigoCiudad = new javax.swing.JLabel();
        jtxtCodigoCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombreCiudad = new javax.swing.JTextField();
        jbtnAgregarCiudad = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jInternalFrameAgregarIglesia = new javax.swing.JInternalFrame();
        jLabelCodigoIglesia = new javax.swing.JLabel();
        jtxtCodigoIglesia = new javax.swing.JTextField();
        jlblIglesia = new javax.swing.JLabel();
        jtxtNombreIglesia = new javax.swing.JTextField();
        jbtnAgregarIglesia = new javax.swing.JButton();
        jbtnCancelarAgregarIglesia = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemRegistro = new javax.swing.JMenuItem();
        jMenuItemMovimientos = new javax.swing.JMenuItem();
        jMenuItemListadoSud = new javax.swing.JMenuItem();
        jMenuItemListadoMovimientos = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUD2015 ### Él en //Nosotros// en Él ###");

        jDesktopPaneSUD.setBackground(new java.awt.Color(0, 51, 51));

        jInternalFrameRegistro.setClosable(true);
        jInternalFrameRegistro.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameRegistro.setIconifiable(true);
        jInternalFrameRegistro.setTitle("Registro Evento");
        jInternalFrameRegistro.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar2424.png"))); // NOI18N
        jInternalFrameRegistro.setVisible(true);
        jInternalFrameRegistro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameRegistroComponentShown(evt);
            }
        });

        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelRut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRut.setText("RUT");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelContacto.setText("Contacto");

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCiudad.setText("Ciudad");

        jLabelIglesia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIglesia.setText("Iglesia");

        jLabelCancela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCancela.setText("Monto Cancela");

        jtxtRutRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtRutRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtRutRegistroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtRutRegistroFocusLost(evt);
            }
        });
        jtxtRutRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRutRegistroKeyTyped(evt);
            }
        });

        jtxtNombreRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtNombreRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreRegistroFocusGained(evt);
            }
        });
        jtxtNombreRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreRegistroKeyTyped(evt);
            }
        });

        jtxtContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContactoFocusGained(evt);
            }
        });
        jtxtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtContactoKeyTyped(evt);
            }
        });

        jtxtCancela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCancela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCancelaFocusGained(evt);
            }
        });
        jtxtCancela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCancelaKeyTyped(evt);
            }
        });

        jButtonIngresarRegistro.setBackground(new java.awt.Color(172, 235, 172));
        jButtonIngresarRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonIngresarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add-Male-User4848.png"))); // NOI18N
        jButtonIngresarRegistro.setText("Agregar");
        jButtonIngresarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarRegistroActionPerformed(evt);
            }
        });
        jButtonIngresarRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIngresarRegistroKeyPressed(evt);
            }
        });

        jButtonReestablecerRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonReestablecerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recycle2424.png"))); // NOI18N
        jButtonReestablecerRegistro.setText("Reestablecer Formulario");
        jButtonReestablecerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReestablecerRegistroActionPerformed(evt);
            }
        });
        jButtonReestablecerRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonReestablecerRegistroKeyPressed(evt);
            }
        });

        jcboCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcboCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcboCiudadFocusGained(evt);
            }
        });

        jcboIglesia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcboIglesia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcboIglesiaFocusGained(evt);
            }
        });

        jbtnAgregarCiudadRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city3232.png"))); // NOI18N
        jbtnAgregarCiudadRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarCiudadRegistroActionPerformed(evt);
            }
        });

        jLabelFolio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFolio.setText("Folio");

        jtxtFolio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFolioFocusGained(evt);
            }
        });
        jtxtFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFolioKeyTyped(evt);
            }
        });

        jLabelAlojamiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAlojamiento.setText("Alojamiento");

        jtxtAlojamiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtAlojamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtAlojamientoFocusGained(evt);
            }
        });
        jtxtAlojamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAlojamientoKeyTyped(evt);
            }
        });

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigo.setText("Codigo");

        jtxtCodigoMovimientoRegistro.setEditable(false);
        jtxtCodigoMovimientoRegistro.setCaretColor(new java.awt.Color(240, 240, 240));
        jtxtCodigoMovimientoRegistro.setFocusable(false);

        jLabelAñoRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAñoRegistro.setText("Año");

        jcboAñoRegistro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));

        jbtnAgregarIglesiaRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CatholicTemple3232.png"))); // NOI18N
        jbtnAgregarIglesiaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarIglesiaRegistroActionPerformed(evt);
            }
        });

        jbtnBuscarPersona.setBackground(new java.awt.Color(250, 221, 191));
        jbtnBuscarPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-Male-User3232.png"))); // NOI18N
        jbtnBuscarPersona.setText("Buscar");
        jbtnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPersonaActionPerformed(evt);
            }
        });
        jbtnBuscarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnBuscarPersonaKeyPressed(evt);
            }
        });

        jbtnActualizarPersona.setBackground(new java.awt.Color(250, 221, 191));
        jbtnActualizarPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnActualizarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit-Male-User3232.png"))); // NOI18N
        jbtnActualizarPersona.setText("Actualizar");
        jbtnActualizarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarPersonaActionPerformed(evt);
            }
        });
        jbtnActualizarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnActualizarPersonaKeyPressed(evt);
            }
        });

        jbtnEliminarPersona.setBackground(new java.awt.Color(250, 221, 191));
        jbtnEliminarPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnEliminarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Remove-Male-User3232.png"))); // NOI18N
        jbtnEliminarPersona.setText("Eliminar");
        jbtnEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarPersonaActionPerformed(evt);
            }
        });
        jbtnEliminarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnEliminarPersonaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Ej. 12345678-9");

        jlblBarraEstadoRegistro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblBarraEstadoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBarraEstadoRegistro.setText(" ");
        jlblBarraEstadoRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblBarraEstadoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCancela)
                                    .addComponent(jLabelIglesia)
                                    .addComponent(jLabelCiudad)
                                    .addComponent(jLabelFolio)
                                    .addComponent(jLabelContacto)
                                    .addComponent(jLabelNombre)
                                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabelRut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabelAlojamiento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jtxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelAñoRegistro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcboAñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtxtNombreRegistro)
                                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jtxtCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabelCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtCodigoMovimientoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jcboIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnAgregarIglesiaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                        .addComponent(jcboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnAgregarCiudadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtxtContacto)
                                    .addComponent(jtxtRutRegistro)
                                    .addComponent(jtxtAlojamiento)))
                            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                .addComponent(jButtonIngresarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnActualizarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jbtnEliminarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnBuscarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonReestablecerRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRut)
                    .addComponent(jtxtRutRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jtxtNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContacto)
                    .addComponent(jtxtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFolio)
                    .addComponent(jtxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAñoRegistro)
                    .addComponent(jcboAñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnAgregarCiudadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcboIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAgregarIglesiaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlojamiento)
                    .addComponent(jtxtAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCancela)
                    .addComponent(jLabelCodigo)
                    .addComponent(jtxtCodigoMovimientoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addComponent(jbtnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnActualizarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonIngresarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReestablecerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblBarraEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameRegistroLayout = new javax.swing.GroupLayout(jInternalFrameRegistro.getContentPane());
        jInternalFrameRegistro.getContentPane().setLayout(jInternalFrameRegistroLayout);
        jInternalFrameRegistroLayout.setHorizontalGroup(
            jInternalFrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jInternalFrameRegistroLayout.setVerticalGroup(
            jInternalFrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPaneSUD.add(jInternalFrameRegistro);
        jInternalFrameRegistro.setBounds(10, 20, 350, 610);

        jInternalFrameListadoSud.setClosable(true);
        jInternalFrameListadoSud.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameListadoSud.setTitle("Listado SUD");
        jInternalFrameListadoSud.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconframeListadoVotantes2424.png"))); // NOI18N
        jInternalFrameListadoSud.setVisible(true);
        jInternalFrameListadoSud.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameListadoSudComponentShown(evt);
            }
        });

        jTableListadoSudIngresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListadoSudIngresados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListadoSudIngresadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListadoSudIngresados);

        jlblCantidadPersonas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCantidadPersonas.setText("00");

        jLabel9.setText("Cant. Personas");

        jbtnReportePersonasSUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnReportePersonasSUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReportePersonasSUDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameListadoSudLayout = new javax.swing.GroupLayout(jInternalFrameListadoSud.getContentPane());
        jInternalFrameListadoSud.getContentPane().setLayout(jInternalFrameListadoSudLayout);
        jInternalFrameListadoSudLayout.setHorizontalGroup(
            jInternalFrameListadoSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoSudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameListadoSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameListadoSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jlblCantidadPersonas))
                    .addComponent(jbtnReportePersonasSUD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jInternalFrameListadoSudLayout.setVerticalGroup(
            jInternalFrameListadoSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameListadoSudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameListadoSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addGroup(jInternalFrameListadoSudLayout.createSequentialGroup()
                        .addComponent(jbtnReportePersonasSUD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblCantidadPersonas)))
                .addContainerGap())
        );

        jDesktopPaneSUD.add(jInternalFrameListadoSud);
        jInternalFrameListadoSud.setBounds(350, 10, 880, 310);

        jInternalFrameMovimientos.setClosable(true);
        jInternalFrameMovimientos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameMovimientos.setIconifiable(true);
        jInternalFrameMovimientos.setTitle("Movimientos");
        jInternalFrameMovimientos.setToolTipText("");
        jInternalFrameMovimientos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/21-2424.png"))); // NOI18N
        jInternalFrameMovimientos.setVisible(true);
        jInternalFrameMovimientos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameMovimientosComponentShown(evt);
            }
        });

        jLabelTituloEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloEstadisticas.setText("Ingresar Nuevo Movimiento de Fondo");

        jLabelCodigoEstadistica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoEstadistica.setText("Codigo");

        jtxtCodigoMovimiento.setEditable(false);
        jtxtCodigoMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCodigoMovimiento.setFocusable(false);

        jLabelGastosEstadistica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGastosEstadistica.setText("Monto $");

        jtxtMontoMovimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMontoMovimientoKeyTyped(evt);
            }
        });

        jLabelDetalleEstadistica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDetalleEstadistica.setText("Detalle");

        jbtnIngresarMovimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cash_register4848.png"))); // NOI18N
        jbtnIngresarMovimiento.setText("Ingresar");
        jbtnIngresarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarMovimientoActionPerformed(evt);
            }
        });
        jbtnIngresarMovimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnIngresarMovimientoKeyPressed(evt);
            }
        });

        jLabelOpcionEstadistica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOpcionEstadistica.setText("Opcion");

        buttonGroupEstadisticas.add(jrbtnEgreso);
        jrbtnEgreso.setText("Egreso");

        buttonGroupEstadisticas.add(jrbtnIngreso);
        jrbtnIngreso.setSelected(true);
        jrbtnIngreso.setText("Ingreso");

        jtxtDetalleMovimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDetalleMovimientoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jtxtDetalleMovimiento);

        jlblIconoMAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-24.png"))); // NOI18N

        jlblIconoMENOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove-24.png"))); // NOI18N

        jcboañoMovimientos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabelAño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAño.setText("Año");

        jlblBarraEstadoMovimientos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblBarraEstadoMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBarraEstadoMovimientos.setText(" ");
        jlblBarraEstadoMovimientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelMovimientoLayout = new javax.swing.GroupLayout(jPanelMovimiento);
        jPanelMovimiento.setLayout(jPanelMovimientoLayout);
        jPanelMovimientoLayout.setHorizontalGroup(
            jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
            .addComponent(jlblBarraEstadoMovimientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                        .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDetalleEstadistica)
                            .addComponent(jLabelGastosEstadistica)
                            .addComponent(jLabelCodigoEstadistica)
                            .addComponent(jLabelOpcionEstadistica)
                            .addComponent(jLabelAño))
                        .addGap(4, 4, 4)
                        .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbtnIngreso)
                                    .addComponent(jrbtnEgreso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblIconoMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblIconoMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jcboañoMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtCodigoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnIngresarMovimiento))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelMovimientoLayout.setVerticalGroup(
            jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                .addComponent(jLabelTituloEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAño)
                    .addComponent(jcboañoMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblIconoMAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbtnIngreso)
                        .addComponent(jLabelOpcionEstadistica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbtnEgreso)
                    .addComponent(jlblIconoMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoEstadistica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGastosEstadistica))
                .addGroup(jPanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMovimientoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelDetalleEstadistica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnIngresarMovimiento)
                .addGap(18, 18, 18)
                .addComponent(jlblBarraEstadoMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameMovimientosLayout = new javax.swing.GroupLayout(jInternalFrameMovimientos.getContentPane());
        jInternalFrameMovimientos.getContentPane().setLayout(jInternalFrameMovimientosLayout);
        jInternalFrameMovimientosLayout.setHorizontalGroup(
            jInternalFrameMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameMovimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrameMovimientosLayout.setVerticalGroup(
            jInternalFrameMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameMovimientosLayout.createSequentialGroup()
                .addComponent(jPanelMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPaneSUD.add(jInternalFrameMovimientos);
        jInternalFrameMovimientos.setBounds(920, 590, 270, 400);

        jInternalFrameListadoMovimientos.setClosable(true);
        jInternalFrameListadoMovimientos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameListadoMovimientos.setTitle("Listado Movimientos");
        jInternalFrameListadoMovimientos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analytics-24.png"))); // NOI18N
        jInternalFrameListadoMovimientos.setVisible(true);
        jInternalFrameListadoMovimientos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameListadoMovimientosComponentShown(evt);
            }
        });

        jTableListadoMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListadoMovimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListadoMovimientosMousePressed(evt);
            }
        });
        jTableListadoMovimientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListadoMovimientosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListadoMovimientos);

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFondo.setText("Fondo:");

        jlblFondoSud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblFondoSud.setText("0");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recycle2424.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jpaneltxtDetalleMovimiento);

        jbtnReportePersonasSUD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnReportePersonasSUD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReportePersonasSUD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameListadoMovimientosLayout = new javax.swing.GroupLayout(jInternalFrameListadoMovimientos.getContentPane());
        jInternalFrameListadoMovimientos.getContentPane().setLayout(jInternalFrameListadoMovimientosLayout);
        jInternalFrameListadoMovimientosLayout.setHorizontalGroup(
            jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                        .addComponent(jLabelFondo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblFondoSud)))
                .addGap(10, 10, 10)
                .addGroup(jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                        .addComponent(jbtnReportePersonasSUD1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jInternalFrameListadoMovimientosLayout.setVerticalGroup(
            jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnReportePersonasSUD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInternalFrameListadoMovimientosLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jInternalFrameListadoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFondo)
                    .addComponent(jlblFondoSud))
                .addContainerGap())
        );

        jDesktopPaneSUD.add(jInternalFrameListadoMovimientos);
        jInternalFrameListadoMovimientos.setBounds(350, 330, 740, 250);

        jInternalFrameInfo.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrameInfo.setClosable(true);
        jInternalFrameInfo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameInfo.setTitle("SOLO UN DIOS");
        jInternalFrameInfo.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/information_info_about_question-2424.png"))); // NOI18N
        jInternalFrameInfo.setVisible(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fONDO.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Proyecto v1.0 Creado para:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Solo un Dios, SUD2015");

        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Elaborado por:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fabian Aguila Vidal");

        javax.swing.GroupLayout jInternalFrameInfoLayout = new javax.swing.GroupLayout(jInternalFrameInfo.getContentPane());
        jInternalFrameInfo.getContentPane().setLayout(jInternalFrameInfoLayout);
        jInternalFrameInfoLayout.setHorizontalGroup(
            jInternalFrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInfoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrameInfoLayout.setVerticalGroup(
            jInternalFrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameInfoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrameInfoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(73, 73, 73))))
        );

        jDesktopPaneSUD.add(jInternalFrameInfo);
        jInternalFrameInfo.setBounds(470, 590, 430, 230);

        jInternalFrameAgregarCiudad.setClosable(true);
        jInternalFrameAgregarCiudad.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameAgregarCiudad.setTitle("Agregar Ciudad");
        jInternalFrameAgregarCiudad.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city3232.png"))); // NOI18N
        jInternalFrameAgregarCiudad.setVisible(true);
        jInternalFrameAgregarCiudad.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameAgregarCiudadComponentShown(evt);
            }
        });

        jLabelCodigoCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoCiudad.setText("Codigo");

        jtxtCodigoCiudad.setEditable(false);
        jtxtCodigoCiudad.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCodigoCiudad.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ciudad");

        jtxtNombreCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreCiudadFocusGained(evt);
            }
        });
        jtxtNombreCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNombreCiudadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreCiudadKeyTyped(evt);
            }
        });

        jbtnAgregarCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city3232.png"))); // NOI18N
        jbtnAgregarCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtnAgregarCiudadFocusGained(evt);
            }
        });
        jbtnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarCiudadActionPerformed(evt);
            }
        });
        jbtnAgregarCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAgregarCiudadKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/17-32.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameAgregarCiudadLayout = new javax.swing.GroupLayout(jInternalFrameAgregarCiudad.getContentPane());
        jInternalFrameAgregarCiudad.getContentPane().setLayout(jInternalFrameAgregarCiudadLayout);
        jInternalFrameAgregarCiudadLayout.setHorizontalGroup(
            jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAgregarCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelCodigoCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombreCiudad)
                    .addGroup(jInternalFrameAgregarCiudadLayout.createSequentialGroup()
                        .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCodigoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrameAgregarCiudadLayout.setVerticalGroup(
            jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAgregarCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoCiudad)
                    .addComponent(jtxtCodigoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameAgregarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jDesktopPaneSUD.add(jInternalFrameAgregarCiudad);
        jInternalFrameAgregarCiudad.setBounds(240, 650, 220, 180);

        jInternalFrameAgregarIglesia.setClosable(true);
        jInternalFrameAgregarIglesia.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameAgregarIglesia.setTitle("Agregar Iglesia");
        jInternalFrameAgregarIglesia.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CatholicTemple3232.png"))); // NOI18N
        jInternalFrameAgregarIglesia.setVisible(true);
        jInternalFrameAgregarIglesia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternalFrameAgregarIglesiaMouseClicked(evt);
            }
        });
        jInternalFrameAgregarIglesia.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameAgregarIglesiaComponentShown(evt);
            }
        });

        jLabelCodigoIglesia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoIglesia.setText("Codigo");

        jtxtCodigoIglesia.setEditable(false);
        jtxtCodigoIglesia.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCodigoIglesia.setFocusable(false);

        jlblIglesia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblIglesia.setText("Iglesia");

        jtxtNombreIglesia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreIglesiaFocusGained(evt);
            }
        });
        jtxtNombreIglesia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNombreIglesiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreIglesiaKeyTyped(evt);
            }
        });

        jbtnAgregarIglesia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CatholicTemple3232.png"))); // NOI18N
        jbtnAgregarIglesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarIglesiaActionPerformed(evt);
            }
        });
        jbtnAgregarIglesia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAgregarIglesiaKeyPressed(evt);
            }
        });

        jbtnCancelarAgregarIglesia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/17-32.png"))); // NOI18N
        jbtnCancelarAgregarIglesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarAgregarIglesiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameAgregarIglesiaLayout = new javax.swing.GroupLayout(jInternalFrameAgregarIglesia.getContentPane());
        jInternalFrameAgregarIglesia.getContentPane().setLayout(jInternalFrameAgregarIglesiaLayout);
        jInternalFrameAgregarIglesiaLayout.setHorizontalGroup(
            jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAgregarIglesiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblIglesia)
                    .addComponent(jLabelCodigoIglesia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombreIglesia)
                    .addGroup(jInternalFrameAgregarIglesiaLayout.createSequentialGroup()
                        .addComponent(jtxtCodigoIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrameAgregarIglesiaLayout.createSequentialGroup()
                        .addComponent(jbtnAgregarIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jbtnCancelarAgregarIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrameAgregarIglesiaLayout.setVerticalGroup(
            jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAgregarIglesiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoIglesia)
                    .addComponent(jtxtCodigoIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIglesia)
                    .addComponent(jtxtNombreIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameAgregarIglesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAgregarIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelarAgregarIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jDesktopPaneSUD.add(jInternalFrameAgregarIglesia);
        jInternalFrameAgregarIglesia.setBounds(10, 650, 220, 180);

        getContentPane().add(jDesktopPaneSUD, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2424.png"))); // NOI18N
        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close2424.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItem1);

        jMenuBarPrincipal.add(jMenuArchivo);

        jMenuOpciones.setText("Opciones");
        jMenuOpciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItemRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar2424.png"))); // NOI18N
        jMenuItemRegistro.setText("Registro");
        jMenuItemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemRegistro);

        jMenuItemMovimientos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/21-2424.png"))); // NOI18N
        jMenuItemMovimientos.setText("Registro Movimientos");
        jMenuItemMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovimientosActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemMovimientos);

        jMenuItemListadoSud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemListadoSud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemListadoSud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconframeListadoVotantes2424.png"))); // NOI18N
        jMenuItemListadoSud.setText("Listado Personas SUD");
        jMenuItemListadoSud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoSudActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemListadoSud);

        jMenuItemListadoMovimientos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemListadoMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemListadoMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analytics-24.png"))); // NOI18N
        jMenuItemListadoMovimientos.setText("Listado Movimientos registrados");
        jMenuItemListadoMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoMovimientosActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemListadoMovimientos);

        jMenuBarPrincipal.add(jMenuOpciones);

        jMenuAcercaDe.setText("Acerca de");
        jMenuAcercaDe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItemAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAcercaDe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/information_info_about_question-2424.png"))); // NOI18N
        jMenuItemAcercaDe.setText("Acerca de");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(jMenuItemAcercaDe);

        jMenuBarPrincipal.add(jMenuAcercaDe);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroActionPerformed
        this.jInternalFrameRegistro.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroActionPerformed

    private void jMenuItemMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovimientosActionPerformed
        this.jInternalFrameMovimientos.setLocation(350, 20);
        this.jInternalFrameMovimientos.setVisible(true);
    }//GEN-LAST:event_jMenuItemMovimientosActionPerformed

    private void jtxtNombreCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreCiudadKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jtxtNombreCiudad.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreCiudadKeyTyped

    private void jtxtNombreIglesiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreIglesiaKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jtxtNombreIglesia.getText().length() == 40)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreIglesiaKeyTyped

    private void jtxtAlojamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAlojamientoKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jtxtAlojamiento.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtAlojamientoKeyTyped

    private void jtxtFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFolioKeyTyped
        char caracter = evt.getKeyChar();
        if (! Character.isDigit(caracter))
        {
            evt.consume();
        }
        if (this.jtxtFolio.getText().length() == 4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtFolioKeyTyped

    private void jtxtCancelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCancelaKeyTyped
        char caracter = evt.getKeyChar();
        if (! Character.isDigit(caracter))
        {
            evt.consume();
        }
        if (this.jtxtCancela.getText().length() == 5)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCancelaKeyTyped

    private void jtxtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtContactoKeyTyped
        char caracter = evt.getKeyChar();
        if (! Character.isDigit(caracter))
        {
            evt.consume();
        }
        if (this.jtxtContacto.getText().length() == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtContactoKeyTyped

    private void jtxtNombreRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreRegistroKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter) || caracter == KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
        if (this.jtxtNombreRegistro.getText().length() == 40)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreRegistroKeyTyped

    private void jtxtRutRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRutRegistroKeyTyped
        char caracter = evt.getKeyChar();
        if(! (Character.isDigit(caracter) || caracter == KeyEvent.VK_MINUS
            || caracter == 'k' || caracter == 'K'))
        {
            evt.consume();
        }
        if (this.jtxtRutRegistro.getText().length() == 11)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtRutRegistroKeyTyped

    private void jtxtRutRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutRegistroFocusLost
        if(!validarRut())
        {
            this.jlblBarraEstadoRegistro.setText("Rut Inválido");
        }
        else
        {
            this.jlblBarraEstadoRegistro.setText("");  
        }
    }//GEN-LAST:event_jtxtRutRegistroFocusLost

    private void jbtnAgregarCiudadRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarCiudadRegistroActionPerformed
        this.jInternalFrameAgregarCiudad.setLocation(350, 20);
        this.jInternalFrameAgregarCiudad.setVisible(true);
    }//GEN-LAST:event_jbtnAgregarCiudadRegistroActionPerformed

    private void jbtnAgregarIglesiaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarIglesiaRegistroActionPerformed
        this.jInternalFrameAgregarIglesia.setLocation(350, 20);
        this.jInternalFrameAgregarIglesia.setVisible(true);
    }//GEN-LAST:event_jbtnAgregarIglesiaRegistroActionPerformed

    private void jMenuItemListadoSudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoSudActionPerformed
        this.jInternalFrameListadoSud.setVisible(true);
    }//GEN-LAST:event_jMenuItemListadoSudActionPerformed

    private void jMenuItemListadoMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoMovimientosActionPerformed
        this.jInternalFrameListadoMovimientos.setVisible(true);
    }//GEN-LAST:event_jMenuItemListadoMovimientosActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
       this.jInternalFrameInfo.setLocation(350, 20);
       this.jInternalFrameInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jInternalFrameAgregarCiudadComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameAgregarCiudadComponentShown
        obtenerIdCiudad();
    }//GEN-LAST:event_jInternalFrameAgregarCiudadComponentShown

    private void jbtnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarCiudadActionPerformed
        registrarCiudad();
    }//GEN-LAST:event_jbtnAgregarCiudadActionPerformed

    private void jButtonReestablecerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReestablecerRegistroActionPerformed
        reestablecerFormularioRegistroPersona();
    }//GEN-LAST:event_jButtonReestablecerRegistroActionPerformed

    private void jbtnCancelarAgregarIglesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarAgregarIglesiaActionPerformed
        this.jInternalFrameAgregarIglesia.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarAgregarIglesiaActionPerformed

    private void jtxtNombreCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreCiudadFocusGained
        this.jtxtNombreCiudad.selectAll();
    }//GEN-LAST:event_jtxtNombreCiudadFocusGained

    private void jtxtNombreIglesiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreIglesiaFocusGained
        this.jtxtNombreIglesia.selectAll();
    }//GEN-LAST:event_jtxtNombreIglesiaFocusGained

    private void jtxtNombreIglesiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreIglesiaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarIglesia();
        }
    }//GEN-LAST:event_jtxtNombreIglesiaKeyPressed

    private void jtxtNombreCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreCiudadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarCiudad();
        }
    }//GEN-LAST:event_jtxtNombreCiudadKeyPressed

    private void jbtnAgregarCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnAgregarCiudadFocusGained
        
    }//GEN-LAST:event_jbtnAgregarCiudadFocusGained

    private void jbtnAgregarCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAgregarCiudadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarCiudad();
        }
    }//GEN-LAST:event_jbtnAgregarCiudadKeyPressed

    private void jbtnAgregarIglesiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAgregarIglesiaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarIglesia();
        }
    }//GEN-LAST:event_jbtnAgregarIglesiaKeyPressed

    private void jtxtRutRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutRegistroFocusGained
        this.jtxtRutRegistro.selectAll();
    }//GEN-LAST:event_jtxtRutRegistroFocusGained

    private void jtxtNombreRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreRegistroFocusGained
        this.jtxtNombreRegistro.selectAll();
    }//GEN-LAST:event_jtxtNombreRegistroFocusGained

    private void jtxtContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContactoFocusGained
        this.jtxtContacto.selectAll();
    }//GEN-LAST:event_jtxtContactoFocusGained

    private void jtxtFolioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFolioFocusGained
        this.jtxtFolio.selectAll();
    }//GEN-LAST:event_jtxtFolioFocusGained

    private void jtxtAlojamientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAlojamientoFocusGained
        this.jtxtAlojamiento.selectAll();
    }//GEN-LAST:event_jtxtAlojamientoFocusGained

    private void jtxtCancelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCancelaFocusGained
        this.jtxtCancela.selectAll();
    }//GEN-LAST:event_jtxtCancelaFocusGained

    private void jInternalFrameMovimientosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameMovimientosComponentShown
        obtenerIdMovimiento();
    }//GEN-LAST:event_jInternalFrameMovimientosComponentShown

    private void jbtnIngresarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarMovimientoActionPerformed
        registrarMovimiento();
    }//GEN-LAST:event_jbtnIngresarMovimientoActionPerformed

    private void jInternalFrameAgregarIglesiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrameAgregarIglesiaMouseClicked
        
    }//GEN-LAST:event_jInternalFrameAgregarIglesiaMouseClicked

    private void jInternalFrameAgregarIglesiaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameAgregarIglesiaComponentShown
        obtenerIdIglesia();
    }//GEN-LAST:event_jInternalFrameAgregarIglesiaComponentShown

    private void jInternalFrameRegistroComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameRegistroComponentShown
        reestablecerFormularioRegistroPersona();
    }//GEN-LAST:event_jInternalFrameRegistroComponentShown

    private void jButtonIngresarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarRegistroActionPerformed
        registrarPersona();
    }//GEN-LAST:event_jButtonIngresarRegistroActionPerformed

    private void jInternalFrameListadoMovimientosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameListadoMovimientosComponentShown
        listadoMovimientos();
    }//GEN-LAST:event_jInternalFrameListadoMovimientosComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jInternalFrameAgregarCiudad.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnAgregarIglesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarIglesiaActionPerformed
        registrarIglesia();
    }//GEN-LAST:event_jbtnAgregarIglesiaActionPerformed

    private void jtxtMontoMovimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMontoMovimientoKeyTyped
        char caracter = evt.getKeyChar();
        if (! Character.isDigit(caracter))
        {
            evt.consume();
        }
        if (this.jtxtMontoMovimiento.getText().length() == 8)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtMontoMovimientoKeyTyped

    private void jtxtDetalleMovimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDetalleMovimientoKeyTyped
        if (this.jtxtDetalleMovimiento.getText().length() == 255)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDetalleMovimientoKeyTyped

    private void jbtnIngresarMovimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnIngresarMovimientoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarMovimiento();
        }
    }//GEN-LAST:event_jbtnIngresarMovimientoKeyPressed

    private void jInternalFrameListadoSudComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameListadoSudComponentShown
        listadoPersonasSud();
    }//GEN-LAST:event_jInternalFrameListadoSudComponentShown

    private void jButtonIngresarRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIngresarRegistroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarPersona();
        }
    }//GEN-LAST:event_jButtonIngresarRegistroKeyPressed

    private void jButtonReestablecerRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonReestablecerRegistroKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            reestablecerFormularioRegistroPersona();
        }
    }//GEN-LAST:event_jButtonReestablecerRegistroKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        new AccesoSud2015().configAccesoSud();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jbtnEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarPersonaActionPerformed
        eliminarPersona();
    }//GEN-LAST:event_jbtnEliminarPersonaActionPerformed

    private void jbtnEliminarPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnEliminarPersonaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            eliminarPersona();
        }
    }//GEN-LAST:event_jbtnEliminarPersonaKeyPressed

    private void jbtnActualizarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarPersonaActionPerformed
        actualizarPersona();
    }//GEN-LAST:event_jbtnActualizarPersonaActionPerformed

    private void jbtnActualizarPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnActualizarPersonaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            actualizarPersona();
        }
    }//GEN-LAST:event_jbtnActualizarPersonaKeyPressed

    private void jbtnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPersonaActionPerformed
        buscarPersona();
    }//GEN-LAST:event_jbtnBuscarPersonaActionPerformed

    private void jbtnBuscarPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnBuscarPersonaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            buscarPersona();
        }
    }//GEN-LAST:event_jbtnBuscarPersonaKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jpaneltxtDetalleMovimiento.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableListadoMovimientosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoMovimientosMousePressed
        mostrarDetalleMovimiento();
    }//GEN-LAST:event_jTableListadoMovimientosMousePressed

    private void jTableListadoMovimientosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoMovimientosKeyPressed
        mostrarDetalleMovimiento();
    }//GEN-LAST:event_jTableListadoMovimientosKeyPressed

    private void jTableListadoSudIngresadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoSudIngresadosMousePressed

    }//GEN-LAST:event_jTableListadoSudIngresadosMousePressed

    private void jbtnReportePersonasSUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReportePersonasSUDActionPerformed
        new Itext.Itext().generarReporteListadoSUD();
        abrirArchivo(System.getProperty("user.dir") + "\\ListadoPersonasSUD.pdf");
    }//GEN-LAST:event_jbtnReportePersonasSUDActionPerformed

    private void jbtnReportePersonasSUD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReportePersonasSUD1ActionPerformed
        new Itext.Itext().generarReporteMovimientosSUD();
        abrirArchivo(System.getProperty("user.dir") + "\\ListadoMovimientoSUD.pdf");
    }//GEN-LAST:event_jbtnReportePersonasSUD1ActionPerformed

    private void jcboCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcboCiudadFocusGained
        cargarListadoCiudades();
    }//GEN-LAST:event_jcboCiudadFocusGained

    private void jcboIglesiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcboIglesiaFocusGained
        cargarListadoIglesias();
    }//GEN-LAST:event_jcboIglesiaFocusGained

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////// M  E  T  O  D  O  S //////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    //Método para abrir archivos guardados en el disco duro (.PDFs).
    public void abrirArchivo(String archivo){
        try 
        {
        Desktop dk=Desktop.getDesktop();
        dk.open(new File(archivo));      
        } 
        catch (Exception e) 
        {
            System.out.println("Error al abrir archivo .PDF");
        }
    }
    
    private void mostrarDetalleMovimiento(){
        try
        { 
        int filajt = this.jTableListadoMovimientos.getSelectedRow();
            String detalle = this.jTableListadoMovimientos.getValueAt(filajt, 3).toString();
            jpaneltxtDetalleMovimiento.setText(detalle);
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private void buscarPersona(){
        try
        {
            if(validarRut())
            {    
                String rutDV = this.jtxtRutRegistro.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
                BLL.Persona p = new BLL.Persona().buscarPersona(rut);
                if(p != null)
                {
                    this.jtxtNombreRegistro.setText(p.getNombre());
                    this.jtxtContacto.setText(String.valueOf(p.getContacto()));
                    this.jtxtFolio.setText(String.valueOf(p.getFolio()));
                    int idciudad = p.getIdciudad();
                    String nombreCiudad = new BLL.Ciudad().obtenerNombreCiudad(idciudad);
                    int indiceCiudad = -1;
                    for(int i=0;i < this.jcboCiudad.getItemCount(); i++)
                    {
                        if(nombreCiudad.equals(this.jcboCiudad.getItemAt(i).toString()))
                        {
                            indiceCiudad = i;
                            break;
                        }
                    }
                    this.jcboCiudad.setSelectedIndex(indiceCiudad);
                    int idiglesia = p.getIdiglesia();
                    String nombreIglesia = new BLL.Iglesia().obtenerNombreIglesia(idiglesia);
                    int indiceIglesia = -1;
                    for(int i=0;i < this.jcboIglesia.getItemCount(); i++)
                    {
                        if(nombreIglesia.equals(this.jcboIglesia.getItemAt(i).toString()))
                        {
                            indiceIglesia = i;
                            break;
                        }
                    }
                    this.jcboIglesia.setSelectedIndex(indiceIglesia);
                    this.jtxtAlojamiento.setText(p.getAlojamiento());
                }
                else
                {
                    jlblBarraEstadoRegistro.setText("El rut ingresado no existe en registros");
                    this.jtxtRutRegistro.requestFocus();
                }
            }
            else
            {
                this.jlblBarraEstadoRegistro.setText("Rut Inválido");
            }
        }
        catch(NumberFormatException e)
        {
            jlblBarraEstadoRegistro.setText("Debe ingresar un rut valido a buscar");
            this.jtxtRutRegistro.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            jlblBarraEstadoRegistro.setText("Ingrese el rut de la persona");
            this.jtxtRutRegistro.requestFocus();
        }
    }
    
    private void actualizarPersona(){
        try
        {
            if (validarRut()) 
            {
                String rutDV = this.jtxtRutRegistro.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
                String nombre = jtxtNombreRegistro.getText().trim();
                if(nombre.length() == 0)
                {
                    nombre = null;
                }
                int contacto = Integer.parseInt(jtxtContacto.getText());
                int folio = Integer.parseInt(jtxtFolio.getText());
                String alojamiento = jtxtAlojamiento.getText().trim();
                if(alojamiento.length() == 0)
                {
                    alojamiento = null;
                }
                int idciudad = new BLL.Ciudad().obtenerIdCiudad(jcboCiudad.getSelectedItem().toString());
                int idiglesia = new BLL.Iglesia().obtenerIdIglesia(jcboIglesia.getSelectedItem().toString());
                int año = Integer.parseInt(jcboAñoRegistro.getSelectedItem().toString());
                int resultado = new BLL.Persona().actualizarPersona(rut, nombre, contacto, folio, alojamiento, idciudad, idiglesia, año);
                switch(resultado)
                {
                    case 0: jlblBarraEstadoRegistro.setText("La persona que deseas actualizar no existe");
                            break;
                    case 1: JOptionPane.showMessageDialog(jbtnActualizarPersona, "Los datos de la persona ha sido actualizados exitosamente", "Actualizaciones", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Edit-Male-User3232.png"));
                            reestablecerFormularioRegistroPersona();
                            listadoPersonasSud();
                            break;
                    case 1048: jlblBarraEstadoRegistro.setText("Debe ingresar todos los campos"); 
                               break;
                    case 1406: jlblBarraEstadoRegistro.setText("Datos exceden la longitud máxima permitida"); 
                               break;
                    case 1062: jlblBarraEstadoRegistro.setText("Folio ocupado"); 
                               break;
                    case 1452: jlblBarraEstadoRegistro.setText("Año del Evento Incorrecto");
                               jcboAñoRegistro.setBackground(Color.cyan);
                               break;    
                    default: JOptionPane.showMessageDialog(null, "Error desconocido. Contacte el administrador: " + resultado, "Actualizaciones", JOptionPane.ERROR_MESSAGE); 
                               break;
                }
            }
            else
            {
                this.jlblBarraEstadoRegistro.setText("Rut Inválido");
            }
        }
        catch(NumberFormatException e)
        {
            jlblBarraEstadoRegistro.setText("Debe ingresar todos los campos");
        }
        catch(NullPointerException e)
        {
            jlblBarraEstadoRegistro.setText("Debe seleccionar: Ciudad e Iglesia.");
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            jlblBarraEstadoRegistro.setText("Ingrese el rut de la persona");
            this.jtxtRutRegistro.requestFocus();
        }
    }
    
    private void eliminarPersona(){
        try
        {
            if(validarRut())
            {    
                String rutDV = this.jtxtRutRegistro.getText();
                int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
                int resultado = new BLL.Persona().eliminarPersona(rut);
                switch(resultado)
                {
                    case 0: jlblBarraEstadoRegistro.setText("La persona no existe en nuestros registros");
                            break;
                    case 1: JOptionPane.showMessageDialog(jbtnEliminarPersona, "Persona Eliminada del Registro", "Eliminando", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/Remove-Male-User3232.png"));
                            reestablecerFormularioRegistroPersona();
                            listadoPersonasSud();
                            break;
                    default: JOptionPane.showMessageDialog(jbtnEliminarPersona, "Error desconocido Contacte a Coordinador: " + resultado, "Eliminando", JOptionPane.ERROR_MESSAGE);
                            break;
                }
            }
            else
            {
                this.jlblBarraEstadoRegistro.setText("Rut Inválido");
            }
        }
        catch(NumberFormatException e)
        {
            jlblBarraEstadoRegistro.setText("Ingrese el rut de la persona");
            this.jtxtRutRegistro.requestFocus();
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            jlblBarraEstadoRegistro.setText("Ingrese el rut de la persona");
            this.jtxtRutRegistro.requestFocus();
        }
    }
    
    private boolean validarRut(){
        try
        {
            String rut = this.jtxtRutRegistro.getText();
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
    
    private void registrarPersonaSud(){
        try
        {
            String rutDV = this.jtxtRutRegistro.getText();
            int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
            String nombre = jtxtNombreRegistro.getText().trim();
            if(nombre.length() == 0)
            {
                nombre = null;
            }
            int contacto = Integer.parseInt(jtxtContacto.getText());
            int folio = Integer.parseInt(jtxtFolio.getText());
            String alojamiento = jtxtAlojamiento.getText().trim();
            if(alojamiento.length() == 0)
            {
                alojamiento = null;
            }
            int idciudad = new BLL.Ciudad().obtenerIdCiudad(jcboCiudad.getSelectedItem().toString());
            int idiglesia = new BLL.Iglesia().obtenerIdIglesia(jcboIglesia.getSelectedItem().toString());
            int año = Integer.parseInt(jcboAñoRegistro.getSelectedItem().toString());
            int resultado = new BLL.Persona().registrarPersona(rut, nombre, contacto, folio, alojamiento, idciudad, idiglesia, año);
            switch (resultado) 
            {
                case 1: JOptionPane.showMessageDialog(jButtonIngresarRegistro, "Persona registrada exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Imagenes/Add-Male-User4848.png"));
                        listadoPersonasSud();
                        registrarMovimientoResgistro();
                        reestablecerFormularioRegistroPersona();
                        break;
                case 1048: jlblBarraEstadoRegistro.setText("Debe ingresar todos los campos"); 
                           break;
                case 1062: jlblBarraEstadoRegistro.setText("Rut y/o Folio ya Registrado(s)"); 
                           this.jtxtRutRegistro.setBackground(Color.gray);
                           this.jtxtFolio.setBackground(Color.gray);
                           break;
                case 1406: jlblBarraEstadoRegistro.setText("Datos exceden la longitud máxima permitida"); 
                           break;
                case 1452: jlblBarraEstadoRegistro.setText("Año del Evento Incorrecto");
                           jcboAñoRegistro.setBackground(Color.cyan);
                           break;
                default: JOptionPane.showMessageDialog(jButtonIngresarRegistro, "Error desconocido. Contacte el administrador: " + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRutRegistro, "Debe Ingresar: \n-Rut.\n-Contacto.\n-Folio.\n-Monto.","Registros SUD",JOptionPane.WARNING_MESSAGE);
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRutRegistro, "Debe seleccionar: \n-Ciudad\n-Iglesia","Registros SUD",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void listadoPersonasSud(){
        ArrayList<BLL.Persona> listado = new BLL.Persona().listadoPersonas();
        DecimalFormat formatoRut = new DecimalFormat("#,###");
        DefaultTableModel modelo = new DefaultTableModel()
        { 
        public boolean isCellEditable(int rowIndex,int columnIndex){return false;} 
        };
        modelo.addColumn("Rut");
        modelo.addColumn("Nombre Participante");
        modelo.addColumn("Contacto");
        modelo.addColumn("Folio");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Iglesia");
        modelo.addColumn("Año");
        for(BLL.Persona m: listado)   
        {
            Object fila[] = new Object[8];
            fila[0] = formatoRut.format(m.getRut()) + "-" + obtenerDigitoVerificador(m.getRut());
            fila[1] = m.getNombre();
            fila[2] = m.getContacto();
            fila[3] = m.getFolio();
            fila[4] = m.getAlojamiento();
            fila[5] = new BLL.Ciudad().obtenerNombreCiudad(m.getIdciudad());
            fila[6] = new BLL.Iglesia().obtenerNombreIglesia(m.getIdiglesia());
            fila[7] = m.getAño();
            modelo.addRow(fila);
        }
        this.jTableListadoSudIngresados.setModel(modelo);
        jlblCantidadPersonas.setText(String.valueOf(new BLL.Persona().listadoPersonas().size()));
    }
    
    private void registrarPersona(){
        if (validarFormularioPersonas())
        {
            registrarPersonaSud();
        }
        else
        {
            jlblBarraEstadoRegistro.setText("Debe ingresar todos los valores que se indican.");
        }
    }
    
    private boolean validarFormularioPersonas(){
        int validaciones = 0;
        if(! validarRut())
        {
            this.jtxtRutRegistro.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtRutRegistro.setBackground(Color.white);
        }
        if(this.jtxtNombreRegistro.getText().trim().isEmpty())
        {
            this.jtxtNombreRegistro.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtNombreRegistro.setBackground(Color.white);
        }
        if(this.jtxtContacto.getText().trim().isEmpty())
        {
            this.jtxtContacto.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtContacto.setBackground(Color.white);
        }
        if(this.jtxtFolio.getText().trim().isEmpty())
        {
            this.jtxtFolio.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtFolio.setBackground(Color.white);
        }
        if(this.jcboCiudad.getSelectedIndex() == -1)
        {
            this.jcboCiudad.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jcboCiudad.setBackground(Color.white);
        }
        if(this.jcboIglesia.getSelectedIndex() == -1)
        {
            this.jcboIglesia.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jcboIglesia.setBackground(Color.white);
        }
        if(this.jtxtAlojamiento.getText().trim().isEmpty())
        {
            this.jtxtAlojamiento.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtAlojamiento.setBackground(Color.white);
        }
        if(this.jtxtCancela.getText().trim().isEmpty())
        {
            this.jtxtCancela.setBackground(Color.cyan);
            validaciones++;
        }
        else{
            this.jtxtCancela.setBackground(Color.white);
        }
        return validaciones == 0;
    }
    
    private void listadoMovimientos(){
        ArrayList<BLL.Movimiento> listado = new BLL.Movimiento().listadoMovimientos();
        DecimalFormat formatMoney = new DecimalFormat("$ #,###");
        DefaultTableModel modelo = new DefaultTableModel()
        { 
        public boolean isCellEditable(int rowIndex,int columnIndex){return false;} 
        };
        modelo.addColumn("Codigo");
        modelo.addColumn("Registro");
        modelo.addColumn("Monto");
        modelo.addColumn("Detalle del Movimiento");
        modelo.addColumn("Año");
        for(BLL.Movimiento m: listado)   
        {
            Object fila[] = new Object[5];
            fila[0] = m.getCodigo();
            fila[1] = m.getMovimiento();
            fila[2] = formatMoney.format(m.getMonto());
            fila[3] = m.getDetalle();
            fila[4] = m.getAño();
            modelo.addRow(fila);
        }
        this.jTableListadoMovimientos.setModel(modelo);
        jlblFondoSud.setText(formatMoney.format(new BLL.Sud().obtenerFondoSud()));
    }
    
    private void registrarMovimientoResgistro(){
        try
        {
            int codigo = Integer.parseInt(this.jtxtCodigoMovimientoRegistro.getText());
            int monto = Integer.parseInt(this.jtxtCancela.getText());
            String movimiento = "Ingreso";
            String detalle = "Cancela Entrada: " + this.jtxtNombreRegistro.getText().trim();
            if(detalle.length() == 0)
            {
                detalle = null;
            }
            int año = Integer.parseInt(this.jcboAñoRegistro.getSelectedItem().toString());
            int resultado = new BLL.Movimiento().registrarNuevaMovimiento(codigo,monto,movimiento,detalle,año);
            ////////
            while (resultado == 1062) 
            {
                codigo++;
                resultado = new BLL.Movimiento().registrarNuevaMovimiento(codigo,monto,movimiento,detalle,año);
            }
            ////////
            switch(resultado)
            {
                case 1:     actualizarFondoSudIngreso(monto);
                            listadoMovimientos();
                            reestablecerFormularioRegistroNuevaMovimiento();
                            break;
                case 1048:  jlblBarraEstadoRegistro.setText("Debe ingresar el Nombre de la Persona"); 
                            break; 
                default: JOptionPane.showMessageDialog(jButtonIngresarRegistro, "Error desconocido, contacte al Coordinador..."  + resultado, "Movimiento resgistro", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            jlblBarraEstadoRegistro.setText("Debe ingresar un Monto");
        }
    }
    
    private void registrarMovimiento(){
        try
        {    
            int codigo = Integer.parseInt(this.jtxtCodigoMovimiento.getText());
            int monto = Integer.parseInt(this.jtxtMontoMovimiento.getText());
            String movimiento = "";
            if (this.jrbtnIngreso.isSelected()) 
            {
                movimiento = "Ingreso";
            }
            else
            {
                 movimiento = "Egreso";
                 monto*=-1;
            }
            String detalle = this.jtxtDetalleMovimiento.getText().trim();
            if(detalle.length() == 0)
            {
                detalle = null;
            }
            int año = Integer.parseInt(this.jcboañoMovimientos.getSelectedItem().toString());
            int resultado = new BLL.Movimiento().registrarNuevaMovimiento(codigo,monto,movimiento,detalle,año);
            ////////
            while (resultado == 1062) 
            {
                codigo++;
                resultado = new BLL.Movimiento().registrarNuevaMovimiento(codigo,monto,movimiento,detalle,año);
            }
            ////////
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(jInternalFrameMovimientos, "Movimiento registrado exitosamente", "Movimiento", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("Imagenes/Cash_register4848.png"));
                        actualizarFondoSudIngreso(monto);
                        listadoMovimientos();
                        reestablecerFormularioRegistroNuevaMovimiento();
                        break;
                case 1048: jlblBarraEstadoMovimientos.setText("Debe ingresar el detalle del Movimiento");
                           break;
                case 1062: jlblBarraEstadoMovimientos.setText("Movimiento ya ingresado");
                           break;
                case 1452: jlblBarraEstadoMovimientos.setText("Año del Evento Incorrecto");
                           break;
                default: JOptionPane.showMessageDialog(this.jInternalFrameMovimientos, "Error desconocido, contacte al Coordinador..."  + resultado, "Movimiento", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            jlblBarraEstadoMovimientos.setText("Debe ingresar un Monto");
        }
    }
    
    private void actualizarFondoSudIngreso(int monto){
        try
        {
            int resultado = new BLL.Sud().actualizarFondoSud(monto);
            switch(resultado)
            {
                case 0: JOptionPane.showMessageDialog(null, "Fondo No creado", "Fondo Sud", JOptionPane.WARNING_MESSAGE);
                        break;
                case 1: System.out.println("Monto ingresado a Fondo Sud");
                
                        break;    
                default:JOptionPane.showMessageDialog(null, "Error desconocido. Contacte el administrador: " + resultado, "Fondo Sud", JOptionPane.ERROR_MESSAGE); 
                        break;
            }
        }
        catch(NumberFormatException e)
        {
            e.getMessage();
        }
    }
    
    private void registrarCiudad(){
        int id = Integer.parseInt(this.jtxtCodigoCiudad.getText());
        String nombreCiudad = this.jtxtNombreCiudad.getText().trim();
        if(nombreCiudad.length() == 0)
        {
            nombreCiudad = null;
        }
        int resultado = new BLL.Ciudad().registrarNuevaCiudad(id, nombreCiudad);
        switch(resultado)
        {
            case 1: JOptionPane.showMessageDialog(this.jbtnAgregarCiudad, "Ciudad registrada exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/Imagenes/city3232.png"));
                    reestablecerFormularioRegistroNuevaCiudad();
                    cargarListadoCiudades();
                    this.jInternalFrameAgregarCiudad.setVisible(false);
                    break;
            case 1048: JOptionPane.showMessageDialog(this.jbtnAgregarCiudad, "Debe ingresar el nombre de la Ciudad", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            case 1062: JOptionPane.showMessageDialog(this.jbtnAgregarCiudad, "Ciudad ya ingresada", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            case 1406: JOptionPane.showMessageDialog(this.jbtnAgregarCiudad, "El nombre de la Ciudad excede el largo máximo permitido", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            default: JOptionPane.showMessageDialog(this.jbtnAgregarCiudad, "Error desconocido, contacte al Coordinador..."  + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
        }
    }
    
    private void registrarIglesia(){
        int id = Integer.parseInt(this.jtxtCodigoIglesia.getText());
        String nombreIglesia = this.jtxtNombreIglesia.getText().trim();
        if(nombreIglesia.length() == 0)
        {
            nombreIglesia = null;
        }
        int resultado = new BLL.Iglesia().registrarNuevaIglesia(id, nombreIglesia);
        switch(resultado)
        {
            case 1: JOptionPane.showMessageDialog(this.jbtnAgregarIglesia, "Iglesia registrada exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Imagenes/CatholicTemple3232.png"));
                    reestablecerFormularioRegistroNuevaIglesia();
                    cargarListadoIglesias();
                    this.jInternalFrameAgregarIglesia.setVisible(false);
                    break;
            case 1048: JOptionPane.showMessageDialog(this.jbtnAgregarIglesia, "Debe ingresar el nombre de la Iglesia", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            case 1062: JOptionPane.showMessageDialog(this.jbtnAgregarIglesia, "Iglesia ya ingresada", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            case 1406: JOptionPane.showMessageDialog(this.jbtnAgregarIglesia, "El nombre de la Iglesia excede el largo máximo permitido", "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
            default: JOptionPane.showMessageDialog(this.jbtnAgregarIglesia, "Error desconocido, contacte al Coordinador..."  + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                       break;
        }
    }
    
    private void reestablecerFormularioRegistroPersona(){
        this.jtxtRutRegistro.setText(null);
        this.jtxtNombreRegistro.setText(null);
        this.jtxtContacto.setText(null);
        this.jtxtFolio.setText(null);
        this.jtxtAlojamiento.setText(null);
        this.jtxtCancela.setText(null);
        cargarListadoCiudades();
        cargarListadoIglesias();
        obtenerIdMovimiento();
        this.jtxtCodigoMovimientoRegistro.setText(this.jtxtCodigoMovimiento.getText());
        this.jlblBarraEstadoRegistro.setText("");
        this.jtxtRutRegistro.setBackground(Color.white);
        this.jtxtNombreRegistro.setBackground(Color.white);
        this.jtxtContacto.setBackground(Color.white);
        this.jtxtFolio.setBackground(Color.white);
        this.jcboCiudad.setBackground(Color.white);
        this.jcboIglesia.setBackground(Color.white);
        this.jtxtAlojamiento.setBackground(Color.white);
        this.jtxtCancela.setBackground(Color.white);
        jcboAñoRegistro.setBackground(Color.white);
        this.jtxtRutRegistro.requestFocus();
    }
    
    private void cargarListadoCiudades(){
        this.jcboCiudad.removeAllItems();
        ArrayList<BLL.Ciudad> ciudades = new BLL.Ciudad().listadoCiudades();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Ciudad c: ciudades)
        {
            modelo.addElement(c);
        }
        this.jcboCiudad.setModel(modelo);
        this.jcboCiudad.setSelectedIndex(-1);
    }
    
    private void cargarListadoIglesias(){
        this.jcboIglesia.removeAllItems();
        ArrayList<BLL.Iglesia> iglesias = new BLL.Iglesia().listadoIglesias();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(BLL.Iglesia i: iglesias)
        {
            modelo.addElement(i);
        }
        this.jcboIglesia.setModel(modelo);
        this.jcboIglesia.setSelectedIndex(-1);
    }
    
    private void reestablecerFormularioRegistroNuevaCiudad(){
        this.obtenerIdCiudad();
        this.jtxtNombreCiudad.setText(null);
        this.jtxtNombreCiudad.requestFocus();
    }
    
    private void reestablecerFormularioRegistroNuevaMovimiento(){
        this.obtenerIdMovimiento();
        this.jtxtCodigoMovimientoRegistro.setText(this.jtxtCodigoMovimiento.getText());
        this.jrbtnIngreso.setSelected(true);
        this.jtxtMontoMovimiento.setText(null);
        this.jtxtDetalleMovimiento.setText(null);
        this.jlblBarraEstadoMovimientos.setText("");
        this.jtxtMontoMovimiento.requestFocus();
    }
    
    private void reestablecerFormularioRegistroNuevaIglesia(){
        this.obtenerIdIglesia();
        this.jtxtNombreIglesia.setText(null);
        this.jtxtNombreIglesia.requestFocus();
    }
    
    private void obtenerIdMovimiento(){
        int max = new BLL.Movimiento().registroMaxMovimiento();
        if(max > -1)
        {
            this.jtxtCodigoMovimiento.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(this.jInternalFrameMovimientos, "Se ha producido un error!!!", "Registro Movimiento", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void obtenerIdCiudad(){
        int max = new BLL.Ciudad().registroMaxCiudad();
        if(max > -1)
        {
            this.jtxtCodigoCiudad.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(this.jInternalFrameAgregarCiudad, "Se ha producido un error!!!", "Registro Ciudad", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void obtenerIdIglesia(){
        int max = new BLL.Iglesia().registroMaxIglesia();
        if(max > -1)
        {
            this.jtxtCodigoIglesia.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(this.jInternalFrameAgregarIglesia, "Se ha producido un error!!!", "Registro Iglesia", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public char obtenerDigitoVerificador(int rut){
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
        {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return (char) (s != 0 ? s + 47 : 75);  
    }
    
    public void configControlSudFrame(){
        ControlIngreso c = new ControlIngreso();
        c.setTitle("Solo un Dios 2015 'Él en NOSOTROS en ÉL'");
        c.setResizable(true);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        c.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(ControlIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstadisticas;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonIngresarRegistro;
    private javax.swing.JButton jButtonReestablecerRegistro;
    private javax.swing.JDesktopPane jDesktopPaneSUD;
    private javax.swing.JInternalFrame jInternalFrameAgregarCiudad;
    private javax.swing.JInternalFrame jInternalFrameAgregarIglesia;
    private javax.swing.JInternalFrame jInternalFrameInfo;
    private javax.swing.JInternalFrame jInternalFrameListadoMovimientos;
    private javax.swing.JInternalFrame jInternalFrameListadoSud;
    private javax.swing.JInternalFrame jInternalFrameMovimientos;
    private javax.swing.JInternalFrame jInternalFrameRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlojamiento;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelAñoRegistro;
    private javax.swing.JLabel jLabelCancela;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigoCiudad;
    private javax.swing.JLabel jLabelCodigoEstadistica;
    private javax.swing.JLabel jLabelCodigoIglesia;
    private javax.swing.JLabel jLabelContacto;
    private javax.swing.JLabel jLabelDetalleEstadistica;
    private javax.swing.JLabel jLabelFolio;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGastosEstadistica;
    private javax.swing.JLabel jLabelIglesia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelOpcionEstadistica;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTituloEstadisticas;
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemListadoMovimientos;
    private javax.swing.JMenuItem jMenuItemListadoSud;
    private javax.swing.JMenuItem jMenuItemMovimientos;
    private javax.swing.JMenuItem jMenuItemRegistro;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JPanel jPanelMovimiento;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableListadoMovimientos;
    private javax.swing.JTable jTableListadoSudIngresados;
    private javax.swing.JButton jbtnActualizarPersona;
    private javax.swing.JButton jbtnAgregarCiudad;
    private javax.swing.JButton jbtnAgregarCiudadRegistro;
    private javax.swing.JButton jbtnAgregarIglesia;
    private javax.swing.JButton jbtnAgregarIglesiaRegistro;
    private javax.swing.JButton jbtnBuscarPersona;
    private javax.swing.JButton jbtnCancelarAgregarIglesia;
    private javax.swing.JButton jbtnEliminarPersona;
    private javax.swing.JButton jbtnIngresarMovimiento;
    private javax.swing.JButton jbtnReportePersonasSUD;
    private javax.swing.JButton jbtnReportePersonasSUD1;
    private javax.swing.JComboBox jcboAñoRegistro;
    private javax.swing.JComboBox jcboCiudad;
    private javax.swing.JComboBox jcboIglesia;
    private javax.swing.JComboBox jcboañoMovimientos;
    private javax.swing.JLabel jlblBarraEstadoMovimientos;
    private javax.swing.JLabel jlblBarraEstadoRegistro;
    private javax.swing.JLabel jlblCantidadPersonas;
    private javax.swing.JLabel jlblFondoSud;
    private javax.swing.JLabel jlblIconoMAS;
    private javax.swing.JLabel jlblIconoMENOS;
    private javax.swing.JLabel jlblIglesia;
    private javax.swing.JTextPane jpaneltxtDetalleMovimiento;
    private javax.swing.JRadioButton jrbtnEgreso;
    private javax.swing.JRadioButton jrbtnIngreso;
    private javax.swing.JTextField jtxtAlojamiento;
    private javax.swing.JTextField jtxtCancela;
    private javax.swing.JTextField jtxtCodigoCiudad;
    private javax.swing.JTextField jtxtCodigoIglesia;
    private javax.swing.JTextField jtxtCodigoMovimiento;
    private javax.swing.JTextField jtxtCodigoMovimientoRegistro;
    private javax.swing.JTextField jtxtContacto;
    private javax.swing.JTextPane jtxtDetalleMovimiento;
    private javax.swing.JTextField jtxtFolio;
    private javax.swing.JTextField jtxtMontoMovimiento;
    private javax.swing.JTextField jtxtNombreCiudad;
    private javax.swing.JTextField jtxtNombreIglesia;
    private javax.swing.JTextField jtxtNombreRegistro;
    private javax.swing.JTextField jtxtRutRegistro;
    // End of variables declaration//GEN-END:variables
}
