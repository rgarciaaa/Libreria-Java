package com.garcia.libreria;

import org.biblioteca.interfaces.Libro;


public class Ejemplar implements Libro {
// Información del libro
    private int id, uniDisponibles;
    private String titulo, descrip;

//Constructor
    public Ejemplar(int id,String titulo,String descrip,int uniDisp){
        this.id = id;
        this.titulo = titulo;
        this.descrip = descrip;
        this.uniDisponibles = uniDisp;
    }
//Implementación de métodos
    public String getInformacion(){
        return this.titulo+" ("+this.descrip+") - "+this.uniDisponibles+" unidades disponibles.("+this.id+")";
    }


}
