package Interfaces;

import Clases.ListaVehiculos;
import Clases.Vehiculo;

public class GestionarVeh extends javax.swing.JPanel {

    private ListaVehiculos vehiculos = new ListaVehiculos();

    public GestionarVeh() {
        initComponents();
    }

    public void setVehiculos(ListaVehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ListaVehiculos getVehiculos() {
        return vehiculos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TCV = new javax.swing.JTextField();
        TSO = new javax.swing.JTextField();
        TMCP = new javax.swing.JTextField();
        CB_TR = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TUUR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CB_D = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_C = new javax.swing.JTextArea();
        BAV = new javax.swing.JButton();
        BRV = new javax.swing.JButton();
        BVC = new javax.swing.JButton();
        BEV = new javax.swing.JButton();
        jLAnuncio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_Mostrar = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        CB_Permiso = new javax.swing.JComboBox<>();

        setLayout(null);

        jLabel1.setText("Vehiculos");
        add(jLabel1);
        jLabel1.setBounds(276, 14, 70, 16);

        jLabel2.setText("Codigo Vehiculo:");
        add(jLabel2);
        jLabel2.setBounds(24, 67, 120, 16);

        jLabel3.setText("Sucursal de Origen:");
        add(jLabel3);
        jLabel3.setBounds(24, 118, 120, 16);

        jLabel4.setText("Máxima capcidad de carga (Kg):");
        add(jLabel4);
        jLabel4.setBounds(24, 172, 190, 16);

        jLabel5.setText("Tipo de recorrido:");
        add(jLabel5);
        jLabel5.setBounds(24, 229, 110, 16);
        add(TCV);
        TCV.setBounds(161, 63, 144, 24);
        add(TSO);
        TSO.setBounds(161, 114, 144, 24);
        add(TMCP);
        TMCP.setBounds(217, 168, 91, 24);

        CB_TR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbano", "Interprovinsial", "Interregional" }));
        CB_TR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TRActionPerformed(evt);
            }
        });
        add(CB_TR);
        CB_TR.setBounds(161, 224, 147, 26);

        jLabel6.setText("Ultima ubicación reportada:");
        add(jLabel6);
        jLabel6.setBounds(320, 67, 170, 16);
        add(TUUR);
        TUUR.setBounds(497, 63, 130, 24);

        jLabel7.setText("Disponibilidad:");
        add(jLabel7);
        jLabel7.setBounds(323, 118, 100, 16);

        CB_D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));
        CB_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DActionPerformed(evt);
            }
        });
        add(CB_D);
        CB_D.setBounds(483, 115, 144, 26);

        jLabel8.setText("Comentario:");
        add(jLabel8);
        jLabel8.setBounds(320, 200, 80, 16);

        TA_C.setColumns(20);
        TA_C.setRows(5);
        jScrollPane1.setViewportView(TA_C);

        add(jScrollPane1);
        jScrollPane1.setBounds(410, 200, 223, 83);

        BAV.setText("Agregar Vehiculo");
        BAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAVActionPerformed(evt);
            }
        });
        add(BAV);
        BAV.setBounds(10, 300, 150, 24);

        BRV.setText("Recorrer Vehiculos");
        BRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRVActionPerformed(evt);
            }
        });
        add(BRV);
        BRV.setBounds(320, 300, 150, 24);

        BVC.setText("Verificar código");
        BVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVCActionPerformed(evt);
            }
        });
        add(BVC);
        BVC.setBounds(170, 300, 140, 24);

        BEV.setText("Elimininar Vehiculo");
        BEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEVActionPerformed(evt);
            }
        });
        add(BEV);
        BEV.setBounds(480, 300, 160, 24);

        jLAnuncio.setFocusable(false);
        jLAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLAnuncio);
        jLAnuncio.setBounds(24, 257, 271, 26);

        TA_Mostrar.setEditable(false);
        TA_Mostrar.setColumns(20);
        TA_Mostrar.setRows(5);
        jScrollPane2.setViewportView(TA_Mostrar);

        add(jScrollPane2);
        jScrollPane2.setBounds(24, 343, 610, 128);

        jLabel9.setText("Dejar comentario:");
        add(jLabel9);
        jLabel9.setBounds(320, 164, 130, 16);

        CB_Permiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        add(CB_Permiso);
        CB_Permiso.setBounds(580, 160, 46, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void CB_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DActionPerformed

    private void CB_TRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TRActionPerformed

    private void BAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAVActionPerformed
        try {
            float maxCapPeso = Float.parseFloat(TMCP.getText());
            if (maxCapPeso > 0) {
                String codVehiculo = TCV.getText();
                String sucursalOrigen = TSO.getText();
                int tipoRecorrido = CB_TR.getSelectedIndex() + 1;
                String lugarUltimoReporte = TUUR.getText();
                boolean disponible;
                String nota;
                Vehiculo auto;
                if (CB_D.getSelectedItem().equals("Disponible")) {
                    disponible = true;
                } else {
                    disponible = false;
                }
                if (!vehiculos.ExisteElemento(codVehiculo)) {
                    if (CB_Permiso.getSelectedItem().equals("Si")) {
                        nota = TA_C.getText();
                        auto = new Vehiculo(maxCapPeso, disponible, sucursalOrigen, codVehiculo, lugarUltimoReporte, tipoRecorrido, nota);
                        vehiculos.Agregar(auto);
                        jLAnuncio.setText("Se agregó Vehiculo");
                    } else {
                        auto = new Vehiculo(maxCapPeso, disponible, sucursalOrigen, codVehiculo, lugarUltimoReporte, tipoRecorrido);
                        vehiculos.Agregar(auto);
                        jLAnuncio.setText("Se agregó Vehiculo");
                    }
                } else {
                    jLAnuncio.setText("El codigo digitado ya está en uso");
                }
            } else {
                jLAnuncio.setText("La máxima capacidad debe ser mayor a 0");
            }
        } catch (NumberFormatException ex) {
            jLAnuncio.setText("Valor digitado inalido");
        }

    }//GEN-LAST:event_BAVActionPerformed

    private void BVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVCActionPerformed
        String codVehiculo = TCV.getText(), mensaje;
        if (vehiculos.ExisteElemento(codVehiculo)) {
            mensaje = "Vehiculo encontrado:\n";
            mensaje += vehiculos.Mostrar(codVehiculo).Mostrar();
            TA_Mostrar.setText(mensaje);
        } else {
            mensaje = "No existe vehiculo con el código digitado.";
            jLAnuncio.setText(mensaje);
        }
    }//GEN-LAST:event_BVCActionPerformed

    private void BRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRVActionPerformed
        TA_Mostrar.setText(vehiculos.Recorrer());
    }//GEN-LAST:event_BRVActionPerformed

    private void BEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEVActionPerformed
        String codVehiculo = TCV.getText();
        jLAnuncio.setText(vehiculos.EliminarElemento(codVehiculo));
    }//GEN-LAST:event_BEVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAV;
    private javax.swing.JButton BEV;
    private javax.swing.JButton BRV;
    private javax.swing.JButton BVC;
    private javax.swing.JComboBox<String> CB_D;
    private javax.swing.JComboBox<String> CB_Permiso;
    private javax.swing.JComboBox<String> CB_TR;
    private javax.swing.JTextArea TA_C;
    private javax.swing.JTextArea TA_Mostrar;
    private javax.swing.JTextField TCV;
    private javax.swing.JTextField TMCP;
    private javax.swing.JTextField TSO;
    private javax.swing.JTextField TUUR;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLabel1;
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
