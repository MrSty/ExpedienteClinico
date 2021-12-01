package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marcelo
 * @version 1.0
 * @created 26-Nov-2021 6:27:26 PM
 */
public class Clinica {

	private Registro m_Registro = new Registro();
	private Usuario m_Usuario;
        private Paciente p = new Paciente();
        TPaciente tt = new TPaciente();
        
        private TUsuario usu=new TUsuario();

	public Clinica(){
            
	}

	public void finalize() throws Throwable {

	}
	public void agregarRegistro(Paciente p){
            m_Registro.crearPaciente(p);
	}

	public void buscarRegistro(){

	}
        public void cargarPacientes(){
            this.m_Registro.cargarPaciente();
        }
       
        public Paciente leerPaciente(){
            this.cargarPacientes();
            this.p=this.m_Registro.leerPaciente(1);
            
            return p;
        }
        public Paciente leerPacienteAct(){
            return this.p = this.m_Registro.leerPacienteAct();
        }
        public boolean sigPaciente(){
            boolean sig = this.m_Registro.siguientePac();
            return sig;
        }
        public boolean antPaciente(){
            boolean ant = this.m_Registro.anteriorPac();
            return ant;
        }
        
        public boolean buscarUsuario(Usuario e) {
          this.usu.cargarDatos();
          return this.usu.buscar(e);
        }

	public void crearUsuario(String usuario, String clave){
            this.m_Usuario = new Usuario();
            this.m_Usuario.setUsuario(usuario);
            this.m_Usuario.setClave(clave);
            this.usu.agregar(m_Usuario);
	}
        public void cargarUsuarios(){
            this.usu.cargarDatos();
        }

	public void eliminarRegistro(){

	}

	public void modificarRegistro(){

	}
        
        
}//end Clinica