package Interfaces;

import Clases.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GestionarServ extends javax.swing.JPanel implements ActionListener {

    Historial servicios = new Historial();
    ListaSucursales sucursales;
    ListaClientes clientes;
    ListaVehiculos vehiculos;
    javax.swing.Timer temporizador;

    
    public GestionarServ(ListaSucursales sucursales, ListaClientes clientes, ListaVehiculos vehiculos) {
        initComponents();
        this.sucursales = sucursales;
        this.clientes = clientes;
        this.vehiculos = vehiculos;
        addItemsComboBox();
        temporizador = new javax.swing.Timer(1000, this);

        temporizador.start();
    }

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        temporizadorActionPerformed(evt);
    }

    private void temporizadorActionPerformed(java.awt.event.ActionEvent evt) {
        addItemsComboBox();
    }

    private void addItemsComboBox() {
        boolean existe = false;
        for (Sucursal sucur : sucursales.getSucursales()) {
            for (int i = 0; i < CB_SR.getItemCount(); i++) {
                if (sucur.getCodigo().equals(CB_SR.getItemAt(i))) {
                    existe = true;
                }
            }
            if (!existe) {
                CB_SR.addItem(sucur.getCodigo());
            }
            existe = false;
        }
        for (Vehiculo vehi : vehiculos.getVehiculos()) {
            for (int i = 0; i < CB_VI.getItemCount(); i++) {
                if (vehi.getCodigo().equals(CB_VI.getItemAt(i))) {
                    existe = true;
                }
            }
            if (!existe) {
                CB_VI.addItem(vehi.getCodigo());
            }
            existe = false;
        }
        for (int i = 0; i < CB_SR.getItemCount(); i++) {
            for (Sucursal sucur : sucursales.getSucursales()) {
                if (CB_SR.getItemAt(i).equals(sucur.getCodigo())) {
                    existe = true;
                }
            }
            if (!existe) {
                CB_SR.removeItemAt(i);
            }
            existe = false;
        }
        for (int i = 0; i < CB_VI.getItemCount(); i++) {
            for (Vehiculo vehi : vehiculos.getVehiculos()) {
                if (CB_VI.getItemAt(i).equals(vehi.getCodigo())) {
                    existe = true;
                }
            }
            if (!existe) {
                CB_VI.removeItemAt(i);
            }
            existe = false;
        }
    }

    public Historial getServicios() {
        return servicios;
    }

    public void setServicios(Historial servicios) {
        this.servicios = servicios;
    }

    public static void AbreFrameProductos(javax.swing.JFrame fProductos, javax.swing.JTextField tFCodigo,
            javax.swing.JTextField tFMostrarCodigo, Historial servicios,
            int ancho, int largo) {
        String codServicio = tFCodigo.getText();
        if (servicios.ExisteServicio(codServicio)) {
            fProductos.setSize(ancho, largo);
            fProductos.setLocationRelativeTo(null);
            fProductos.setVisible(true);
            tFMostrarCodigo.setText(codServicio);
        } else {
            JOptionPane.showMessageDialog(null, "Primero debe digitar el código de un servicio existente");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFProductos = new javax.swing.JFrame();
        jFPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TCP = new javax.swing.JTextField();
        TDP = new javax.swing.JTextField();
        TVUP = new javax.swing.JTextField();
        TPP = new javax.swing.JTextField();
        CB_FP = new javax.swing.JComboBox<>();
        CB_PP = new javax.swing.JComboBox<>();
        CB_EPP = new javax.swing.JComboBox<>();
        TNPP = new javax.swing.JTextField();
        BVerificarPro = new javax.swing.JButton();
        BAñadirProducto = new javax.swing.JButton();
        BEliminarPro = new javax.swing.JButton();
        jLAnuncioP = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TCS_P = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TDR = new javax.swing.JTextField();
        TDD = new javax.swing.JTextField();
        TRS = new javax.swing.JTextField();
        TFC = new javax.swing.JTextField();
        TCC = new javax.swing.JTextField();
        TCS = new javax.swing.JTextField();
        CB_VI = new javax.swing.JComboBox<>();
        CB_SR = new javax.swing.JComboBox<>();
        BVerificar = new javax.swing.JButton();
        B_AProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_MPro = new javax.swing.JTextArea();
        B_MSuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAMostrar = new javax.swing.JTextArea();
        B_MCli = new javax.swing.JButton();
        B_MVeh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        B_AServicio = new javax.swing.JButton();
        jLAnuncio = new javax.swing.JLabel();
        B_AV = new javax.swing.JButton();
        B_QS = new javax.swing.JButton();
        B_QV = new javax.swing.JButton();
        B_AS = new javax.swing.JButton();

        jFProductos.setTitle("Agregar Producto ");

        jFPanel.setLayout(null);

        jLabel10.setText("Código:");
        jFPanel.add(jLabel10);
        jLabel10.setBounds(80, 70, 54, 16);

        jLabel12.setText("Destino:");
        jFPanel.add(jLabel12);
        jLabel12.setBounds(80, 120, 56, 16);

        jLabel13.setText("Perecible:");
        jFPanel.add(jLabel13);
        jLabel13.setBounds(70, 170, 65, 16);

        jLabel14.setText("Fragilidad:");
        jFPanel.add(jLabel14);
        jLabel14.setBounds(70, 220, 66, 16);

        jLabel15.setText("Vida útil:");
        jFPanel.add(jLabel15);
        jLabel15.setBounds(80, 270, 58, 16);

        jLabel16.setText("Peso:");
        jFPanel.add(jLabel16);
        jLabel16.setBounds(90, 320, 44, 16);

        jLabel17.setText("Estado del proceso:");
        jFPanel.add(jLabel17);
        jLabel17.setBounds(10, 370, 122, 16);

        jLabel18.setText("Número de partes:");
        jFPanel.add(jLabel18);
        jLabel18.setBounds(20, 410, 114, 16);
        jFPanel.add(TCP);
        TCP.setBounds(150, 70, 160, 24);

        TDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDPActionPerformed(evt);
            }
        });
        jFPanel.add(TDP);
        TDP.setBounds(150, 120, 160, 24);
        jFPanel.add(TVUP);
        TVUP.setBounds(150, 270, 160, 24);
        jFPanel.add(TPP);
        TPP.setBounds(150, 320, 160, 24);

        CB_FP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jFPanel.add(CB_FP);
        CB_FP.setBounds(150, 216, 160, 30);

        CB_PP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        jFPanel.add(CB_PP);
        CB_PP.setBounds(150, 166, 160, 30);

        CB_EPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitado", "Paquete en Almacen", "En Transporte", "Entregado" }));
        CB_EPP.setSelectedIndex(1);
        jFPanel.add(CB_EPP);
        CB_EPP.setBounds(150, 366, 160, 30);
        jFPanel.add(TNPP);
        TNPP.setBounds(150, 410, 160, 24);

        BVerificarPro.setText("Verificar");
        BVerificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerificarProActionPerformed(evt);
            }
        });
        jFPanel.add(BVerificarPro);
        BVerificarPro.setBounds(320, 70, 77, 24);

        BAñadirProducto.setText("Añadir producto");
        BAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAñadirProductoActionPerformed(evt);
            }
        });
        jFPanel.add(BAñadirProducto);
        BAñadirProducto.setBounds(70, 500, 140, 24);

        BEliminarPro.setText("Eliminar prodcto");
        BEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarProActionPerformed(evt);
            }
        });
        jFPanel.add(BEliminarPro);
        BEliminarPro.setBounds(250, 500, 140, 24);

        jLAnuncioP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFPanel.add(jLAnuncioP);
        jLAnuncioP.setBounds(30, 460, 390, 30);

        jLabel19.setText("Código de servicio:");
        jFPanel.add(jLabel19);
        jLabel19.setBounds(20, 30, 120, 16);

        TCS_P.setEditable(false);
        jFPanel.add(TCS_P);
        TCS_P.setBounds(150, 30, 160, 24);

        javax.swing.GroupLayout jFProductosLayout = new javax.swing.GroupLayout(jFProductos.getContentPane());
        jFProductos.getContentPane().setLayout(jFProductosLayout);
        jFProductosLayout.setHorizontalGroup(
            jFProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        jFProductosLayout.setVerticalGroup(
            jFProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 153, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nuevo Servicio");
        add(jLabel1);
        jLabel1.setBounds(355, 6, 130, 42);

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código:");
        add(jLabel2);
        jLabel2.setBounds(90, 70, 50, 28);

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dirección del Remitente:");
        add(jLabel3);
        jLabel3.setBounds(10, 130, 140, 28);

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección del destinatario:");
        add(jLabel4);
        jLabel4.setBounds(10, 190, 150, 28);

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ruta:");
        add(jLabel5);
        jLabel5.setBounds(110, 250, 28, 28);

        jLabel6.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de contratación:");
        add(jLabel6);
        jLabel6.setBounds(20, 310, 130, 28);

        jLabel7.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sucursales a recorrer:");
        add(jLabel7);
        jLabel7.setBounds(100, 403, 140, 20);

        jLabel8.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Código del cliente:");
        add(jLabel8);
        jLabel8.setBounds(40, 370, 110, 28);

        jLabel9.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Involucrar vehiculos:");
        add(jLabel9);
        jLabel9.setBounds(270, 400, 150, 20);

        TDR.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        add(TDR);
        TDR.setBounds(170, 120, 140, 30);

        TDD.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        add(TDD);
        TDD.setBounds(170, 180, 140, 30);

        TRS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TRS.setText("Ciudad-...-Ciudad");
        TRS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TRSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TRSFocusLost(evt);
            }
        });
        add(TRS);
        TRS.setBounds(170, 240, 140, 30);

        TFC.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TFC.setText("DD/MM/AAAA");
        TFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFCFocusLost(evt);
            }
        });
        add(TFC);
        TFC.setBounds(170, 300, 140, 30);

        TCC.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        add(TCC);
        TCC.setBounds(170, 360, 140, 30);

        TCS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        add(TCS);
        TCS.setBounds(170, 60, 140, 30);

        CB_VI.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        add(CB_VI);
        CB_VI.setBounds(270, 430, 140, 30);

        CB_SR.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        CB_SR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_SRActionPerformed(evt);
            }
        });
        add(CB_SR);
        CB_SR.setBounds(90, 430, 140, 30);

        BVerificar.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        BVerificar.setText("Verificar");
        BVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerificarActionPerformed(evt);
            }
        });
        add(BVerificar);
        BVerificar.setBounds(380, 60, 100, 20);

        B_AProducto.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_AProducto.setText("Gestionar productos");
        B_AProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AProductoActionPerformed(evt);
            }
        });
        add(B_AProducto);
        B_AProducto.setBounds(360, 100, 150, 20);

        TA_MPro.setEditable(false);
        TA_MPro.setColumns(20);
        TA_MPro.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TA_MPro.setRows(5);
        jScrollPane1.setViewportView(TA_MPro);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 130, 203, 200);

        B_MSuc.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_MSuc.setText("Sucursales");
        B_MSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MSucActionPerformed(evt);
            }
        });
        add(B_MSuc);
        B_MSuc.setBounds(740, 70, 100, 20);

        TAMostrar.setEditable(false);
        TAMostrar.setColumns(20);
        TAMostrar.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TAMostrar.setRows(5);
        jScrollPane2.setViewportView(TAMostrar);

        add(jScrollPane2);
        jScrollPane2.setBounds(550, 100, 290, 380);

        B_MCli.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_MCli.setText("Clientes");
        B_MCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MCliActionPerformed(evt);
            }
        });
        add(B_MCli);
        B_MCli.setBounds(540, 70, 90, 20);

        B_MVeh.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_MVeh.setText("Vehiculos");
        B_MVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MVehActionPerformed(evt);
            }
        });
        add(B_MVeh);
        B_MVeh.setBounds(640, 70, 90, 20);

        jLabel11.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Mostrar ");
        add(jLabel11);
        jLabel11.setBounds(660, 30, 60, 33);

        B_AServicio.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_AServicio.setText("Agregar servicio");
        B_AServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AServicioActionPerformed(evt);
            }
        });
        add(B_AServicio);
        B_AServicio.setBounds(350, 350, 160, 27);

        jLAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLAnuncio);
        jLAnuncio.setBounds(500, 500, 340, 30);

        B_AV.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_AV.setText("Añadir vehiculo");
        B_AV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AVActionPerformed(evt);
            }
        });
        add(B_AV);
        B_AV.setBounds(270, 470, 130, 30);

        B_QS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_QS.setText("Quitar sucursal");
        B_QS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_QSActionPerformed(evt);
            }
        });
        add(B_QS);
        B_QS.setBounds(90, 500, 130, 30);

        B_QV.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_QV.setText("Quitar vehiculo");
        B_QV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_QVActionPerformed(evt);
            }
        });
        add(B_QV);
        B_QV.setBounds(270, 500, 130, 30);

        B_AS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        B_AS.setText("Añadir sucursal");
        B_AS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ASActionPerformed(evt);
            }
        });
        add(B_AS);
        B_AS.setBounds(90, 470, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void CB_SRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_SRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_SRActionPerformed

    private void B_AProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AProductoActionPerformed
        String codServicio;
        AbreFrameProductos(jFProductos, TCS, TCS_P, servicios, 439, 594);
        codServicio = TCS.getText();
        TA_MPro.setText(servicios.MostrarServicio(codServicio).Recorrer());
    }//GEN-LAST:event_B_AProductoActionPerformed

    private void BVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerificarActionPerformed
        String codServicio = TCS.getText();
        String mensaje;
        if (servicios.ExisteServicio(codServicio)) {
            mensaje = "Servicio encontrado:\n";
            mensaje += servicios.MostrarServicio(codServicio).MostrarServicio();
            TAMostrar.setText(mensaje);
        } else {
            mensaje = "No existe servicio con el código digitado.";
            jLAnuncio.setText(mensaje);
        }
        TA_MPro.setText(null);
    }//GEN-LAST:event_BVerificarActionPerformed

    private void B_AServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AServicioActionPerformed
        Servicio service;
        String codServicio = TCS.getText();
        String dirRemi = TDR.getText();
        String dirDesti = TDD.getText();
        String ruta = TRS.getText();
        String fechaContra = TFC.getText();
        String codCliente = TCC.getText();
        Cliente client = clientes.Mostrar(codCliente);
        service = new Servicio(codServicio, dirRemi, dirDesti, ruta, fechaContra,
                client);
        servicios.AgregarServicio(service);
        TA_MPro.setText(null);
        //servicios.MostrarServicio(codServicio);
    }//GEN-LAST:event_B_AServicioActionPerformed

    private void B_ASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ASActionPerformed
        String codSucursal = CB_SR.getSelectedItem().toString();
        String codServicio = TCS.getText();
        Sucursal sucursal = sucursales.Mostrar(codSucursal);
        servicios.MostrarServicio(codServicio).AniadirSucursal(sucursal);
        jLAnuncio.setText("Se añadió sucursal al servicio");
    }//GEN-LAST:event_B_ASActionPerformed

    private void B_QSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_QSActionPerformed
        String codSucursal = CB_SR.getSelectedItem().toString();
        String codServicio = TCS.getText();
        String mensaje;
        mensaje = servicios.MostrarServicio(codServicio).EliminarSucursal(codSucursal);
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_B_QSActionPerformed

    private void B_AVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AVActionPerformed
        String codVehiculo = CB_VI.getSelectedItem().toString();
        String codServicio = TCS.getText();
        Vehiculo vehiculo = vehiculos.Mostrar(codVehiculo);
        servicios.MostrarServicio(codServicio).AniadirVehiculo(vehiculo);
        jLAnuncio.setText("Se añadió vehiculo al servicio");
    }//GEN-LAST:event_B_AVActionPerformed

    private void B_QVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_QVActionPerformed
        String codVehiculo = CB_VI.getSelectedItem().toString();
        String codServicio = TCS.getText();
        String mensaje;
        mensaje = servicios.MostrarServicio(codServicio).EliminarVehiculo(codVehiculo);
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_B_QVActionPerformed

    private void TDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDPActionPerformed

    private void BVerificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerificarProActionPerformed
        String codProducto = TCP.getText();
        String codServicio = TCS_P.getText();
        String mensaje;
        if (servicios.MostrarServicio(codServicio).ExisteElemento(codProducto)) {
            mensaje = "Ya existe un producto con el código digitado en este servicio";
        } else {
            mensaje = "No existe tal producto en este servicio.";
        }
        jLAnuncioP.setText(mensaje);
    }//GEN-LAST:event_BVerificarProActionPerformed

    private void BAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAñadirProductoActionPerformed
        String codServicio = TCS_P.getText();
        try {
            Producto producto;
            String codProducto = TCP.getText();
            String lugarDestino = TDP.getText();
            int gradoFragilidad = CB_FP.getSelectedIndex() + 1;
            int vidaUtil = Integer.parseInt(TVUP.getText());
            double peso = Double.parseDouble(TPP.getText());
            int estadoProceso = CB_EPP.getSelectedIndex() + 1;
            int numPartes = Integer.parseInt(TNPP.getText());
            int pereci = CB_PP.getSelectedIndex();
            boolean perecible = true;
            if (pereci == 0) {
                perecible = false;
            } else if (pereci == 1) {
                perecible = true;
            }
            if (numPartes > 0 && peso > 0 && vidaUtil >= 0) {
                producto = new Producto(codProducto, lugarDestino, perecible, gradoFragilidad,
                        vidaUtil, peso, estadoProceso, numPartes);
                servicios.MostrarServicio(codServicio).AniadirProducto(producto);

                TA_MPro.setText(servicios.MostrarServicio(codServicio).Recorrer());
            } else {
                jLAnuncioP.setText("Valor digitado inalido");
            }
        } catch (NumberFormatException ex) {
            jLAnuncioP.setText("Valor digitado inalido");
        }
    }//GEN-LAST:event_BAñadirProductoActionPerformed

    private void BEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarProActionPerformed
        String codProducto = TCP.getText();
        String codServicio = TCS_P.getText();
        String mensaje;
        mensaje = servicios.MostrarServicio(codServicio).EliminarElemento(codProducto);
        jLAnuncioP.setText(mensaje);

        TA_MPro.setText(servicios.MostrarServicio(codServicio).Recorrer());
    }//GEN-LAST:event_BEliminarProActionPerformed

    private void B_MCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MCliActionPerformed
        String client = clientes.Recorrer();
        TAMostrar.setText(client);
    }//GEN-LAST:event_B_MCliActionPerformed

    private void MouseExited(String texto, javax.swing.JTextField jTF) {
        String contenido = jTF.getText();
        if (contenido.equals("") || contenido.equals(null)) {
            jTF.setText(texto);
        }
    }

    private void TRSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TRSFocusGained
        TRS.setText(null);
    }//GEN-LAST:event_TRSFocusGained

    private void TRSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TRSFocusLost
        MouseExited("Ciudad-...-Ciudad", TRS);
    }//GEN-LAST:event_TRSFocusLost

    private void TFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFCFocusGained
        TFC.setText(null);
    }//GEN-LAST:event_TFCFocusGained

    private void TFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFCFocusLost
        MouseExited("DD/MM/AAAA", TFC);
    }//GEN-LAST:event_TFCFocusLost

    private void B_MVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MVehActionPerformed
        String auto = vehiculos.Recorrer();
        TAMostrar.setText(auto);
    }//GEN-LAST:event_B_MVehActionPerformed

    private void B_MSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MSucActionPerformed
        String sucur = sucursales.Recorrer();
        TAMostrar.setText(sucur);
    }//GEN-LAST:event_B_MSucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAñadirProducto;
    private javax.swing.JButton BEliminarPro;
    private javax.swing.JButton BVerificar;
    private javax.swing.JButton BVerificarPro;
    private javax.swing.JButton B_AProducto;
    private javax.swing.JButton B_AS;
    private javax.swing.JButton B_AServicio;
    private javax.swing.JButton B_AV;
    private javax.swing.JButton B_MCli;
    private javax.swing.JButton B_MSuc;
    private javax.swing.JButton B_MVeh;
    private javax.swing.JButton B_QS;
    private javax.swing.JButton B_QV;
    private javax.swing.JComboBox<String> CB_EPP;
    private javax.swing.JComboBox<String> CB_FP;
    private javax.swing.JComboBox<String> CB_PP;
    private javax.swing.JComboBox<String> CB_SR;
    private javax.swing.JComboBox<String> CB_VI;
    private javax.swing.JTextArea TAMostrar;
    private javax.swing.JTextArea TA_MPro;
    private javax.swing.JTextField TCC;
    private javax.swing.JTextField TCP;
    private javax.swing.JTextField TCS;
    private javax.swing.JTextField TCS_P;
    private javax.swing.JTextField TDD;
    private javax.swing.JTextField TDP;
    private javax.swing.JTextField TDR;
    private javax.swing.JTextField TFC;
    private javax.swing.JTextField TNPP;
    private javax.swing.JTextField TPP;
    private javax.swing.JTextField TRS;
    private javax.swing.JTextField TVUP;
    private javax.swing.JPanel jFPanel;
    private javax.swing.JFrame jFProductos;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLAnuncioP;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
