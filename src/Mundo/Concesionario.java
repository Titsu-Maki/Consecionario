
package Mundo;

import javax.swing.JOptionPane;


public class Concesionario {
    public static void main(String[] args) {
        
        Automovil a = new Automovil();
        Cliente c = new Cliente("12345678","Juan","Marquez","M",a);
        a.setModelo(JOptionPane.showInputDialog("digite modelo del auto")); 
        a.setMarca(JOptionPane.showInputDialog("digite marca del auto"));
        a.setNumeroPuertas(Integer.parseInt(JOptionPane.showInputDialog("digite numero de puertas del auto")));
        c.MostrarAuto();
        
        
    }
}
