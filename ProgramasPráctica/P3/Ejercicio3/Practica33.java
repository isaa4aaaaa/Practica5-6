package mx.unam.fi.poo.g1.p33;

/**
 * Clase principal de Practica 3 Ejercicio 3
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Practica33{

    /**
     * Método main.
     * Se ejecuta toda la funcionalidad del programa.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {

        Frutas frutas = new Frutas();

        frutas.agregrarFruta("Manzana", 35);
        frutas.agregrarFruta("Tuna", 20);
        frutas.agregrarFruta("Toronja", 25);
        frutas.agregrarFruta("Fresa", 40);
        frutas.agregrarFruta("Carambola", 50);


        System.out.println("Lista de frutas: "+frutas.obtenerFrutas());
        System.out.println("Se quiere conocer el precio de la Carambola: ");
        System.out.println("El precio de la Carambola es de $"+frutas.obtenerPrecio("Carambola"));

    }
}

