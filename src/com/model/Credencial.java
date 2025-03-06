package com.model;

public class Credencial {
	private String username;
	private String password;
	private static int secuencia = 99;
	private Usuario u1;
	
	public Credencial(String password,String apellidos,String nombre ) {
		super();
		this.password = password ;
		this.u1 = new Usuario(nombre, apellidos,password);
	}
	
	public boolean comprobarPassword(String OtraPassword) {
		return this.password.equals(OtraPassword);
	}

	public String getUsername(String nombre, String apellidos) {
		String usuario = nombre.substring(0, 2) + apellidos.substring(0,2) + secuencia+1;
		return username;
	}

	public void setPassword(String password) {
			this.password = password;
	}
	
	public boolean esPasswordSegura() {
		boolean esSegura = false;
		if(this.password.toLowerCase().contains("abcdefghijklmnopqrtuvwxyz")
			&& this.password.contains("$%&!?¿¡")&& this.password.length() > 10){
			 esSegura = true;
		}
		return esSegura;
	}
	
}
