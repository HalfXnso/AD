/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolectura2t1ad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploLectura2T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File fichero = new File("datos.txt");
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
        
        //Creamos instancia File sobre nuevoFichero.txt
        File nuevoFichero = new File("nuevoFichero.txt");
        //Creamos flujo de escrtura y buffer sobre el flujo
        FileWriter fw = new FileWriter(nuevoFichero);
        BufferedWriter bw = new BufferedWriter(fw);

        //Creamos contenido del fichero
        String linea1 = "Hola";
        String linea2 = "Adiós";
        //Escribimos en el fichero las líneas separadas por \n
        bw.write(linea1);
        bw.newLine();
        bw.write(linea2);
        //Volcamos memoria a disco
        bw.flush();
        //Cerramos buffer y flujo
        bw.close();
        fw.close();
        
    }
    
}
