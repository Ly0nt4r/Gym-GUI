package Gimnasio;

public class Usuarios {
	  String nombre;
	    String apellidos;
	    Integer fechaNacimiento;
	    String telefonoFijo;
	    String telefonoMovil;
	    
	    
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public Integer getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Integer fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getTelefonoFijo() {
			return telefonoFijo;
		}
		public void setTelefonoFijo(String telefonoFijo) {
			this.telefonoFijo = telefonoFijo;
		}
		public String getTelefonoMovil() {
			return telefonoMovil;
		}
		public void setTelefonoMovil(String telefonoMovil) {
			this.telefonoMovil = telefonoMovil;
		}
		
		public Usuarios(String nombre, String apellidos, Integer fechaNacimiento, String telefonoFijo,
				String telefonoMovil) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.telefonoFijo = telefonoFijo;
			this.telefonoMovil = telefonoMovil;
		}
	    
}
