/**
 *
 * @author Jose Albaro Salazar Rivera
 */
package clases;

//IMPORTAMOS EL PAQUETE DE CONEXION
import conexion.ClaseConexion;

//IMPORTAMOS LIBRERIAS
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClaseProducto {
    //CREAMOS LAS VARIABLES PARA LA CONEXION
    static Connection cn;
    static Statement s;
    static ResultSet rs;
    DefaultTableModel modelo= new DefaultTableModel();
    
    
    
    //METODO MOSTRAR DATOS EN UNA JTABLE EN EL JFORM
    public DefaultTableModel lista(){
        
        try{
            cn = ClaseConexion.conector(cn);
            Statement s= cn.createStatement();
            
            //CONSULTA A MOSTRAR
            String query = "select * from producto";
            rs = s.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData();
            
            //OBTENEMOS NUMERO DE COLUMNAS
            int CanColumns = rsmd.getColumnCount();
            
            //COMPROBAMOS
            for(int i=1;i<=CanColumns;i++){
                
                //CARGAMOS COLUMNAS EN MODELO
                modelo.addColumn(rsmd.getColumnLabel(i));
            }//FIN FOR
            
            while (rs.next()){
                
                //CREAMOS ARRAY
                Object[] fila=new Object[CanColumns];
                
                //CARGAMOS DATOS A MODELO
                for(int i=0;i<CanColumns;i++){
                    fila[i] = rs.getObject(i+1);
                }
                
            modelo.addRow(fila);
            }//FIN WHILE
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //RETORNAMOS MODELO PARA JTABLE
        return modelo;
    
    }//FIN METODO MOSTRAR DATOS EN UNA JTABLE EN EL JFOR
    
    
    
    //METODO INSERTAR DATOS
    public void AgregarConsulta(String ProNombre,String ProDescripcion,double ProPrecio,int ProCantidad){
        //CODIGO QUE AGARRA LA FECHA ACTUAL
        Date fechaRe=new Date();
        SimpleDateFormat FR=new SimpleDateFormat("yyyy-MM-dd");
        String fechaRec=FR.format(fechaRe);
        
        //INSERTAR DATOS
        try{
            Statement s=cn.createStatement();
            String query = ("INSERT INTO producto (`idPro`, `nombrePro`, `descripcionPro`, `precioPro`, `cantidadPro`, `fechaRegistroPro`) VALUES (NULL, '"+ProNombre+"', '"+ProDescripcion+"', '"+ProPrecio+"', '"+ProCantidad+"', '"+fechaRec+"')");
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Se ingresaron los datos correctamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//FIN METODO INSERTAR DATOS
    
    
    
    //METODO ELIMINAR DATOS
    public void EliminarConsulta(String ProCodigo){
        try{
            
            //MENSAGE PARA CONFIRMAR LA ELIMINACION
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar el Producto?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(resp==0){
                
                //CODIGO QUE ELIMINA EL REGISTRO
                Statement s=cn.createStatement();
                String query="DELETE FROM producto WHERE idPro="+ProCodigo+"";
                s.executeUpdate(query);
                s.close();
                cn.close();
                JOptionPane.showMessageDialog(null, "El Producto fue eliminado");
            }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//FIN METODO ELIMINAR DATOS
    
    
    
   //METODO MODIFICAR DATOS
    public void ModificarConsulta(String ProNombre,String ProDescripcion,double ProPrecio,int ProCantidad, String ProCodigo){
        try{
            Statement s=cn.createStatement();
            String query="UPDATE producto SET nombrePro='"+ProNombre+"', descripcionPro='"+ProDescripcion+"', precioPro='"+ProPrecio+"', cantidadPro='"+ProCantidad+"' WHERE producto.idPro = '"+ProCodigo+"'"; 
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Se modificaron los datos correctamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     
    }//FIN METODO MODIFICAR DATOS
    
}
