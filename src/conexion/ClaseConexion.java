/**
 *
 * @author Jose Albaro Salazar Rivera
 */
package conexion;

//IMPORTAMOS LIBRERIAS
import java.sql.Connection; //Aqui obtenemos el metodo conectar
import java.sql.DriverManager; //Aqui obtenemos el manejo del driver de java a mysql
import java.sql.SQLException; //Aqui obtenemos los metodo para manejo de excepciones
import javax.swing.JOptionPane;

public class ClaseConexion {
    
    //Comprobando conexion
    /*public static void main(String[] args) {
        //Creamos un objeto de tipo conexion
        ClaseConexion cn = new ClaseConexion();
        //Mandamos a llamar el metodo conectado
        cn.conector();
    }*/
    

    // Declaramos la conexion a mysql
    private static Connection cn;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/dbventas";
    
    public static Connection conector(Connection cn) {
        // Reseteamos a null la conexion a la bd
        cn=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            cn= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (cn!=null){
                //JOptionPane.showMessageDialog(null, "Conexion con la DB exitosa");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion" + e);
        }
        return cn;
    }
}//fin calse ClaseConexion
