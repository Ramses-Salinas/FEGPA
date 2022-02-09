package Interfaces;

import Clases.ListaVehiculos;
import Clases.Vehiculo;

public class EditVehiculos extends javax.swing.JFrame {

    ListaVehiculos vehiculos;
    boolean active = false;

    public EditVehiculos(ListaVehiculos vehiculos) {
        initComponents();
        this.vehiculos = vehiculos;
        active = true;
        this.setLocationRelativeTo(null);
    }

    public ListaVehiculos getVehiculos() {
        return vehiculos;
    }

    public boolean isActive() {
        return active;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TSO = new javax.swing.JTextField();
        CB_D = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_NA = new javax.swing.JTextArea();
        TCV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TLUR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TMCC = new javax.swing.JTextField();
        CB_TR = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_NN = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        BAgregarN = new javax.swing.JButton();
        BReemplazarN = new javax.swing.JButton();
        BEliminarN = new javax.swing.JButton();
        BGC = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        jLAnuncio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Vehiculos");

        jPanel1.setLayout(null);

        TSO.setEditable(false);
        jPanel1.add(TSO);
        TSO.setBounds(131, 107, 156, 24);

        CB_D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));
        CB_D.setSelectedIndex(1);
        jPanel1.add(CB_D);
        CB_D.setBounds(129, 327, 156, 26);

        jLabel2.setText("Código:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 69, 60, 16);

        jLabel5.setText("Maxima capacidad ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(6, 199, 120, 16);

        jLabel8.setText("Reporte:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(64, 289, 60, 16);

        jLabel3.setText("Sucursal de origen:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(6, 111, 120, 16);

        jLabel9.setText("Disponibilidad:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(28, 332, 100, 16);

        jLabel4.setText("Tipo de recorrido:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(17, 160, 110, 16);

        TA_NA.setEditable(false);
        TA_NA.setColumns(20);
        TA_NA.setRows(5);
        jScrollPane1.setViewportView(TA_NA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(368, 87, 223, 110);
        jPanel1.add(TCV);
        TCV.setBounds(131, 65, 156, 24);

        jLabel6.setText("de carga (Kg):");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(34, 221, 90, 16);
        jPanel1.add(TLUR);
        TLUR.setBounds(129, 267, 156, 24);

        jLabel1.setText("Editar Vehiculos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 16, 100, 16);
        jPanel1.add(TMCC);
        TMCC.setBounds(129, 213, 156, 24);

        CB_TR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urbano", "Interprovinsial", "Interregional" }));
        jPanel1.add(CB_TR);
        CB_TR.setBounds(131, 155, 156, 26);

        jLabel10.setText("Nota actual:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(368, 65, 80, 16);

        jLabel7.setText("Lugar de último");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(25, 267, 100, 16);

        TA_NN.setColumns(20);
        TA_NN.setRows(5);
        jScrollPane2.setViewportView(TA_NN);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(368, 231, 223, 121);

        jLabel11.setText("Nota nueva:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(368, 209, 80, 16);

        BAgregarN.setText("Agregar nueva nota");
        BAgregarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarNActionPerformed(evt);
            }
        });
        jPanel1.add(BAgregarN);
        BAgregarN.setBounds(300, 370, 160, 24);

        BReemplazarN.setText("Reemplazar nota");
        BReemplazarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReemplazarNActionPerformed(evt);
            }
        });
        jPanel1.add(BReemplazarN);
        BReemplazarN.setBounds(480, 370, 140, 24);

        BEliminarN.setText("Eliminar nota existente");
        BEliminarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarNActionPerformed(evt);
            }
        });
        jPanel1.add(BEliminarN);
        BEliminarN.setBounds(390, 410, 170, 24);

        BGC.setText("Guardar cambios");
        BGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGCActionPerformed(evt);
            }
        });
        jPanel1.add(BGC);
        BGC.setBounds(93, 376, 140, 24);

        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BBuscar);
        BBuscar.setBounds(286, 65, 80, 24);

        jLAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLAnuncio);
        jLAnuncio.setBounds(6, 436, 599, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        String codVehiculo = TCV.getText(), mensaje;
        TLUR.setText(null);
        TMCC.setText(null);
        TSO.setText(null);
        TA_NN.setText(null);
        TA_NA.setText(null);
        if (vehiculos.ExisteElemento(codVehiculo)) {
            mensaje = "Vehiculo encontrado";
            TSO.setText(vehiculos.Mostrar(codVehiculo).getSucursalOrigen());
            TLUR.setText(vehiculos.Mostrar(codVehiculo).getLugarUltimoReporte());
            TMCC.setText("" + vehiculos.Mostrar(codVehiculo).getMaxCapPeso());
            CB_TR.setSelectedIndex(vehiculos.Mostrar(codVehiculo).getTipoRecorrido() - 1);
            if (vehiculos.Mostrar(codVehiculo).getDisponibilidad()) {
                CB_D.setSelectedIndex(1);
            } else {
                CB_D.setSelectedIndex(0);
            }
            if (!vehiculos.Mostrar(codVehiculo).getNota().equals("")) {
                TA_NA.setText(vehiculos.Mostrar(codVehiculo).getNota());
            }
        } else {
            mensaje = "No existe vehiculo con el código digitado.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BBuscarActionPerformed

    private void EditaVehiculo(String codVehiculo, String nota) {
        try {
            float maxCapPeso = Float.parseFloat(TMCC.getText());
            if (maxCapPeso > 0) {
                int tipoRecorrido = CB_TR.getSelectedIndex() + 1;
                String lugarUltimoReporte = TLUR.getText();
                String sucursalOrigen = TSO.getText();
                boolean disponibilidad;
                switch (CB_D.getSelectedIndex()) {
                    case 0:
                        disponibilidad = false;
                        break;
                    case 1:
                        disponibilidad = true;
                        break;
                    default:
                        disponibilidad = true;
                        break;
                }
                Vehiculo vehiculo = new Vehiculo(maxCapPeso, disponibilidad, sucursalOrigen, codVehiculo, lugarUltimoReporte, tipoRecorrido, nota);
                vehiculos.EditaElemento(codVehiculo, vehiculo);
            } else {
                jLAnuncio.setText("La máxima capacidad debe ser mayor a 0");
            }
        } catch (NumberFormatException ex) {
            jLAnuncio.setText("Valor digitado inalido");
        }
    }

    private void BGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGCActionPerformed
        try {
            String codVehiculo = TCV.getText(), mensaje;
            if (vehiculos.ExisteElemento(codVehiculo)) {
                String nota = vehiculos.Mostrar(codVehiculo).getNota();
                EditaVehiculo(codVehiculo, nota);
                mensaje = "Se han guardo los cambios de " + vehiculos.Mostrar(codVehiculo).getCodigo() + ". ";
            } else {
                mensaje = "No existe vehiculo con el código digitado.";
            }
            jLAnuncio.setText(mensaje);
        } catch (NumberFormatException ex) {
            jLAnuncio.setText("Valor digitado inalido");
        }
    }//GEN-LAST:event_BGCActionPerformed

    private void BEliminarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarNActionPerformed
        String codVehiculo = TCV.getText(), mensaje;
        if (vehiculos.ExisteElemento(codVehiculo)) {
            vehiculos.Mostrar(codVehiculo).setNota("");
            mensaje = "Se han eliminado los comentarios del vehiculo " + vehiculos.Mostrar(codVehiculo).getCodigo() + ". ";
        } else {
            mensaje = "No existe vehiculo con el código digitado.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BEliminarNActionPerformed

    private void BReemplazarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReemplazarNActionPerformed
        String codVehiculo = TCV.getText(), mensaje;
        if (vehiculos.ExisteElemento(codVehiculo)) {
            String nota = TA_NN.getText();
            vehiculos.Mostrar(codVehiculo).setNota(nota);
            mensaje = "Se ha reemplazado el comentario del vehiculo " + vehiculos.Mostrar(codVehiculo).getCodigo() + ". ";
        } else {
            mensaje = "No existe vehiculo con el código digitado.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BReemplazarNActionPerformed

    private void BAgregarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarNActionPerformed
        String codVehiculo = TCV.getText(), mensaje;
        if (vehiculos.ExisteElemento(codVehiculo)) {
            String nota = vehiculos.Mostrar(codVehiculo).getNota();
            nota += "\nNota: " + TA_NN.getText();
            vehiculos.Mostrar(codVehiculo).setNota(nota);
            mensaje = "Se ha agregado un comentario al vehiculo " + vehiculos.Mostrar(codVehiculo).getCodigo() + ". ";
        } else {
            mensaje = "No existe vehiculo con el código digitado.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BAgregarNActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarN;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BEliminarN;
    private javax.swing.JButton BGC;
    private javax.swing.JButton BReemplazarN;
    private javax.swing.JComboBox<String> CB_D;
    private javax.swing.JComboBox<String> CB_TR;
    private javax.swing.JTextArea TA_NA;
    private javax.swing.JTextArea TA_NN;
    private javax.swing.JTextField TCV;
    private javax.swing.JTextField TLUR;
    private javax.swing.JTextField TMCC;
    private javax.swing.JTextField TSO;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
