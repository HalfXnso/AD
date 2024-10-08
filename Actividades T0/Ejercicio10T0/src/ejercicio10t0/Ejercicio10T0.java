/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10t0;

import java.util.ArrayList;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio10T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno>alumnos = new ArrayList();
        Alumno miAlumno1 = new Alumno("423425234J", "Juan Carlos", "De Borbón", "1 DOWN");
        Alumno miAlumno2 = new Alumno("123123V", "Angel", "Sinsitio", "2ºDAM");
        alumnos.add(miAlumno1);
        alumnos.add(miAlumno2);
        System.out.println(alumnos);
        alumnos.remove(1);
        System.out.println(alumnos);
        
    }
    
}
