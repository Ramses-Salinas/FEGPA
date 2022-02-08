
package Interfaces;

import Clases.Historial;
import Clases.Producto;
import Clases.Servicio;


public class GestionarHis extends javax.swing.JPanel {

    Historial historia;
    
    public GestionarHis(Historial historia) {
        initComponents();
        this.historia=historia;
    }
    
    public void Actualiza(){
        String mensaje;
        mensaje=historia.RecorrerHistorial();
        TA_SE.setText(mensaje);
    }

    public Historial getHistoria() {
        return historia;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFProductos = new javax.swing.JFrame();
        jFPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CB_EPP = new javax.swing.JComboBox<>();
        BVerificarPro = new javax.swing.JButton();
        jLAnuncioP = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TCS_P = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA_MostrarP = new javax.swing.JTextArea();
        BModificarP = new javax.swing.JButton();
        CB_CP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_MS = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        TFC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BBS = new javax.swing.JButton();
        BRFC = new javax.swing.JButton();
        CB_EPProductos = new javax.swing.JComboBox<>();
        BEPProductos = new javax.swing.JButton();
        BPxP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_SE = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        TCS = new javax.swing.JTextField();
        jLAnuncio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        jFProductos.setTitle("Estado de proceso por producto");

        jFPanel.setLayout(null);

        jLabel10.setText("Código:");
        jFPanel.add(jLabel10);
        jLabel10.setBounds(80, 70, 54, 16);

        jLabel17.setText("Estado del proceso:");
        jFPanel.add(jLabel17);
        jLabel17.setBounds(20, 370, 122, 30);

        CB_EPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitado", "Paquete en Almacen", "En Transporte", "Entregado" }));
        CB_EPP.setSelectedIndex(1);
        jFPanel.add(CB_EPP);
        CB_EPP.setBounds(150, 370, 160, 30);

        BVerificarPro.setText("Mostrar");
        BVerificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerificarProActionPerformed(evt);
            }
        });
        jFPanel.add(BVerificarPro);
        BVerificarPro.setBounds(320, 70, 77, 24);

        jLAnuncioP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFPanel.add(jLAnuncioP);
        jLAnuncioP.setBounds(20, 420, 390, 30);

        jLabel19.setText("Código de servicio:");
        jFPanel.add(jLabel19);
        jLabel19.setBounds(20, 30, 120, 16);

        TCS_P.setEditable(false);
        jFPanel.add(TCS_P);
        TCS_P.setBounds(150, 30, 160, 24);

        TA_MostrarP.setColumns(20);
        TA_MostrarP.setRows(5);
        jScrollPane3.setViewportView(TA_MostrarP);

        jFPanel.add(jScrollPane3);
        jScrollPane3.setBounds(60, 120, 310, 230);

        BModificarP.setText("Modificar");
        BModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarPActionPerformed(evt);
            }
        });
        jFPanel.add(BModificarP);
        BModificarP.setBounds(320, 370, 90, 30);

        CB_CP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CB_CPMouseEntered(evt);
            }
        });
        jFPanel.add(CB_CP);
        CB_CP.setBounds(150, 70, 160, 26);

        javax.swing.GroupLayout jFProductosLayout = new javax.swing.GroupLayout(jFProductos.getContentPane());
        jFProductos.getContentPane().setLayout(jFProductosLayout);
        jFProductosLayout.setHorizontalGroup(
            jFProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        jFProductosLayout.setVerticalGroup(
            jFProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 102, 51));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Historial");
        add(jLabel1);
        jLabel1.setBounds(370, 10, 110, 30);

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código  del Servicio:");
        add(jLabel2);
        jLabel2.setBounds(10, 90, 130, 20);

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Editar Servicio");
        add(jLabel3);
        jLabel3.setBounds(220, 50, 140, 30);

        TA_MS.setEditable(false);
        TA_MS.setColumns(20);
        TA_MS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TA_MS.setRows(5);
        jScrollPane1.setViewportView(TA_MS);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 290, 390);

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de cumplimiento:");
        add(jLabel5);
        jLabel5.setBounds(390, 140, 150, 33);

        TFC.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCActionPerformed(evt);
            }
        });
        add(TFC);
        TFC.setBounds(320, 164, 140, 30);

        jLabel6.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Todos los productos:");
        add(jLabel6);
        jLabel6.setBounds(400, 260, 140, 20);

        BBS.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        BBS.setForeground(new java.awt.Color(0, 0, 0));
        BBS.setText("Buscar servicio");
        BBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBSActionPerformed(evt);
            }
        });
        add(BBS);
        BBS.setBounds(370, 90, 160, 30);

        BRFC.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        BRFC.setForeground(new java.awt.Color(0, 0, 0));
        BRFC.setText("Reportar");
        BRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRFCActionPerformed(evt);
            }
        });
        add(BRFC);
        BRFC.setBounds(480, 170, 100, 20);

        CB_EPProductos.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        CB_EPProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitado", "Paquete en Almacen", "En Transporte", "Entregado" }));
        add(CB_EPProductos);
        CB_EPProductos.setBounds(320, 280, 150, 38);

        BEPProductos.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        BEPProductos.setForeground(new java.awt.Color(0, 0, 0));
        BEPProductos.setText("Modificar");
        BEPProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEPProductosActionPerformed(evt);
            }
        });
        add(BEPProductos);
        BEPProductos.setBounds(480, 290, 100, 20);

        BPxP.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        BPxP.setForeground(new java.awt.Color(0, 0, 0));
        BPxP.setText("Producto por producto");
        BPxP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPxPActionPerformed(evt);
            }
        });
        add(BPxP);
        BPxP.setBounds(370, 340, 160, 37);

        jLabel8.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Modificar estado del proceso");
        add(jLabel8);
        jLabel8.setBounds(370, 230, 180, 20);

        TA_SE.setEditable(false);
        TA_SE.setColumns(20);
        TA_SE.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TA_SE.setRows(5);
        TA_SE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(TA_SE);

        add(jScrollPane2);
        jScrollPane2.setBounds(610, 90, 230, 420);

        jLabel9.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Servicios existentes");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel9);
        jLabel9.setBounds(640, 50, 170, 30);

        TCS.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        TCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCSActionPerformed(evt);
            }
        });
        add(TCS);
        TCS.setBounds(160, 80, 140, 36);
        add(jLAnuncio);
        jLAnuncio.setBounds(10, 520, 590, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(600, 40, 10, 510);

        jSeparator2.setToolTipText("");
        jSeparator2.setAutoscrolls(true);
        add(jSeparator2);
        jSeparator2.setBounds(600, 40, 252, 10);
        add(jSeparator3);
        jSeparator3.setBounds(310, 380, 280, 10);
        add(jSeparator4);
        jSeparator4.setBounds(310, 220, 280, 10);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator5);
        jSeparator5.setBounds(590, 220, 20, 160);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setMinimumSize(new java.awt.Dimension(30, 167));
        add(jSeparator6);
        jSeparator6.setBounds(310, 220, 30, 162);
        add(jSeparator7);
        jSeparator7.setBounds(310, 320, 280, 10);
        add(jSeparator8);
        jSeparator8.setBounds(310, 250, 280, 10);
    }// </editor-fold>//GEN-END:initComponents

    private void TFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCActionPerformed
    
    private void BBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBSActionPerformed
        String codServicio= TCS.getText();
        String mensaje;
        if(historia.ExisteServicio(codServicio)){
            mensaje=historia.MostrarServicio(codServicio).MostrarServicio();
            TA_MS.setText(mensaje);
        }else{
            mensaje="No se encontró el servicio solicitado.";
            jLAnuncio.setText(mensaje);
        }
    }//GEN-LAST:event_BBSActionPerformed

    private void BRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRFCActionPerformed
        String fechaCumplimiento=TFC.getText();
        String codServicio= TCS.getText();
        String mensaje;
        if(historia.ExisteServicio(codServicio)){
            historia.MostrarServicio(codServicio).setFechaCumplimiento(fechaCumplimiento);
            mensaje="Fecha de cumplimiento reportada";
        }else{
            mensaje="Ingrese un código de servicio valido.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BRFCActionPerformed

    private void BEPProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEPProductosActionPerformed
        String codServicio= TCS.getText();
        String mensaje;
        int estadoProceso;
        if(historia.ExisteServicio(codServicio)){
            estadoProceso=CB_EPProductos.getSelectedIndex()+1;
            historia.MostrarServicio(codServicio).setEstadoProcesoProductos(estadoProceso);
            mensaje="Estado de proceso actualizado para todos los productos";
        }else{
            mensaje="Ingrese un código de servicio valido.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BEPProductosActionPerformed

    private void BPxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPxPActionPerformed
        GestionarServ.AbreFrameProductos(jFProductos, TCS, TCS_P, historia,439,475);
        PasaCodProducto();
    }//GEN-LAST:event_BPxPActionPerformed

    private void PasaCodProducto(){
        String codServicio=TCS_P.getText();
        String codProducto;
        for(Producto producto: historia.MostrarServicio(codServicio).getProductosEncargados()){
            codProducto=producto.getCodigo();
            CB_CP.addItem(codProducto);
        }
    }

    private void BVerificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerificarProActionPerformed
        String codServicio=TCS_P.getText();
        String codProducto=CB_CP.getSelectedItem().toString();
        String producto=historia.MostrarServicio(codServicio).Mostrar(codProducto).Mostrar();
        TA_MostrarP.setText(producto);
    }//GEN-LAST:event_BVerificarProActionPerformed

    private void BModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarPActionPerformed
        String codServicio=TCS_P.getText();
        String codProducto=CB_CP.getSelectedItem().toString();
        int estadoProceso=CB_EPP.getSelectedIndex()+1;
        String mensaje;
        historia.MostrarServicio(codServicio).Mostrar(codProducto).setEstadoProceso(estadoProceso);
        mensaje="Se modifico el estado de proceso del producto.";
        jLAnuncioP.setText(mensaje);
    }//GEN-LAST:event_BModificarPActionPerformed

    private void CB_CPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CB_CPMouseEntered
        CB_CP.removeAllItems();
        PasaCodProducto();
    }//GEN-LAST:event_CB_CPMouseEntered

    private void TCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBS;
    private javax.swing.JButton BEPProductos;
    private javax.swing.JButton BModificarP;
    private javax.swing.JButton BPxP;
    private javax.swing.JButton BRFC;
    private javax.swing.JButton BVerificarPro;
    private javax.swing.JComboBox<String> CB_CP;
    private javax.swing.JComboBox<String> CB_EPP;
    private javax.swing.JComboBox<String> CB_EPProductos;
    private javax.swing.JTextArea TA_MS;
    private javax.swing.JTextArea TA_MostrarP;
    private javax.swing.JTextArea TA_SE;
    private javax.swing.JTextField TCS;
    private javax.swing.JTextField TCS_P;
    private javax.swing.JTextField TFC;
    private javax.swing.JPanel jFPanel;
    private javax.swing.JFrame jFProductos;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLAnuncioP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables

    
}
