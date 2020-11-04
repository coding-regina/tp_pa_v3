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
 * Clase Alquiler<br>
 * Modelo que invoca métodos de clase abstracta Operacion<br>
 *
 * El atributo multiplicador define la comisión
 *
 * @see nare.tp_pa_v4.Operacion
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
public class Alquiler extends Operacion {

  private int meses;
  private double monto_mensual;
  private final double multiplicador = 2;

  /**
   *
   * Constructor
   *
   * @param in tipo Inmueble
   * @param monto tipo double para el valor mensual del alquiler
   * @param meses tipo int para la duración del contrato
   *
   */
  public Alquiler(Inmueble in, double monto, int meses) {
    super(in);
    this.monto_mensual = monto;
    this.meses = meses;
  }

  /**
   *
   * Getter
   *
   * @return meses - tipo int para la duración del contrato en meses
   */
  public int get_meses() {
    return this.meses;
  }

  /**
   *
   * Getter
   *
   * @return monto_mensual - tipo double para obtener el costo mensual del
   * alquiler
   */
  public double get_monto() {
    return this.monto_mensual;
  }

  /**
   * Implementación del método abstracto
   *
   * @see nare.tp_pa_v4.Operacion
   * @return valor - tipo double con el importe de la comisión por un alquiler
   */
  @Override
  public double get_comision() {
    return this.monto_mensual * this.multiplicador;
  }

  /**
   * Implementación del método abstracto <br>
   * Registra una operación en un arrayList y muestra los detalles de la
   * transacción<br>
   * RESUELVE PUNTO 1 DE LA CONSIGNA * Se implementó abstracto porque difiere en
   * una línea del método de la clase<br>
   * Venta (muestra la duración del contrato en meses)
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
        + "\nDuración del contrato  : " + this.get_meses() + " meses"
        + "\nMonto de la operación  : " + formatear(this.get_monto())
        + "\nComisión               : " + formatear(this.get_comision())
        + "\n-----------------------------------------------------------------------------------");
  }
}
