package mx.unam.fi.poo.g1.p31;

/**
 * Clase Cadena.
 * @author Campos Cortés Isaac Jareth.
 * @version Septiembre-2024
 */
public class Cadena {

    private String cad;
    private char charInicial,charFinal;
    
    /**
     * Método contructor.
     * Para construir objetos Cadena.
     * @param s -> Atributo para la cadena a modificar.
     * @param i -> Atributo para el carácter a reemplazar.
     * @param f -> Atributo para el nuevo carácter.
     */
    public Cadena(String s, char i, char f){
        setCadena(s);
        setCharInicial(i);
        setCharFinal(f);
    }

    /**
     * Método get.
     * @return cad -> Regresa el atributo cad.
     */
    public String getCadena(){
        return cad;
    }

    /**
     * Método set.
     * @param cad -> Para asignar la cadena a modificar.
     */
    public void setCadena(String cad){
        this.cad = cad;
    }

    /**
     * Método get
     * @return charInicial -> Regresa el carácter a cambiar.
     */
    public char getCharInicial(){
        return charInicial;
    }

    /**
     * Método set.
     * @param charInicial -> Para asignar el cáracter a reemplazar.
     */
    public void setCharInicial(char charInicial){
        this.charInicial = charInicial;
    }

    /**
     * Método get.
     * @return charFinal -> Regresa el nuevo carácter.
     */
    public char getCharFinal(){
        return charFinal;
    }

    /**
     * Método set.
     * @param charFinal -> Para asignar el nuevo carácter.
     */
    public void setCharFinal(char charFinal){
        this.charFinal = charFinal;
    }

    /**
     * Método para reemplazar el cáracter.
     */
    public void reemplChar(){
        setCadena(cad.replace(charInicial, charFinal));
    }
}
