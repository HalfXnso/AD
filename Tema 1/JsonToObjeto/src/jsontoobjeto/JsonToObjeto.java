/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsontoobjeto;

import com.google.gson.Gson;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class JsonToObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos el String con la estructura json

        String json = "{\n"
                + "\"titulo\":\"Odisea 2001\",\n"
                + "\"paginas\":400\n"
                + "}";

        
        Gson miGson = new Gson();
        Libro miLibro = miGson.fromJson(json, Libro.class);
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Páginas: " + miLibro.getPaginas());

    }

}
