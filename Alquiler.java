package nare.tp_pa_v3;
import static nare.tp_pa_v3.Logica.alquileres;
import static nare.tp_pa_v3.Logica.formatear;

public class Alquiler extends Inmueble implements Transaccion{    
    private int meses;
  
    private final double multiplicador = 2;
    private double precio;
    
    public Alquiler(String dom, char juri, double precio, int meses){
        super(dom, juri);      
        this.precio = precio;
        this.meses = meses;
    }
    
    public double getPrecio(){
      return this.precio;
    }
    
    @Override
    public String getTipoOperacion(){       
        return "Alquiler";
    }       
    
    @Override
    public double calcularComision() {
        return this.precio * multiplicador;        
    }
    
    @Override
    public void registrarOperacion() {          
        alquileres.add(this);
    }

    @Override    
    public void mostrarOperacion(){        
        System.out.println("Domicilio del Inmueble : " + this.getDomicilio() +
                           "\nJurisdicción           : " + this.getJuris() +
                           "\nTipo de Operación      : " + this.getTipoOperacion() +                             
                           "\nMonto de la operación  : " + formatear(this.getPrecio()) +
                           "\nComisión               : " + formatear(this.calcularComision()) + 
                           "\n-----------------------------------------------------------------------------------" );                           
    }    
}
