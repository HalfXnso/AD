/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3t0;

import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio3T0 {

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

        switch (catLab) {
            case 1:
                sueldo += sueldo*0.10;break;
                
            case 2:
                sueldo += sueldo * 0.20;break;
            case 3:
                sueldo += sueldo * 0.30;break;
            case 4:
                sueldo += sueldo * 0.40;break;
                
            default : sueldo = sueldo;
        }
        System.out.println("El empleado " + nombre + " con categoria Laboral "
                + catLab + " de " + poblacion + " cobra " + sueldo);
    }
}
