/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29t1ad;

import com.google.gson.Gson;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio29T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String json = "{\"idEmpleado\":\"1234ASD\",\n"
                + "\"nombre\":\"Juan\",\n"
                + "\"apellidos\":\"Perico\",\n"
                + "\"departamento\":\"I.T\",\n"
                + "\"dni\":\"48676042T\",\n"
                + "\"sueldo\":2600.32}";

        Gson miGson = new Gson();
        Empleado miEmpleado = miGson.fromJson(json, Empleado.class);
        System.out.println("Título: " + miEmpleado.getIdEmpleado() + "\nPáginas: "
                + miEmpleado.getNombre() + "\nApellidos: "
                + miEmpleado.getApellidos() + "\nDni: " + miEmpleado.getDni()
                + "\nDepartamento: " + miEmpleado.getDepartamento()
                + "\nSueldo: " + miEmpleado.getSueldo());

    }

}
