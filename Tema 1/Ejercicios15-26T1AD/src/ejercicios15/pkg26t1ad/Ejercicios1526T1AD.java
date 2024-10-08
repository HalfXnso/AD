/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios15.pkg26t1ad;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicios1526T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder poblacion = new StringBuilder();
        poblacion.append("Valencia");
        poblacion.insert(0, "Burjassotx");
        System.out.println(poblacion.length());
        System.out.println(poblacion);
        poblacion.setCharAt(9, '-');
        System.out.println(poblacion);
        System.out.println(poblacion.charAt(10));
        poblacion.delete(9, 10);
        System.out.println(poblacion);
        poblacion.delete(9, 20);
        poblacion.replace(5, 8, "Bici");
        System.out.println(poblacion);
        System.out.println(poblacion.indexOf("ja"));
        System.out.println(poblacion.substring(5,8));
        System.out.println(poblacion.reverse());
        
        
        
    }
    
}
