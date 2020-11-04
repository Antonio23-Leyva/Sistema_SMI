package com.example.Sistema_SMI.modelo;

import javax.persistence.*;

@Entity
@Table(name="sensor") // Tabla persona en la bd
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private char id;
    String nombre;
    String modelo;
    String descripcion;
    String humedad;
    String temperatura;


    public Sensor(){

    }


    public void setId(char id) {
        this.id = id;
    }

    public char getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

}
