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

public class ClaseCliente {
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
            String query = "select * from cliente";
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
    
    }//FIN METODO MOSTRAR DATOS EN UNA JTABLE EN EL JFORM
    
    
    
    //METODO INSERTAR DATOS
    public void AgregarConsulta(String CliNombre,String Cliapellidos,String CliCi){
        //CODIGO QUE AGARRA LA FECHA ACTUAL
        Date fechaRe=new Date();
        SimpleDateFormat FR=new SimpleDateFormat("yyyy-MM-dd");
        String fechaRec=FR.format(fechaRe);
        
        //INSERTAR DATOS
        try{
            Statement s=cn.createStatement();
            String query = ("INSERT INTO cliente (`idCli`, `nombreCli`, `apellidosCli`, `ciCli`, `fechaRegistroCli`) VALUES (NULL, '"+CliNombre+"', '"+Cliapellidos+"', '"+CliCi+"', '"+fechaRec+"')");
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Se ingresaron los datos correctamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//FIN METODO INSERTAR DATOS
    
    
    
    //METODO ELIMINAR DATOS
    public void EliminarConsulta(String CliCodigo){
        try{
            
            //MENSAGE PARA CONFIRMAR LA ELIMINACION
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar el registro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(resp==0){
                
                //CODIGO QUE ELIMINA EL REGISTRO
                Statement s=cn.createStatement();
                String query="DELETE FROM cliente WHERE idCli="+CliCodigo+"";
                s.executeUpdate(query);
                s.close();
                cn.close();
                JOptionPane.showMessageDialog(null, "El registro fue eliminado");
            }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//FIN METODO ELIMINAR DATOS
    
    
    //METODO MODIFICAR DATOS
    public void ModificarConsulta(String CliNombre,String Cliapellidos,String CliCi, String CliCodigo){
        try{
            Statement s=cn.createStatement();
            String query="UPDATE cliente SET nombreCli='"+CliNombre+"', apellidosCli='"+Cliapellidos+"', ciCli='"+CliCi+"' WHERE cliente.idCli = '"+CliCodigo+"'"; 
            s.executeUpdate(query);
            s.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Se modificaron los datos correctamente");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     
    }//FIN METODO MODIFICAR DATOS
    
}//FIN CLASE CLIENTE
