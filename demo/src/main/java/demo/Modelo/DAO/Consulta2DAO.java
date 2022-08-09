package demo.Modelo.DAO;
import java.sql.*;

import demo.Utilidades.JDBCUtilities;

public class Consulta2DAO {
    public static ResultSet consulta() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM proyecto WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena','Barranquilla');";
        try {
            conn=JDBCUtilities.conexion();
            stmt=conn.createStatement();
            rs= stmt.executeQuery(csql);

        } catch (Exception e) {
            System.out.println(e);            
        }
        return rs;
        
    }
    
}
