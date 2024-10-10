/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4t0;

import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio4T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double importeFinal = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Introduce el coste de la factura " + i+": ");
            double importeFactura = tec.nextInt();
            importeFinal += importeFactura;
        }
        System.out.println("El total de las facturas es: " + importeFinal + "€");
    }

}
