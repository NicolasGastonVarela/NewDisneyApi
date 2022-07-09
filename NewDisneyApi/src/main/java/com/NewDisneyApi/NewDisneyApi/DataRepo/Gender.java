package com.NewDisneyApi.NewDisneyApi.DataRepo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String nombre;
    private int id;
    private String peliculasAsociadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    public void setPeliculasAsociadas(String peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", peliculasAsociadas='" + peliculasAsociadas + '\'' +
                '}';
    }
}
