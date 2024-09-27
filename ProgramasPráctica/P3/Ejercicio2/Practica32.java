package mx.unam.fi.poo.g1.p32;

/**
 * Clase principal de Practica 3 Ejercicio 2.
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Practica32{

    /**
     * Método main.
     * Se ejecuta el funcionamiento del programa.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {

        Comida comida = new Comida();

        comida.agregarComida("Hamburguesa");
        comida.agregarComida("Tsuru");
        comida.agregarComida("Ceviche");
        comida.agregarComida("Torta");
        comida.agregarComida("Gordita");

        System.out.println("Arreglo original: "+comida.getComida());

        System.out.println("Se reemplazará \"Tsuru\" por \"Sushi\". ");

        comida.reemplazarComida("Tsuru","Sushi");

        System.out.println("Arreglo modificado: "+comida.getComida());

    }
}

