/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package máquinaExpendedoraManjónCarrascoJoséCarlos2223;

/**
 * En esta clase tenemos el código necesario para poder crear una instancia de
 * una máquina expendedora y todos los métodos necesarios para que esta funcione
 * correctamente
 *
 * @author José Carlos Manjón Carrasco
 * @version 1
 */

/** En esta clase , creamos una instancia de una máquina expendedora de snacks*/
public class MáquinaExpendedora {// Consideramos máquina snack precio único

    private int unidades;//número de snacks disponbles en la máquina expendora 
    double precio;//precio actual de un snack
    double precio_maxManjonCarrascoJoseCarlos2223;//precio máximo que puede tener un snack

    /**Constructor por defecto*/
    public MáquinaExpendedora() {

    }

    /**Constructor por parámetros
     * @param unidades Indica el número de snacks en la máquina
     * @param precio Indica el precio unitario del snack
     * @param precio_maxManjonCarrascoJoseCarlos String necesario en ejercicio
     */
    public MáquinaExpendedora(int unidades, double precio, double precio_maxManjonCarrascoJoseCarlos) {
        this.unidades = unidades;
        this.precio = precio;
        this.precio_maxManjonCarrascoJoseCarlos2223 = precio_maxManjonCarrascoJoseCarlos;
    }

    /**
     * Método que devuelve el número de snack que tiene la máquina
     *
     * @return Nos indica la cantidad de snacks existentes en la máquina
     */
    public int obtenerUnidades() {
        return this.unidades;
    }

    /**
     * Método que devuelve el precio que tiene cada snack
     *
     * @return Indica el precio del snack
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }

    /**
     * Método que permite modificar el número de snack disponibles de la máquina
     *
     * @param unidades Modifica la cantidad de snacks en la máquina
     */
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Método que permite aumentar el precio de venta, suma al precio actual el
     * aumento que se indica siempre que no se sobrepase el precio máximo de
     * venta
     *
     * @param aumento Indica la cantidad a aumentar del precio de venta
     * @throws Exception Cuando la cantidad es menor o igual a cero y cuando se
     * intenta superar el precio máximo
     */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxManjonCarrascoJoseCarlos2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * Método que permite obtener un snack si se tiene suficiente dinero y hay
     * suficientes unidades en la máquina
     *
     * @param unidades Indica las unidades de snack que queremos comprar
     * @param dinero Indica la cantida de dinero que tenemos para realizar la
     * compra
     *
     * @throws Exception Devuelve una excepción si queremos comprar más unidades
     * de snack de las que hay en la máquina,cuando la cantidad es negativa, el
     * número de snacks es menor a la cantidad a comprar, dinero insuficiente
     */
    public void sacarsnack(int unidades, double dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * Método que devuelve el precio que tiene cada snack
     *
     * @return Indica el precio del snack
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Este método tiene como objetivo hacer un seter del precio del snack
     *
     * @param precio Cantidad de dinero a aumentar de precio al snack
     *
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que permite recuperar el precio máximo unitaroip por snack
     *
     *
     * @return Precio máximo
     *
     */
    public double getPrecio_maxManjonCarrascoJoseCarlos2223() {
        return precio_maxManjonCarrascoJoseCarlos2223;
    }

    /**
     * Este método ermite modificar el valor del precio del snack
     *
     * @param precio_maxManjonCarrascoJoseCarlos2223 Permite modificar el precio
     * máximo por unidad
     *
     */
    public void setPrecio_maxManjonCarrascoJoseCarlos2223(double precio_maxManjonCarrascoJoseCarlos2223) {
        this.precio_maxManjonCarrascoJoseCarlos2223 = precio_maxManjonCarrascoJoseCarlos2223;
    }

}
