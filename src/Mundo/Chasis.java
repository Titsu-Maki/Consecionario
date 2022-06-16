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
public class Chasis {
    private String numero;
    private String procedencia;
    
    
    public Chasis(){}
    
    public Chasis(String numero, String procedencia) {
        this.numero = numero;
        this.procedencia = procedencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    
}
