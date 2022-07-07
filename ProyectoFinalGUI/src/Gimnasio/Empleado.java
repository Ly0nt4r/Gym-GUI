package Gimnasio;

public class Empleado extends Usuarios{
	
	Double salarioBruto;
	Integer fechaIncorporacion;
	

	public Empleado(String nombre, String apellidos, Integer fechaNacimiento, String telefonoFijo,
			String telefonoMovil, Double salarioBruto, Integer fechaIncorporacion) {
		
		super(nombre, apellidos, fechaNacimiento, telefonoFijo, telefonoMovil);
		this.salarioBruto= salarioBruto;
		this.fechaIncorporacion= fechaIncorporacion;
		
	}


	public Double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public Integer getFechaIncorporacion() {
		return fechaIncorporacion;
	}


	public void setFechaIncorporacion(Integer fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	
}