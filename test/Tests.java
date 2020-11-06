
import static junit.framework.Assert.assertTrue;
import nare.tp_pa_v4.Alquiler;
import static nare.tp_pa_v4.Datos.*;
import nare.tp_pa_v4.Inmueble;
import nare.tp_pa_v4.Venta;
import org.junit.Before;
import org.junit.Test;

/**
 * <b>TRABAJO PRÁCTICO PROGRAMACIÓN APLICADA</b><br>
 * DOCENTE: FEDERICO CASSINELLI<br>
 * CICLO: 2020<br>
 *
 */

/**
 * Clase para testeos unitarios
 * Junit v4.12
 *
 * @author GRUPO FORMADO POR: Molares, Regina Noemí / Regensburger, Nadina
 * @version 4 11/03/20
 *
 */
public class Tests {

  public Tests() {
  }

 @Before
  public void initialize() {
    operaciones.clear();
    acumCABA = 0;
    acumBsAs = 0;
    total_comis = 0;
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


  @Test
  public void testComisionUnit() {
    Venta o77 = new Venta(new Inmueble("Carlos Casares 5644", 'b'), 2000000);
    assertTrue(o77.get_comision() == 400000);
  }

  @Test
  public void testCantidadOperaciones() {       
    assertTrue(operaciones.size() == 7);
  }

  @Test
  public void testComisionesxJurisdiccion() {
    assertTrue(acumCABA == 1480000 && acumBsAs == 1710000);
  }

  @Test
  public void testComisionesTotal() {
    assertTrue(total_comis == 3190000);
  }
}
