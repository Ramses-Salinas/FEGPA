
package Interfaces;


public class Gestionar extends javax.swing.JFrame {

    GestionarCli gestionCli=new GestionarCli();
    GestionarVeh gestionVeh=new GestionarVeh();
    GestionarSucur gestionSuc=new GestionarSucur();
    EditClientes editarCli;
    EditVehiculos editVeh;
    public Gestionar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void IniciarCon(int opcion/*1:Clientes; 2:Vehiculos; 3:Sucursal*/){
        switch(opcion){
            case 1: Principal.IniciarGestionSeleccionada(gestionCli,PanelPrincipal);
                break;
            case 2: Principal.IniciarGestionSeleccionada(gestionVeh,PanelPrincipal);
                break;
            case 3: Principal.IniciarGestionSeleccionada(gestionSuc,PanelPrincipal);
                break;
        }
    }

    public GestionarCli getGestionCli() {
        return gestionCli;
    }

    public GestionarVeh getGestionVeh() {
        return gestionVeh;
    }

    public GestionarSucur getGestionSuc() {
        return gestionSuc;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cli = new javax.swing.JMenu();
        jMItem_Clientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMItem_EditClient = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu_Veh = new javax.swing.JMenu();
        jMItem_Vehiculos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMItem_EditVeh = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu_Suc = new javax.swing.JMenu();

        setTitle("Gestionar");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jMenu_Cli.setText("Clientes");

        jMItem_Clientes.setText("Clientes");
        jMItem_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_ClientesActionPerformed(evt);
            }
        });
        jMenu_Cli.add(jMItem_Clientes);
        jMenu_Cli.add(jSeparator1);

        jMItem_EditClient.setText("Editar clinetes");
        jMItem_EditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_EditClientActionPerformed(evt);
            }
        });
        jMenu_Cli.add(jMItem_EditClient);
        jMenu_Cli.add(jSeparator2);

        jMenuBar1.add(jMenu_Cli);

        jMenu_Veh.setText("Vehiculos");

        jMItem_Vehiculos.setText("Vehiculos");
        jMItem_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_VehiculosActionPerformed(evt);
            }
        });
        jMenu_Veh.add(jMItem_Vehiculos);
        jMenu_Veh.add(jSeparator3);

        jMItem_EditVeh.setText("Editar Vehiculos");
        jMItem_EditVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_EditVehActionPerformed(evt);
            }
        });
        jMenu_Veh.add(jMItem_EditVeh);
        jMenu_Veh.add(jSeparator4);

        jMenuBar1.add(jMenu_Veh);

        jMenu_Suc.setText("Sucursales");
        jMenu_Suc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_SucMouseClicked(evt);
            }
        });
        jMenu_Suc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SucActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Suc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItem_EditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_EditClientActionPerformed
        editarCli=new EditClientes(gestionCli.getARClientes());
        editarCli.setVisible(true);
        editarCli.setSize(787+10, 296+20);
        editarCli.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMItem_EditClientActionPerformed

    private void jMItem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_ClientesActionPerformed
        Principal.IniciarGestionSeleccionada(gestionCli,PanelPrincipal);
    }//GEN-LAST:event_jMItem_ClientesActionPerformed

    private void jMItem_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_VehiculosActionPerformed
        Principal.IniciarGestionSeleccionada(gestionVeh,PanelPrincipal);
    }//GEN-LAST:event_jMItem_VehiculosActionPerformed

    private void jMItem_EditVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_EditVehActionPerformed
        editVeh=new EditVehiculos(gestionVeh.getVehiculos());
        editVeh.setVisible(true);
        editVeh.setSize(627+20, 472+20);
        editVeh.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMItem_EditVehActionPerformed

    private void jMenu_SucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SucActionPerformed
        Principal.IniciarGestionSeleccionada(gestionSuc,PanelPrincipal);
    }//GEN-LAST:event_jMenu_SucActionPerformed

    private void jMenu_SucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_SucMouseClicked
        Principal.IniciarGestionSeleccionada(gestionSuc,PanelPrincipal);
    }//GEN-LAST:event_jMenu_SucMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JMenuItem jMItem_Clientes;
    private javax.swing.JMenuItem jMItem_EditClient;
    private javax.swing.JMenuItem jMItem_EditVeh;
    private javax.swing.JMenuItem jMItem_Vehiculos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Cli;
    private javax.swing.JMenu jMenu_Suc;
    private javax.swing.JMenu jMenu_Veh;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
