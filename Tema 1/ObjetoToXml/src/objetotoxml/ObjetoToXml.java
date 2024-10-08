/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetotoxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjetoToXml {

    public static void main(String[] args) throws JAXBException {
        Libro miLibro = new Libro("Edgal y las nenas", 400);
        // Creamos instancia de contexto indicando qué clase queremos convertir a XML(Libro)
        JAXBContext contexto = JAXBContext.newInstance(miLibro.getClass());
        //Creamos una instancia de Marshaller para poder hacer la conversión de objeto a XML
        Marshaller conversor = contexto.createMarshaller();
        conversor.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //Método marshall rrealiza conversión de objeto a XML
        //Pasamos con parámetros la instancia e libro que queremos convertir y la salidao:
        // System.out.println(""); para pantalla o new File("./fichero.xml) para fichero XML
        conversor.marshal(miLibro, new File("./fichero.xml"));
        conversor.marshal(miLibro, System.out);
    
    }
    
}
