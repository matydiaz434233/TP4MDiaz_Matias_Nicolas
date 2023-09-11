package com.matisoft.tp4mdiaz_matias_nicolas.modelo;

public class Usuario {

    private String apellido;
    private String nombre;

    private String telefono;

    private int foto;

    public Usuario(String apellido, String nombre, String telefono, int foto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.foto = foto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
