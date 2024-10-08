/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2t10;

import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio2T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = tec.nextLine();
        System.out.print("Introduce el sueldo: ");
        double sueldo = tec.nextDouble();
        tec.nextLine();
        System.out.print("Introduce la categoría laboral (1)(2)(3)(4): ");
        int catLab = tec.nextInt();
        tec.nextLine();
        System.out.print("Introduce la población: ");
        String poblacion = tec.nextLine();
        if (poblacion.equals("Valencia")) {
            sueldo += sueldo * 0.20;
        } else {
            sueldo += sueldo * 0.10;
        }
        System.out.println("El empleado " + nombre + " con categoria Laboral " + catLab
                + " de " + poblacion + " cobra " + sueldo);
    }

}
