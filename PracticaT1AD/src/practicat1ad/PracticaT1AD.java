/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat1ad;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class PracticaT1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, JAXBException {
        Scanner tec = new Scanner(System.in);
        
        File fichero = new File("mipais.txt");
        
        System.out.println("¿Qué quieres hacer?" + "\n" + "1.- Pedir datos del país y crear fichero."
                + "\n2.- Leer fichero y volcar datos a objeto miPais." + "\n3.- Crear fichero XML a partir del objeto miPais."
                + "\n4.- Crear fichero Json a partir del objeto miPais." + "\n5.- Salir de la aplicación."
        );
        int opcion = tec.nextInt();
        tec.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.print("Escribe el nombre del País: ");
                String nombre = tec.nextLine();
                System.out.print("Escribe el nombre de su capital: ");
                String capital = tec.nextLine();
                System.out.print("Escribe los kms de superficie del país: ");
                String superficie = tec.nextLine();
                System.out.print("Escribe el número de habitantes");
                String habitantes = tec.nextLine();
                System.out.print("¿Es costero?(S)(N)");
                String costero = tec.nextLine();
                
                switch (costero) {
                    case "S":
                        costero = "true";
                        break;
                    case "N":
                        costero = "false";
                    
                }
                FileWriter fw = new FileWriter(fichero);
                BufferedWriter bw = new BufferedWriter(fw);
                
                bw.write(nombre);
                bw.newLine();
                
                bw.write(capital);
                bw.newLine();
                
                bw.write(superficie);
                bw.newLine();
                
                bw.write(habitantes);
                bw.newLine();
                
                bw.write(costero);
                bw.newLine();
                
                bw.close();
                fw.close();
                
                ;
                break;
            case 2:
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                String[] paises = new String[5];
                
                for (int i = 0; i < paises.length; i++) {
                    paises[i] = br.readLine();
                }
                
                br.close();
                fr.close();
                ;
                Pais miPais = new Pais(paises[0], paises[1], Double.parseDouble(paises[2]), Integer.parseInt(paises[3]),
                        Boolean.getBoolean(paises[4]));
                System.out.println(miPais);
                break;
            case 3:
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                paises = new String[5];
                
                for (int i = 0; i < paises.length; i++) {
                    paises[i] = br.readLine();
                }
                
                br.close();
                fr.close();
                ;
                miPais = new Pais(paises[0], paises[1], Double.parseDouble(paises[2]), Integer.parseInt(paises[3]),
                        Boolean.getBoolean(paises[4]));
                JAXBContext contexto = JAXBContext.newInstance(miPais.getClass());
                //Creamos una instancia de Marshaller para poder hacer la conversión de objeto a XML
                Marshaller conversor = contexto.createMarshaller();
                conversor.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                
                conversor.marshal(miPais, new File("./mipais.xml"));
                conversor.marshal(miPais, System.out);
                ;
                break;
            case 4:
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                paises = new String[5];
                
                for (int i = 0; i < paises.length; i++) {
                    paises[i] = br.readLine();
                }
                
                br.close();
                fr.close();
                ;
                miPais = new Pais(paises[0], paises[1], Double.parseDouble(paises[2]), Integer.parseInt(paises[3]),
                        Boolean.getBoolean(paises[4]));
                Gson miGson = new Gson();
                String json = miGson.toJson(miPais);
                File ficheroJson = new File("mipais.json");

                //Creamos flujo de escritura sobre el fichero
                fw = new FileWriter(ficheroJson);
                bw = new BufferedWriter(fw);
                bw.write(json);
                //Volcar el contendo del fichero en memoria
                bw.flush();
                
                bw.close();
                fw.close();
                ;
                break;
            case 5:
                System.exit(0);
        }
    }
    
}
