/**
 *
 * @author Jose Albaro Salazar Rivera
 */
package formularios;

//IMPORTAMOS LA CLASE CLIENTE
import clases.ClaseCliente;

//IMPORTAMOS LIBRERIAS
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCliente extends javax.swing.JInternalFrame {

    //VARIABLES
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    public frmCliente() {
        initComponents();
        
        //INICIAMOS METODO DATOS TABLA
        DatosTabla();
        
        //CODIGO BLOQUEAR ESCRITURA EN CAJA DE TEXTO
        txtCliCodigo.setEnabled(false);
    }
    
    //METODO PARA MOSTRAR DATOS EN LA TABLAS
    public void DatosTabla(){
        ClaseCliente cCliente = new ClaseCliente();
        DefaultTableModel model =new DefaultTableModel();
        model = cCliente.lista();
        jTableCliente.setModel(model);
    }//FIN METODO PARA MOSTRAR DATOS EN LA TABLAS
    
    
    
    //METODO PARA AGREGAR DATOS
    public void Agregar(){
        ClaseCliente cCliente = new ClaseCliente();
        cCliente.AgregarConsulta(txtCliNombre.getText(), txtCliApellidos.getText(), txtCliCi.getText());
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA AGREGAR DATOS
    
    
    
    //METODO PARA ELIMINAR DATOS
    public void Eliminar(){
        ClaseCliente cCliente = new ClaseCliente();
        cCliente.EliminarConsulta(txtCliCodigo.getText());
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA ELIMINAR DATOS
     
    
    
    //METODO PARA MODIFICAR DATOS
    public void Modificar(){
        ClaseCliente cCliente = new ClaseCliente();
        
        //EN EL MISMO ORDEN QUE EL METODO EN LA CLASE CLIENTE
        cCliente.ModificarConsulta(txtCliNombre.getText(),txtCliApellidos.getText(),
                txtCliCi.getText(),txtCliCodigo.getText());
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA MODIFICAR DATOS
    
    
    
    //METODO PARA LIMPIAR CAMPOS
    public void LimpiarCampos(){
        
        //LIMPIAMOS LAS CAJAS DE TEXTO
        txtCliCodigo.setText(null);
        txtCliNombre.setText(null);
        txtCliApellidos.setText(null);
        txtCliCi.setText(null);
        
        //DAMOS FOCO AL CAMPO NOMBRE Y APELLIDOS
        txtCliNombre.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCliNombre = new javax.swing.JTextField();
        txtCliApellidos = new javax.swing.JTextField();
        txtCliCi = new javax.swing.JTextField();
        txtCliCodigo = new javax.swing.JTextField();
        btnCliAgregar = new javax.swing.JButton();
        btnCliModificar = new javax.swing.JButton();
        btnCliEliminar = new javax.swing.JButton();
        btnCliLimpiar = new javax.swing.JButton();
        btnCliActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");

        jLabel1.setText("CLIENTES");

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Registrar:");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Los campos con * son obligatorios para el registro");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("C.I./NIT:");

        jLabel7.setText("Código:");

        btnCliAgregar.setText("Agregar");
        btnCliAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliAgregarActionPerformed(evt);
            }
        });

        btnCliModificar.setText("Modificar");
        btnCliModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliModificarActionPerformed(evt);
            }
        });

        btnCliEliminar.setText("Eliminar");
        btnCliEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEliminarActionPerformed(evt);
            }
        });

        btnCliLimpiar.setText("Limpiar campos");
        btnCliLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliLimpiarActionPerformed(evt);
            }
        });

        btnCliActualizar.setText("Actualizar registro");
        btnCliActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActualizarActionPerformed(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Lista de clientes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCliAgregar)
                                .addGap(36, 36, 36)
                                .addComponent(btnCliModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCliEliminar)
                                .addGap(45, 45, 45)
                                .addComponent(btnCliLimpiar)
                                .addGap(45, 45, 45)
                                .addComponent(btnCliActualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliNombre)
                                    .addComponent(txtCliApellidos))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCliCi, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(txtCliCodigo))))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCliCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliAgregar)
                    .addComponent(btnCliModificar)
                    .addComponent(btnCliEliminar)
                    .addComponent(btnCliActualizar)
                    .addComponent(btnCliLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //METODO CLICK EN LA TABLA DE REGISTROS
    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        DefaultTableModel model=(DefaultTableModel)this.jTableCliente.getModel();
        int i = jTableCliente.getSelectedRow();
        
        //CONDICION SI NO SE SELECCIONO NINGUNO
        if(i==-1){
            
            JOptionPane.showMessageDialog(this, "Seleccione");
        }else{
            
            //MOSTRAMOS LOS DATOS EN LAS CAJAS DE DEXTO
            //CONVERTIMOS EN STRING EL RESULTADO
            txtCliCodigo.setText(String.valueOf(jTableCliente.getValueAt(i, 0)));
            txtCliNombre.setText(String.valueOf(jTableCliente.getValueAt(i, 1)));
            txtCliApellidos.setText(String.valueOf(jTableCliente.getValueAt(i, 2)));
            txtCliCi.setText(String.valueOf(jTableCliente.getValueAt(i, 3)));
        }
    }//GEN-LAST:event_jTableClienteMouseClicked
    //FIN METODO CLICK EN LA TABLA DE REGISTROS
    
    
    //METODO BOTON AGREGAR
    private void btnCliAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliAgregarActionPerformed
        //LLAMAMOS AL METODO AGREGAR
        Agregar();
    }//GEN-LAST:event_btnCliAgregarActionPerformed
    
    //METODO BOTON MODIFICAR
    private void btnCliModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliModificarActionPerformed
        //LLAMAMOS AL METODO MODIFICAR
        Modificar();
    }//GEN-LAST:event_btnCliModificarActionPerformed
    
    //METODO BOTON ELIMINAR
    private void btnCliEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEliminarActionPerformed
        //LLAMAMOS AL METODO ELIMINAR
        Eliminar();
    }//GEN-LAST:event_btnCliEliminarActionPerformed

    //METODO BOTON LIMPIAR CAMPOS
    private void btnCliLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliLimpiarActionPerformed
        //LLAMAMOS AL METODO LIMPIAR CAMPOS
        LimpiarCampos();
    }//GEN-LAST:event_btnCliLimpiarActionPerformed
    
    //METODO BOTON ACTUALIZAR REGISTRO
    private void btnCliActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActualizarActionPerformed
        //LLAMAMOS AL METODO MOSTRAR DATOS
        DatosTabla();
    }//GEN-LAST:event_btnCliActualizarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliActualizar;
    private javax.swing.JButton btnCliAgregar;
    private javax.swing.JButton btnCliEliminar;
    private javax.swing.JButton btnCliLimpiar;
    private javax.swing.JButton btnCliModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField txtCliApellidos;
    private javax.swing.JTextField txtCliCi;
    private javax.swing.JTextField txtCliCodigo;
    private javax.swing.JTextField txtCliNombre;
    // End of variables declaration//GEN-END:variables
}
