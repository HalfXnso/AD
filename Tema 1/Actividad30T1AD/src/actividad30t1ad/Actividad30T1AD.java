/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad30t1ad;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Actividad30T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Coche> coches = new ArrayList();

        coches.add(new Coche("1821FVP", "Dacia", "Logan", 7400, "Gasolina"));
        coches.add(new Coche("1421RSP", "Porche", "XDd", 73400, "Gasolina"));
        coches.add(new Coche("8761", "Peugeot", "206", 800, "Diésel"));
        
        System.out.println(coches);
        
        Gson miGson = new Gson();
        Type tipoListado = new TypeToken<ArrayList<Coche>>(){}.getType();
        
        String json = miGson.toJson(coches , tipoListado);
        System.out.println(json);
    }

}
