package com.dto;

public class EmpleadoDTO {
    private String dni;
    private String nombre;
    private Character sexo;
    private int categoria;
    private int anyos;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String dni, String nombre, Character sexo, int categoria, int anyos) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.categoria = categoria;
        this.anyos = anyos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO [\n" +
               "  anyos=" + anyos + "\n" +
               "  categoria=" + categoria + "\n" +
               "  dni=" + dni + "\n" +
               "  nombre=" + nombre + "\n" +
               "  sexo=" + sexo + "\n" +
               "]";
    }
    
}
