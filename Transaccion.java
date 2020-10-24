package nare.tp_pa_v3;

public interface Transaccion {
    
    abstract double calcularComision();    
    abstract String getTipoOperacion();    
    abstract void registrarOperacion();  
    abstract void mostrarOperacion();   
     
}
