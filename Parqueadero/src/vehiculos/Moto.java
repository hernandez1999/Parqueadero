
package vehiculos;

import vehiculos.Vehiculo;

    
public class Moto extends Vehiculo {

  @Override
   void acelerar() {

        System.out.println("Estoy acelerando");
    }

    @Override
    void frenar() {

        System.out.println("Estoy frenando");
    }
    
    void derrapar(){
        
    }

    
}
