package com.model;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private int intentos;
    private Credencial c1;

    public Usuario(String nombre, String apellidos, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.c1 = new Credencial(password, apellidos, nombre);
    }

    public Usuario(String nombre, String apellidos, String email, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.c1 = new Credencial(password, apellidos, nombre);
    }

    public boolean esCuentaBloqueada() {
        return intentos > 3;
    }

    public boolean modificarPassword(String newpass, String oldpass, String newpassverif) {
        return true;
    }

    public boolean esPasswordSegura() {
        return c1.esPasswordSegura();
    }

    public boolean hacerLogin(String username, String password) {
        boolean esLogin = false;
        if (c1.comprobarPassword(password) && c1.getUsername().equals(username)) {
            esLogin = true;
        }else {
        	this.intentos ++;
        }
        return esLogin;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getEmail() {
        return this.email;
    }
}
