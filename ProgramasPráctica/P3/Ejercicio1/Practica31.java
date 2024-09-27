package mx.unam.fi.poo.g1.p31;

/**
 * Clase principal de Practica 3 Ejercicio 1.
 * @author Campos Cortés Isaac Jareth.
 * @version Septiembre-2024
 */
public class Practica31{
    
    /**
     * Método main.
     * Se ejecuta toda la funcionalidad del programa.
     * @param args -> Arreglo por defecto del método main.
    */
    public static void main(String[] args) {

        System.out.println("Cadena original: Hola mundo");
        
        Cadena str = new Cadena("Hola mundo",'o','i');

        str.reemplChar();

        System.out.println("Cadena modificada: "+ str.getCadena());

    }
}

