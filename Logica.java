package nare.tp_pa_v3;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Logica {
    
    static ArrayList<Venta> ventas = new ArrayList<Venta>();
    static ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
    
    public static void init(){
        Alquiler t1 = new Alquiler("Aráoz 234", 'c', 15000, 12);
        t1.registrarOperacion();
        t1.mostrarOperacion();
        Alquiler t2 = new Alquiler("Corrientes 234", 'b', 25000, 36);
        t2.registrarOperacion();
        t2.mostrarOperacion();
        Alquiler t3 = new Alquiler("Cervantes 234", 'c', 30000, 24);
        t3.registrarOperacion();
        t3.mostrarOperacion();
        Venta t4 = new Venta("Salguero 1234", 'b', 2700000);
        t4.registrarOperacion();
        t4.mostrarOperacion();
        Venta t5 = new Venta("Carlos Casares 5644", 'b', 5600000);
        t5.registrarOperacion();        
        Venta t6 = new Venta("Sarmiento 34", 'c', 6750000);           
        t6.registrarOperacion();
        t6.mostrarOperacion();       
        Alquiler t7 = new Alquiler("Av. La Plata 655", 'c', 20000, 24);
        t7.registrarOperacion();
        t7.mostrarOperacion();          
    }    
    
    public static void calcularTotales(){
    //recorro el arrayList y voy incrementando los acumuladores
        double acumCABA = 0;
        double acumBsAs = 0;        
                
        for (int i=0; i<ventas.size(); i++){
            if (ventas.get(i).getJuris().equals("CABA")){
                acumCABA += ventas.get(i).calcularComision();
            } else {
                acumBsAs += ventas.get(i).calcularComision();
            }                      
        }      
        
          for (int i=0; i<alquileres.size(); i++){
            if (alquileres.get(i).getJuris().equals("CABA")){
                acumCABA += alquileres.get(i).calcularComision();
            } else {
                acumBsAs += alquileres.get(i).calcularComision();
            }                      
        } 
          
        System.out.println("\nTotal de operaciones: " + (alquileres.size() + ventas.size()));
        System.out.println("Total de comisiones por operaciones en CABA " + formatear(acumCABA));
        System.out.println("Total de comisiones por operaciones en BsAs " + formatear(acumBsAs));
        System.out.println("                                              ------------------");
        System.out.println("                        Total comisiones    " + formatear(acumBsAs + acumCABA));

    }
    
    // función que da formato monetario 
    public static String formatear(double valor){ 
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(); 
        return formatoMoneda.format(valor);
    }    
}
