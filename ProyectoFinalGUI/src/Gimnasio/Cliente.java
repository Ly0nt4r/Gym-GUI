package Gimnasio;

public class Cliente extends Usuarios{
	
	Integer cuotaPagada;
	Integer mensualidad;
	
	
	public Cliente(String nombre, String apellidos, Integer fechaNacimiento, String telefonoFijo,
			String telefonoMovil, Integer cuota, Integer mensualidad) {
		super(nombre, apellidos, fechaNacimiento, telefonoFijo, telefonoMovil);
		
		this.cuotaPagada=cuota;
		this.mensualidad=mensualidad;
		
	}
}
