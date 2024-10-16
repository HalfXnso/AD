package modelo;
// Generated 10-oct-2024 12:17:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Peliculas generated by hbm2java
 */
public class Peliculas  implements java.io.Serializable {


     private int codpelicula;
     private String titulo;
     private String tema;
     private Integer duracion;
     private BigDecimal precio;

    public Peliculas() {
    }

	
    public Peliculas(int codpelicula) {
        this.codpelicula = codpelicula;
    }
    public Peliculas(int codpelicula, String titulo, String tema, Integer duracion, BigDecimal precio) {
       this.codpelicula = codpelicula;
       this.titulo = titulo;
       this.tema = tema;
       this.duracion = duracion;
       this.precio = precio;
    }
   
    public int getCodpelicula() {
        return this.codpelicula;
    }
    
    public void setCodpelicula(int codpelicula) {
        this.codpelicula = codpelicula;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Integer getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "codpelicula=" + codpelicula + ", titulo=" + titulo + ", tema=" + tema + ", duracion=" + duracion + ", precio=" + precio + '}';
    }




}


