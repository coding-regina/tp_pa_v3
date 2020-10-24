package nare.tp_pa_v3;

import static nare.tp_pa_v3.Logica.formatear;

abstract class Transaccion extends Inmueble{
    double precio;  
    
    public Transaccion(String dom, char juri, double pre){
        super(dom, juri);      
        this.precio = pre;
    }
    
    abstract double calcularComision();
    
    abstract String getTipoOperacion();
    
    abstract void registrarOperacion();
       
    public double getMonto(){
        return this.precio;
    } 
        
    public void mostrarOperacion(){        
        System.out.println("Domicilio del Inmueble : " + getDomicilio() +
                           "\nJurisdicción           : " + getJuris() +
                           "\nTipo de Operación      : " + getTipoOperacion() +                             
                           "\nMonto de la operación  : " + formatear(getMonto()) +
                           "\nComisión               : " + formatear(calcularComision()) + 
                           "\n-----------------------------------------------------------------------------------" );                           
    }       
}
