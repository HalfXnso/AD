/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciost2;

import java.time.LocalDate;

/**
 *
 * @author AlfonsoGaitanPerez
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String categoria;
    private String sinopsis;
    private int paginas;
    private String idioma;
    private LocalDate anyoPublicacion;
    private double precio;
    private boolean novedad;

    public Libro(String isbn, String titulo, String autor, String editorial, String categoria, String sinopsis, int paginas, String idioma, LocalDate anyoPublicacion, double precio, boolean novedad) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.sinopsis = sinopsis;
        this.paginas = paginas;
        this.idioma = idioma;
        this.anyoPublicacion = anyoPublicacion;
        this.precio = precio;
        this.novedad = novedad;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(LocalDate anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", categoria=" + categoria + ", sinopsis=" + sinopsis + ", paginas=" + paginas + ", idioma=" + idioma + ", anyoPublicacion=" + anyoPublicacion + ", precio=" + precio + ", novedad=" + novedad + '}';
    }

}
