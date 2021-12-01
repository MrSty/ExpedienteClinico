package domain;


import java.util.Date;



/**
 * @author Marcelo
 * @version 1.0
 * @created 26-Nov-2021 6:27:26 PM
 */
public class Cita {

        private String paciente;
	private Date fecha;

	public Cita(){

	}

	public void finalize() throws Throwable {

	}

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
        
}//end Cita