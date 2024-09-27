package mx.unam.fi.poo.g1.p4;

/**
 * Clase principal de Practica 4
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Practica4{

    /**
     * Método main.
     * Se ejecuta toda la funcionalidad del programa.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {

        CuentaBanco cuenta = new CuentaBanco("Federico Florencio",361563770,500.00); 

        System.out.println("Los datos de la cuenta son: ");
        cuenta.informacionCuenta();

        System.out.println("");

        System.out.println("Se realizó un depósito de 350 pesos.");
        cuenta.depositar(350.00);

        System.out.println("***************************************");
       
        System.out.println("Se realizó un retiro de 150 pesos.");
        cuenta.retirar(150.00);

        System.out.println("");
       
        System.out.println("Los datos de la cuenta son: ");
        cuenta.informacionCuenta();
         
    }
}




