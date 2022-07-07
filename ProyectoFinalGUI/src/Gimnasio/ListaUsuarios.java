package Gimnasio;

import java.util.HashMap;
import java.util.Map;

public class ListaUsuarios {
	Integer numeroSocio;
	
	Map <Integer,Usuarios> listaUsuarios = new HashMap<Integer,Usuarios>();
	
	
	
	public Integer getNumeroSocio() {
		return numeroSocio;
	}



	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}



	public Map<Integer, Usuarios> getListaUsuarios() {
		return listaUsuarios;
	}



	public void setListaUsuarios(Map<Integer, Usuarios> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}



	public void agregarUsuario(Usuarios nuevoCliente) {
		listaUsuarios.put(getNumeroSocio(),nuevoCliente);
	}



	public ListaUsuarios(Integer numeroSocio, Map<Integer, Usuarios> listaUsuarios) {
		super();
		this.numeroSocio = numeroSocio;
		this.listaUsuarios = listaUsuarios;
	}
}
