/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4t1ad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio4T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        System.out.print("Escribe el número de la incidencia: ");
        String numIncidencia = tec.nextLine() + ".txt";
        System.out.print("Escribe información sobre la incidencia: ");
        String incidenciaT = tec.nextLine();
        
        File incidencia = new File(numIncidencia);
        FileWriter fw = new FileWriter(incidencia);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(incidenciaT);
        bw.close();
        fw.close();
        
    }
    
}
