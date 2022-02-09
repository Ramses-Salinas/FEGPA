
package Interfaces;

import Clases.ListaSucursales;
import Clases.Sucursal;


public class GestionarSucur extends javax.swing.JPanel {

    ListaSucursales sucursales=new ListaSucursales();
    
    public GestionarSucur() {
        initComponents();
    }

    public ListaSucursales getSucursales() {
        return sucursales;
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TCS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TDS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BVerificar = new javax.swing.JButton();
        BAgregar = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Mostrar = new javax.swing.JTextArea();
        jLAnuncio = new javax.swing.JLabel();
        BEliminar = new javax.swing.JButton();
        BMostrar = new javax.swing.JButton();
        CB_TS = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(661, 473));
        setLayout(null);

        jLabel1.setText("Sucursales");
        add(jLabel1);
        jLabel1.setBounds(292, 6, 80, 16);

        jLabel2.setText("Código:");
        add(jLabel2);
        jLabel2.setBounds(70, 80, 50, 16);
        add(TCS);
        TCS.setBounds(150, 80, 130, 24);

        jLabel3.setText("Dirección:");
        add(jLabel3);
        jLabel3.setBounds(60, 160, 60, 16);
        add(TDS);
        TDS.setBounds(150, 160, 130, 24);

        jLabel4.setText("Tipo de sucursal:");
        add(jLabel4);
        jLabel4.setBounds(20, 230, 100, 16);

        BVerificar.setText("Verificar Código");
        BVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerificarActionPerformed(evt);
            }
        });
        add(BVerificar);
        BVerificar.setBounds(20, 280, 130, 24);

        BAgregar.setText("Agregar");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });
        add(BAgregar);
        BAgregar.setBounds(40, 330, 90, 24);

        BEditar.setText("Editar Tipo");
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        add(BEditar);
        BEditar.setBounds(180, 280, 110, 24);

        TA_Mostrar.setColumns(20);
        TA_Mostrar.setRows(5);
        jScrollPane1.setViewportView(TA_Mostrar);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 70, 330, 310);

        jLAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLAnuncio);
        jLAnuncio.setBounds(10, 400, 360, 20);

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        add(BEliminar);
        BEliminar.setBounds(190, 330, 90, 24);

        BMostrar.setText("Mostrar Sucursales");
        BMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarActionPerformed(evt);
            }
        });
        add(BMostrar);
        BMostrar.setBounds(410, 400, 150, 24);

        CB_TS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Central Nacional", "Central Regional", "Central Provinsial", "Central Distrital" }));
        CB_TS.setSelectedIndex(3);
        add(CB_TS);
        CB_TS.setBounds(150, 230, 150, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        String codSucursal=TCS.getText();
        String ubicacion=TDS.getText();
        int tipoSucursal=CB_TS.getSelectedIndex()+1;
        Sucursal sucursal;
        if(!sucursales.ExisteElemento(codSucursal)){
            sucursal=new Sucursal(codSucursal,ubicacion,tipoSucursal);
            sucursales.Agregar(sucursal);
            jLAnuncio.setText("Se agregó nueva sucursal");
        }else{
            jLAnuncio.setText("El código digitado ya está en uso");
        }
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerificarActionPerformed
        String codSucursal=TCS.getText();
        String mensaje;
        if(sucursales.ExisteElemento(codSucursal)){
           mensaje=sucursales.Mostrar(codSucursal).Mostrar();
           jLAnuncio.setText("Se encontró la sucursal buscada");
           TA_Mostrar.setText(mensaje);
        }else{
            jLAnuncio.setText("No se encontró sucursal con el código dado.");
        }
    }//GEN-LAST:event_BVerificarActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        String codSucursal=TCS.getText();
        int newTipo=CB_TS.getSelectedIndex()+1;
        String ubicacion=TDS.getText();
        Sucursal sucur=new Sucursal(codSucursal,ubicacion,newTipo);
        String mensaje;
        mensaje=sucursales.EditaElemento(codSucursal, sucur);
        jLAnuncio.setText("mensaje");
    }//GEN-LAST:event_BEditarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        String codSucursal=TCS.getText();
        String mensaje;
        mensaje=sucursales.EliminarElemento(codSucursal);
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarActionPerformed
        String mensaje;
        mensaje=sucursales.Recorrer();
        TA_Mostrar.setText(mensaje);
    }//GEN-LAST:event_BMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BMostrar;
    private javax.swing.JButton BVerificar;
    private javax.swing.JComboBox<String> CB_TS;
    private javax.swing.JTextArea TA_Mostrar;
    private javax.swing.JTextField TCS;
    private javax.swing.JTextField TDS;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
