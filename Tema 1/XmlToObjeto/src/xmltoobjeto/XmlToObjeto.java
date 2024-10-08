/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoobjeto;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class XmlToObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        //Creamos instancia de contexto para el xml que será la clase Libro
        JAXBContext contexto = JAXBContext.newInstance(Libro.class);
        //Creamos instancia de conversor de xml a objeto con Unmarshaller
        Unmarshaller conversor = contexto.createUnmarshaller();
        //Convertimos con .unmarshall() de ficher xml a objeto
        Libro miLibro = (Libro) conversor.unmarshal(new File("fichero.xml"));
        //Mostramos los datos de miLibro
        System.out.println("Título: " + miLibro.getTitulo() + "\nPáginas: " + miLibro.getPaginas());
    }

}
