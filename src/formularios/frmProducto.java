/**
 *
 * @author Jose Albaro Salazar Rivera
 */
package formularios;

//IMPORTAMOS LA CLASE CLIENTE
import clases.ClaseProducto;

//IMPORTAMOS LIBRERIAS
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProducto extends javax.swing.JInternalFrame {

    //VARIABLES
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    
    
    public frmProducto() {
        initComponents();
        
        //INICIAMOS METODO DATOS TABLA
        DatosTabla();
        
        //CODIGO BLOQUEAR ESCRITURA EN CAJA DE TEXTO
        txtProCodigo.setEnabled(false);   
    }
    
    
    
    //METODO PARA MOSTRAR DATOS EN LA TABLAS
    public void DatosTabla(){
        ClaseProducto cProducto = new ClaseProducto();
        DefaultTableModel model =new DefaultTableModel();
        model = cProducto.lista();
        jTableProducto.setModel(model);
    }//FIN METODO PARA MOSTRAR DATOS EN LA TABLAS
    
    
    
    //METODO PARA AGREGAR DATOS
    public void Agregar(){
        ClaseProducto cProducto = new ClaseProducto();
        cProducto.AgregarConsulta(txtProNombre.getText(), txtProDescripcion.getText(), Double.parseDouble(txtProPrecio.getText()),Integer.parseInt(txtProCantidad.getText()));
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA AGREGAR DATOS


    
    //METODO PARA ELIMINAR DATOS
    public void Eliminar(){
        ClaseProducto cProducto = new ClaseProducto();
        cProducto.EliminarConsulta(txtProCodigo.getText());
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA ELIMINAR DATO
    
    
    
    //METODO PARA MODIFICAR DATOS
    public void Modificar(){
        ClaseProducto cProducto = new ClaseProducto();
        
        //EN EL MISMO ORDEN QUE EL METODO EN LA CLASE CLIENTE
        cProducto.ModificarConsulta(txtProNombre.getText(),txtProDescripcion.getText(),
                Double.parseDouble(txtProPrecio.getText()),Integer.parseInt(txtProCantidad.getText()),
                txtProCodigo.getText());
        
        //ACTUALIZAMOS DATOS EN LA TABLA
        DatosTabla();
    }//FIN METODO PARA MODIFICAR DATOS
    
    
    //METODO PARA LIMPIAR CAMPOS
    public void LimpiarCampos(){
        
        //LIMPIAMOS LAS CAJAS DE TEXTO
        txtProCodigo.setText(null);
        txtProNombre.setText(null);
        txtProDescripcion.setText(null);
        txtProPrecio.setText(null);
        txtProCantidad.setText(null);
        
        //DAMOS FOCO AL CAMPO NOMBRE Y APELLIDOS
        txtProNombre.requestFocus();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProNombre = new javax.swing.JTextField();
        txtProPrecio = new javax.swing.JTextField();
        txtProCantidad = new javax.swing.JTextField();
        txtProCodigo = new javax.swing.JTextField();
        btnProAgregar = new javax.swing.JButton();
        btnProModificar = new javax.swing.JButton();
        btnProEliminar = new javax.swing.JButton();
        btnProLimpiar = new javax.swing.JButton();
        btnProActualizar = new javax.swing.JButton();
        txtProDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Registrar:");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Los campos con * son obligatorios para el registro");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Descripción:");

        jLabel8.setText("Código:");

        btnProAgregar.setText("Agregar");
        btnProAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAgregarActionPerformed(evt);
            }
        });

        btnProModificar.setText("Modificar");
        btnProModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProModificarActionPerformed(evt);
            }
        });

        btnProEliminar.setText("Eliminar");
        btnProEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProEliminarActionPerformed(evt);
            }
        });

        btnProLimpiar.setText("Limpiar campos");
        btnProLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProLimpiarActionPerformed(evt);
            }
        });

        btnProActualizar.setText("Actualizar registro");
        btnProActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtProNombre)
                            .addComponent(txtProPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProCodigo)
                            .addComponent(txtProDescripcion))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnProAgregar)
                .addGap(34, 34, 34)
                .addComponent(btnProModificar)
                .addGap(38, 38, 38)
                .addComponent(btnProEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnProLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnProActualizar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtProDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtProCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProModificar)
                    .addComponent(btnProEliminar)
                    .addComponent(btnProAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProActualizar)
                        .addComponent(btnProLimpiar)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel1.setText("PRODUCTOS");

        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Lista de productos:");

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked
        DefaultTableModel model=(DefaultTableModel)this.jTableProducto.getModel();
        int i = jTableProducto.getSelectedRow();
        
        //CONDICION SI NO SE SELECCIONO NINGUNO
        if(i==-1){
            
            JOptionPane.showMessageDialog(this, "Seleccione");
        }else{
            
            //MOSTRAMOS LOS DATOS EN LAS CAJAS DE DEXTO
            //CONVERTIMOS EN STRING EL RESULTADO
            txtProCodigo.setText(String.valueOf(jTableProducto.getValueAt(i, 0)));
            txtProNombre.setText(String.valueOf(jTableProducto.getValueAt(i, 1)));
            txtProDescripcion.setText(String.valueOf(jTableProducto.getValueAt(i, 2)));
            txtProPrecio.setText(String.valueOf(jTableProducto.getValueAt(i, 3)));
            txtProCantidad.setText(String.valueOf(jTableProducto.getValueAt(i, 4)));
        }
    }//GEN-LAST:event_jTableProductoMouseClicked
    
    
    
    
    //METODO BOTON AGREGAR
    private void btnProAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAgregarActionPerformed
        //LLAMAMOS AL METODO AGREGAR
        Agregar();
    }//GEN-LAST:event_btnProAgregarActionPerformed
    
    
    
    
    //METODO BOTON MODIFICAR
    private void btnProModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProModificarActionPerformed
        //LLAMAMOS AL METODO MODIFICAR
        Modificar();
    }//GEN-LAST:event_btnProModificarActionPerformed

    
    
    
    //METODO BOTON ELIMINAR
    private void btnProEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProEliminarActionPerformed
        //LLAMAMOS AL METODO ELIMINAR
        Eliminar();
    }//GEN-LAST:event_btnProEliminarActionPerformed

    
    
    
    //METODO BOTON LIMPIAR CAMPOS
    private void btnProLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProLimpiarActionPerformed
        //LLAMAMOS AL METODO LIMPIAR CAMPOS
        LimpiarCampos();
    }//GEN-LAST:event_btnProLimpiarActionPerformed
    
    
    
    
    //METODO BOTON ACTUALIZAR REGISTRO
    private void btnProActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActualizarActionPerformed
        //LLAMAMOS AL METODO MOSTRAR DATOS
        DatosTabla();
    }//GEN-LAST:event_btnProActualizarActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProActualizar;
    private javax.swing.JButton btnProAgregar;
    private javax.swing.JButton btnProEliminar;
    private javax.swing.JButton btnProLimpiar;
    private javax.swing.JButton btnProModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField txtProCantidad;
    private javax.swing.JTextField txtProCodigo;
    private javax.swing.JTextField txtProDescripcion;
    private javax.swing.JTextField txtProNombre;
    private javax.swing.JTextField txtProPrecio;
    // End of variables declaration//GEN-END:variables
}
