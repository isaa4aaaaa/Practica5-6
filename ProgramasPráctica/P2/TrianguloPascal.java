package mx.unam.fi.poo.g1.p2;

/**
 * Clase TrianguloPascal
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class TrianguloPascal {
    /**
     * Método para la impresión del triángulo de pascal.
     * @param n -> Número de filas del triángulo.
     */
    public static void ImprimirTriangulo(int n){
        for (int i = 0; i < n;i++){

            for(int e = 0; e<n-i-1; e++){
                System.out.print(" ");
            }
    
            int c = 1;
    
            for( int j = 0; j<=i; j++){
                System.out.print(c+" ");
                c = c * (i-j) / (j + 1);
            }
            
    
            System.out.println("");
        }
    }

}
