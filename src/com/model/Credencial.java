package com.model;

public class Credencial {
    private String username;
    private String password;
    private static int secuencia = 99;

    public Credencial(String password, String apellidos, String nombre) {
        this.password = password;
        this.username = generarUsername(nombre, apellidos); // Generar username
    }

    private String generarUsername(String nombre, String apellidos) {
        return nombre.substring(0, 2) + apellidos.substring(0, 2) + (++secuencia);
    }

    public boolean comprobarPassword(String otraPassword) {
        return this.password.equals(otraPassword);
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean esPasswordSegura() {
        boolean esSegura = false;
        if (this.password.matches(".*[a-z].*") 
            && this.password.matches(".*[A-Z].*") 
            && this.password.matches(".*[0-9].*") 
            && this.password.matches(".*[$%&!?¿¡].*") 
            && this.password.length() > 10) {
            esSegura = true;
        }
        return esSegura;
    }
}
