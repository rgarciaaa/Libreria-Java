package com.garcia.libreria;

import java.util.List;
import java.util.ArrayList;

import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;
import org.biblioteca.excepciones.LibroNoEncontradoException;


public class AdminLib implements Buscar {
//Base de libros
    ArrayList<Libro> ejemplares = new ArrayList<Libro>(){
        {
            //Agregamos libros con parametros: (ID,TITULO,DESCRIPCION,CANT-DISPONIBLE)
            add(new Ejemplar(1,"Libro Rojo","Cuentos y fabulas del siglo XX",150));
            add(new Ejemplar(2,"Calculo 3","Matematicas y Fisica nivel licenciatura",210));
            add(new Ejemplar(3,"Codigo penal","Leyes y sanciones aplicables a 2022",85));

        }
    };

//Implementación de métodos
    public List<Libro> buscar(String[] palabrasClave)throws LibroNoEncontradoException{
        
        //Variables
        List<Libro> encontrados = new ArrayList<>();
        //Recorremos la lista de libros
        for(int i =0;i<ejemplares.size();i++){
            //Recorremos palabras clave
            for(String palabra:palabrasClave){
                //Pasamos el texto a minusculas y verificamos que el texto del libro tenga la palabra clave con "contains()"
                if(ejemplares.get(i).getInformacion().toLowerCase().contains(palabra.toLowerCase()))
                    encontrados.add(ejemplares.get(i));       
            }
        }
        //Manejo de la excepción 
        if(encontrados.isEmpty())
          throw new LibroNoEncontradoException("Busqueda sin resultados"); 
        
        return encontrados;

    } 

}
