package com.clase2;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private Boolean prestado;
    private String ultimoUsuario;

    public Libro() {
        this.titulo = "";
        this.isbn = "";
        this.autor = "";
        this.prestado = false;
        this.ultimoUsuario = "";
    }

    public Libro(String titulo, String isbn, String autor, Boolean prestado, String ultimousuario) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = prestado;
        this.ultimoUsuario = ultimousuario;
    }

    public void prestamo(String usuario) {
        this.ultimoUsuario = usuario;
        this.prestado = true;
    }

    public void devolucion() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

}
