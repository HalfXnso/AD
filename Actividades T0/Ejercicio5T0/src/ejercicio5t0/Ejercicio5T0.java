/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5t0;

import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio5T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        double importeFactura = Double.MAX_VALUE;
        double importeMenor = importeFactura;
        do {

            System.out.print("Introduce el importe de la factura: ");
            importeFactura = tec.nextInt();
            if (importeMenor > importeFactura && importeFactura > 0) {
                importeMenor = importeFactura;
            }
        } while (importeFactura != 0);
        System.out.println(importeMenor);
    }

}
