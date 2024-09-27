package mx.unam.fi.poo.g1.p4;

/**
 * Clase CuentaBanco
 * @author Campos Cortés Isaac Jareth
 * @version Septiembre-2024
 */
public class CuentaBanco{
    private String nombre = null;
    private int cuenta = 0;
    private double saldo = 0.0;

    /**
     * Método constructor.
     * @param n -> Para asignar el atributo nombre.
     * @param c -> Para asignar el atributo cuenta.
     * @param s -> Para asignar el atributo saldo.
     */
    public CuentaBanco(String n,int c, double s){
        setNombre(n);
        setCuenta(c);
        setSaldo(s);
    }

    /**
     * Método get.
     * @return nombre -> Regresa el atributo nombre.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método set.
     * @param nombre -> Para cambiar el atributo nombre.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método get.
     * @return cuenta -> Regresa el atributo cuenta.
     */
    public int getCuenta(){
        return cuenta;
    }

    /**
     * Método set.
     * @param cuenta -> Para cambiar el atributo cuenta.
     */
    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }

    /**
     * Método get.
     * @return saldo -> Regresa el atributo saldo.
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     * Método set.
     * @param saldo -> Para cambiar el atributo saldo.
     */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    /**
     * Método para realizar un depósito.
     * @param deposito -> Monto a depositrar.
     */
    public void depositar(double deposito){
        setSaldo(getSaldo() + deposito); 
    }

    /**
     * Método para realizar un retiro.
     * @param retiro -> Monto a retirar.
     */
    public void retirar(double retiro){
        setSaldo(getSaldo() - retiro); 
    }

    /**
     * Método para imprimir la información de la cuenta.
     */
    public void informacionCuenta(){
        System.out.println("Nombre del/a propiertario/a: " 
        + getNombre());
        System.out.println("Número de cuenta: " + getCuenta());
        System.out.println("Saldo total: " + getSaldo());
    }

}
