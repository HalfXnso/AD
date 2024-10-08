/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostringbuilder;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjemploStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder cadena = new StringBuilder();
        
        //Método .append() asigna valor
        cadena.append("Aulo Campus");
        System.out.println(cadena);
        
        cadena.append(" - Curso DAM");
        System.out.println(cadena);
        System.out.println("Longidud: " + cadena.length());
        
        System.out.println(cadena.reverse());
        cadena.reverse();
        cadena.setCharAt(3, 'a');
        System.out.println(cadena);
        
        System.out.println("Posicion 5:"+ cadena.charAt(5));
        
        cadena.insert(11, " - 2024");
        System.out.println(cadena);
        
        cadena.delete(18, 30);
        System.out.println(cadena);
        
        cadena.deleteCharAt(11);
        System.out.println(cadena);
        
        cadena.replace(11, 17, " - DAM");
        System.out.println(cadena);
        
        int pos =cadena.indexOf("Campus");
        System.out.println(pos);
        System.out.println(cadena.substring(6));
        System.out.println(cadena.substring(6,11));
        
        String text = cadena.toString();
        System.out.println(text);
    }
    
}
