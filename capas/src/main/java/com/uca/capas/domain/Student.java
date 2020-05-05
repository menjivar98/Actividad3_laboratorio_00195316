package com.uca.capas.domain;

public class Student {
	private	String nombre;
	private String apellido;
	private String fEntreada;
	private String carrera;
	private Boolean estado;
	
	public Student(String nombre, String apellido, String fEntreada, String carrera, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fEntreada = fEntreada;
		this.carrera = carrera;
		this.estado = estado;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getfEntreada() {
		return fEntreada;
	}
	public void setfEntreada(String fEntreada) {
		this.fEntreada = fEntreada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public String delegateEstado() {
		return estado ? "Activo" : "Inactivo";
	}
	
	
}
