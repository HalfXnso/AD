package ejemplolecturat1ad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploLecturaT1AD {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Creamos una instancia de tipo File para poder trabajar con el fichero.
        File miFichero = new File("fichero.txt");
    FileReader fr = new FileReader(miFichero);
    int character;
    while((character = fr.read()) != -1){
           System.out.print((char)character);
    }
    //Cerramos el flujo
    fr.close();
    
    //Escribir en un fichero
    //Creamos instancia de tipo File al nuevo fichero
    File nuevoFichero = new File("nuevoFichero.txt");
    //Creamos flujo de escritura sobre nuevo fichero
    FileWriter fw = new FileWriter(nuevoFichero);
    String contenido = "Este es el nuevo texto \n salu2";
    //Escribirmos el texto en el fichero con .write()
    fw.write(contenido);
    //Cerramos el flujo sobre el fichero
    fw.close();
    //Añadimos text al nuevoFichero.txt
    fw = new FileWriter(nuevoFichero, true);
    //Escribirmos texto al final
    String firma = "\nMario";
    fw.write(firma);
    fw.close();
    }
}
