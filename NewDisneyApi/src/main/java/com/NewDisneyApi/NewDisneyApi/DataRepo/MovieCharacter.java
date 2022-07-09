package com.NewDisneyApi.NewDisneyApi.DataRepo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;
    private String peliculasAsociadas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    public void setPeliculasAsociadas(String peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }

    @Override
    public String toString() {
        return "MovieCharacter{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", historia='" + historia + '\'' +
                ", peliculasAsociadas='" + peliculasAsociadas + '\'' +
                '}';
    }
}
