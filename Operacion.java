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

/**
 * Clase abstracta<br>
 * Describe patrón de las operaciones con inmuebles
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
public abstract class Operacion {

  final Inmueble inmueble;

  /**
   *
   * Constructor
   *
   * @param in tipo Inmueble
   * @see nare.tp_pa_v4.Inmueble
   *
   */
  public Operacion(Inmueble in) {
    this.inmueble = in;
  }

  /**
   *
   * Método abstracto para obtener la comisión por casa operación
   *
   * @return valor tipo double
   *
   */
  public abstract double get_comision();

  /**
   *
   * Método abstracto para registrar y mostrar cada operación en un arrayList
   *
   */
  public abstract void registrar_operacion();

  /**
   *
   * Método para obtener el tipo de operación según qué clase se haya
   * instanciado
   *
   */
  public String get_tipo_operacion() {
    String retorno = this instanceof Venta ? "venta" : "alquiler";
    System.out.println("Es una operación de " + retorno);
    return retorno;
  }
}
