/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BGGUI;

import BGBLL.BGPerfil;
import BGBLL.BGTipoperfil;
import BGBLL.BGUsername;
import BGBLL.BGUsuario;
import BGDAL.BGConectar;
import BGDAL.BGPerfilDAL;
import BGDAL.BGTipoperfilDAL;
import BGDAL.BGUsernameDAL;
import BGDAL.BGUsuarioDAL;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Bastian
 */
public class BGMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form BGMenuGUI
     */
    public BGMenuGUI() {
        initComponents();
        BGTipoperfilDAL tipper = new BGTipoperfilDAL();
        cmbtipoperfil.removeAllItems();
        cmbaperfil.removeAllItems();
       combatperfil.removeAllItems();
        for(BGTipoperfil tper : tipper.comboTipoperfil())
        {
            cmbtipoperfil.addItem(tper.getTipoperfil());
            combatperfil.addItem(tper.getTipoperfil());
        }
        //oculta botonera y paneles//
        this.pdatosmusername.setVisible(false);
        this.pdatosmperfil.setVisible(false);
        this.pdatosmusuarios.setVisible(false);
        this.txtnombreeusername.setEnabled(false);
        this.txtapellidoeusername.setEnabled(false);
        this.paneleusername.setVisible(false);
        this.checkeusername.setEnabled(false);
        this.txtapellidoeperfil.setEnabled(false);
        this.txtnombreeperfil.setEnabled(false);
        this.checkeperfil.setEnabled(false);
        this.paneleperfil.setVisible(false);
         this.txtnombreeusuario.setEnabled(false);
         this.txtapellidoeusuario.setEnabled(false);
         this.txtedadeusuario.setEnabled(false);
        this.checkeusuario.setEnabled(false);
        this.paneleusuario.setVisible(false);
        this.txtnombreausername.setEnabled(false);
        this.txtapellidoausername.setEnabled(false);
        this.checkausername.setEnabled(false);
        this.panelausername.setVisible(false);
        this.txtinfoaperfil.setVisible(false);
        this.txtinfoaperfil1.setVisible(false);
        this.txtinfoaperfil2.setVisible(false);
        this.combatperfil.setVisible(false);
        this.listaperfil.setVisible(false);
        this.panelaperfil.setVisible(false);
         this.txtnombreaperfil.setVisible(false);
         this.txtapellidoaperfil.setVisible(false);
         this.txtedadaperfil.setVisible(false);
         this.txtnombreaperfil.setEnabled(false);
         this.txtapellidoaperfil.setEnabled(false);
         this.txtedadaperfil.setEnabled(false);
         this.cmbaperfil.setVisible(false);
        this.panelausuario.setVisible(false);
         this.checkaperfil.setEnabled(false);
        this.checkausuario.setEnabled(false);
       this.txtedadausuario.setVisible(false);
        this.txtapellidoausuario.setVisible(false);
          this.txtnombreausuario.setVisible(false);
          this.jCheckBox1.setEnabled(false);
          this.txtnombrerperfil.setEnabled(false);
          this.txtapellidorperfil.setEnabled(false);
          this.txtedadrperfil.setEnabled(false);
          this.panelrusername.setVisible(false);
          this.panelrperfil.setVisible(false);
          this.panelrusuario.setVisible(false);
          this.btnguardarusuario.setVisible(true);
          this.btncrear.setVisible(false);
          this.btnactualizar.setVisible(false);
          this.btneliminar.setVisible(false);
          this.btnmostrar.setVisible(false);
          this.btnmostrar1.setVisible(false);
          this.panelcrear.setVisible(false);
          this.panelactualizar.setVisible(false);
          this.paneleliminar.setVisible(false);
          this.panelmostrar.setVisible(false);
          this.panelmenu.setVisible(true);
          //--------------//
   BGUsernameDAL usurn = new BGUsernameDAL(); 
    BGUsuario us = new BGUsuario();
    BGPerfilDAL per = new BGPerfilDAL();
    BGUsuarioDAL usu = new BGUsuarioDAL();
    us = usurn.buscarUsuario(BGLoginGui.id);
    // pe = per.buscarPerfil(us.getId_usuario());
    this.txtbienvenida.setText("Bienvenido Sr.");
    this.txtbienvenida1.setText(us.getNombre()+" "+us.getApellido());
    String auxrut =usu.FormatoRutUsuario(String.valueOf(us.getRun()+String.valueOf(us.getDv())));
    this.txtrut.setText(auxrut);
    for(BGPerfil pe: per.buscarPerfil(us.getId_usuario()))
      {
        switch(pe.getTipoperfil()){
      case "Administrador":
          this.btncrear.setVisible(true);
          this.btnactualizar.setVisible(true);
          this.btneliminar.setVisible(true);
          this.btnmostrar.setVisible(true);
          this.btnmostrar1.setVisible(true);
          break;
      case "Cliente":
          break;
      case "Creador":
          this.btncrear.setVisible(true);
          break;
      case "Actualizador":
          this.btnactualizar.setVisible(true);
          break;
      case "Eliminador":
          this.btneliminar.setVisible(true);
          break;
      case "Mostrador":
          this.btnmostrar.setVisible(true);
          this.btnmostrar1.setVisible(true);
          break;
     } 
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btncrear = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JLabel();
        btnmostrar1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JLabel();
        btnsalir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelmostrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnmostrarperfil = new javax.swing.JButton();
        btnmostrarusername = new javax.swing.JButton();
        btnmostarusuario = new javax.swing.JButton();
        pdatosmusuarios = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablamusuario = new javax.swing.JTable();
        btncerrrar9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pdatosmperfil = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablamperfil = new javax.swing.JTable();
        btncerrrar10 = new javax.swing.JButton();
        pdatosmusername = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablamusername = new javax.swing.JTable();
        btncerrrar11 = new javax.swing.JButton();
        panelcrear = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btncrearusername = new javax.swing.JButton();
        btncrearperfil = new javax.swing.JButton();
        btncrearusuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelrperfil = new javax.swing.JPanel();
        txttipoperfil = new javax.swing.JLabel();
        btnguardarperfil = new javax.swing.JButton();
        txtapellidorperfil = new javax.swing.JTextField();
        btncerrrar1 = new javax.swing.JButton();
        txtrunrperfil = new javax.swing.JTextField();
        txtedadrperfil = new javax.swing.JTextField();
        txtnombrerperfil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txterror1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbtipoperfil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelrusuario = new javax.swing.JPanel();
        btnguardarusuario = new javax.swing.JButton();
        txtapellidoregistro = new javax.swing.JTextField();
        btncerrrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtdvregistro = new javax.swing.JTextField();
        txtrunregistro = new javax.swing.JTextField();
        txtedadregistro = new javax.swing.JTextField();
        txtnombreregistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txterror = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelrusername = new javax.swing.JPanel();
        btnguardarusuario1 = new javax.swing.JButton();
        btncerrrar2 = new javax.swing.JButton();
        txtusernamerusername = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txterror2 = new javax.swing.JLabel();
        txtpasswordrusername = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtrunrusername = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        paneleliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btneliminarusuario = new javax.swing.JButton();
        btneliminarusername = new javax.swing.JButton();
        btneliminarperfil = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        paneleusuario = new javax.swing.JPanel();
        btnguardarusuario5 = new javax.swing.JButton();
        txtruneusuario = new javax.swing.JTextField();
        btncerrrar6 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txterroreusuario = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        checkeusuario = new javax.swing.JCheckBox();
        btnBuscar5 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        pdatoseusuario = new javax.swing.JPanel();
        txtedadeusuario = new javax.swing.JTextField();
        txtnombreeusuario = new javax.swing.JTextField();
        txtapellidoeusuario = new javax.swing.JTextField();
        paneleusername = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        btncerrrar8 = new javax.swing.JButton();
        btnguardarusuario7 = new javax.swing.JButton();
        txtruneusername = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txterroreusername = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        checkeusername = new javax.swing.JCheckBox();
        btnBuscar7 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        pdatoseusername = new javax.swing.JPanel();
        txtnombreeusername = new javax.swing.JTextField();
        txtapellidoeusername = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listeusername = new javax.swing.JList<>();
        txtinfoeperfil3 = new javax.swing.JLabel();
        txtinfoeperfil4 = new javax.swing.JLabel();
        txtinfoeperfil5 = new javax.swing.JLabel();
        cmbeusername = new javax.swing.JComboBox<>();
        paneleperfil = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btncerrrar7 = new javax.swing.JButton();
        btnguardarusuario6 = new javax.swing.JButton();
        txtruneperfil = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txterroreperfil = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        checkeperfil = new javax.swing.JCheckBox();
        btnBuscar6 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        pdatoseperfil = new javax.swing.JPanel();
        txtnombreeperfil = new javax.swing.JTextField();
        txtapellidoeperfil = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listeperfil = new javax.swing.JList<>();
        txtinfoeperfil2 = new javax.swing.JLabel();
        txtinfoeperfil = new javax.swing.JLabel();
        txtinfoeperfil1 = new javax.swing.JLabel();
        cmbeperfil = new javax.swing.JComboBox<>();
        panelactualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnactualizarusuario = new javax.swing.JButton();
        btnactualizarperfil = new javax.swing.JButton();
        btnactualizarusername = new javax.swing.JButton();
        panelausername = new javax.swing.JPanel();
        txtrunausername = new javax.swing.JTextField();
        txtinfoausername1 = new javax.swing.JLabel();
        txtinfoausername2 = new javax.swing.JLabel();
        txtpassapass = new javax.swing.JPasswordField();
        btnguardarusuario4 = new javax.swing.JButton();
        txtusernameausername = new javax.swing.JTextField();
        txtapellidoausername = new javax.swing.JTextField();
        btncerrrar5 = new javax.swing.JButton();
        txtnombreausername = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txterrorausername = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        checkausername = new javax.swing.JCheckBox();
        btnBuscar4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listausername = new javax.swing.JList<>();
        txtinfoausername = new javax.swing.JLabel();
        txtinfoausername3 = new javax.swing.JLabel();
        cmbausername = new javax.swing.JComboBox<>();
        panelausuario = new javax.swing.JPanel();
        btnguardarusuario2 = new javax.swing.JButton();
        txtapellidoausuario = new javax.swing.JTextField();
        txtrunausuario = new javax.swing.JTextField();
        btncerrrar3 = new javax.swing.JButton();
        txtedadausuario = new javax.swing.JTextField();
        txtnombreausuario = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txterrorausuario = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        checkausuario = new javax.swing.JCheckBox();
        btnBuscar2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        panelaperfil = new javax.swing.JPanel();
        txterroraperfil = new javax.swing.JLabel();
        btnguardarusuario3 = new javax.swing.JButton();
        txtapellidoaperfil = new javax.swing.JTextField();
        txtrunaperfil = new javax.swing.JTextField();
        btncerrrar4 = new javax.swing.JButton();
        txtedadaperfil = new javax.swing.JTextField();
        txtnombreaperfil = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        checkaperfil = new javax.swing.JCheckBox();
        btnBuscar3 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmbaperfil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaperfil = new javax.swing.JList<>();
        txtinfoaperfil1 = new javax.swing.JLabel();
        txtinfoaperfil = new javax.swing.JLabel();
        combatperfil = new javax.swing.JComboBox<>();
        txtinfoaperfil2 = new javax.swing.JLabel();
        panelmenu = new javax.swing.JPanel();
        txtrut = new javax.swing.JLabel();
        txtbienvenida = new javax.swing.JLabel();
        txtbienvenida1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncrear.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btncrear.setForeground(new java.awt.Color(255, 255, 255));
        btncrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Plus_32.png"))); // NOI18N
        btncrear.setText(" Creador");
        btncrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncrear.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btncrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncrear.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btncrearComponentAdded(evt);
            }
        });
        btncrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearMouseClicked(evt);
            }
        });
        btncrear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncrearKeyTyped(evt);
            }
        });
        getContentPane().add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, -1));

        btnmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmenu.setText(" Menu");
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        btnmostrar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnmostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnmostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconomostrar_32.png"))); // NOI18N
        btnmostrar.setText("Mostrador");
        btnmostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmostrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 70, -1));

        btnmostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconobuscar_32.png"))); // NOI18N
        getContentPane().add(btnmostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 30, 30));

        btneliminar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Trash_Can_32.png"))); // NOI18N
        btneliminar.setText("Eliminador");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 70, -1));

        btnactualizar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Edit_32.png"))); // NOI18N
        btnactualizar.setText(" Actualizar");
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnactualizarMouseClicked(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, -1));

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 0, 0));
        btnsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cerrar_32.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/fondoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 440));

        panelmostrar.setBackground(new java.awt.Color(33, 67, 115));
        panelmostrar.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu Mostrar");
        panelmostrar.add(jLabel6);
        jLabel6.setBounds(110, 0, 200, 30);

        jLabel19.setText("Desarrollador : Bastian Gonzalez");
        panelmostrar.add(jLabel19);
        jLabel19.setBounds(160, 420, 240, 20);

        btnmostrarperfil.setBackground(new java.awt.Color(33, 67, 115));
        btnmostrarperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnmostrarperfil.setForeground(new java.awt.Color(255, 255, 255));
        btnmostrarperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoLogin_32.png"))); // NOI18N
        btnmostrarperfil.setText("Mostrar Perfies");
        btnmostrarperfil.setBorder(null);
        btnmostrarperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmostrarperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmostrarperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmostrarperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmostrarperfilMouseClicked(evt);
            }
        });
        btnmostrarperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarperfilActionPerformed(evt);
            }
        });
        panelmostrar.add(btnmostrarperfil);
        btnmostrarperfil.setBounds(160, 30, 100, 60);

        btnmostrarusername.setBackground(new java.awt.Color(33, 67, 115));
        btnmostrarusername.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnmostrarusername.setForeground(new java.awt.Color(255, 255, 255));
        btnmostrarusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        btnmostrarusername.setText("Mostrar Usernames");
        btnmostrarusername.setBorder(null);
        btnmostrarusername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmostrarusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmostrarusername.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmostrarusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmostrarusernameMouseClicked(evt);
            }
        });
        btnmostrarusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarusernameActionPerformed(evt);
            }
        });
        panelmostrar.add(btnmostrarusername);
        btnmostrarusername.setBounds(280, 30, 130, 60);

        btnmostarusuario.setBackground(new java.awt.Color(33, 67, 115));
        btnmostarusuario.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnmostarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnmostarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Find_User_Male_32.png"))); // NOI18N
        btnmostarusuario.setText("Mostrar Usuarios");
        btnmostarusuario.setBorder(null);
        btnmostarusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmostarusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmostarusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmostarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmostarusuarioMouseClicked(evt);
            }
        });
        btnmostarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostarusuarioActionPerformed(evt);
            }
        });
        panelmostrar.add(btnmostarusuario);
        btnmostarusuario.setBounds(30, 30, 110, 60);

        pdatosmusuarios.setBackground(new java.awt.Color(33, 67, 115));
        pdatosmusuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pdatosmusuarios.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Usuarios");
        pdatosmusuarios.add(jLabel47);
        jLabel47.setBounds(160, 10, 100, 22);

        tablamusuario.setBackground(new java.awt.Color(33, 67, 115));
        tablamusuario.setForeground(new java.awt.Color(255, 255, 255));
        tablamusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablamusuario);

        pdatosmusuarios.add(jScrollPane5);
        jScrollPane5.setBounds(10, 90, 380, 240);

        btncerrrar9.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar9MouseClicked(evt);
            }
        });
        btncerrrar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar9ActionPerformed(evt);
            }
        });
        pdatosmusuarios.add(btncerrrar9);
        btncerrrar9.setBounds(350, 10, 40, 36);

        jButton2.setBackground(new java.awt.Color(33, 67, 115));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8-boleta-de-calificaciones-36.png"))); // NOI18N
        jButton2.setText("Reporte Tranferencia");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHideActionText(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pdatosmusuarios.add(jButton2);
        jButton2.setBounds(10, 50, 200, 30);

        jButton1.setBackground(new java.awt.Color(33, 67, 115));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8-boleta-de-calificaciones-36.png"))); // NOI18N
        jButton1.setText("Reporte Pagos");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pdatosmusuarios.add(jButton1);
        jButton1.setBounds(220, 50, 150, 30);

        panelmostrar.add(pdatosmusuarios);
        pdatosmusuarios.setBounds(10, 90, 400, 340);

        pdatosmperfil.setBackground(new java.awt.Color(33, 67, 115));
        pdatosmperfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pdatosmperfil.setLayout(null);

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Perfiles");
        pdatosmperfil.add(jLabel49);
        jLabel49.setBounds(150, 0, 80, 30);

        tablamperfil.setBackground(new java.awt.Color(33, 67, 115));
        tablamperfil.setForeground(new java.awt.Color(255, 255, 255));
        tablamperfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablamperfil);

        pdatosmperfil.add(jScrollPane6);
        jScrollPane6.setBounds(10, 50, 380, 260);

        btncerrrar10.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar10MouseClicked(evt);
            }
        });
        btncerrrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar10ActionPerformed(evt);
            }
        });
        pdatosmperfil.add(btncerrrar10);
        btncerrrar10.setBounds(340, 10, 40, 36);

        panelmostrar.add(pdatosmperfil);
        pdatosmperfil.setBounds(10, 110, 400, 320);

        pdatosmusername.setBackground(new java.awt.Color(33, 67, 115));
        pdatosmusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pdatosmusername.setLayout(null);

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Username");
        pdatosmusername.add(jLabel50);
        jLabel50.setBounds(150, 0, 110, 30);

        tablamusername.setBackground(new java.awt.Color(33, 67, 115));
        tablamusername.setForeground(new java.awt.Color(255, 255, 255));
        tablamusername.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablamusername);

        pdatosmusername.add(jScrollPane7);
        jScrollPane7.setBounds(10, 50, 380, 260);

        btncerrrar11.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar11MouseClicked(evt);
            }
        });
        btncerrrar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar11ActionPerformed(evt);
            }
        });
        pdatosmusername.add(btncerrrar11);
        btncerrrar11.setBounds(340, 10, 40, 36);

        panelmostrar.add(pdatosmusername);
        pdatosmusername.setBounds(10, 110, 400, 320);

        getContentPane().add(panelmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 420, 440));

        panelcrear.setBackground(new java.awt.Color(33, 67, 115));
        panelcrear.setLayout(null);

        jLabel17.setText("Desarrollador : Bastian Gonzalez");
        panelcrear.add(jLabel17);
        jLabel17.setBounds(180, 420, 184, 20);

        btncrearusername.setBackground(new java.awt.Color(33, 67, 115));
        btncrearusername.setForeground(new java.awt.Color(255, 255, 255));
        btncrearusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        btncrearusername.setText("Crear Username");
        btncrearusername.setBorder(null);
        btncrearusername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncrearusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncrearusername.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncrearusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearusernameMouseClicked(evt);
            }
        });
        btncrearusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearusernameActionPerformed(evt);
            }
        });
        panelcrear.add(btncrearusername);
        btncrearusername.setBounds(270, 40, 120, 60);

        btncrearperfil.setBackground(new java.awt.Color(33, 67, 115));
        btncrearperfil.setForeground(new java.awt.Color(255, 255, 255));
        btncrearperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoLogin_32.png"))); // NOI18N
        btncrearperfil.setText("Crear Perfil");
        btncrearperfil.setBorder(null);
        btncrearperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncrearperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncrearperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncrearperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearperfilMouseClicked(evt);
            }
        });
        btncrearperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearperfilActionPerformed(evt);
            }
        });
        panelcrear.add(btncrearperfil);
        btncrearperfil.setBounds(170, 40, 80, 60);

        btncrearusuario.setBackground(new java.awt.Color(33, 67, 115));
        btncrearusuario.setForeground(new java.awt.Color(255, 255, 255));
        btncrearusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrear_32.png"))); // NOI18N
        btncrearusuario.setText("Crear Usuario");
        btncrearusuario.setBorder(null);
        btncrearusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncrearusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncrearusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncrearusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearusuarioMouseClicked(evt);
            }
        });
        btncrearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearusuarioActionPerformed(evt);
            }
        });
        panelcrear.add(btncrearusuario);
        btncrearusuario.setBounds(50, 40, 100, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Creador");
        panelcrear.add(jLabel1);
        jLabel1.setBounds(120, 10, 210, 30);

        panelrperfil.setBackground(new java.awt.Color(30, 74, 137));
        panelrperfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelrperfil.setLayout(null);

        txttipoperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txttipoperfil.setForeground(new java.awt.Color(255, 255, 255));
        txttipoperfil.setText("Seleccione Tipo Perfil(*)");
        panelrperfil.add(txttipoperfil);
        txttipoperfil.setBounds(120, 180, 160, 20);

        btnguardarperfil.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarperfil.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoguardar_32.png"))); // NOI18N
        btnguardarperfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarperfilMouseClicked(evt);
            }
        });
        btnguardarperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarperfilActionPerformed(evt);
            }
        });
        panelrperfil.add(btnguardarperfil);
        btnguardarperfil.setBounds(220, 270, 40, 40);

        txtapellidorperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidorperfil.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtapellidorperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidorperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidorperfil.setText("Apellidos");
        txtapellidorperfil.setBorder(null);
        txtapellidorperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidorperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidorperfilMouseClicked(evt);
            }
        });
        txtapellidorperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidorperfilActionPerformed(evt);
            }
        });
        txtapellidorperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidorperfilKeyPressed(evt);
            }
        });
        panelrperfil.add(txtapellidorperfil);
        txtapellidorperfil.setBounds(10, 200, 150, 30);

        btncerrrar1.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar1MouseClicked(evt);
            }
        });
        btncerrrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar1ActionPerformed(evt);
            }
        });
        panelrperfil.add(btncerrrar1);
        btncerrrar1.setBounds(170, 274, 40, 36);

        txtrunrperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtrunrperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunrperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtrunrperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunrperfil.setText("RUN");
        txtrunrperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunrperfilMouseClicked(evt);
            }
        });
        txtrunrperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunrperfilActionPerformed(evt);
            }
        });
        txtrunrperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrunrperfilKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunrperfilKeyTyped(evt);
            }
        });
        panelrperfil.add(txtrunrperfil);
        txtrunrperfil.setBounds(60, 100, 90, 30);

        txtedadrperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtedadrperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtedadrperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtedadrperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedadrperfil.setText(" Edad");
        txtedadrperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtedadrperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadrperfilMouseClicked(evt);
            }
        });
        txtedadrperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadrperfilActionPerformed(evt);
            }
        });
        txtedadrperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadrperfilKeyTyped(evt);
            }
        });
        panelrperfil.add(txtedadrperfil);
        txtedadrperfil.setBounds(190, 150, 60, 30);

        txtnombrerperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtnombrerperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombrerperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtnombrerperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombrerperfil.setText("Nombres");
        txtnombrerperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombrerperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombrerperfilMouseClicked(evt);
            }
        });
        txtnombrerperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrerperfilActionPerformed(evt);
            }
        });
        panelrperfil.add(txtnombrerperfil);
        txtnombrerperfil.setBounds(10, 150, 150, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoLogin_32.png"))); // NOI18N
        panelrperfil.add(jLabel10);
        jLabel10.setBounds(60, 10, 30, 40);

        btnBuscar.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelrperfil.add(btnBuscar);
        btnBuscar.setBounds(150, 100, 30, 30);

        txterror1.setForeground(java.awt.Color.red);
        panelrperfil.add(txterror1);
        txterror1.setBounds(20, 240, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Crear Perfil");
        panelrperfil.add(jLabel11);
        jLabel11.setBounds(90, 20, 120, 22);

        cmbtipoperfil.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        cmbtipoperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbtipoperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbtipoperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtipoperfilActionPerformed(evt);
            }
        });
        panelrperfil.add(cmbtipoperfil);
        cmbtipoperfil.setBounds(170, 200, 110, 30);

        jLabel9.setText("sin guion ni digito verificador");
        panelrperfil.add(jLabel9);
        jLabel9.setBounds(40, 125, 210, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ingrese Rut Del Usuario(*)");
        panelrperfil.add(jLabel12);
        jLabel12.setBounds(50, 80, 190, 15);

        panelcrear.add(panelrperfil);
        panelrperfil.setBounds(70, 100, 290, 330);

        panelrusuario.setBackground(new java.awt.Color(30, 74, 137));
        panelrusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelrusuario.setLayout(null);

        btnguardarusuario.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoguardar_32.png"))); // NOI18N
        btnguardarusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuarioMouseClicked(evt);
            }
        });
        btnguardarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuarioActionPerformed(evt);
            }
        });
        panelrusuario.add(btnguardarusuario);
        btnguardarusuario.setBounds(220, 270, 40, 40);

        txtapellidoregistro.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoregistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoregistro.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoregistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoregistro.setText("Apellidos");
        txtapellidoregistro.setBorder(null);
        txtapellidoregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoregistroMouseClicked(evt);
            }
        });
        txtapellidoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoregistroActionPerformed(evt);
            }
        });
        txtapellidoregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoregistroKeyPressed(evt);
            }
        });
        panelrusuario.add(txtapellidoregistro);
        txtapellidoregistro.setBounds(50, 110, 200, 30);

        btncerrrar.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrarMouseClicked(evt);
            }
        });
        btncerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrarActionPerformed(evt);
            }
        });
        panelrusuario.add(btncerrrar);
        btncerrrar.setBounds(170, 274, 40, 36);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        panelrusuario.add(jLabel7);
        jLabel7.setBounds(160, 160, 10, 30);

        txtdvregistro.setBackground(new java.awt.Color(255, 255, 255));
        txtdvregistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtdvregistro.setForeground(new java.awt.Color(0, 0, 0));
        txtdvregistro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdvregistro.setText("DV");
        txtdvregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdvregistroMouseClicked(evt);
            }
        });
        txtdvregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdvregistroActionPerformed(evt);
            }
        });
        txtdvregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdvregistroKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdvregistroKeyPressed(evt);
            }
        });
        panelrusuario.add(txtdvregistro);
        txtdvregistro.setBounds(170, 160, 40, 30);

        txtrunregistro.setBackground(new java.awt.Color(255, 255, 255));
        txtrunregistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunregistro.setForeground(new java.awt.Color(0, 0, 0));
        txtrunregistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunregistro.setText("RUN");
        txtrunregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunregistroMouseClicked(evt);
            }
        });
        txtrunregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunregistroActionPerformed(evt);
            }
        });
        txtrunregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunregistroKeyTyped(evt);
            }
        });
        panelrusuario.add(txtrunregistro);
        txtrunregistro.setBounds(70, 160, 90, 30);

        txtedadregistro.setBackground(new java.awt.Color(255, 255, 255));
        txtedadregistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtedadregistro.setForeground(new java.awt.Color(0, 0, 0));
        txtedadregistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedadregistro.setText(" Edad");
        txtedadregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadregistroMouseClicked(evt);
            }
        });
        txtedadregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadregistroActionPerformed(evt);
            }
        });
        txtedadregistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadregistroKeyTyped(evt);
            }
        });
        panelrusuario.add(txtedadregistro);
        txtedadregistro.setBounds(130, 210, 60, 30);

        txtnombreregistro.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreregistro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreregistro.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreregistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreregistro.setText("Nombres");
        txtnombreregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreregistroMouseClicked(evt);
            }
        });
        txtnombreregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreregistroActionPerformed(evt);
            }
        });
        panelrusuario.add(txtnombreregistro);
        txtnombreregistro.setBounds(50, 60, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_User_48.png"))); // NOI18N
        panelrusuario.add(jLabel2);
        jLabel2.setBounds(40, 10, 50, 50);

        txterror.setForeground(java.awt.Color.red);
        panelrusuario.add(txterror);
        txterror.setBounds(20, 250, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Crear Usuario");
        panelrusuario.add(jLabel8);
        jLabel8.setBounds(90, 30, 140, 22);

        panelcrear.add(panelrusuario);
        panelrusuario.setBounds(70, 100, 280, 330);

        panelrusername.setBackground(new java.awt.Color(30, 74, 137));
        panelrusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelrusername.setLayout(null);

        btnguardarusuario1.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoguardar_32.png"))); // NOI18N
        btnguardarusuario1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario1MouseClicked(evt);
            }
        });
        btnguardarusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario1ActionPerformed(evt);
            }
        });
        panelrusername.add(btnguardarusuario1);
        btnguardarusuario1.setBounds(220, 270, 40, 40);

        btncerrrar2.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar2MouseClicked(evt);
            }
        });
        btncerrrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar2ActionPerformed(evt);
            }
        });
        panelrusername.add(btncerrrar2);
        btncerrrar2.setBounds(170, 274, 40, 36);

        txtusernamerusername.setBackground(new java.awt.Color(255, 255, 255));
        txtusernamerusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtusernamerusername.setForeground(new java.awt.Color(0, 0, 0));
        txtusernamerusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusernamerusername.setText("Username");
        txtusernamerusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernamerusernameMouseClicked(evt);
            }
        });
        txtusernamerusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernamerusernameActionPerformed(evt);
            }
        });
        panelrusername.add(txtusernamerusername);
        txtusernamerusername.setBounds(50, 80, 200, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        panelrusername.add(jLabel13);
        jLabel13.setBounds(50, 20, 40, 40);

        txterror2.setForeground(java.awt.Color.red);
        panelrusername.add(txterror2);
        txterror2.setBounds(10, 250, 150, 30);

        txtpasswordrusername.setBackground(new java.awt.Color(255, 255, 255));
        txtpasswordrusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtpasswordrusername.setForeground(new java.awt.Color(0, 0, 0));
        txtpasswordrusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasswordrusername.setText("**********");
        txtpasswordrusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpasswordrusernameMouseClicked(evt);
            }
        });
        panelrusername.add(txtpasswordrusername);
        txtpasswordrusername.setBounds(50, 130, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Crear Username");
        panelrusername.add(jLabel14);
        jLabel14.setBounds(90, 30, 170, 22);

        txtrunrusername.setBackground(new java.awt.Color(255, 255, 255));
        txtrunrusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunrusername.setForeground(new java.awt.Color(0, 0, 0));
        txtrunrusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunrusername.setText("RUN");
        txtrunrusername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtrunrusernameCaretUpdate(evt);
            }
        });
        txtrunrusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunrusernameMouseClicked(evt);
            }
        });
        txtrunrusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunrusernameActionPerformed(evt);
            }
        });
        txtrunrusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrunrusernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunrusernameKeyTyped(evt);
            }
        });
        panelrusername.add(txtrunrusername);
        txtrunrusername.setBounds(80, 200, 90, 30);

        btnBuscar1.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar1.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        panelrusername.add(btnBuscar1);
        btnBuscar1.setBounds(170, 200, 30, 30);

        jLabel15.setText("sin guion ni digito verificador");
        panelrusername.add(jLabel15);
        jLabel15.setBounds(50, 230, 210, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ingrese Rut Del Usuario(*)");
        panelrusername.add(jLabel16);
        jLabel16.setBounds(60, 180, 190, 15);

        jCheckBox1.setBackground(new java.awt.Color(30, 74, 137));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyTyped(evt);
            }
        });
        panelrusername.add(jCheckBox1);
        jCheckBox1.setBounds(60, 200, 20, 30);

        panelcrear.add(panelrusername);
        panelrusername.setBounds(70, 100, 280, 330);

        getContentPane().add(panelcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 420, 440));

        paneleliminar.setBackground(new java.awt.Color(33, 67, 115));
        paneleliminar.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Menu Eliminar");
        paneleliminar.add(jLabel5);
        jLabel5.setBounds(110, 10, 200, 30);

        btneliminarusuario.setBackground(new java.awt.Color(33, 67, 115));
        btneliminarusuario.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btneliminarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoeliminar_32.png"))); // NOI18N
        btneliminarusuario.setText("Eliminar Usuario");
        btneliminarusuario.setBorder(null);
        btneliminarusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminarusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminarusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarusuarioMouseClicked(evt);
            }
        });
        btneliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarusuarioActionPerformed(evt);
            }
        });
        paneleliminar.add(btneliminarusuario);
        btneliminarusuario.setBounds(50, 40, 89, 60);

        btneliminarusername.setBackground(new java.awt.Color(33, 67, 115));
        btneliminarusername.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btneliminarusername.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        btneliminarusername.setText("Eliminar Username");
        btneliminarusername.setBorder(null);
        btneliminarusername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminarusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminarusername.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminarusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarusernameMouseClicked(evt);
            }
        });
        btneliminarusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarusernameActionPerformed(evt);
            }
        });
        paneleliminar.add(btneliminarusername);
        btneliminarusername.setBounds(280, 40, 120, 60);

        btneliminarperfil.setBackground(new java.awt.Color(33, 67, 115));
        btneliminarperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btneliminarperfil.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_ID_not_Verified_32.png"))); // NOI18N
        btneliminarperfil.setText("Eliminar Perfil");
        btneliminarperfil.setBorder(null);
        btneliminarperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminarperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminarperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminarperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarperfilMouseClicked(evt);
            }
        });
        btneliminarperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarperfilActionPerformed(evt);
            }
        });
        paneleliminar.add(btneliminarperfil);
        btneliminarperfil.setBounds(170, 40, 76, 60);

        jLabel20.setText("Desarrollador : Bastian Gonzalez");
        paneleliminar.add(jLabel20);
        jLabel20.setBounds(160, 420, 240, 20);

        paneleusuario.setBackground(new java.awt.Color(30, 74, 137));
        paneleusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneleusuario.setLayout(null);

        btnguardarusuario5.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario5.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Trash_Can_32.png"))); // NOI18N
        btnguardarusuario5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario5MouseClicked(evt);
            }
        });
        btnguardarusuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario5ActionPerformed(evt);
            }
        });
        paneleusuario.add(btnguardarusuario5);
        btnguardarusuario5.setBounds(220, 270, 40, 40);

        txtruneusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtruneusuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtruneusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtruneusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtruneusuario.setText("RUN");
        txtruneusuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtruneusuarioCaretUpdate(evt);
            }
        });
        txtruneusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtruneusuarioMouseClicked(evt);
            }
        });
        txtruneusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtruneusuarioActionPerformed(evt);
            }
        });
        txtruneusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtruneusuarioKeyTyped(evt);
            }
        });
        paneleusuario.add(txtruneusuario);
        txtruneusuario.setBounds(100, 70, 90, 30);

        btncerrrar6.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar6MouseClicked(evt);
            }
        });
        btncerrrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar6ActionPerformed(evt);
            }
        });
        paneleusuario.add(btncerrrar6);
        btncerrrar6.setBounds(170, 274, 40, 36);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoeliminar_32.png"))); // NOI18N
        paneleusuario.add(jLabel34);
        jLabel34.setBounds(50, 10, 32, 40);

        txterroreusuario.setForeground(java.awt.Color.red);
        paneleusuario.add(txterroreusuario);
        txterroreusuario.setBounds(60, 110, 170, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Eliminar Usuario");
        paneleusuario.add(jLabel35);
        jLabel35.setBounds(80, 20, 170, 22);

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Ingrese Rut del Usuario");
        paneleusuario.add(jLabel36);
        jLabel36.setBounds(80, 50, 132, 15);

        checkeusuario.setBackground(new java.awt.Color(30, 74, 137));
        checkeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkeusuarioActionPerformed(evt);
            }
        });
        paneleusuario.add(checkeusuario);
        checkeusuario.setBounds(80, 70, 24, 20);

        btnBuscar5.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar5.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar5ActionPerformed(evt);
            }
        });
        paneleusuario.add(btnBuscar5);
        btnBuscar5.setBounds(190, 70, 30, 30);

        jLabel37.setText("Sin guion ni digito verificador");
        paneleusuario.add(jLabel37);
        jLabel37.setBounds(50, 100, 210, 20);

        pdatoseusuario.setBackground(new java.awt.Color(30, 74, 137));
        pdatoseusuario.setLayout(null);

        txtedadeusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtedadeusuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtedadeusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtedadeusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedadeusuario.setText(" Edad");
        txtedadeusuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtedadeusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadeusuarioMouseClicked(evt);
            }
        });
        txtedadeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadeusuarioActionPerformed(evt);
            }
        });
        txtedadeusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadeusuarioKeyTyped(evt);
            }
        });
        pdatoseusuario.add(txtedadeusuario);
        txtedadeusuario.setBounds(80, 100, 60, 30);

        txtnombreeusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreeusuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreeusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreeusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreeusuario.setText("Nombres");
        txtnombreeusuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreeusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreeusuarioMouseClicked(evt);
            }
        });
        txtnombreeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreeusuarioActionPerformed(evt);
            }
        });
        pdatoseusuario.add(txtnombreeusuario);
        txtnombreeusuario.setBounds(20, 10, 200, 30);

        txtapellidoeusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoeusuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoeusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoeusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoeusuario.setText("Apellidos");
        txtapellidoeusuario.setBorder(null);
        txtapellidoeusuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidoeusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoeusuarioMouseClicked(evt);
            }
        });
        txtapellidoeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoeusuarioActionPerformed(evt);
            }
        });
        txtapellidoeusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoeusuarioKeyPressed(evt);
            }
        });
        pdatoseusuario.add(txtapellidoeusuario);
        txtapellidoeusuario.setBounds(20, 60, 200, 30);

        paneleusuario.add(pdatoseusuario);
        pdatoseusuario.setBounds(30, 130, 230, 130);

        paneleliminar.add(paneleusuario);
        paneleusuario.setBounds(80, 100, 280, 330);

        paneleusername.setBackground(new java.awt.Color(30, 74, 137));
        paneleusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneleusername.setLayout(null);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Unavailable_32.png"))); // NOI18N
        paneleusername.add(jLabel48);
        jLabel48.setBounds(40, 10, 30, 40);

        btncerrrar8.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar8MouseClicked(evt);
            }
        });
        btncerrrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar8ActionPerformed(evt);
            }
        });
        paneleusername.add(btncerrrar8);
        btncerrrar8.setBounds(230, 280, 40, 36);

        btnguardarusuario7.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario7.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Trash_Can_32.png"))); // NOI18N
        btnguardarusuario7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario7MouseClicked(evt);
            }
        });
        btnguardarusuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario7ActionPerformed(evt);
            }
        });
        paneleusername.add(btnguardarusuario7);
        btnguardarusuario7.setBounds(280, 280, 40, 40);

        txtruneusername.setBackground(new java.awt.Color(255, 255, 255));
        txtruneusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtruneusername.setForeground(new java.awt.Color(0, 0, 0));
        txtruneusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtruneusername.setText("RUN");
        txtruneusername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtruneusernameCaretUpdate(evt);
            }
        });
        txtruneusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtruneusernameMouseClicked(evt);
            }
        });
        txtruneusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtruneusernameActionPerformed(evt);
            }
        });
        txtruneusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtruneusernameKeyTyped(evt);
            }
        });
        paneleusername.add(txtruneusername);
        txtruneusername.setBounds(80, 70, 90, 30);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        paneleusername.add(jLabel42);
        jLabel42.setBounds(40, 10, 32, 40);

        txterroreusername.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txterroreusername.setForeground(java.awt.Color.red);
        paneleusername.add(txterroreusername);
        txterroreusername.setBounds(70, 110, 190, 20);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Eliminar Username");
        paneleusername.add(jLabel43);
        jLabel43.setBounds(80, 20, 200, 22);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Ingrese Rut del Usuario");
        paneleusername.add(jLabel44);
        jLabel44.setBounds(80, 50, 132, 15);

        checkeusername.setBackground(new java.awt.Color(30, 74, 137));
        checkeusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkeusernameActionPerformed(evt);
            }
        });
        paneleusername.add(checkeusername);
        checkeusername.setBounds(60, 70, 24, 20);

        btnBuscar7.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar7.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar7ActionPerformed(evt);
            }
        });
        paneleusername.add(btnBuscar7);
        btnBuscar7.setBounds(170, 70, 30, 30);

        jLabel45.setText("Sin guion ni digito verificador");
        paneleusername.add(jLabel45);
        jLabel45.setBounds(70, 100, 210, 15);

        pdatoseusername.setBackground(new java.awt.Color(30, 74, 137));
        pdatoseusername.setLayout(null);

        txtnombreeusername.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreeusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreeusername.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreeusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreeusername.setText("Nombres");
        txtnombreeusername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreeusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreeusernameMouseClicked(evt);
            }
        });
        txtnombreeusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreeusernameActionPerformed(evt);
            }
        });
        pdatoseusername.add(txtnombreeusername);
        txtnombreeusername.setBounds(0, 10, 150, 30);

        txtapellidoeusername.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoeusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoeusername.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoeusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoeusername.setText("Apellidos");
        txtapellidoeusername.setBorder(null);
        txtapellidoeusername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidoeusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoeusernameMouseClicked(evt);
            }
        });
        txtapellidoeusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoeusernameActionPerformed(evt);
            }
        });
        txtapellidoeusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoeusernameKeyPressed(evt);
            }
        });
        pdatoseusername.add(txtapellidoeusername);
        txtapellidoeusername.setBounds(160, 10, 150, 30);

        listeusername.setBackground(new java.awt.Color(30, 74, 137));
        listeusername.setForeground(new java.awt.Color(255, 255, 255));
        listeusername.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listeusername);

        pdatoseusername.add(jScrollPane4);
        jScrollPane4.setBounds(0, 60, 130, 110);

        txtinfoeperfil3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil3.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil3.setText("ID - Username");
        pdatoseusername.add(txtinfoeperfil3);
        txtinfoeperfil3.setBounds(10, 40, 120, 20);

        txtinfoeperfil4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil4.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil4.setText("Selecciona ID");
        pdatoseusername.add(txtinfoeperfil4);
        txtinfoeperfil4.setBounds(170, 40, 120, 20);

        txtinfoeperfil5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil5.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil5.setText("Perfil Para eliminar");
        pdatoseusername.add(txtinfoeperfil5);
        txtinfoeperfil5.setBounds(150, 60, 150, 20);

        cmbeusername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pdatoseusername.add(cmbeusername);
        cmbeusername.setBounds(180, 80, 65, 25);

        paneleusername.add(pdatoseusername);
        pdatoseusername.setBounds(10, 120, 310, 180);

        paneleliminar.add(paneleusername);
        paneleusername.setBounds(40, 100, 330, 330);

        paneleperfil.setBackground(new java.awt.Color(30, 74, 137));
        paneleperfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneleperfil.setLayout(null);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Unavailable_32.png"))); // NOI18N
        paneleperfil.add(jLabel46);
        jLabel46.setBounds(50, 10, 30, 40);

        btncerrrar7.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar7MouseClicked(evt);
            }
        });
        btncerrrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar7ActionPerformed(evt);
            }
        });
        paneleperfil.add(btncerrrar7);
        btncerrrar7.setBounds(230, 280, 40, 36);

        btnguardarusuario6.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario6.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Trash_Can_32.png"))); // NOI18N
        btnguardarusuario6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario6MouseClicked(evt);
            }
        });
        btnguardarusuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario6ActionPerformed(evt);
            }
        });
        paneleperfil.add(btnguardarusuario6);
        btnguardarusuario6.setBounds(280, 280, 40, 40);

        txtruneperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtruneperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtruneperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtruneperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtruneperfil.setText("RUN");
        txtruneperfil.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtruneperfilCaretUpdate(evt);
            }
        });
        txtruneperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtruneperfilMouseClicked(evt);
            }
        });
        txtruneperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtruneperfilActionPerformed(evt);
            }
        });
        txtruneperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtruneperfilKeyTyped(evt);
            }
        });
        paneleperfil.add(txtruneperfil);
        txtruneperfil.setBounds(80, 70, 90, 30);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoLogin_32.png"))); // NOI18N
        paneleperfil.add(jLabel38);
        jLabel38.setBounds(50, 10, 32, 40);

        txterroreperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txterroreperfil.setForeground(java.awt.Color.red);
        paneleperfil.add(txterroreperfil);
        txterroreperfil.setBounds(70, 110, 180, 20);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Eliminar Perfil");
        paneleperfil.add(jLabel39);
        jLabel39.setBounds(80, 20, 160, 22);

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Ingrese Rut del Usuario");
        paneleperfil.add(jLabel40);
        jLabel40.setBounds(80, 50, 132, 15);

        checkeperfil.setBackground(new java.awt.Color(30, 74, 137));
        checkeperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkeperfilActionPerformed(evt);
            }
        });
        paneleperfil.add(checkeperfil);
        checkeperfil.setBounds(60, 70, 24, 20);

        btnBuscar6.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar6.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar6ActionPerformed(evt);
            }
        });
        paneleperfil.add(btnBuscar6);
        btnBuscar6.setBounds(170, 70, 30, 30);

        jLabel41.setText("Sin guion ni digito verificador");
        paneleperfil.add(jLabel41);
        jLabel41.setBounds(70, 100, 210, 15);

        pdatoseperfil.setBackground(new java.awt.Color(30, 74, 137));
        pdatoseperfil.setLayout(null);

        txtnombreeperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreeperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreeperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreeperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreeperfil.setText("Nombres");
        txtnombreeperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreeperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreeperfilMouseClicked(evt);
            }
        });
        txtnombreeperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreeperfilActionPerformed(evt);
            }
        });
        pdatoseperfil.add(txtnombreeperfil);
        txtnombreeperfil.setBounds(0, 10, 150, 30);

        txtapellidoeperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoeperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoeperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoeperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoeperfil.setText("Apellidos");
        txtapellidoeperfil.setBorder(null);
        txtapellidoeperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidoeperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoeperfilMouseClicked(evt);
            }
        });
        txtapellidoeperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoeperfilActionPerformed(evt);
            }
        });
        txtapellidoeperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoeperfilKeyPressed(evt);
            }
        });
        pdatoseperfil.add(txtapellidoeperfil);
        txtapellidoeperfil.setBounds(160, 10, 150, 30);

        listeperfil.setBackground(new java.awt.Color(30, 74, 137));
        listeperfil.setForeground(new java.awt.Color(255, 255, 255));
        listeperfil.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listeperfil);

        pdatoseperfil.add(jScrollPane3);
        jScrollPane3.setBounds(0, 60, 130, 110);

        txtinfoeperfil2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil2.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil2.setText("ID - Perfil");
        pdatoseperfil.add(txtinfoeperfil2);
        txtinfoeperfil2.setBounds(10, 40, 80, 16);

        txtinfoeperfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil.setText("Selecciona ID");
        pdatoseperfil.add(txtinfoeperfil);
        txtinfoeperfil.setBounds(170, 40, 120, 20);

        txtinfoeperfil1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoeperfil1.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoeperfil1.setText("Perfil Para eliminar");
        pdatoseperfil.add(txtinfoeperfil1);
        txtinfoeperfil1.setBounds(150, 60, 150, 20);

        cmbeperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pdatoseperfil.add(cmbeperfil);
        cmbeperfil.setBounds(180, 80, 65, 25);

        paneleperfil.add(pdatoseperfil);
        pdatoseperfil.setBounds(10, 120, 310, 180);

        paneleliminar.add(paneleperfil);
        paneleperfil.setBounds(40, 100, 330, 330);

        getContentPane().add(paneleliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 420, 440));

        panelactualizar.setBackground(new java.awt.Color(33, 67, 115));
        panelactualizar.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu Actualizar");
        panelactualizar.add(jLabel3);
        jLabel3.setBounds(110, 10, 230, 30);

        jLabel21.setText("Desarrollador : Bastian Gonzalez");
        panelactualizar.add(jLabel21);
        jLabel21.setBounds(180, 420, 240, 20);

        btnactualizarusuario.setBackground(new java.awt.Color(33, 67, 115));
        btnactualizarusuario.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnactualizarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoactulizar_32.png"))); // NOI18N
        btnactualizarusuario.setText("Actualizar Usuario");
        btnactualizarusuario.setBorder(null);
        btnactualizarusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizarusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarusuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnactualizarusuarioMouseClicked(evt);
            }
        });
        btnactualizarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarusuarioActionPerformed(evt);
            }
        });
        panelactualizar.add(btnactualizarusuario);
        btnactualizarusuario.setBounds(20, 40, 99, 60);

        btnactualizarperfil.setBackground(new java.awt.Color(33, 67, 115));
        btnactualizarperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnactualizarperfil.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizarperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoLogin_32.png"))); // NOI18N
        btnactualizarperfil.setText("Actualizar Perfil");
        btnactualizarperfil.setBorder(null);
        btnactualizarperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizarperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnactualizarperfilMouseClicked(evt);
            }
        });
        btnactualizarperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarperfilActionPerformed(evt);
            }
        });
        panelactualizar.add(btnactualizarperfil);
        btnactualizarperfil.setBounds(150, 40, 110, 60);

        btnactualizarusername.setBackground(new java.awt.Color(33, 67, 115));
        btnactualizarusername.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnactualizarusername.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizarusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconocrearusername_32.png"))); // NOI18N
        btnactualizarusername.setText("Actualizar Username");
        btnactualizarusername.setBorder(null);
        btnactualizarusername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizarusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactualizarusername.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnactualizarusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnactualizarusernameMouseClicked(evt);
            }
        });
        btnactualizarusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarusernameActionPerformed(evt);
            }
        });
        panelactualizar.add(btnactualizarusername);
        btnactualizarusername.setBounds(270, 40, 140, 60);

        panelausername.setBackground(new java.awt.Color(30, 74, 137));
        panelausername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelausername.setLayout(null);

        txtrunausername.setBackground(new java.awt.Color(255, 255, 255));
        txtrunausername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunausername.setForeground(new java.awt.Color(0, 0, 0));
        txtrunausername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunausername.setText("RUN");
        txtrunausername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtrunausernameCaretUpdate(evt);
            }
        });
        txtrunausername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunausernameMouseClicked(evt);
            }
        });
        txtrunausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunausernameActionPerformed(evt);
            }
        });
        txtrunausername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunausernameKeyTyped(evt);
            }
        });
        panelausername.add(txtrunausername);
        txtrunausername.setBounds(210, 60, 90, 30);

        txtinfoausername1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinfoausername1.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoausername1.setText("Selecciona id username");
        panelausername.add(txtinfoausername1);
        txtinfoausername1.setBounds(160, 120, 190, 20);

        txtinfoausername2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinfoausername2.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoausername2.setText("Password");
        panelausername.add(txtinfoausername2);
        txtinfoausername2.setBounds(210, 220, 80, 17);

        txtpassapass.setBackground(new java.awt.Color(255, 255, 255));
        txtpassapass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpassapass.setForeground(new java.awt.Color(0, 0, 0));
        txtpassapass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassapass.setText("***********");
        txtpassapass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassapassMouseClicked(evt);
            }
        });
        panelausername.add(txtpassapass);
        txtpassapass.setBounds(170, 240, 150, 30);

        btnguardarusuario4.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario4.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Edit_32.png"))); // NOI18N
        btnguardarusuario4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario4MouseClicked(evt);
            }
        });
        btnguardarusuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario4ActionPerformed(evt);
            }
        });
        panelausername.add(btnguardarusuario4);
        btnguardarusuario4.setBounds(320, 280, 40, 40);

        txtusernameausername.setBackground(new java.awt.Color(255, 255, 255));
        txtusernameausername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtusernameausername.setForeground(new java.awt.Color(0, 0, 0));
        txtusernameausername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusernameausername.setText("Username");
        txtusernameausername.setBorder(null);
        txtusernameausername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernameausernameMouseClicked(evt);
            }
        });
        txtusernameausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameausernameActionPerformed(evt);
            }
        });
        txtusernameausername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernameausernameKeyPressed(evt);
            }
        });
        panelausername.add(txtusernameausername);
        txtusernameausername.setBounds(170, 190, 150, 30);

        txtapellidoausername.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoausername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoausername.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoausername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoausername.setText("Apellidos");
        txtapellidoausername.setBorder(null);
        txtapellidoausername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidoausername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoausernameMouseClicked(evt);
            }
        });
        txtapellidoausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoausernameActionPerformed(evt);
            }
        });
        txtapellidoausername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoausernameKeyPressed(evt);
            }
        });
        panelausername.add(txtapellidoausername);
        txtapellidoausername.setBounds(20, 90, 150, 30);

        btncerrrar5.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar5MouseClicked(evt);
            }
        });
        btncerrrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar5ActionPerformed(evt);
            }
        });
        panelausername.add(btncerrrar5);
        btncerrrar5.setBounds(270, 280, 40, 36);

        txtnombreausername.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreausername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreausername.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreausername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreausername.setText("Nombres");
        txtnombreausername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreausername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreausernameMouseClicked(evt);
            }
        });
        txtnombreausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreausernameActionPerformed(evt);
            }
        });
        panelausername.add(txtnombreausername);
        txtnombreausername.setBounds(20, 50, 150, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoactulizar_32.png"))); // NOI18N
        panelausername.add(jLabel30);
        jLabel30.setBounds(40, 0, 30, 30);

        txterrorausername.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txterrorausername.setForeground(java.awt.Color.red);
        panelausername.add(txterrorausername);
        txterrorausername.setBounds(170, 100, 190, 20);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Actualizar Username");
        panelausername.add(jLabel31);
        jLabel31.setBounds(70, 10, 220, 22);

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Ingrese Rut del Usuario");
        panelausername.add(jLabel32);
        jLabel32.setBounds(190, 40, 132, 15);

        checkausername.setBackground(new java.awt.Color(30, 74, 137));
        checkausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkausernameActionPerformed(evt);
            }
        });
        panelausername.add(checkausername);
        checkausername.setBounds(190, 60, 20, 30);

        btnBuscar4.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar4.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });
        panelausername.add(btnBuscar4);
        btnBuscar4.setBounds(300, 60, 30, 30);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel33.setText("Sin guion ni digito verificador");
        panelausername.add(jLabel33);
        jLabel33.setBounds(190, 90, 170, 13);

        listausername.setBackground(new java.awt.Color(30, 74, 137));
        listausername.setForeground(new java.awt.Color(255, 255, 255));
        listausername.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listausername);

        panelausername.add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 120, 130);

        txtinfoausername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtinfoausername.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoausername.setText("ID  - Username");
        panelausername.add(txtinfoausername);
        txtinfoausername.setBounds(20, 120, 130, 17);

        txtinfoausername3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinfoausername3.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoausername3.setText("Ingresa Nuevos (*)");
        panelausername.add(txtinfoausername3);
        txtinfoausername3.setBounds(180, 170, 130, 17);

        cmbausername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbausernameActionPerformed(evt);
            }
        });
        panelausername.add(cmbausername);
        cmbausername.setBounds(210, 140, 70, 25);

        panelactualizar.add(panelausername);
        panelausername.setBounds(20, 100, 370, 330);

        panelausuario.setBackground(new java.awt.Color(30, 74, 137));
        panelausuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelausuario.setLayout(null);

        btnguardarusuario2.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario2.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Edit_32.png"))); // NOI18N
        btnguardarusuario2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario2MouseClicked(evt);
            }
        });
        btnguardarusuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario2ActionPerformed(evt);
            }
        });
        panelausuario.add(btnguardarusuario2);
        btnguardarusuario2.setBounds(220, 270, 40, 40);

        txtapellidoausuario.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoausuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtapellidoausuario.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoausuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoausuario.setText("Apellidos");
        txtapellidoausuario.setBorder(null);
        txtapellidoausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoausuarioMouseClicked(evt);
            }
        });
        txtapellidoausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoausuarioActionPerformed(evt);
            }
        });
        txtapellidoausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoausuarioKeyPressed(evt);
            }
        });
        panelausuario.add(txtapellidoausuario);
        txtapellidoausuario.setBounds(50, 180, 200, 30);

        txtrunausuario.setBackground(new java.awt.Color(255, 255, 255));
        txtrunausuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunausuario.setForeground(new java.awt.Color(0, 0, 0));
        txtrunausuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunausuario.setText("RUN");
        txtrunausuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtrunausuarioCaretUpdate(evt);
            }
        });
        txtrunausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunausuarioMouseClicked(evt);
            }
        });
        txtrunausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunausuarioActionPerformed(evt);
            }
        });
        txtrunausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunausuarioKeyTyped(evt);
            }
        });
        panelausuario.add(txtrunausuario);
        txtrunausuario.setBounds(90, 60, 90, 30);

        btncerrrar3.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar3MouseClicked(evt);
            }
        });
        btncerrrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar3ActionPerformed(evt);
            }
        });
        panelausuario.add(btncerrrar3);
        btncerrrar3.setBounds(170, 274, 40, 36);

        txtedadausuario.setBackground(new java.awt.Color(255, 255, 255));
        txtedadausuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtedadausuario.setForeground(new java.awt.Color(0, 0, 0));
        txtedadausuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedadausuario.setText(" Edad");
        txtedadausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadausuarioMouseClicked(evt);
            }
        });
        txtedadausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadausuarioActionPerformed(evt);
            }
        });
        txtedadausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadausuarioKeyTyped(evt);
            }
        });
        panelausuario.add(txtedadausuario);
        txtedadausuario.setBounds(120, 220, 60, 30);

        txtnombreausuario.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreausuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtnombreausuario.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreausuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreausuario.setText("Nombres");
        txtnombreausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreausuarioMouseClicked(evt);
            }
        });
        txtnombreausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreausuarioActionPerformed(evt);
            }
        });
        panelausuario.add(txtnombreausuario);
        txtnombreausuario.setBounds(50, 130, 200, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoactulizar_32.png"))); // NOI18N
        panelausuario.add(jLabel23);
        jLabel23.setBounds(30, 10, 30, 30);

        txterrorausuario.setForeground(java.awt.Color.red);
        panelausuario.add(txterrorausuario);
        txterrorausuario.setBounds(50, 100, 190, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Actualizar Usuario");
        panelausuario.add(jLabel24);
        jLabel24.setBounds(60, 10, 190, 22);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ingrese Rut del Usuario");
        panelausuario.add(jLabel25);
        jLabel25.setBounds(70, 40, 132, 15);

        checkausuario.setBackground(new java.awt.Color(30, 74, 137));
        checkausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkausuarioActionPerformed(evt);
            }
        });
        panelausuario.add(checkausuario);
        checkausuario.setBounds(70, 60, 24, 20);

        btnBuscar2.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar2.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        panelausuario.add(btnBuscar2);
        btnBuscar2.setBounds(180, 60, 30, 30);

        jLabel22.setText("Sin guion ni digito verificador");
        panelausuario.add(jLabel22);
        jLabel22.setBounds(50, 90, 210, 15);

        panelactualizar.add(panelausuario);
        panelausuario.setBounds(80, 100, 280, 330);

        panelaperfil.setBackground(new java.awt.Color(30, 74, 137));
        panelaperfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelaperfil.setLayout(null);

        txterroraperfil.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txterroraperfil.setForeground(java.awt.Color.red);
        panelaperfil.add(txterroraperfil);
        txterroraperfil.setBounds(60, 80, 170, 30);

        btnguardarusuario3.setBackground(new java.awt.Color(30, 74, 137));
        btnguardarusuario3.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarusuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Edit_32.png"))); // NOI18N
        btnguardarusuario3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardarusuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarusuario3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarusuario3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardarusuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarusuario3MouseClicked(evt);
            }
        });
        btnguardarusuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarusuario3ActionPerformed(evt);
            }
        });
        panelaperfil.add(btnguardarusuario3);
        btnguardarusuario3.setBounds(230, 280, 40, 40);

        txtapellidoaperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtapellidoaperfil.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtapellidoaperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtapellidoaperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellidoaperfil.setText("Apellidos");
        txtapellidoaperfil.setBorder(null);
        txtapellidoaperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtapellidoaperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoaperfilMouseClicked(evt);
            }
        });
        txtapellidoaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoaperfilActionPerformed(evt);
            }
        });
        txtapellidoaperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoaperfilKeyPressed(evt);
            }
        });
        panelaperfil.add(txtapellidoaperfil);
        txtapellidoaperfil.setBounds(10, 150, 150, 30);

        txtrunaperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtrunaperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtrunaperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtrunaperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrunaperfil.setText("RUN");
        txtrunaperfil.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtrunaperfilCaretUpdate(evt);
            }
        });
        txtrunaperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrunaperfilMouseClicked(evt);
            }
        });
        txtrunaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrunaperfilActionPerformed(evt);
            }
        });
        txtrunaperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrunaperfilKeyTyped(evt);
            }
        });
        panelaperfil.add(txtrunaperfil);
        txtrunaperfil.setBounds(90, 50, 90, 30);

        btncerrrar4.setBackground(new java.awt.Color(30, 74, 137));
        btncerrrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/cancelar_32.png"))); // NOI18N
        btncerrrar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrrar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrrar4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncerrrar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrrar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrrar4MouseClicked(evt);
            }
        });
        btncerrrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrar4ActionPerformed(evt);
            }
        });
        panelaperfil.add(btncerrrar4);
        btncerrrar4.setBounds(180, 284, 40, 36);

        txtedadaperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtedadaperfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtedadaperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtedadaperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtedadaperfil.setText("Edad");
        txtedadaperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtedadaperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadaperfilMouseClicked(evt);
            }
        });
        txtedadaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadaperfilActionPerformed(evt);
            }
        });
        txtedadaperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadaperfilKeyTyped(evt);
            }
        });
        panelaperfil.add(txtedadaperfil);
        txtedadaperfil.setBounds(190, 110, 60, 30);

        txtnombreaperfil.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreaperfil.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtnombreaperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreaperfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombreaperfil.setText("Nombres");
        txtnombreaperfil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreaperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreaperfilMouseClicked(evt);
            }
        });
        txtnombreaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreaperfilActionPerformed(evt);
            }
        });
        panelaperfil.add(txtnombreaperfil);
        txtnombreaperfil.setBounds(10, 110, 150, 30);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/iconoactulizar_32.png"))); // NOI18N
        panelaperfil.add(jLabel26);
        jLabel26.setBounds(40, 2, 30, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Actualizar Perfil");
        panelaperfil.add(jLabel27);
        jLabel27.setBounds(70, 10, 170, 22);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ingrese Rut del Usuario");
        panelaperfil.add(jLabel28);
        jLabel28.setBounds(70, 30, 132, 15);

        checkaperfil.setBackground(new java.awt.Color(30, 74, 137));
        checkaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkaperfilActionPerformed(evt);
            }
        });
        panelaperfil.add(checkaperfil);
        checkaperfil.setBounds(70, 50, 24, 30);

        btnBuscar3.setBackground(new java.awt.Color(30, 74, 137));
        btnBuscar3.setForeground(new java.awt.Color(3, 124, 203));
        btnBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGImagenes/icons8_Checkmark_16.png"))); // NOI18N
        btnBuscar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });
        panelaperfil.add(btnBuscar3);
        btnBuscar3.setBounds(180, 50, 30, 30);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel29.setText("Sin guion ni digito verificador");
        panelaperfil.add(jLabel29);
        jLabel29.setBounds(40, 80, 160, 15);

        cmbaperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cmbaperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));
        panelaperfil.add(cmbaperfil);
        cmbaperfil.setBounds(70, 210, 50, 24);

        listaperfil.setBackground(new java.awt.Color(30, 74, 137));
        listaperfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        listaperfil.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        listaperfil.setForeground(new java.awt.Color(255, 255, 255));
        listaperfil.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Administrador", "Cliente", "Creador", "Actualizador", "Eliminador" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaperfil);

        panelaperfil.add(jScrollPane1);
        jScrollPane1.setBounds(170, 170, 100, 100);

        txtinfoaperfil1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtinfoaperfil1.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoaperfil1.setText("Seleccione Nuevo Perfil");
        panelaperfil.add(txtinfoaperfil1);
        txtinfoaperfil1.setBounds(20, 240, 140, 16);

        txtinfoaperfil.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        txtinfoaperfil.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoaperfil.setText("Seleccione ID-Perfil a actualizar");
        panelaperfil.add(txtinfoaperfil);
        txtinfoaperfil.setBounds(10, 190, 160, 16);

        combatperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelaperfil.add(combatperfil);
        combatperfil.setBounds(40, 260, 110, 25);

        txtinfoaperfil2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtinfoaperfil2.setForeground(new java.awt.Color(0, 0, 0));
        txtinfoaperfil2.setText(" ID  -  TipoPerfil");
        panelaperfil.add(txtinfoaperfil2);
        txtinfoaperfil2.setBounds(170, 150, 100, 14);

        panelactualizar.add(panelaperfil);
        panelaperfil.setBounds(80, 100, 280, 330);

        getContentPane().add(panelactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 420, 440));

        panelmenu.setBackground(new java.awt.Color(33, 67, 115));
        panelmenu.setLayout(null);

        txtrut.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtrut.setForeground(new java.awt.Color(255, 255, 255));
        txtrut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelmenu.add(txtrut);
        txtrut.setBounds(110, 70, 200, 40);

        txtbienvenida.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtbienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtbienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelmenu.add(txtbienvenida);
        txtbienvenida.setBounds(70, 0, 270, 50);

        txtbienvenida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        txtbienvenida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelmenu.add(txtbienvenida1);
        txtbienvenida1.setBounds(20, 30, 390, 60);

        jLabel18.setText("Desarrollador : Bastian Gonzalez");
        panelmenu.add(jLabel18);
        jLabel18.setBounds(170, 420, 250, 20);

        getContentPane().add(panelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 420, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearMouseClicked
        // TODO add your handling code here:
          this.panelcrear.setVisible(true);
          this.panelactualizar.setVisible(false);
          this.paneleliminar.setVisible(false);
          this.panelmostrar.setVisible(false);
          this.panelmenu.setVisible(false);
    }//GEN-LAST:event_btncrearMouseClicked

    private void btnactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnactualizarMouseClicked
        // TODO add your handling code here:
          this.panelcrear.setVisible(false);
          this.panelactualizar.setVisible(true);
          this.paneleliminar.setVisible(false);
          this.panelmostrar.setVisible(false);
          this.panelmenu.setVisible(false);
    }//GEN-LAST:event_btnactualizarMouseClicked

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
        // TODO add your handling code here:
          this.panelcrear.setVisible(false);
          this.panelactualizar.setVisible(false);
          this.paneleliminar.setVisible(true);
          this.panelmostrar.setVisible(false);
          this.panelmenu.setVisible(false);
    }//GEN-LAST:event_btneliminarMouseClicked

    private void btnmostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmostrarMouseClicked
        // TODO add your handling code here:
        this.panelcrear.setVisible(false);
          this.panelactualizar.setVisible(false);
          this.paneleliminar.setVisible(false);
          this.panelmostrar.setVisible(true);
          this.panelmenu.setVisible(false);
    }//GEN-LAST:event_btnmostrarMouseClicked

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        // TODO add your handling code here:
       BGGUI.BGLoginGui log = new BGLoginGui ();
       log.setLocationRelativeTo(null);
       log.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        // TODO add your handling code here:
         this.panelcrear.setVisible(false);
          this.panelactualizar.setVisible(false);
          this.paneleliminar.setVisible(false);
          this.panelmostrar.setVisible(false);
          this.panelmenu.setVisible(true);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btncrearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncrearKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btncrearKeyTyped

    private void btncrearComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btncrearComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btncrearComponentAdded

    private void btncrearperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearperfilActionPerformed
       this.btncrearusuario.setEnabled(false);
       this.btncrearusername.setEnabled(false);
       this.panelrperfil.setVisible(true);
       
    }//GEN-LAST:event_btncrearperfilActionPerformed

    private void btncrearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearusuarioActionPerformed
         
       this.btncrearperfil.setEnabled(false);
        this.btncrearusername.setEnabled(false);
        this.panelrusuario.setVisible(true);
       
    }//GEN-LAST:event_btncrearusuarioActionPerformed

    private void btncrearusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearusuarioMouseClicked
      
    }//GEN-LAST:event_btncrearusuarioMouseClicked

    private void btncrearperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearperfilMouseClicked
        
    }//GEN-LAST:event_btncrearperfilMouseClicked

    private void btnguardarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuarioMouseClicked

    }//GEN-LAST:event_btnguardarusuarioMouseClicked

    private void btnguardarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuarioActionPerformed
        BGUsuario us = new BGUsuario();
         BGUsuario usaux = new BGUsuario();
        BGUsuarioDAL usur = new BGUsuarioDAL();
        try{
            us.setNombre(this.txtnombreregistro.getText());
            us.setApellido(this.txtapellidoregistro.getText());
            us.setRun(this.txtrunregistro.getText());
            us.setDv(this.txtdvregistro.getText());
            us.setEdad(Integer.parseInt(this.txtedadregistro.getText()));
            String auxrut =String.valueOf(us.getRun()+String.valueOf(us.getDv()));
            if (usur.validarRut(auxrut)) {
               usaux = usur.buscarUsuario(Integer.parseInt(us.getRun()));
             if (usaux.getEstado()==0) {
                int res = usur.agregarUsuario(us);
                if (res==1) {
                    JOptionPane.showMessageDialog(null, "Usuario agregado");
                    //---se reset el txt...///
                    this.txtnombreregistro.setText("Nombres");
                    this.txtapellidoregistro.setText("Apellidos");
                    this.txtdvregistro.setText("DV");
                    this.txtrunregistro.setText("RUN");
                    this.txtedadregistro.setText("Edad");
                    //.....///
                }else{
                    if(res == -1){
                        JOptionPane.showMessageDialog(null, "Usuario no agregado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error inesperado");
                    }
                } 
                }else{
                 JOptionPane.showMessageDialog(null, "El rut ya se encuentra Registrado", "Error Rut", JOptionPane.WARNING_MESSAGE);
                 
             }
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese Rut Valido", "RUT INVALIDO", JOptionPane.WARNING_MESSAGE);
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verficar el texto ingresado");

        }
    }//GEN-LAST:event_btnguardarusuarioActionPerformed

    private void txtapellidoregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoregistroMouseClicked
        // TODO add your handling code here:
        this.txtapellidoregistro.setText(null);
    }//GEN-LAST:event_txtapellidoregistroMouseClicked

    private void txtapellidoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoregistroActionPerformed

    private void txtapellidoregistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoregistroKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtapellidoregistroKeyPressed

    private void btncerrrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrarMouseClicked

    private void btncerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrarActionPerformed
        // TODO add your handling code here:
        this.txtnombreregistro.setText("Nombre");
        this.txtapellidoregistro.setText("Apellido");
        this.txtrunregistro.setText("RUN");
        this.txtdvregistro.setText("DV");
        this.txtedadregistro.setText("Edad");
        this.panelrusuario.setVisible(false);
        this.btncrearperfil.setEnabled(true);
        this.btncrearusername.setEnabled(true);
    }//GEN-LAST:event_btncerrrarActionPerformed

    private void txtdvregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdvregistroMouseClicked
        // TODO add your handling code here:
        this.txtdvregistro.setText(null);
    }//GEN-LAST:event_txtdvregistroMouseClicked

    private void txtdvregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdvregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdvregistroActionPerformed

    private void txtdvregistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdvregistroKeyPressed
        // TODO add your handling code here:
        this.txtdvregistro.setText(null);
    }//GEN-LAST:event_txtdvregistroKeyPressed

    private void txtdvregistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdvregistroKeyTyped
        char c=evt.getKeyChar();
        String cad =(""+c).toUpperCase(); // en caso de K la transforma en Mayuscula//
        c=cad.charAt(0);
        evt.setKeyChar(c);
        if(txtdvregistro.getText().length() >= 1){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtdvregistroKeyTyped

    private void txtrunregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunregistroMouseClicked
        // TODO add your handling code here:
        this.txtrunregistro.setText(null);
    }//GEN-LAST:event_txtrunregistroMouseClicked

    private void txtrunregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunregistroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtrunregistroActionPerformed

    private void txtrunregistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunregistroKeyTyped
        char c=evt.getKeyChar();
        if(txtrunregistro.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            this.txterror.setText("Ingrese Solo Numeros");
        }else{
            this.txterror.setText(null);
        }
    }//GEN-LAST:event_txtrunregistroKeyTyped

    private void txtedadregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadregistroMouseClicked
        // TODO add your handling code here:
        this.txtedadregistro.setText(null);
    }//GEN-LAST:event_txtedadregistroMouseClicked

    private void txtedadregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadregistroActionPerformed

    private void txtedadregistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadregistroKeyTyped
        // TODO add your handling code here:
        if(txtedadregistro.getText().length() >= 3){
            getToolkit().beep();
            evt.consume();
        }
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            this.txterror.setText("Ingrese Solo Numeros");
        }else{
            this.txterror.setText(null);
        }
    }//GEN-LAST:event_txtedadregistroKeyTyped

    private void txtnombreregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreregistroMouseClicked
        // TODO add your handling code here:
        this.txtnombreregistro.setText(null);
    }//GEN-LAST:event_txtnombreregistroMouseClicked

    private void txtnombreregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreregistroActionPerformed

    private void btnguardarperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarperfilMouseClicked

    private void btnguardarperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarperfilActionPerformed
        BGPerfilDAL perf = new BGPerfilDAL();
        BGPerfil   pe  = new BGPerfil();
        BGPerfil   pe1  = new BGPerfil();
        BGTipoperfil tipope = new BGTipoperfil();
        BGUsuarioDAL usu = new BGUsuarioDAL();
        BGUsuario us = new BGUsuario();
        int res = 0;
        try {
            us = usu.buscarUsuario(Integer.parseInt(this.txtrunrperfil.getText()));
            pe.setId_usuario(us.getId_usuario());
            tipope.setTipoperfil((String)cmbtipoperfil.getSelectedItem());
            pe1.setTipoperfil(tipope.getTipoperfil());
            pe1.setId_usuario(us.getId_usuario());
            pe1 = perf.buscarPerfil2(pe1);
            if (pe1.getEstado()==0) {
                res = perf.agregarPerfil(pe, tipope);
            if (res==1) {
                JOptionPane.showMessageDialog(null, "Perfil agregado");
                this.txtrunrperfil.setText("RUN");
                this.txtnombrerperfil.setText("Nombres");
                this.txtapellidorperfil.setText("Apellidos");
                this.txtedadrperfil.setText("Edad");
            }else{
                if(res == -1){
                    JOptionPane.showMessageDialog(null, "Error al Crear perfil\n   Rut No registrado", "Error Agregar Perfil", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error inesperado");
                }

            }
            }else{
                JOptionPane.showMessageDialog(null, "Error al Crear perfil\n   Usuario ya tiene perfil "+pe1.getTipoperfil(), "Error Agregar Perfil", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verficar el texto ingresado");
        }

    }//GEN-LAST:event_btnguardarperfilActionPerformed

    private void txtapellidorperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidorperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidorperfilMouseClicked

    private void txtapellidorperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidorperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidorperfilActionPerformed

    private void txtapellidorperfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidorperfilKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidorperfilKeyPressed

    private void btncerrrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar1MouseClicked

    private void btncerrrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar1ActionPerformed
        // TODO add your handling code here:
        this.btncrearusuario.setEnabled(true);
        this.btncrearusername.setEnabled(true);
        this.txtrunrperfil.setText("RUN");
        this.panelrperfil.setVisible(false);
    }//GEN-LAST:event_btncerrrar1ActionPerformed

    private void txtrunrperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunrperfilMouseClicked
        // TODO add your handling code here:
        this.txtrunrperfil.setText(null);
    }//GEN-LAST:event_txtrunrperfilMouseClicked

    private void txtrunrperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunrperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunrperfilActionPerformed

    private void txtrunrperfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunrperfilKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtrunrperfilKeyPressed

    private void txtrunrperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunrperfilKeyTyped
        char c=evt.getKeyChar();
        if(txtrunrperfil.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrunrperfilKeyTyped

    private void txtedadrperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadrperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadrperfilMouseClicked

    private void txtedadrperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadrperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadrperfilActionPerformed

    private void txtedadrperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadrperfilKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadrperfilKeyTyped

    private void txtnombrerperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombrerperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrerperfilMouseClicked

    private void txtnombrerperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrerperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrerperfilActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            BGUsuarioDAL usur = new BGUsuarioDAL();
            BGUsuario   us  = new BGUsuario ();
            us = usur.buscarUsuario(Integer.parseInt(this.txtrunrperfil.getText()));
            if (us.getEstado()==1) {
                this.txtnombrerperfil.setText(us.getNombre());
                this.txtapellidorperfil.setText(us.getApellido());
                this.txtedadrperfil.setText(String.valueOf(us.getEdad()));
            }else{
                JOptionPane.showMessageDialog(null, "El Rut no esta Registrado", "RUT NO REGISTRADO", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al buscar rut");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbtipoperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtipoperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtipoperfilActionPerformed

    private void btncrearusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncrearusernameMouseClicked

    private void btncrearusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearusernameActionPerformed
        this.btncrearperfil.setEnabled(false);
        this.btncrearusuario.setEnabled(false);
        this.panelrusername.setVisible(true);
    }//GEN-LAST:event_btncrearusernameActionPerformed

    private void btnguardarusuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario1MouseClicked

    private void btnguardarusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario1ActionPerformed
        BGUsername usn = new BGUsername();
        BGUsernameDAL usernm = new BGUsernameDAL();
        BGUsuario us = new BGUsuario();
        BGUsuarioDAL usua = new BGUsuarioDAL();
        int res=0;
        try {
            us = usua.buscarUsuario(Integer.parseInt(this.txtrunrusername.getText()));
            usn.setUsername(this.txtusernamerusername.getText());
            usn.setPassword(this.txtpasswordrusername.getText());
            usn.setId_usuario(us.getId_usuario());
            res = usernm.agregarUsername(usn);
            if (res==1) {
                JOptionPane.showMessageDialog(null, "Username agregado");
                this.txtrunrusername.setText("RUN");
                this.txtusernamerusername.setText("Username");
                this.txtpasswordrusername.setText("**********");

            }else{
                if(res == -1){
                    JOptionPane.showMessageDialog(null, "Error al agregar Username\n   Ingrese Rut Usuario y presione Check", "Error Agregar Username", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error inesperado");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verficar el texto ingresado");
        }

    }//GEN-LAST:event_btnguardarusuario1ActionPerformed

    private void btncerrrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar2MouseClicked

    private void btncerrrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar2ActionPerformed
        this.btncrearusuario.setEnabled(true);
        this.btncrearperfil.setEnabled(true);
        this.jCheckBox1.setSelected(false);
        this.txtrunrusername.setText("RUN");
        this.txtusernamerusername.setText("Username");
        this.txtpasswordrusername.setText("**********");
        this.panelrusername.setVisible(false);
    }//GEN-LAST:event_btncerrrar2ActionPerformed

    private void txtusernamerusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernamerusernameMouseClicked
        this.txtusernamerusername.setText("");
    }//GEN-LAST:event_txtusernamerusernameMouseClicked

    private void txtusernamerusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernamerusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernamerusernameActionPerformed

    private void txtpasswordrusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordrusernameMouseClicked
        this.txtpasswordrusername.setText("");
    }//GEN-LAST:event_txtpasswordrusernameMouseClicked

    private void txtrunrusernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtrunrusernameCaretUpdate

    }//GEN-LAST:event_txtrunrusernameCaretUpdate

    private void txtrunrusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunrusernameMouseClicked
        // TODO add your handling code here:
        this.txtrunrusername.setText("");
        this.jCheckBox1.setSelected(false);
    }//GEN-LAST:event_txtrunrusernameMouseClicked

    private void txtrunrusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunrusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunrusernameActionPerformed

    private void txtrunrusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunrusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunrusernameKeyPressed

    private void txtrunrusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunrusernameKeyTyped
        char c=evt.getKeyChar();
        if(txtrunrusername.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if(Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrunrusernameKeyTyped

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        try{
            BGUsuarioDAL usur = new BGUsuarioDAL();
            BGUsuario   us  = new BGUsuario ();
            us = usur.buscarUsuario(Integer.parseInt(this.txtrunrusername.getText()));
            if (us.getEstado()==1) {
                this.jCheckBox1.setSelected(true);
            }else{
                JOptionPane.showMessageDialog(null, "El Rut no esta Registrado", "RUT NO REGISTRADO", JOptionPane.WARNING_MESSAGE);
                this.jCheckBox1.setSelected(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al buscar rut");

        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void jCheckBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyTyped

    }//GEN-LAST:event_jCheckBox1KeyTyped

    private void btnguardarusuario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario2MouseClicked

    private void btnguardarusuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario2ActionPerformed
        BGUsuario us = new BGUsuario();
        BGUsuarioDAL usur = new BGUsuarioDAL();
        try {
            us = usur.buscarUsuario(Integer.parseInt(this.txtrunausuario.getText()));
            us.setNombre(this.txtnombreausuario.getText());
            us.setApellido(this.txtapellidoausuario.getText());
            us.setEdad(Integer.parseInt(this.txtedadausuario.getText()));
       int res = usur.actualizarUsuario(us);
            if (res==1) {
                JOptionPane.showMessageDialog(null,"Usuario Actualizado");
                this.txtrunausuario.setText("RUN");
                this.txtnombreausuario.setVisible(false);
                this.txtapellidoausuario.setVisible(false);
                this.txtedadausuario.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Usuario No actualizado");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Verifique el texto Ingresado", "Error Catch", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnguardarusuario2ActionPerformed

    private void txtapellidoausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoausuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausuarioMouseClicked

    private void txtapellidoausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausuarioActionPerformed

    private void txtapellidoausuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoausuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausuarioKeyPressed

    private void btncerrrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar3MouseClicked

    private void btncerrrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar3ActionPerformed
      this.btnactualizarperfil.setEnabled(true);
      this.btnactualizarusername.setEnabled(true);
      this.txtnombreausuario.setVisible(false);
      this.txtapellidoausuario.setVisible(false);
      this.txtedadausuario.setVisible(false);
      this.panelausuario.setVisible(false);
      this.txtrunausuario.setText("RUN");
      this.checkausuario.setSelected(false);
    }//GEN-LAST:event_btncerrrar3ActionPerformed

    private void txtrunausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunausuarioMouseClicked
        this.txtrunausuario.setText("");
        this.txterrorausuario.setText(null);
        this.checkausuario.setSelected(false);
        this.txtnombreausuario.setVisible(false);
        this.txtapellidoausuario.setVisible(false);
        this.txtedadausuario.setVisible(false);
    }//GEN-LAST:event_txtrunausuarioMouseClicked

    private void txtrunausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunausuarioActionPerformed

    private void txtrunausuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunausuarioKeyTyped
       char c=evt.getKeyChar();
        if(txtrunausuario.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrunausuarioKeyTyped

    private void txtedadausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadausuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadausuarioMouseClicked

    private void txtedadausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadausuarioActionPerformed

    private void txtedadausuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadausuarioKeyTyped
     if(txtedadausuario.getText().length() >= 3){
            getToolkit().beep();
            evt.consume();
           }
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
            this.txterrorausuario.setText("Ingrese Solo Numeros");
          }else{
            this.txterrorausuario.setText(null);
        }
    }//GEN-LAST:event_txtedadausuarioKeyTyped

    private void txtnombreausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreausuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreausuarioMouseClicked

    private void txtnombreausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreausuarioActionPerformed

    private void checkausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkausuarioActionPerformed

    private void txtrunausuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtrunausuarioCaretUpdate
       BGUsuarioDAL usu = new BGUsuarioDAL();
       BGUsuario us = new BGUsuario();
        try {
         us = usu.buscarUsuario(Integer.parseInt(this.txtrunausuario.getText()));
        if (us.getEstado()==1) {
            this.checkausuario.setSelected(true);
            }else{
            this.checkausuario.setSelected(false);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_txtrunausuarioCaretUpdate

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        BGUsuario us = new BGUsuario();
        BGUsuarioDAL usu = new BGUsuarioDAL();
        try {
           us = usu.buscarUsuario(Integer.parseInt(this.txtrunausuario.getText()));
            if (us.getEstado()==1) {
                this.txterrorausuario.setText(null);
                this.txtnombreausuario.setVisible(true);
                this.txtapellidoausuario.setVisible(true);
                this.txtedadausuario.setVisible(true);
                this.txtnombreausuario.setText(us.getNombre());
                this.txtapellidoausuario.setText(us.getApellido());
                this.txtedadausuario.setText(String.valueOf(us.getEdad()));
                }else{
                this.txterrorausuario.setText("Rut No Registrado");
                this.txtnombreausuario.setVisible(false);
                this.txtapellidoausuario.setVisible(false);
                this.txtedadausuario.setVisible(false);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar usuario ingrese rut", "ERROR BOTON BUSCAR", WIDTH);
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnactualizarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnactualizarusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarusuarioMouseClicked

    private void btnactualizarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarusuarioActionPerformed
        this.btnactualizarperfil.setEnabled(false);
        this.btnactualizarusername.setEnabled(false);
        this.panelausuario.setVisible(true);
    }//GEN-LAST:event_btnactualizarusuarioActionPerformed

    private void btnactualizarperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnactualizarperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarperfilMouseClicked

    private void btnactualizarperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarperfilActionPerformed
       this.panelaperfil.setVisible(true);
       this.btnactualizarusername.setEnabled(false);
       this.btnactualizarusuario.setEnabled(false);
       this.jScrollPane1.setVisible(false);
    }//GEN-LAST:event_btnactualizarperfilActionPerformed

    private void btnactualizarusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnactualizarusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarusernameMouseClicked

    private void btnactualizarusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarusernameActionPerformed
        this.panelausername.setVisible(true);
        this.btnactualizarusuario.setEnabled(false);
        this.btnactualizarperfil.setEnabled(false);
        this.txtinfoausername.setVisible(false);
        this.txtinfoausername1.setVisible(false);
        this.txtinfoausername2.setVisible(false);
        this.txtinfoausername3.setVisible(false);
        this.listausername.setVisible(false);
        this.txtnombreausername.setVisible(false);
        this.txtapellidoausername.setVisible(false);
        this.txtusernameausername.setVisible(false);
        this.txtpassapass.setVisible(false);
        this.cmbausername.setVisible(false);
        this.checkausername.setSelected(false);
        this.jScrollPane2.setVisible(false);
         //---/// setea txt 
         this.txtrunausername.setText("RUN");
        this.txtnombreausername.setText("Nombres");
        this.txtapellidoausername.setText("Apellidos");
        this.txtusernameausername.setText("Username");
        this.txtpasswordrusername.setText("***********");
        ///////
        
    }//GEN-LAST:event_btnactualizarusernameActionPerformed

    private void btnguardarusuario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario3MouseClicked

    private void btnguardarusuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario3ActionPerformed
      BGUsuario us = new BGUsuario();
        BGUsuarioDAL usur = new BGUsuarioDAL();
        BGPerfilDAL perf = new BGPerfilDAL();
        BGTipoperfil tipop = new BGTipoperfil();
        BGPerfil per = new BGPerfil();
     try {
            us = usur.buscarUsuario(Integer.parseInt(this.txtrunaperfil.getText()));
            per.setId_usuario(us.getId_usuario());
            tipop.setTipoperfil(String.valueOf(this.combatperfil.getSelectedItem()));
            per.setId_perfil(Integer.parseInt((String) this.cmbaperfil.getSelectedItem()));
          int res = perf.actualizarPerfil(per, tipop);
               if (res==1) {
                JOptionPane.showMessageDialog(null,"Perfil Actualizado");
                this.txtrunaperfil.setText("RUN");
                this.txtnombreaperfil.setVisible(false);
                this.txtapellidoaperfil.setVisible(false);
                this.txtedadaperfil.setVisible(false);
                this.txtinfoaperfil.setVisible(false);
                this.txtinfoaperfil1.setVisible(false);
                this.txtinfoaperfil2.setVisible(false);
                this.cmbaperfil.setVisible(false);
                this.combatperfil.setVisible(false);
                this.listaperfil.setVisible(false);
                this.jScrollPane1.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Perfil No actualizado");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Verifique el texto Ingresado", "Error Catch", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnguardarusuario3ActionPerformed

    private void txtapellidoaperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoaperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoaperfilMouseClicked

    private void txtapellidoaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoaperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoaperfilActionPerformed

    private void txtapellidoaperfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoaperfilKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoaperfilKeyPressed

    private void txtrunaperfilCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtrunaperfilCaretUpdate
        BGUsuarioDAL usu = new BGUsuarioDAL();
       BGUsuario us = new BGUsuario();
        try {
         us = usu.buscarUsuario(Integer.parseInt(this.txtrunaperfil.getText()));
        if (us.getEstado()==1) {
            this.checkaperfil.setSelected(true);
            }else{
            this.checkaperfil.setSelected(false);
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtrunaperfilCaretUpdate

    private void txtrunaperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunaperfilMouseClicked
       this.txtrunaperfil.setText("");
       this.checkaperfil.setSelected(false);
       this.txterroraperfil.setText(null);
       this.txtnombreaperfil.setVisible(false);
       this.txtapellidoaperfil.setVisible(false);
       this.cmbaperfil.setVisible(false);
       this.txtedadaperfil.setVisible(false);
       this.listaperfil.setVisible(false);
       this.txtinfoaperfil.setVisible(false);
       this.txtinfoaperfil1.setVisible(false);
       this.txtinfoaperfil2.setVisible(false);
       this.combatperfil.setVisible(false);
       this.jScrollPane1.setVisible(false);
    }//GEN-LAST:event_txtrunaperfilMouseClicked

    private void txtrunaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunaperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunaperfilActionPerformed

    private void txtrunaperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunaperfilKeyTyped
         char c=evt.getKeyChar();
        if(txtrunaperfil.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrunaperfilKeyTyped

    private void btncerrrar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar4MouseClicked

    private void btncerrrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar4ActionPerformed
        this.panelaperfil.setVisible(false);
        this.btnactualizarusuario.setEnabled(true);
        this.btnactualizarusername.setEnabled(true);
        this.txtnombreaperfil.setVisible(false);
        this.txtapellidoaperfil.setVisible(false);
        this.txtedadaperfil.setVisible(false);
        this.cmbaperfil.setVisible(false);
        this.combatperfil.setVisible(false);
        this.listaperfil.setVisible(false);
        this.txtrunaperfil.setText("RUN");
        this.txtinfoaperfil.setVisible(false);
       this.txtinfoaperfil1.setVisible(false);
      this.txtinfoaperfil2.setVisible(false);
    }//GEN-LAST:event_btncerrrar4ActionPerformed

    private void txtedadaperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadaperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadaperfilMouseClicked

    private void txtedadaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadaperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadaperfilActionPerformed

    private void txtedadaperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadaperfilKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadaperfilKeyTyped

    private void txtnombreaperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreaperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreaperfilMouseClicked

    private void txtnombreaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreaperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreaperfilActionPerformed

    private void checkaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkaperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkaperfilActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
     BGUsuario us = new BGUsuario();
      BGPerfilDAL perf = new BGPerfilDAL();
        BGUsuarioDAL usu = new BGUsuarioDAL();
       ArrayList<BGPerfil> per = new ArrayList<BGPerfil>();
        try {
             DefaultListModel modelo = new DefaultListModel();
       us = usu.buscarUsuario(Integer.parseInt(this.txtrunaperfil.getText()));
        
            if (us.getEstado()==1) {
               //Inserta datos a los txt ""//
               this.txtnombreaperfil.setText(us.getNombre());
               this.txtapellidoaperfil.setText(us.getApellido());
               this.txtedadaperfil.setText(String.valueOf(us.getEdad()));
               this.cmbaperfil.removeAllItems();
               
               modelo.removeAllElements();
              for(BGPerfil pe : perf.buscarPerfil(us.getId_usuario()))
        {
            
            cmbaperfil.addItem(String.valueOf(pe.getId_perfil()));
            modelo.addElement(pe.getId_perfil()+"-"+pe.getTipoperfil());
        }
                if (this.cmbaperfil.getSelectedItem()!=null) {
                    //--hacer visible texto//
               this.listaperfil.setModel(modelo);
                this.txtnombreaperfil.setVisible(true);
                this.txtapellidoaperfil.setVisible(true);
                this.txtedadaperfil.setVisible(true);
                this.cmbaperfil.setVisible(true);
                this.listaperfil.setVisible(true);
                this.combatperfil.setVisible(true);
                this.txtinfoaperfil.setVisible(true);
                this.txtinfoaperfil1.setVisible(true);
                this.txtinfoaperfil2.setVisible(true);
                this.jScrollPane1.setVisible(true);
                //----//
                }else{
                this.txtnombreaperfil.setVisible(true);
                this.txtapellidoaperfil.setVisible(true);
                this.txtedadaperfil.setVisible(true);
                this.txterroraperfil.setText("Usuario No tiene Perfil");
                }
                }else{
                this.txterroraperfil.setText("Rut No Registrado");
                this.txtnombreaperfil.setVisible(false);
                this.txtapellidoaperfil.setVisible(false);
                this.txtedadaperfil.setVisible(false);
                this.cmbaperfil.setVisible(false);
                this.listaperfil.setVisible(false);
                this.combatperfil.setVisible(false);
                this.txtinfoaperfil.setVisible(false);
                this.txtinfoaperfil1.setVisible(false);
                this.txtinfoaperfil2.setVisible(false);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar usuario ingrese rut", "ERROR BOTON BUSCAR", WIDTH);
        }
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void btnguardarusuario4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario4MouseClicked

    private void btnguardarusuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario4ActionPerformed
           BGUsername use = new BGUsername();    
           BGUsernameDAL usern = new BGUsernameDAL();
           
   try {
        
         use.setId_username(Integer.parseInt((String)cmbausername.getSelectedItem()));
         use.setUsername(this.txtusernameausername.getText());
         use.setPassword(this.txtpassapass.getText());
         
            int res=usern.actualizarUsername(use);
            if (res==1) {
                JOptionPane.showMessageDialog(null,"Username Actualizado");
                //Oculta Txt//
        this.txtinfoausername.setVisible(false);
        this.txtinfoausername1.setVisible(false);
        this.txtinfoausername2.setVisible(false);
        this.txtinfoausername3.setVisible(false);
        this.listausername.setVisible(false);
        this.txtnombreausername.setVisible(false);
        this.txtapellidoausername.setVisible(false);
        this.txtusernameausername.setVisible(false);
        this.txtpassapass.setVisible(false);
        this.cmbausername.setVisible(false);
        this.checkausername.setSelected(false);
        this.jScrollPane2.setVisible(false);
        this.txtrunausername.setText("RUN");
        this.cmbausername.removeAllItems();
           }else{
              JOptionPane.showMessageDialog(null,"Username No Actualizado");  
               //Oculta Txt//
        this.txtinfoausername.setVisible(false);
        this.txtinfoausername1.setVisible(false);
        this.txtinfoausername2.setVisible(false);
        this.txtinfoausername3.setVisible(false);
        this.listausername.setVisible(false);
        this.txtnombreausername.setVisible(false);
        this.txtapellidoausername.setVisible(false);
        this.txtusernameausername.setVisible(false);
        this.txtpassapass.setVisible(false);
        this.cmbausername.setVisible(false);
        this.checkausername.setSelected(false);
        this.jScrollPane2.setVisible(false);
        this.txtrunausername.setText("RUN");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Username No Actualizado Verifique Texto");  
        }
    }//GEN-LAST:event_btnguardarusuario4ActionPerformed

    private void txtapellidoausernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoausernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausernameMouseClicked

    private void txtapellidoausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausernameActionPerformed

    private void txtapellidoausernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoausernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoausernameKeyPressed

    private void txtrunausernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtrunausernameCaretUpdate
       BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
        try {
             us = usur.buscarUsuario(Integer.parseInt(this.txtrunausername.getText()));
        if (us.getEstado()==1) {
            this.checkausername.setSelected(true);
           }else{
            this.checkausername.setSelected(false);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_txtrunausernameCaretUpdate

    private void txtrunausernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrunausernameMouseClicked
       this.txtrunausername.setText("");
       this.checkausername.setSelected(false);
       this.txterrorausername.setText(null);
       this.txtnombreausername.setVisible(false);
       this.txtapellidoausername.setVisible(false);
       this.cmbausername.setVisible(false);
       this.txtinfoausername.setVisible(false);
       this.txtinfoausername1.setVisible(false);
       this.txtinfoausername2.setVisible(false);
       this.txtinfoausername3.setVisible(false);
       this.jScrollPane2.setVisible(false);
       this.listausername.setVisible(false);
       this.txtusernameausername.setVisible(false);
       this.txtpassapass.setVisible(false);
    }//GEN-LAST:event_txtrunausernameMouseClicked

    private void txtrunausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrunausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrunausernameActionPerformed

    private void txtrunausernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrunausernameKeyTyped
        char c=evt.getKeyChar();
        if(txtrunausername.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrunausernameKeyTyped

    private void btncerrrar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar5MouseClicked

    private void btncerrrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar5ActionPerformed
        this.panelausername.setVisible(false);
        this.btnactualizarperfil.setEnabled(true);
        this.btnactualizarusuario.setEnabled(true);
        this.txterrorausername.setVisible(false);
        this.cmbausername.removeAllItems();
       
    }//GEN-LAST:event_btncerrrar5ActionPerformed

    private void txtnombreausernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreausernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreausernameMouseClicked

    private void txtnombreausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreausernameActionPerformed

    private void checkausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkausernameActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
     BGUsuario us = new BGUsuario();
     BGUsuarioDAL usu = new BGUsuarioDAL();
     ArrayList<BGUsername> usn = new ArrayList<BGUsername>();
     BGUsernameDAL usern = new BGUsernameDAL();
        try {
          us = usu.buscarUsuario(Integer.parseInt(this.txtrunausername.getText()));  
            if (us.getEstado()==1) {
                //Setea txt//
                this.txtnombreausername.setText(us.getNombre());
                this.txtapellidoausername.setText(us.getApellido());
                //---//
                //Muestra txt//
                this.txtnombreausername.setVisible(true);
                this.txtapellidoausername.setVisible(true);
                ////
                usn = usern.buscarUsername(us.getId_usuario());
                //evalua si tiene username creados o activos 
                if (usn.size()!=0) {
               DefaultListModel modelo = new DefaultListModel();
               modelo.removeAllElements();
               cmbausername.removeAllItems();
              for(BGUsername usnm : usern.buscarUsername(us.getId_usuario()))
        {
            
            cmbausername.addItem(String.valueOf(usnm.getId_username()));
            modelo.addElement(usnm.getId_username()+"-"+usnm.getUsername());
        }
              //Muestra campos de username //
              this.listausername.setModel(modelo);
              this.txtinfoausername.setVisible(true);
              this.txtinfoausername1.setVisible(true);
              this.txtinfoausername2.setVisible(true);
              this.txtinfoausername3.setVisible(true);
              this.listausername.setVisible(true);
              this.jScrollPane2.setVisible(true);
              this.cmbausername.setVisible(true);
              this.txtusernameausername.setVisible(true);
              this.txtusernameausername.setText("Username");
              this.txtpassapass.setText("**********");
              this.txtpassapass.setVisible(true);
                }else{
                    this.txterrorausername.setText("Usuario No tiene Username");
                }
            }else{
                this.txterrorausername.setVisible(true);
                this.txterrorausername.setText("Rut No Registrado");
            }
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar usuario Ingrese rut");
        }
   
    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void txtusernameausernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameausernameMouseClicked
        this.txtusernameausername.setText("");
    }//GEN-LAST:event_txtusernameausernameMouseClicked

    private void txtusernameausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameausernameActionPerformed

    private void txtusernameausernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameausernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameausernameKeyPressed

    private void cmbausernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbausernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbausernameActionPerformed

    private void txtpassapassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassapassMouseClicked
       this.txtpassapass.setText("");
    }//GEN-LAST:event_txtpassapassMouseClicked

    private void btnguardarusuario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario5MouseClicked

    private void btnguardarusuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario5ActionPerformed
        BGUsuario us = new BGUsuario();
        BGUsuarioDAL usu = new BGUsuarioDAL();
        try {
        //int msj = JOptionPane.showConfirmDialog(null,"Estas Seguro ?","Eliminar Usuario",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if (JOptionPane.showConfirmDialog(null,"Estas Seguro ?","Eliminar Usuario",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE)==JOptionPane.YES_OPTION)
            {
                us = usu.buscarUsuario(Integer.parseInt(this.txtruneusuario.getText()));
          int res= usu.desactivarUsuario(us);
            if (res==1) {
                JOptionPane.showMessageDialog(null,"Usuario: "+us.getNombre()+" Rut: "+usu.FormatoRutUsuario(String.valueOf(us.getRun())+String.valueOf(us.getDv()))+" Eliminado", "Usuario Eliminado", JOptionPane.WARNING_MESSAGE);
                this.pdatoseusuario.setVisible(false);
                this.txtruneusuario.setText("RUN");
                this.checkeusuario.setSelected(false);
                
            }else{
                JOptionPane.showMessageDialog(null,"Usuario No Eliminado");
                this.pdatoseusuario.setVisible(false);
            }
            }else{
                
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Veriffique el texto Ingresado");
        }
    }//GEN-LAST:event_btnguardarusuario5ActionPerformed

    private void txtapellidoeusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoeusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusuarioMouseClicked

    private void txtapellidoeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusuarioActionPerformed

    private void txtapellidoeusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoeusuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusuarioKeyPressed

    private void txtruneusuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtruneusuarioCaretUpdate
       BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
        try {
             us = usur.buscarUsuario(Integer.parseInt(this.txtruneusuario.getText()));
        if (us.getEstado()==1) {
            this.checkeusuario.setSelected(true);
           }else{
            this.checkeusuario.setSelected(false);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_txtruneusuarioCaretUpdate

    private void txtruneusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtruneusuarioMouseClicked
        this.pdatoseusuario.setVisible(false);
        this.checkeusuario.setSelected(false);
        this.txterroreusuario.setText("");
        this.txtruneusuario.setText("");
    }//GEN-LAST:event_txtruneusuarioMouseClicked

    private void txtruneusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtruneusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtruneusuarioActionPerformed

    private void txtruneusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtruneusuarioKeyTyped
       char c=evt.getKeyChar();
        if(txtruneusuario.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtruneusuarioKeyTyped

    private void btncerrrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar6MouseClicked

    private void btncerrrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar6ActionPerformed
        this.paneleusuario.setVisible(false);
    
        this.btneliminarperfil.setEnabled(true);
        this.btneliminarusername.setEnabled(true);
    }//GEN-LAST:event_btncerrrar6ActionPerformed

    private void txtedadeusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadeusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadeusuarioMouseClicked

    private void txtedadeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadeusuarioActionPerformed

    private void txtedadeusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadeusuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadeusuarioKeyTyped

    private void txtnombreeusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreeusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeusuarioMouseClicked

    private void txtnombreeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeusuarioActionPerformed

    private void checkeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkeusuarioActionPerformed

    private void btnBuscar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar5ActionPerformed
       BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
       
        try {
             us=usur.buscarUsuario(Integer.parseInt(this.txtruneusuario.getText()));
             if (us.getEstado()==1) {
                //setea datos/   
                this.txtnombreeusuario.setText(us.getNombre());
                this.txtapellidoeusuario.setText(us.getApellido());
                this.txtedadeusuario.setText(String.valueOf(us.getEdad()));
                //////Muestra datos ///
                this.pdatoseusuario.setVisible(true);
             }else{
                 this.txterroreusuario.setText("Rut No Registrado");
             }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese rut y presione boton Check");
        }
        
    }//GEN-LAST:event_btnBuscar5ActionPerformed

    private void btneliminarusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarusernameMouseClicked

    private void btneliminarusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarusernameActionPerformed
       this.paneleusername.setVisible(true);
       this.btneliminarperfil.setEnabled(false);
       this.btneliminarusuario.setEnabled(false);
       this.txtruneusername.setText("RUN");
       this.pdatoseusername.setVisible(false);
       this.checkeusername.setSelected(false); 
    }//GEN-LAST:event_btneliminarusernameActionPerformed

    private void btneliminarperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarperfilMouseClicked

    private void btneliminarperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarperfilActionPerformed
        this.paneleperfil.setVisible(true);
        this.btneliminarusername.setEnabled(false);
     
        this.btneliminarusuario.setEnabled(false);
        this.pdatoseperfil.setVisible(false);
        this.txtruneperfil.setText("RUN");
        this.checkeperfil.setSelected(false);    
    }//GEN-LAST:event_btneliminarperfilActionPerformed

    private void btneliminarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarusuarioMouseClicked

    private void btneliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarusuarioActionPerformed
        this.paneleusuario.setVisible(true);
        this.btneliminarperfil.setEnabled(false);
        this.btneliminarusername.setEnabled(false);
      
        this.pdatoseusuario.setVisible(false);
        this.checkeusuario.setSelected(false);
        this.txterroreusuario.setText("");
        this.txtruneusuario.setText("RUN");
    }//GEN-LAST:event_btneliminarusuarioActionPerformed

    private void btnguardarusuario6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario6MouseClicked

    private void btnguardarusuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario6ActionPerformed
       BGUsuario us = new BGUsuario();
        BGUsuarioDAL usu = new BGUsuarioDAL();
        BGPerfil pe = new BGPerfil();
        BGPerfilDAL perf = new BGPerfilDAL();
        try {
            if (JOptionPane.showConfirmDialog(null,"Estas Seguro ?","Eliminar Perfil",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE)==JOptionPane.YES_OPTION)
            {
             pe.setId_perfil(Integer.parseInt((String) this.cmbeperfil.getSelectedItem()));
           if (perf.desactivarPerfil(pe)==1) {
                JOptionPane.showMessageDialog(null,"Perfil: ID-"+pe.getId_perfil()+" Eliminado", "Perfil Eliminado", JOptionPane.WARNING_MESSAGE);
                this.pdatoseperfil.setVisible(false);
                this.txtruneperfil.setText("RUN");
                this.checkeperfil.setSelected(false);
                this.cmbeperfil.removeAllItems();
              }else{
                JOptionPane.showMessageDialog(null,"Perfil No Eliminado");
                this.pdatoseperfil.setVisible(false);
            }
            }else{
                
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Veriffique el texto Ingresado");
        }
    }//GEN-LAST:event_btnguardarusuario6ActionPerformed

    private void txtruneperfilCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtruneperfilCaretUpdate
        BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
        try {
             us = usur.buscarUsuario(Integer.parseInt(this.txtruneperfil.getText()));
        if (us.getEstado()==1) {
            this.checkeperfil.setSelected(true);
           }else{
            this.checkeperfil.setSelected(false);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_txtruneperfilCaretUpdate

    private void txtruneperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtruneperfilMouseClicked
        this.pdatoseperfil.setVisible(false);
        this.checkeperfil.setSelected(false);
        this.txterroreperfil.setText("");
        this.txtruneperfil.setText("");
    }//GEN-LAST:event_txtruneperfilMouseClicked

    private void txtruneperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtruneperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtruneperfilActionPerformed

    private void txtruneperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtruneperfilKeyTyped
       char c=evt.getKeyChar();
        if(txtruneperfil.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtruneperfilKeyTyped

    private void btncerrrar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar7MouseClicked

    private void btncerrrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar7ActionPerformed
       this.btneliminarusername.setEnabled(true);
    
       this.btneliminarusuario.setEnabled(true);
       this.paneleperfil.setVisible(false);
    }//GEN-LAST:event_btncerrrar7ActionPerformed

    private void checkeperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkeperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkeperfilActionPerformed

    private void btnBuscar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar6ActionPerformed
        BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
       BGPerfilDAL perf = new BGPerfilDAL();
       
        try {
             us=usur.buscarUsuario(Integer.parseInt(this.txtruneperfil.getText()));
             if (us.getEstado()==1) {
                DefaultListModel modelo = new DefaultListModel();
                //setea datos/   
                this.txtnombreeperfil.setText(us.getNombre());
                this.txtapellidoeperfil.setText(us.getApellido());
                cmbeperfil.removeAllItems();
                modelo.removeAllElements();
                 for (BGPerfil p : perf.buscarPerfil(us.getId_usuario())) {
                     modelo.addElement("ID "+p.getId_perfil()+" - "+"Perfil "+p.getTipoperfil());
                     cmbeperfil.addItem(String.valueOf(p.getId_perfil()));
                    }
                 if (this.cmbeperfil.getSelectedItem()!=null) {
                     this.listeperfil.setModel(modelo);
                      //////Muestra datos ///
                     this.pdatoseperfil.setVisible(true);
                 }else{
                this.pdatoseperfil.setVisible(false);
                this.txterroreperfil.setText("Usuario No tiene Perfil");
                 }
             }else{
                 this.txterroreperfil.setText("Rut No Registrado");
             }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese rut y presione boton Check");
        }
    }//GEN-LAST:event_btnBuscar6ActionPerformed

    private void txtnombreeperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreeperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeperfilMouseClicked

    private void txtnombreeperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreeperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeperfilActionPerformed

    private void txtapellidoeperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoeperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeperfilMouseClicked

    private void txtapellidoeperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoeperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeperfilActionPerformed

    private void txtapellidoeperfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoeperfilKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeperfilKeyPressed

    private void btncerrrar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar8MouseClicked

    private void btncerrrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar8ActionPerformed
        this.paneleusername.setVisible(false);
        this.btneliminarperfil.setEnabled(true);
        this.btneliminarusuario.setEnabled(true);
    }//GEN-LAST:event_btncerrrar8ActionPerformed

    private void btnguardarusuario7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarusuario7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarusuario7MouseClicked

    private void btnguardarusuario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarusuario7ActionPerformed
        
        BGUsername us = new BGUsername();
        BGUsernameDAL usern = new BGUsernameDAL();
        try {
            if (JOptionPane.showConfirmDialog(null,"Estas Seguro ?","Eliminar Perfil",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE)==JOptionPane.YES_OPTION)
            {
             us.setId_username(Integer.parseInt((String) this.cmbeusername.getSelectedItem()));
           if (usern.desactivarUsername(us)==1) {
                JOptionPane.showMessageDialog(null,"IDUsername : "+us.getId_username()+" Eliminado", "Perfil Eliminado", JOptionPane.WARNING_MESSAGE);
                this.pdatoseusername.setVisible(false);
                this.txtruneusername.setText("RUN");
                this.checkeusername.setSelected(false);
                this.cmbeusername.removeAllItems();
              }else{
                JOptionPane.showMessageDialog(null,"Username No Eliminado");
                this.pdatoseusername.setVisible(false);
            }
            }else{
                
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Veriffique el texto Ingresado");
        }
    }//GEN-LAST:event_btnguardarusuario7ActionPerformed

    private void txtruneusernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtruneusernameCaretUpdate
      BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
        try {
             us = usur.buscarUsuario(Integer.parseInt(this.txtruneusername.getText()));
        if (us.getEstado()==1) {
            this.checkeusername.setSelected(true);
           }else{
            this.checkeusername.setSelected(false);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_txtruneusernameCaretUpdate

    private void txtruneusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtruneusernameMouseClicked
        this.pdatoseusername.setVisible(false);
        this.checkeusername.setSelected(false);
        this.txterroreusername.setText("");
        this.txtruneusername.setText("");
    }//GEN-LAST:event_txtruneusernameMouseClicked

    private void txtruneusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtruneusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtruneusernameActionPerformed

    private void txtruneusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtruneusernameKeyTyped
        char c=evt.getKeyChar();
        if(txtruneusername.getText().length() >= 8){
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isDigit(c)) {
             evt.consume();
        }
     
        if(Character.isLetter(c)) 
        {
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtruneusernameKeyTyped

    private void checkeusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkeusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkeusernameActionPerformed

    private void btnBuscar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar7ActionPerformed
        BGUsuario us = new BGUsuario();
       BGUsuarioDAL usur = new BGUsuarioDAL();
       BGUsernameDAL usn = new BGUsernameDAL();
       try {
             us=usur.buscarUsuario(Integer.parseInt(this.txtruneusername.getText()));
             if (us.getEstado()==1) {
                DefaultListModel modelo = new DefaultListModel();
                //setea datos/   
                this.txtnombreeusername.setText(us.getNombre());
                this.txtapellidoeusername.setText(us.getApellido());
                cmbeusername.removeAllItems();
                modelo.removeAllElements();
                 for (BGUsername user : usn.buscarUsername(us.getId_usuario())) {
                     modelo.addElement("ID "+user.getId_username()+" - "+" US : "+user.getUsername());
                     cmbeusername.addItem(String.valueOf(user.getId_username()));
                    }
                 if (this.cmbeusername.getSelectedItem()!=null) {
                     this.listeusername.setModel(modelo);
                      //////Muestra datos ///
                     this.pdatoseusername.setVisible(true);
                 }else{
                this.pdatoseusername.setVisible(false);
                this.txterroreusername.setText("Usuario No tiene Username");
                 }
                 
             }else{
                 this.txterroreusername.setText("Rut No Registrado");
             }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese rut y presione boton Check");
        }
    }//GEN-LAST:event_btnBuscar7ActionPerformed

    private void txtnombreeusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreeusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeusernameMouseClicked

    private void txtnombreeusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreeusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreeusernameActionPerformed

    private void txtapellidoeusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoeusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusernameMouseClicked

    private void txtapellidoeusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoeusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusernameActionPerformed

    private void txtapellidoeusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoeusernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoeusernameKeyPressed

    private void btnmostrarperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmostrarperfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostrarperfilMouseClicked

    private void btnmostrarperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarperfilActionPerformed
      this.btnmostarusuario.setEnabled(false);
      this.btnmostrarusername.setEnabled(false);
        BGPerfilDAL perf = new BGPerfilDAL();
        DefaultTableModel modelo = new DefaultTableModel();
        this.pdatosmperfil.setVisible(true);
        modelo.addColumn("ID-Perfil");
        modelo.addColumn("id_Usuario");
        modelo.addColumn("TipoPerfil");
        for(BGPerfil p : perf.mostrarPerfil())
        {
            Object[] fila = new Object[3];
            fila[0] = p.getId_perfil();
            fila[1] = p.getId_usuario();
            fila[2] = p.getTipoperfil();
            modelo.addRow(fila);
        }
         this.tablamperfil.setModel(modelo);
    }//GEN-LAST:event_btnmostrarperfilActionPerformed

    private void btnmostrarusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmostrarusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostrarusernameMouseClicked

    private void btnmostrarusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarusernameActionPerformed
       this.btnmostarusuario.setEnabled(false);
      this.btnmostrarperfil.setEnabled(false);
        BGUsernameDAL usern = new BGUsernameDAL();
        DefaultTableModel modelo = new DefaultTableModel();
        this.pdatosmusername.setVisible(true);
        modelo.addColumn("ID-Username");
        modelo.addColumn("Username");
        modelo.addColumn("id_usuario");
        for(BGUsername usn : usern.mostrarUsername())
        {
            Object[] fila = new Object[3];
            fila[0] = usn.getId_username();
            fila[1] = usn.getUsername();
            fila[2] = usn.getId_usuario();
            modelo.addRow(fila);
        }
         this.tablamusername.setModel(modelo);
    }//GEN-LAST:event_btnmostrarusernameActionPerformed

    private void btnmostarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmostarusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostarusuarioMouseClicked

    private void btnmostarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostarusuarioActionPerformed
      this.btnmostrarperfil.setEnabled(false);
      this.btnmostrarusername.setEnabled(false);
        BGUsuarioDAL usu = new BGUsuarioDAL();
        DefaultTableModel modelo = new DefaultTableModel();
        this.pdatosmusuarios.setVisible(true);
        modelo.addColumn("ID");
        modelo.addColumn("RUN");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        for(BGUsuario u : usu.mostrarUsuario())
        {
            Object[] fila = new Object[5];
            fila[0] = u.getId_usuario();
            fila[1] = usu.FormatoRutUsuario(String.valueOf(u.getRun()+String.valueOf(u.getDv())));
            fila[2] = u.getNombre();
            fila[3] = u.getApellido();
            fila[4] = u.getEdad();
            modelo.addRow(fila);
        }
         this.tablamusuario.setModel(modelo);
    }//GEN-LAST:event_btnmostarusuarioActionPerformed

    private void btncerrrar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar9MouseClicked

    private void btncerrrar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar9ActionPerformed
        this.pdatosmusuarios.setVisible(false);
        this.btnmostrarperfil.setEnabled(true);
        this.btnmostrarusername.setEnabled(true);
    }//GEN-LAST:event_btncerrrar9ActionPerformed

    private void btncerrrar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar10MouseClicked

    private void btncerrrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar10ActionPerformed
      this.pdatosmperfil.setVisible(false);
      this.btnmostarusuario.setEnabled(true);
      this.btnmostrarusername.setEnabled(true);
    }//GEN-LAST:event_btncerrrar10ActionPerformed

    private void btncerrrar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrrar11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrrar11MouseClicked

    private void btncerrrar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrar11ActionPerformed
        this.pdatosmusername.setVisible(false);
        this.btnmostarusuario.setEnabled(true);
        this.btnmostrarperfil.setEnabled(true);
    }//GEN-LAST:event_btncerrrar11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
          BGConectar con = new BGConectar();
          Connection conn = con.conectarsereporte("ipchilenobank");
     
            JasperReport reporte = null;
            URL path = this.getClass().getResource("/BGReportes/BGReportePago.jasper");
            reporte = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,conn);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(BGMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
          BGConectar con = new BGConectar();
          Connection conn = con.conectarsereporte("ipchilenobank");
          JasperReport reporte = null;
            URL path = this.getClass().getResource("/BGReportes/BGReporteTranferencia.jasper");
            reporte = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,conn);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(BGMenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BGMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BGMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BGMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BGMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BGMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton btnBuscar5;
    private javax.swing.JButton btnBuscar6;
    private javax.swing.JButton btnBuscar7;
    private javax.swing.JLabel btnactualizar;
    private javax.swing.JButton btnactualizarperfil;
    private javax.swing.JButton btnactualizarusername;
    private javax.swing.JButton btnactualizarusuario;
    private javax.swing.JButton btncerrrar;
    private javax.swing.JButton btncerrrar1;
    private javax.swing.JButton btncerrrar10;
    private javax.swing.JButton btncerrrar11;
    private javax.swing.JButton btncerrrar2;
    private javax.swing.JButton btncerrrar3;
    private javax.swing.JButton btncerrrar4;
    private javax.swing.JButton btncerrrar5;
    private javax.swing.JButton btncerrrar6;
    private javax.swing.JButton btncerrrar7;
    private javax.swing.JButton btncerrrar8;
    private javax.swing.JButton btncerrrar9;
    private javax.swing.JLabel btncrear;
    private javax.swing.JButton btncrearperfil;
    private javax.swing.JButton btncrearusername;
    private javax.swing.JButton btncrearusuario;
    private javax.swing.JLabel btneliminar;
    private javax.swing.JButton btneliminarperfil;
    private javax.swing.JButton btneliminarusername;
    private javax.swing.JButton btneliminarusuario;
    private javax.swing.JButton btnguardarperfil;
    private javax.swing.JButton btnguardarusuario;
    private javax.swing.JButton btnguardarusuario1;
    private javax.swing.JButton btnguardarusuario2;
    private javax.swing.JButton btnguardarusuario3;
    private javax.swing.JButton btnguardarusuario4;
    private javax.swing.JButton btnguardarusuario5;
    private javax.swing.JButton btnguardarusuario6;
    private javax.swing.JButton btnguardarusuario7;
    private javax.swing.JLabel btnmenu;
    private javax.swing.JButton btnmostarusuario;
    private javax.swing.JLabel btnmostrar;
    private javax.swing.JLabel btnmostrar1;
    private javax.swing.JButton btnmostrarperfil;
    private javax.swing.JButton btnmostrarusername;
    private javax.swing.JLabel btnsalir;
    private javax.swing.JCheckBox checkaperfil;
    private javax.swing.JCheckBox checkausername;
    private javax.swing.JCheckBox checkausuario;
    private javax.swing.JCheckBox checkeperfil;
    private javax.swing.JCheckBox checkeusername;
    private javax.swing.JCheckBox checkeusuario;
    private javax.swing.JComboBox<String> cmbaperfil;
    private javax.swing.JComboBox<String> cmbausername;
    private javax.swing.JComboBox<String> cmbeperfil;
    private javax.swing.JComboBox<String> cmbeusername;
    private javax.swing.JComboBox<String> cmbtipoperfil;
    private javax.swing.JComboBox<String> combatperfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> listaperfil;
    private javax.swing.JList<String> listausername;
    private javax.swing.JList<String> listeperfil;
    private javax.swing.JList<String> listeusername;
    private javax.swing.JPanel panelactualizar;
    private javax.swing.JPanel panelaperfil;
    private javax.swing.JPanel panelausername;
    private javax.swing.JPanel panelausuario;
    private javax.swing.JPanel panelcrear;
    private javax.swing.JPanel paneleliminar;
    private javax.swing.JPanel paneleperfil;
    private javax.swing.JPanel paneleusername;
    private javax.swing.JPanel paneleusuario;
    private javax.swing.JPanel panelmenu;
    private javax.swing.JPanel panelmostrar;
    private javax.swing.JPanel panelrperfil;
    private javax.swing.JPanel panelrusername;
    private javax.swing.JPanel panelrusuario;
    private javax.swing.JPanel pdatoseperfil;
    private javax.swing.JPanel pdatoseusername;
    private javax.swing.JPanel pdatoseusuario;
    private javax.swing.JPanel pdatosmperfil;
    private javax.swing.JPanel pdatosmusername;
    private javax.swing.JPanel pdatosmusuarios;
    private javax.swing.JTable tablamperfil;
    private javax.swing.JTable tablamusername;
    private javax.swing.JTable tablamusuario;
    private javax.swing.JTextField txtapellidoaperfil;
    private javax.swing.JTextField txtapellidoausername;
    private javax.swing.JTextField txtapellidoausuario;
    private javax.swing.JTextField txtapellidoeperfil;
    private javax.swing.JTextField txtapellidoeusername;
    private javax.swing.JTextField txtapellidoeusuario;
    private javax.swing.JTextField txtapellidoregistro;
    private javax.swing.JTextField txtapellidorperfil;
    private javax.swing.JLabel txtbienvenida;
    private javax.swing.JLabel txtbienvenida1;
    private javax.swing.JTextField txtdvregistro;
    private javax.swing.JTextField txtedadaperfil;
    private javax.swing.JTextField txtedadausuario;
    private javax.swing.JTextField txtedadeusuario;
    private javax.swing.JTextField txtedadregistro;
    private javax.swing.JTextField txtedadrperfil;
    private javax.swing.JLabel txterror;
    private javax.swing.JLabel txterror1;
    private javax.swing.JLabel txterror2;
    private javax.swing.JLabel txterroraperfil;
    private javax.swing.JLabel txterrorausername;
    private javax.swing.JLabel txterrorausuario;
    private javax.swing.JLabel txterroreperfil;
    private javax.swing.JLabel txterroreusername;
    private javax.swing.JLabel txterroreusuario;
    private javax.swing.JLabel txtinfoaperfil;
    private javax.swing.JLabel txtinfoaperfil1;
    private javax.swing.JLabel txtinfoaperfil2;
    private javax.swing.JLabel txtinfoausername;
    private javax.swing.JLabel txtinfoausername1;
    private javax.swing.JLabel txtinfoausername2;
    private javax.swing.JLabel txtinfoausername3;
    private javax.swing.JLabel txtinfoeperfil;
    private javax.swing.JLabel txtinfoeperfil1;
    private javax.swing.JLabel txtinfoeperfil2;
    private javax.swing.JLabel txtinfoeperfil3;
    private javax.swing.JLabel txtinfoeperfil4;
    private javax.swing.JLabel txtinfoeperfil5;
    private javax.swing.JTextField txtnombreaperfil;
    private javax.swing.JTextField txtnombreausername;
    private javax.swing.JTextField txtnombreausuario;
    private javax.swing.JTextField txtnombreeperfil;
    private javax.swing.JTextField txtnombreeusername;
    private javax.swing.JTextField txtnombreeusuario;
    private javax.swing.JTextField txtnombreregistro;
    private javax.swing.JTextField txtnombrerperfil;
    private javax.swing.JPasswordField txtpassapass;
    private javax.swing.JPasswordField txtpasswordrusername;
    private javax.swing.JTextField txtrunaperfil;
    private javax.swing.JTextField txtrunausername;
    private javax.swing.JTextField txtrunausuario;
    private javax.swing.JTextField txtruneperfil;
    private javax.swing.JTextField txtruneusername;
    private javax.swing.JTextField txtruneusuario;
    private javax.swing.JTextField txtrunregistro;
    private javax.swing.JTextField txtrunrperfil;
    private javax.swing.JTextField txtrunrusername;
    private javax.swing.JLabel txtrut;
    private javax.swing.JLabel txttipoperfil;
    private javax.swing.JTextField txtusernameausername;
    private javax.swing.JTextField txtusernamerusername;
    // End of variables declaration//GEN-END:variables
}
