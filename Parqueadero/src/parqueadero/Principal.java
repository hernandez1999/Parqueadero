
package parqueadero;

import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class Principal extends Vehiculo{
    
    public static void main (String [] args){
        
        FichaVehiculo miFicha;
        miFicha = new FichaVehiculo();
        miFicha.setVisible(true);
        
        Moto miMoto=new Moto();
        
        //Modificar
        miFicha.miMoto = miMoto;
    }   
}
