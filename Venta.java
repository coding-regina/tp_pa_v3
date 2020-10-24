package nare.tp_pa_v3;

import static nare.tp_pa_v3.Logica.ventas;

public class Venta extends Transaccion{    
    private final char tipo = 'v';   
    private final double multiplicador = 0.1;
    
    public Venta (String dom, char juri,double monto){  
        super(dom, juri, monto);                
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
    
    
}
