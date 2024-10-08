/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28t1ad;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio28T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Empleado miEmpleado = new Empleado("1234ASD", "Juan", "Perico", "I.T", "48676042T", 2600.32);
        
        Gson gson = new Gson();
        String json = gson.toJson(miEmpleado);
        System.out.println(json);
        
        
        File fichero = new File("empleado.json");
        
        FileWriter fw = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(json);
        bw.flush();
        bw.close();
        fw.close();
        
    }
    
}
