package nare.tp_pa_v3;
import static nare.tp_pa_v3.Logica.alquileres;

public class Alquiler extends Transaccion{    
    private int meses;
    private final char tipo = 'a'; 
    private final double multiplicador = 2;
    
    public Alquiler(String dom, char juri, double monto, int meses){
        super(dom, juri, monto);      
        this.meses = meses;
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
    
}
