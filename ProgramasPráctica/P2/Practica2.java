package mx.unam.fi.poo.g1.p2;

import java.util.Scanner;

/**
 * Clase principal de Practica 2.
 * @author Campos Cortés Isaac Jareth.
 * @version Septiembre-2024
 */
public class Practica2{

    /**
     * Método main.
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int n = en.nextInt();

        TrianguloPascal.ImprimirTriangulo(n);

    }
}
