/**
 * <b>TRABAJO PRÁCTICO PROGRAMACIÓN APLICADA</b><br>
 * DOCENTE: FEDERICO CASSINELLI<br>
 * CICLO: 2020<br>
 *
 */
package nare.tp_pa_v4;

/**
 * Clase que modela objeto Inmueble<br>
 * Define atributos, métodos constructor y getters solamente
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
public class Inmueble {

  private String domicilio;
  private char jurisdiccion;

  /**
   * Constructor
   *
   * @param dom - Domicilio
   * @param jur - Jurisdicción
   *
   */
  public Inmueble(String dom, char jur) {
    this.domicilio = dom;
    this.jurisdiccion = jur;
  }

  /**
   * Getter
   *
   * @return - Un String con la jurisdicción
   *
   */
  public String get_juris() {
    String retorno = this.jurisdiccion == 'c' ? "CABA" : "BsAs";
    return retorno;
  }

  /**
   * Getter
   *
   * @return - Un String con el domicilio
   *
   */
  public String get_domicilio() {
    return this.domicilio;
  }
}
