/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonarraytoarraylist;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class JsonArrayToArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String json = "[{\"nombre\":\"Kerry\",\"apellidos\":\"Copo\",\"edad\":34},{\"nombre\":\"Salchi\",\"apellidos\":\"Chón\",\"edad\":34},{\"nombre\":\"Malva\",\"apellidos\":\"Visco\",\"edad\":34}]";
        //Creamos instancia gson para conversion
        Gson miGson = new Gson();

        // Creamos ArrayList para la conversión con el método from json
        ArrayList<Persona> personas = miGson.fromJson(json,
                new TypeToken<ArrayList<Persona>>() {
                }.getType());
         
        // Mostramos los dats del ArrayList
        for(Persona miPersona: personas){
            System.out.println("Nombre: "+ miPersona.getNombre());
            System.out.println("Apellidos: "+ miPersona.getApellidos());
            System.out.println("Edad: "+ miPersona.getEdad());
            
        }

    }

}
