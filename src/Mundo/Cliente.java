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
public class Cliente {
   private String id;
   private String nopmbre;
   private String apellido;
   private String genero;
   private Automovil automovil;
   
   public Cliente(){}

    public Cliente(String id, String nopmbre, String apellido, String genero, Automovil automovil) {
        this.id = id;
        this.nopmbre = nopmbre;
        this.apellido = apellido;
        this.genero = genero;
        this.automovil = automovil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNopmbre() {
        return nopmbre;
    }

    public void setNopmbre(String nopmbre) {
        this.nopmbre = nopmbre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
   //mostrar el auto que el cliente compro, incluyendo la capacidad del motor y procedencia del chasis
    
    public void MostrarAuto(){
        System.out.println("Cliente : ID :"+getId()+" "+getNopmbre()+" "+getApellido()+" genero :"+getGenero());
        System.out.println("Caracteristicas del auto comprado");
        System.out.println("marca :"+automovil.getMarca());
        System.out.println("modelo :"+automovil.getModelo());
        System.out.println("numero de puertas :"+automovil.getNumeroPuertas());
        System.out.println("capacidad del motor :"+automovil.m.getCapacidad());
        System.out.println("procedencia del chasis:"+automovil.ch.getProcedencia());
    }
   
}