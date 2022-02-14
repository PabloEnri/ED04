
package cuentas;


public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor de la clase sin parámetros
     */
    public CCuenta()
    {
    }
            
       /**
     * Constructor de la clase con parámetros
     * 
     * @param nom String
     * @param cue String
     * @param sal Double
     * @param tipo Double
     */    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo de la cuenta
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

        /**
     * Añade la cantidad indicada por parámetro al saldo
     * 
     * @param cantidad Double
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * Resta la cantidad indicada por parámetro al saldo
     * 
     * @param cantidad Double
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *Metodo get de Nombre
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set de Nombre
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get de Cuenta
     * 
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo set de Cuenta
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo get de Saldo
     * 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo set de Saldo
     * 
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo get de TipoInteres
     * 
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo Set de TipoInteres
     * 
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

