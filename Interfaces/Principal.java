
package Interfaces;

import Guardar.Guardar;
import Clases.ListaClientes;
import Clases.ListaSucursales;
import Clases.ListaVehiculos;
import Clases.Historial;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Principal extends javax.swing.JFrame {

    Gestionar gestion=new Gestionar();
    GestionarHis gestionHistorial;
    GestionarServ gestionServicio;
    Inicio inicio=new Inicio();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        InicializaServicios();
        InicializaHistorial();
        IniciarGestionSeleccionada(inicio,PanelPrincipal);
        Guardar.leerExcel(gestionServicio.getServicios(), gestion.gestionCli.getARClientes(), 
                        gestion.gestionVeh.getVehiculos(), gestion.gestionSuc.getSucursales());
    }
    public static void IniciarGestionSeleccionada(JPanel panel, JPanel principal){
        panel.setSize(850, 546);
        panel.setLocation(0,0);
        
        principal.removeAll();
        principal.add(panel, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }
    private void InicializaServicios(){
        ListaClientes clientes=gestion.getGestionCli().getARClientes();
        ListaVehiculos vehiculos=gestion.getGestionVeh().getVehiculos();
        ListaSucursales sucursales=gestion.getGestionSuc().getSucursales();
        gestionServicio=new GestionarServ(sucursales,clientes,vehiculos);
    }
    
    private void InicializaHistorial(){
        Historial historia=gestionServicio.getServicios();
        gestionHistorial=new GestionarHis(historia);
        gestionServicio.setServicios(historia);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jMB = new javax.swing.JMenuBar();
        jMenu_Inicio = new javax.swing.JMenu();
        jMenu_Gestionar = new javax.swing.JMenu();
        jMItem_Clientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMItem_Vehiculos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMItem_Sucursales = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu_NServicio = new javax.swing.JMenu();
        jMenu_Historial = new javax.swing.JMenu();
        jMenu_Guardar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FEGPA");

        PanelPrincipal.setBackground(new java.awt.Color(109, 49, 6));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 120)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FEGPA");

        jLabel2.setBackground(new java.awt.Color(101, 30, 3));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Facilitador en Gestión de Paquetes");

        jTextField2.setText("                        .                                                                                                                                                           ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jMB.setBackground(new java.awt.Color(156, 120, 90));
        jMB.setBorder(null);

        jMenu_Inicio.setText("Inicio");
        jMenu_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_InicioMouseClicked(evt);
            }
        });
        jMB.add(jMenu_Inicio);

        jMenu_Gestionar.setText("Gestionar");

        jMItem_Clientes.setText("Clientes");
        jMItem_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_ClientesActionPerformed(evt);
            }
        });
        jMenu_Gestionar.add(jMItem_Clientes);
        jMenu_Gestionar.add(jSeparator1);

        jMItem_Vehiculos.setText("Vehiculos");
        jMItem_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_VehiculosActionPerformed(evt);
            }
        });
        jMenu_Gestionar.add(jMItem_Vehiculos);
        jMenu_Gestionar.add(jSeparator2);

        jMItem_Sucursales.setText("Sucursales");
        jMItem_Sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItem_SucursalesActionPerformed(evt);
            }
        });
        jMenu_Gestionar.add(jMItem_Sucursales);
        jMenu_Gestionar.add(jSeparator3);

        jMB.add(jMenu_Gestionar);

        jMenu_NServicio.setText("Nuevo Servicio");
        jMenu_NServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_NServicioMouseClicked(evt);
            }
        });
        jMB.add(jMenu_NServicio);

        jMenu_Historial.setText("Historial");
        jMenu_Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_HistorialMouseClicked(evt);
            }
        });
        jMB.add(jMenu_Historial);

        jMenu_Guardar.setText("Guardar");
        jMenu_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_GuardarMouseClicked(evt);
            }
        });
        jMB.add(jMenu_Guardar);

        setJMenuBar(jMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_ClientesActionPerformed
        gestion.setVisible(true);
        gestion.IniciarCon(1);
    }//GEN-LAST:event_jMItem_ClientesActionPerformed

    private void jMItem_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_VehiculosActionPerformed
        gestion.setVisible(true);
        gestion.IniciarCon(2);
    }//GEN-LAST:event_jMItem_VehiculosActionPerformed

    private void jMItem_SucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItem_SucursalesActionPerformed
        gestion.setVisible(true);
        gestion.IniciarCon(3);
       
    }//GEN-LAST:event_jMItem_SucursalesActionPerformed

    private void jMenu_NServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_NServicioMouseClicked
        IniciarGestionSeleccionada(gestionServicio,PanelPrincipal);
    }//GEN-LAST:event_jMenu_NServicioMouseClicked

    private void jMenu_HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_HistorialMouseClicked
        IniciarGestionSeleccionada(gestionHistorial,PanelPrincipal);
        gestionHistorial.Actualiza();
    }//GEN-LAST:event_jMenu_HistorialMouseClicked

    private void jMenu_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_InicioMouseClicked
        IniciarGestionSeleccionada(inicio,PanelPrincipal);
    }//GEN-LAST:event_jMenu_InicioMouseClicked

    private void jMenu_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_GuardarMouseClicked
        Guardar.crearExcel();
        Guardar.guardar(gestionServicio.getServicios(), gestion.gestionCli.getARClientes(), 
                        gestion.gestionVeh.getVehiculos(), gestion.gestionSuc.getSucursales());
        JOptionPane.showMessageDialog(null, "Se guardó la información");
    }//GEN-LAST:event_jMenu_GuardarMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                File archivo = new File("Hitorial.xlsx");
                if(!archivo.exists()){
                    Guardar.crearExcel();
                }else{
                    System.out.println("Si existe");
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMB;
    private javax.swing.JMenuItem jMItem_Clientes;
    private javax.swing.JMenuItem jMItem_Sucursales;
    private javax.swing.JMenuItem jMItem_Vehiculos;
    private javax.swing.JMenu jMenu_Gestionar;
    private javax.swing.JMenu jMenu_Guardar;
    private javax.swing.JMenu jMenu_Historial;
    private javax.swing.JMenu jMenu_Inicio;
    private javax.swing.JMenu jMenu_NServicio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
