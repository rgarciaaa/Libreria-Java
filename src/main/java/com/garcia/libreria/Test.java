package com.garcia.libreria;

import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Libro;


public class Test {
    
    public static void main(String[] args) {
    //Instanciar Clase
        AdminLib a = new AdminLib();
        String [] palabrasClave = {"Leyes","Cuentos"};

        try{
            List<Libro> encontrados = a.buscar(palabrasClave);
            encontrados.forEach(encontrado -> System.out.println(encontrado.getInformacion()));
        }catch(LibroNoEncontradoException e){
            System.out.println(e.getMessage());
        }
        
    }

}
