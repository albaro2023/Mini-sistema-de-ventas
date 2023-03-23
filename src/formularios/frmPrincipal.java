/**
 *
 * @author Jose Albaro Salazar Rivera
 */
package formularios;

//LIBRERIA PARA EL ICONO
import clases.ClaseReporteCliente;
import javax.swing.ImageIcon;
//IMPORTAMOS LIBRERIAS
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        
        //CODIGO PARA CENTRAR VENTANA
        this.setLocationRelativeTo(null);
        
        //CODIGO PARA MAXIMIZAR VENTA
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //CODIGO AÑADIR ICONO AL JFRAME
        this.setIconImage(new ImageIcon(getClass().getResource("/iconos/ico_sis_ventas.png")).getImage());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ventas");

        javax.swing.GroupLayout PanelEscritorioLayout = new javax.swing.GroupLayout(PanelEscritorio);
        PanelEscritorio.setLayout(PanelEscritorioLayout);
        PanelEscritorioLayout.setHorizontalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelEscritorioLayout.setVerticalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_menu.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_cliente.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_producto.png"))); // NOI18N
        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_salir.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_venta.png"))); // NOI18N
        jMenu2.setText("Ventas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_venta_productos.png"))); // NOI18N
        jMenuItem3.setText("Venta de productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_reporte.png"))); // NOI18N
        jMenu3.setText("Reportes");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_repo_cliente.png"))); // NOI18N
        jMenuItem5.setText("Reporte clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_repo_producto.png"))); // NOI18N
        jMenuItem6.setText("Reporte productos");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ico_repo_venta.png"))); // NOI18N
        jMenuItem7.setText("Reporte Ventas");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //LLAMAMOS AL FORMULARIO CLIENTE
        frmCliente vClientes = new frmCliente();
        
        //AGREGAMOS LA VENTANA DENTRO EL PANEL DE ESCRITORIO
        /*Se debe agregar Panel de escritorio a la ventana principal
        y le ponemos de nombre PanelEscritorio
        */
        PanelEscritorio.add(vClientes);
        
        //MOSTRAMOS LA VENTANA
        vClientes.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //LLAMAMOS AL FORMULARIO PRODUCTO
        frmProducto vProducto = new frmProducto();
        
        //AGREGAMOS LA VENTANA DENTRO EL PANEL DE ESCRITORIO
        /*Se debe agregar Panel de escritorio a la ventana principal
        y le ponemos de nombre PanelEscritorio
        */
        PanelEscritorio.add(vProducto);
        
        //MOSTRAMOS LA VENTANA
        vProducto.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //CODIGO SUB MENU SALIR
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // CODIGO QUE MUESTRA MENSAJE DE DIALOGO SI NO
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del programa?",
                "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        
        if(resp==0){
            
            //CODIGO QUE CIERRA VENTANA
            System.exit( 0 );
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // //LLAMAMOS AL FORMULARIO VENTA
        frmVenta vVenta = new frmVenta();
        
        //AGREGAMOS LA VENTANA DENTRO EL PANEL DE ESCRITORIO
        /*Se debe agregar Panel de escritorio a la ventana principal
        y le ponemos de nombre PanelEscritorio
        */
        PanelEscritorio.add(vVenta);
        
        //MOSTRAMOS LA VENTANA
        vVenta.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //CODIGO SUB MENU REPORTE CLIENTES
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //LLAMAMOS A LA CLASE REPORTE CLIENTE
        ClaseReporteCliente ReCliente = new ClaseReporteCliente();
        
        //MOSTRAMOS LA VENTANA DEL REPORTE
        ReCliente.ReporteClientes();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
