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
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ClaseReporteCliente {
    
    //CREAMOS LAS VARIABLE DE LA CONEXION
    static Connection cn;
    
    //METODO MOSTRAR REPORTE CLIENTE
    public void ReporteClientes(){
        try {
            cn = ClaseConexion.conector(cn);
            
            String rutaReporte=System.getProperty("user.dir")+"/src/reportes/reporteClientes.jasper";
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile(rutaReporte);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, cn);
            
            JasperViewer view = new JasperViewer(print,false);
            view.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
