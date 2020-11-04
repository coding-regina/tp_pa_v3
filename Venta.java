/**
 * <b>TRABAJO PRÁCTICO PROGRAMACIÓN APLICADA</b><br>
 * DOCENTE: FEDERICO CASSINELLI<br>
 * CICLO: 2020<br>
 * DOCUMENTACIÓN (Links):<br>
 * <ul>
 * <li><a href="{@docRoot}docs/TP.pdf">Consignas</a></li>
 * <li><a href="{@docRoot}docs/dc.pdf">Diagrama de clases</a></li>
 * <li><a href="{@docRoot}docs/juego_datos.pdf">Datos de prueba</a></li>
 * </ul>
 *
 */
package nare.tp_pa_v4;

import static nare.tp_pa_v4.Datos.formatear;
import static nare.tp_pa_v4.Datos.operaciones;

/**
 * Clase Venta<br>
 * Modelo que invoca métodos de clase abstracta Operacion<br>
 * El atributo multiplicador define la comisión
 *
 * @see nare.tp_pa_v4.Operacion
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
public class Venta extends Operacion {

  private double precio;
  private final double multiplicador = 0.2;

  /**
   * Constructor
   *
   * @param in tipo Inmueble
   * @param monto tipo double
   */
  public Venta(Inmueble in, double monto) {
    super(in);
    this.precio = monto;
  }

  /**
   *
   * Getter
   *
   * @return precio - tipo double para obtener el valor de la propiedad
   */
  public double get_precio() {
    return this.precio;
  }

  /**
   * Implementación del método abstracto
   *
   * @see nare.tp_pa_v4.Operacion
   * @return valor - tipo double con el importe de la comisión por una venta
   */
  @Override
  public double get_comision() {
    return this.precio * this.multiplicador;
  }

  /**
   * Implementación del método abstracto <br>
   * Registra una operación en un arrayList y muestra los detalles de la
   * transacción<br>
   * RESUELVE PUNTO 1 DE LA CONSIGNA Se implementó abstracto porque difiere en
   * una línea del método de la clase Alquiler
   *
   * @see nare.tp_pa_v4.Operacion
   *
   */
  @Override
  public void registrar_operacion() {
    operaciones.add(this);
    System.out.println("Domicilio del Inmueble : " + this.inmueble.get_domicilio()
        + "\nJurisdicción           : " + this.inmueble.get_juris()
        + "\nTipo de Operación      : " + this.get_tipo_operacion()
        + "\nMonto de la operación  : " + formatear(this.get_precio())
        + "\nComisión               : " + formatear(this.get_comision())
        + "\n-----------------------------------------------------------------------------------");
  }
}
