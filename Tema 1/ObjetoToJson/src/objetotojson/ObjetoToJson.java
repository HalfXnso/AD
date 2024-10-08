/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetotojson;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class ObjetoToJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //Creamos una instancia de Libro 
        Libro miLibro = new Libro("Wigeta777", 400);

        Gson gson = new Gson();
        String json = gson.toJson(miLibro);
        System.out.println(json);

        //Guardamos el Json en un fichero
        File fichero = new File("libro.json");

        //Creamos flujo de escritura sobre el fichero
        FileWriter fw = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        //Volcar el contendo del fichero en memoria
        bw.flush();

        bw.close();
        fw.close();

    }

}
