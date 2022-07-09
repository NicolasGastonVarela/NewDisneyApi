package com.NewDisneyApi.NewDisneyApi.DataRepo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String titulo;
    private int fechaDeCreacion;
    private int calificacion;
    private String personajesAsociados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(int fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getPersonajesAsociados() {
        return personajesAsociados;
    }

    public void setPersonajesAsociados(String personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", calificacion=" + calificacion +
                ", personajesAsociados='" + personajesAsociados + '\'' +
                '}';
    }
}
