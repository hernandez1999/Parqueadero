
package Vehiculos;

public class Moto extends Vehiculo {
    
   @Override
   void acelerar (){ 
       System.out.println("La moto esta acelerando");
    }
    
   @Override
    void frenar (){
       System.out.println("La moto esta frenando");    
    }
    void derrapar (){
       System.out.println("La moto esta derrapando"); 
    }
}
