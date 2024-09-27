package mx.unam.fi.poo.g1.p1;


/**
 * Clase Coordenadas
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Coordenadas {
    private int x1,x2,y1,y2;
    final double radio = 6371.01;


    /**
     * Método Constructor
     * @param x1 -> Latitud punto 1.
     * @param y1 -> Longitud punto 1.
     * @param x2 -> Latitud punto 2.
     * @param y2 -> Longitud punto 2.
     */
    public Coordenadas(int x1, int y1, int x2, int y2){
        setLatitudes(x1,x2);
        setLongitudes(y1,y2);
    }

    /**
     * Método get.
     * @return x1 -> Regresa el atributo de la primer latitud.
     */
    public int getLatitud1(){
        return x1;
    }

    /**
     * Método get.
     * @return x2 -> Regresa el atributo de la segunda latitud.
     */
    public int getLatitud2(){
        return x2;
    }

    /**
     * Método set.
     * @param x1 -> Para la latitud del punto 1.
     * @param x2 -> Para la latitud del punto 2.
     */
    public void setLatitudes(int x1,int x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    /**
     * Método get.
     * @return y1 -> Regresa el atributo de la primer longitud.
     */
    public int getLongitud1(){
        return y1;
    }

    /**
     * Mpetodo get.
     * @return y2 -> Regresa el atributo de la segunda longitud.
     */
    public int getLongitud2(){
        return y2;
    }

    /**
     * Método set.
     * @param y1 -> Para la longitud del punto 1.
     * @param y2 -> Para la longitud del punto 2.
     */
    public void setLongitudes(int y1, int y2){
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Método para calcular la distancia entre los puntos.
     * @param x1 -> Latitud del punto 1.
     * @param y1 -> Longitud del punto 1.
     * @param x2 -> Latitud del punto 2.
     * @param y2 -> Longitud del punto 2.
     * @return dis -> Regresa la distancia calculada de tipo double.
     */
    public double calcularDistancia(double x1, double y1, double x2, double y2){

        double dis = radio * Math.acos((Math.sin(x1)*Math.sin(x2))+(Math.cos(x1)*Math.cos(x2)*Math.cos((y2-y1))));
        return dis;
    }
}
    
