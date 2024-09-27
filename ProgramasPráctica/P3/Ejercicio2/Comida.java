package mx.unam.fi.poo.g1.p32;

import java.util.ArrayList;

/**
 * Clase Comida
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class Comida {
    private ArrayList<String> comida;

    /**
     * Método constructor.
     */
    public Comida(){
        comida = new ArrayList<String>();
    }

    /**
     * Método para agregar tipos de comida.
     * @param com -> Para agregar un tipo de comida.
     */
    public void agregarComida(String com){
        comida.add(com);
    }

    /**
     * Método para accesar a la lista de tipos de comida.
     * @return comida -> Regresa ArrayList<String>
     */
    public ArrayList<String> getComida(){
        return comida;
    }

    /**
     * Método para reemplazar un tipo de comida.
     * @param comI -> Tipo de comida a reemplazar.
     * @param comF -> Nuevo tipo de comida.
     */
    public void reemplazarComida(String comI,String comF){
        int ind = comida.indexOf(comI);
        comida.set(ind, comF);
    }
}
