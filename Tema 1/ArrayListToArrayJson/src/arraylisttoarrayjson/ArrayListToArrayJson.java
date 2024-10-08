/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttoarrayjson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class ArrayListToArrayJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> misPersonas = new ArrayList();

        misPersonas.add(new Persona("Kerry", "Copo", 34));
        misPersonas.add(new Persona("Salchi", "Chón", 34));
        misPersonas.add(new Persona("Malva", "Visco", 34));
        
        //Creamos instancia de tipo gson
        Gson miGson = new Gson();
        // Obtenemos el tipo de estructura del arrayList de Persona que queremos convertir
        Type tipoListado = new TypeToken<ArrayList<Persona>>(){}.getType();
        // Convertimos el arraylist en string json
        String json = miGson.toJson(misPersonas, tipoListado);
        System.out.println(json);
    }

}
