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
public class Automovil {
    private String marca;
    private String modelo;
    private int numeroPuertas;
    private Motor motor;
    private Chasis chasis;
    //atributos de composicion
    Motor m = new Motor("2500","151ca540");
    Chasis ch = new Chasis("5448145","RUSIA");
    
    public Automovil(){}

    public Automovil(String marca, String modelo, int numeroPuertas, Motor motor, Chasis chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.motor = motor;
        this.chasis = chasis;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public void actualizar(String marca, String modelo, int numeroPuertas, Motor motor, Chasis chasis){
        setMarca(marca);
        setModelo(modelo);
        setNumeroPuertas(numeroPuertas);
        
    }
    
}
