/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author estudiante
 */
public class Motor {
    private String capacidad;
    private String numeroSerie;
    
    
public Motor(){}

public Motor(String capacidad, String numeroSerie) {            
        this.capacidad = capacidad;
        this.numeroSerie = numeroSerie;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


}
