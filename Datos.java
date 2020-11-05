/**
 * <b>TRABAJO PRÁCTICO PROGRAMACIÓN APLICADA</b><br>
 * DOCENTE: FEDERICO CASSINELLI<br>
 * CICLO: 2020<br>
 *
 */
package nare.tp_pa_v4;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
/**
 * Clase para declarar variables, arrays, crear instancias, etc.
 * Acumula valores totales
 *
 */
public class Datos {

  public static ArrayList<Operacion> operaciones = new ArrayList();
  public static double acumCABA = 0;
  public static double acumBsAs = 0;
  public static double total_comis = 0;

  public static void ignite() {
    Alquiler o1 = new Alquiler(new Inmueble("Aráoz 234", 'c'), 15000, 12);
    Alquiler o2 = new Alquiler(new Inmueble("Corrientes 234", 'b'), 25000, 36);
    Alquiler o3 = new Alquiler(new Inmueble("Cervantes 234", 'c'), 30000, 24);
    Venta o4 = new Venta(new Inmueble("Carlos Casares 5644", 'b'), 5600000);
    Venta o5 = new Venta(new Inmueble("Salguero 1234", 'b'), 2700000);
    Venta o6 = new Venta(new Inmueble("Sarmiento 34", 'c'), 6750000);
    Alquiler o7 = new Alquiler(new Inmueble("Av. La Plata 655", 'c'), 20000, 24);
    o1.registrar_operacion();
    o2.registrar_operacion();
    o3.registrar_operacion();
    o4.registrar_operacion();
    o5.registrar_operacion();
    o6.registrar_operacion();
    o7.registrar_operacion();
    calcular_totales();
  }

  /**
   *
   * Método que se encarga de:
   * <ul>
   * <li>obtener la cantidad de operaciones realizadas </li>
   * <li>acumular las comisiones obtenidas por jurisdicción</li>
   * <li>calcular total de comisiones obtenidas<li>
   * <li>presentar la información por pantalla</li>
   * </ul>
   * CUMPLE CON LOS PUNTOS 2, 3 y 4 DE LA CONSIGNA
   *
   */
  public static void calcular_totales() {
   
    for (int i = 0; i < operaciones.size(); i++) {
      if (operaciones.get(i).inmueble.get_juris().equals("CABA")) {
        acumCABA += operaciones.get(i).get_comision();
      } else {
        acumBsAs += operaciones.get(i).get_comision();
      }
    }
    total_comis = acumBsAs + acumCABA;
    System.out.println("\nTotal de operaciones: " + operaciones.size());
    System.out.println("Total de comisiones por operaciones en CABA: " + formatear(acumCABA));
    System.out.println("Total de comisiones por operaciones en BsAs: " + formatear(acumBsAs));
    System.out.println("                                           -----------------");
    System.out.println("                        Total comisiones:    " + formatear(total_comis));
  }

  /**
   * Función que da formato monetario
   *
   * @param valor tipo double sin formato
   * @return valor tipo String con formato moneda: con signo, separado en miles,
   * y dos decimales
   * @see java.text.NumberFormat
   */
  public static String formatear(double valor) {
    NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
    return formatoMoneda.format(valor);
  }
}
