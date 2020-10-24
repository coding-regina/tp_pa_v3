package nare.tp_pa_v3;

public class Inmueble {
    private String domicilio;
    private char jurisdiccion;
   
    public Inmueble(String dom, char jur){
        this.domicilio = dom;
        this.jurisdiccion = jur;
    } 
        
    public String getJuris(){
        String retorno = this.jurisdiccion == 'c'? "CABA":"BsAs";
        return retorno;
    };
    
    public String getDomicilio(){
        return this.domicilio;
    };
}
