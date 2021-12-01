package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TCita {
    Connection cn;
    Statement stm;
    ResultSet rs;
    
    public TCita(){
        cn = Conexion.getConexion();
    }
    
    
    public void cargarDatos(){
        try {
            stm=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs=stm.executeQuery("SELECT * FROM Citas");
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(TCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void agregar(Cita e){
        try {
            rs.moveToInsertRow();
            Date n = e.getFecha();
            rs.updateString("paciente", e.getPaciente());
            rs.updateDate("fechaCita", e.getFecha());
            
            rs.insertRow();
        } catch (SQLException ex) {
            Logger.getLogger(TCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
