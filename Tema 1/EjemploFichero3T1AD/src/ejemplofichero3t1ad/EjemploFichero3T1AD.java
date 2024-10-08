/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofichero3t1ad;

import java.io.File;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploFichero3T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fichero = new File("fichero.txt");
        File carpeta = new File("curso");
        //Comprobamos si existe el fichero o la carpeta
        if (fichero.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero NO NO NO existe");
        }

        if (carpeta.exists()) {
            System.out.println("La carpeta existe");
        } else {
            System.out.println("La carpeta NO existe");
        }
        //Creamos la carpeta curso
        boolean creada = carpeta.mkdir();
        if (creada) {
            System.out.println("Carpeta creada");
        } else {
            System.out.println("Carpeta NO creada");
        }
        System.out.println("Ruta: " + fichero.getAbsolutePath());
        
        File proyecto = new File(".");
        
        //Volcamos en un array String el contenido de la carpeta del proyecto
        String[]listado = proyecto.list();
        
        for (String nombre : listado) {
            System.out.println("XD: "+nombre);
        }
        
        
        
        
        
        
        
    }

}
