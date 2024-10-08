/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6t0;

import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio6T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double importeFactura = Double.MIN_VALUE;
        double importeMayor = importeFactura;
        while (importeFactura != 0) {

            System.out.print("Introduce el importe de la factura: ");
            importeFactura = tec.nextInt();
            if (importeMayor < importeFactura) {
                importeMayor = importeFactura;
            }
        }
        System.out.println(importeMayor);
    }

}
