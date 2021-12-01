package domain;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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
            
            rs.updateString("paciente", e.getPaciente());
            rs.updateString("fechaCita", e.getFecha());
            
            rs.insertRow();
        } catch (SQLException ex) {
            Logger.getLogger(TCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
   
   public boolean siguiente(){
        try {
        if(rs.next()!=false){
            return true;
        }
        else{
            rs.previous();
            return false;
        }
        } catch (SQLException ex) {
                Logger.getLogger(TRegistro.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
        
    }
    public boolean anterior(){
        try {
        if(rs.previous()!=false){
            return true;
        }
        else{
            rs.next();
            return false;
        }
        } catch (SQLException ex) {
                Logger.getLogger(TRegistro.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
    }
    public void eliminar(){
        try {
            rs.deleteRow();
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(TRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
