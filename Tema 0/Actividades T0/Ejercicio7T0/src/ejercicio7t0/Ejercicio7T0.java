/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7t0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio7T0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Escribe una fecha: ");
        String fechaInicio = tec.nextLine();
        System.out.print("Escribe otra fecha: ");
        String fechaFinal = tec.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicioFormateada = LocalDate.parse(fechaInicio, formato);
        LocalDate fechaFinalFormateada = LocalDate.parse(fechaFinal, formato);

        System.out.println(fechaInicio);
        System.out.println(fechaFinal);
        System.out.println("Día de la Semana de la Fecha Inicial"+
                fechaInicioFormateada.getDayOfWeek());
        System.out.println("Día de la Semana de la Fecha Final"+
                fechaFinalFormateada.getDayOfWeek());
        long diasEntre = ChronoUnit.DAYS.between(fechaInicioFormateada, fechaFinalFormateada);
        
        System.out.println("Días transcurridos entre"
                +fechaInicioFormateada +"y" +fechaFinalFormateada+":"+diasEntre);
    }

}
