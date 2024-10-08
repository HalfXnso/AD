/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9t0;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio9T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa miMesa = new Mesa(123, 23, "123GFR", "Metal", 123);
        Mesa miMesa2 = new Mesa(223, 33, "444GFR", "Plástico", 12342.32);
        Silla miSilla = new Silla(24, "GomaEspuma", true, "1234ASDF", "Látex", 123);
        Silla miSilla2 = new Silla(24, "Platino", true, "5345ASDF", "Látex", 1223);
        
        System.out.println(miMesa);
        System.out.println(miMesa2);
        System.out.println(miSilla);
        System.out.println(miSilla2);
        System.out.println(miMesa.getPrecio());
        System.out.println(miSilla.getPrecio());
        miMesa.calculaIva();
        miSilla.calculaIva(12);
        
        System.out.println(miMesa.getPrecio());
        System.out.println(miSilla.getPrecio());
        
    }
    
}
