package domain;

import java.util.Calendar;



/**
 * @author Marcelo
 * @version 1.0
 * @created 26-Nov-2021 6:27:26 PM
 */
public class Registro {

	private String diagnostico;
	private Calendar fecha;
	private String tratamiento;
	private Cita m_Cita;
        private TPaciente mn = new TPaciente();
        
	public Registro(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param fecha
	 */
	public void crearCita(Calendar fecha){

	}

	public void crearPaciente(Paciente p){
            this.mn.agregar(p);
	}
        public Paciente leerPaciente(int i){
            Paciente n;
           n= this.mn.leerRegistro(i);
           return n;
        }
        public Paciente leerPacienteAct(){
            Paciente n;
            return n = this.mn.leerRegistroActual();
        }
        public void cargarPaciente(){
            this.mn.cargarDatos();
        }
        public boolean siguientePac(){
            boolean sig = this.mn.siguiente();
            return sig;
        }

        public boolean anteriorPac(){
            boolean sig = this.mn.anterior();
            return sig;
        }
	public void modificarCita(){

	}
}//end Registro