package mx.unam.fi.poo.g1.p1;

/**
 * Clase principal de Practica 1
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Practica1{
    /**
     * Método main
     * Se ejecuta todo el funcionamiento del programa.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {

        Coordenadas cords = new Coordenadas(100, 200, 540, 600);

        int x1 = cords.getLatitud1();
        int y1 = cords.getLongitud1();

        int x2 = cords.getLatitud2();
        int y2 = cords.getLongitud2();

        System.out.println("Cálculo de la distancia entre dos puntos terrestres: ");
        System.out.println("Punto 1: (" + x1 + "," + y1 + ")");
        System.out.println("Punto 2: (" + x2 + "," + y2 + ")");

        System.out.println("La distancia entre el punto 1 y el punto 2 es: "+ cords.calcularDistancia(x1,y1,x2,y2));
    }

}