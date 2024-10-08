/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8t1ad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio8T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("..\\Ejercicio7T1AD\\matriculas.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        String contenido = "";
        String linea;
        while((linea = br.readLine())!= null){
            contenido+=linea+"\n";
        }
        System.out.println(contenido);
        br.close();
        fr.close();

    }
    
}
