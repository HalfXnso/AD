/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7t1ad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio7T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        File matriculas = new File("matriculas.txt");
        FileWriter fw = new FileWriter(matriculas);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe una matrícula: ");
            String contenido = tec.nextLine();
            bw.write(contenido);
            bw.newLine();
        }
        bw.close();
        fw.close();
        System.out.println(matriculas.getPath());
    }

}
