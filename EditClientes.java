
package Interfaces;

import Clases.ListaClientes;
import Clases.Cliente;


public class EditClientes extends javax.swing.JFrame {

    ListaClientes clientes=new ListaClientes();
    boolean active=false;
    public EditClientes(ListaClientes clientes) {
        initComponents();
        this.clientes=clientes;
        active=true;
        this.setLocationRelativeTo(null);
    }
    public ListaClientes getARClientes(){
        return clientes;
    }
    public boolean getActive(){
        return active;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TNC = new javax.swing.JTextField();
        TCC = new javax.swing.JTextField();
        TDC = new javax.swing.JTextField();
        BBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BAgregarN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CB_TC = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_N = new javax.swing.JTextArea();
        BReemplazarN = new javax.swing.JButton();
        BEliminarN = new javax.swing.JButton();
        BETC = new javax.swing.JButton();
        jLAnuncio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_NotaC = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Clientes");

        jPanel1.setLayout(null);

        jLabel7.setText("DNI:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 190, 40, 16);

        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 120, 60, 16);

        jLabel9.setText("Codigo de cliente:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 50, 110, 16);
        jPanel1.add(TNC);
        TNC.setBounds(130, 110, 126, 24);
        jPanel1.add(TCC);
        TCC.setBounds(130, 50, 126, 24);
        jPanel1.add(TDC);
        TDC.setBounds(130, 190, 126, 24);

        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BBuscar);
        BBuscar.setBounds(270, 50, 90, 24);

        jLabel10.setText("Nota");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(500, 90, 30, 16);

        BAgregarN.setText("Agregar nueva nota");
        BAgregarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarNActionPerformed(evt);
            }
        });
        jPanel1.add(BAgregarN);
        BAgregarN.setBounds(310, 200, 160, 24);

        jLabel11.setText("Tipo de cliente:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(380, 50, 100, 16);

        jLabel12.setText("Editar Clientes");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(355, 6, 100, 16);

        CB_TC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Recurrente", "VIP" }));
        jPanel1.add(CB_TC);
        CB_TC.setBounds(500, 50, 91, 26);

        TA_N.setColumns(20);
        TA_N.setRows(5);
        jScrollPane2.setViewportView(TA_N);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(530, 90, 233, 103);

        BReemplazarN.setText("Reemplazar nota");
        BReemplazarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReemplazarNActionPerformed(evt);
            }
        });
        jPanel1.add(BReemplazarN);
        BReemplazarN.setBounds(480, 200, 130, 24);

        BEliminarN.setText("Eliminar nota");
        BEliminarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarNActionPerformed(evt);
            }
        });
        jPanel1.add(BEliminarN);
        BEliminarN.setBounds(620, 200, 110, 24);

        BETC.setText("Editar el tipo de cliente");
        BETC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BETCActionPerformed(evt);
            }
        });
        jPanel1.add(BETC);
        BETC.setBounds(600, 50, 170, 24);

        jLAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLAnuncio);
        jLAnuncio.setBounds(271, 260, 253, 30);

        TA_NotaC.setEditable(false);
        TA_NotaC.setColumns(20);
        TA_NotaC.setRows(5);
        jScrollPane1.setViewportView(TA_NotaC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 90, 223, 103);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        String codCliente=TCC.getText(), mensaje;
        TNC.setText(null);
        TDC.setText(null);
        TA_N.setText(null);
        if(clientes.ExisteElemento(codCliente)){
            mensaje="Cliente encontrado";
            TNC.setText(clientes.Mostrar(codCliente).getNombre());
            TDC.setText(clientes.Mostrar(codCliente).getDni());
            CB_TC.setSelectedIndex(clientes.Mostrar(codCliente).getTipoCliente()-1);
            if(!clientes.Mostrar(codCliente).getNota().equals("")){
                TA_NotaC.setText(clientes.Mostrar(codCliente).getNota());
            }
        }
        else{
            mensaje="No existe cliente con el código digitado.";
        }
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BETCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BETCActionPerformed
        String codCliente=TCC.getText(), mensaje;
        String nombre=TNC.getText();
        String dni=TDC.getText();
        int tipoCli=CB_TC.getSelectedIndex()+1;
        String nota=TA_NotaC.getText();
        Cliente client=new Cliente(codCliente,nombre,dni,tipoCli,nota);
        mensaje=clientes.EditaElemento(codCliente, client);
        jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BETCActionPerformed

    private void BAgregarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarNActionPerformed
        String codCliente=TCC.getText(), mensaje;
        if(clientes.ExisteElemento(codCliente)){
            String nota=clientes.Mostrar(codCliente).getNota();
            nota+="\nNota: "+TA_N.getText();
            clientes.Mostrar(codCliente).setNota(nota);
            mensaje="Se ha agregado un comentario al cliente "+clientes.Mostrar(codCliente).getNombre()+". ";
        }
        else{
            mensaje="No existe cliente con el código digitado.";
        }
         jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BAgregarNActionPerformed

    private void BReemplazarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReemplazarNActionPerformed
        String codCliente=TCC.getText(), mensaje;
        if(clientes.ExisteElemento(codCliente)){
            String nota="Nota: "+TA_N.getText();
            clientes.Mostrar(codCliente).setNota(nota);
            mensaje="Se ha reemplazado el comentario del cliente "+clientes.Mostrar(codCliente).getNombre()+". ";
        }
        else{
            mensaje="No existe cliente con el código digitado.";
        }
         jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BReemplazarNActionPerformed

    private void BEliminarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarNActionPerformed
        String codCliente=TCC.getText(), mensaje;
        if(clientes.ExisteElemento(codCliente)){
            clientes.Mostrar(codCliente).setNota("");
            mensaje="Se han eliminado los comentarios del cliente "+clientes.Mostrar(codCliente).getNombre()+". ";
        }
        else{
            mensaje="No existe cliente con el código digitado.";
        }
         jLAnuncio.setText(mensaje);
    }//GEN-LAST:event_BEliminarNActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarN;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BETC;
    private javax.swing.JButton BEliminarN;
    private javax.swing.JButton BReemplazarN;
    private javax.swing.JComboBox<String> CB_TC;
    private javax.swing.JTextArea TA_N;
    private javax.swing.JTextArea TA_NotaC;
    private javax.swing.JTextField TCC;
    private javax.swing.JTextField TDC;
    private javax.swing.JTextField TNC;
    private javax.swing.JLabel jLAnuncio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
