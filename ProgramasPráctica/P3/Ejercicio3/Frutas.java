package mx.unam.fi.poo.g1.p33;

import java.util.HashMap;
import java.util.Set;

/**
 * Clase Frutas
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Frutas {
    private HashMap<String,Integer> frutas;

    /**
     * Método contructor.
     */
    public Frutas(){
        frutas = new HashMap<String,Integer>();
    }

    /**
     * Método para agregar cada fruta y su precio.
     * @param fruta -> Para agregar el nombre de la fruta.
     * @param precio -> Para agregar el precio de la fruta.
     */
    public void agregrarFruta(String fruta, int precio){
        frutas.put(fruta,precio);
    }

    /**
     * Método para obtener la lista de frutas.
     * @return frutas.keySet() -> Regresa los nombres de las frutas.
     */
    public Set obtenerFrutas(){
        return frutas.keySet();
    }

    /**
     * Método para obtener el precio de una fruta.
     * @param fruta -> Para buscar su precio.
     * @return frutas.get(fruta) -> Regresa el precio de la fruta.
     */
    public int obtenerPrecio(String fruta){
        return frutas.get(fruta);
    }


}
