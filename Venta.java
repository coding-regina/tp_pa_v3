package nare.tp_pa_v3;

import static nare.tp_pa_v3.Logica.formatear;
import static nare.tp_pa_v3.Logica.ventas; 

public class Venta extends Inmueble implements Transaccion{    
  
    private double precio;
    private final double multiplicador = 0.1;
    
    public Venta (String dom, char juri,double precio){  
        super(dom, juri);                
        this.precio = precio;
    }
    
    public double getPrecio(){
      return this.precio;
    }
    
    @Override
    public String getTipoOperacion(){        
        return "Venta";
    }       
    
    @Override
    public double calcularComision() {
        return this.precio * multiplicador;       
    }
    
    @Override
    public void registrarOperacion() {            
        ventas.add(this);
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
