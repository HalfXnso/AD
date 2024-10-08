/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciost2;

import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class EjerciciosT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        try {
            System.out.print("ISBN del libro: ");
            String isbn = tec.nextLine();
            System.out.print("Escribe el titulo del libro: ");
            String titulo = tec.nextLine();
            System.out.print("Escribe el autor del libro: ");
            String autor = tec.nextLine();
            System.out.print("Escribe la editorial del libro: ");
            String editorial = tec.nextLine();
            System.out.print("Escribe el numero de páginas del libro: ");
            int numPags = tec.nextInt();
            tec.nextLine();
            System.out.print("Escribe la categoría del libro: ");
            String categoria = tec.nextLine();
            System.out.print("Escribe la sinopsis del libro: ");
            String sinopsis = tec.nextLine();
            System.out.print("Escribe el idioma del libro: ");
            String idioma = tec.nextLine();
            System.out.print("Escribe el año de publicación del libro: ");
            String anyoPublicacionT = tec.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate anyoPublicacion = LocalDate.parse(anyoPublicacionT, formatter);
            System.out.print("Escribe el precio del libro: ");
            double precio = tec.nextDouble();
            tec.nextLine();
            System.out.print("Indica si es una novedad o no: (S)(N) ");
            String novedadT = tec.nextLine();
            boolean novedad = false;
            switch (novedadT) {
                case "S":
                    novedad = true;
                    break;
                case "N":
                    novedad = false;
            }
            
            ObjectContainer base = Db4oEmbedded.openFile("libros.db4o");
            Libro miLibro = new Libro(isbn, titulo, autor, editorial, categoria,
                    sinopsis, numPags, idioma, anyoPublicacion, precio, novedad);
            
            base.store(miLibro);
            Libro miLibroEjemplo = new Libro(null, null, null, null, null,
                    null, 0, null, null, 0, true);
            ObjectSet resultado = base.queryByExample(miLibroEjemplo);
            System.out.println("Recuperados " + resultado.size() + " Objetos");
            while (resultado.hasNext()) {
                System.out.println(resultado.next());
                
            }
            base.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void muestraDatos(LocalDate anyoInicial, LocalDate anyoFinal, Libro miLibro, ObjectContainer base) {
        Predicate<Libro> consulta = new Predicate<Libro>() {
            @Override
            public boolean match(Libro a) {
                return (a.getAnyoPublicacion().isAfter(anyoInicial) && a.getAnyoPublicacion().isBefore(anyoFinal));
            }
        };
        ObjectSet resultado = base.query(consulta);
        while (resultado.hasNext()) {
            System.out.println(resultado.next());
        }
        
    }
    
    public static void muestraDatosNovedades(ObjectContainer base, Scanner tec) {
        System.out.print("¿Qué libros quieres mostrar, Novedad o no novedad?");
        String novedad = tec.nextLine();
        switch (novedad) {
            case "Novedad":
                Predicate<Libro> consulta = new Predicate<Libro>() {
                    @Override
                    public boolean match(Libro a) {
                        return (a.isNovedad() == true);
                    }
                };
                ObjectSet resultado = base.query(consulta);
                while (resultado.hasNext()) {
                    System.out.println(resultado.next());
                }
                ;
                break;
            case "No novedad":
                consulta = new Predicate<Libro>() {
                    @Override
                    public boolean match(Libro a) {
                        return (a.isNovedad() == false);
                    }
                };
                resultado = base.query(consulta);
                while (resultado.hasNext()) {
                    System.out.println(resultado.next());
                }
        }
        
    }
    
    public static void contieneSinopsis(ObjectContainer base, Scanner tec, Libro miLibro) {
        
        System.out.print("Escribe parte de la sinopsis");
        String sinopsis = tec.nextLine();
        Predicate<Libro> consulta = new Predicate<Libro>() {
            @Override
            public boolean match(Libro a) {
                return (a.getSinopsis().contains(sinopsis));
            }
        };
        ObjectSet resultado = base.query(consulta);
        while (resultado.hasNext()) {
            System.out.println(resultado.next());
        }
        
    }
    
}
