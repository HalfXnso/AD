/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27t1ad;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Ejercicio27T1AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        Empleado miEmpleado1 = new Empleado("1234DFG", "Pere", "Gilcon Queso", "I.T", "468427429L", 1200.23);
        Empleado miEmpleado2 = new Empleado("4321GFD", "Juan", "Salchi chón", "Telecomunicaciones", "46732719D", 4200.97);


        objetoToXml(miEmpleado2);
        xmlToObjeto(miEmpleado2);
    }

    public static void xmlToObjeto(Empleado miEmpleado) throws JAXBException {
        //Creamos instancia de contexto para el xml que será la clase Libro
        JAXBContext contexto = JAXBContext.newInstance(Empleado.class);
        //Creamos instancia de conversor de xml a objeto con Unmarshaller
        Unmarshaller conversor = contexto.createUnmarshaller();
        //Convertimos con .unmarshall() de ficher xml a objeto
        miEmpleado = (Empleado) conversor.unmarshal(new File("fichero.xml"));

        System.out.println("Título: " + miEmpleado.getIdEmpleado() + "\nPáginas: "
                + miEmpleado.getNombre() + "\nApellidos: "
                + miEmpleado.getApellidos() + "\nDni: " + miEmpleado.getDni()
                + "\nDepartamento: " + miEmpleado.getDepartamento()
                + "\nSueldo: " + miEmpleado.getSueldo());
    }

    public static void objetoToXml(Empleado miEmpleado) throws JAXBException {

        // Creamos instancia de contexto indicando qué clase queremos convertir a XML(Libro)
        JAXBContext contexto = JAXBContext.newInstance(miEmpleado.getClass());
        //Creamos una instancia de Marshaller para poder hacer la conversión de objeto a XML
        Marshaller conversor = contexto.createMarshaller();
        conversor.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //Método marshall rrealiza conversión de objeto a XML
        //Pasamos con parámetros la instancia e libro que queremos convertir y la salidao:
        // System.out.println(""); para pantalla o new File("./fichero.xml) para fichero XML
        conversor.marshal(miEmpleado, new File("./fichero.xml"));
        conversor.marshal(miEmpleado, System.out);
    }

}
