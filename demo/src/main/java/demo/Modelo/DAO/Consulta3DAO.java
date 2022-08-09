package demo.Modelo.DAO;
import java.sql.*;

import demo.Utilidades.JDBCUtilities;

public class Consulta3DAO {
    public static ResultSet consulta() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING (ID_Proyecto) WHERE Ciudad=='Salento' AND Proveedor=='Homecenter';";
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
