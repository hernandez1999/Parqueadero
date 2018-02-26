
package parqueadero;

import Vehiculos.Moto;

public class Principal {
    
    public static void main (String [] args){
        
        FichaVehiculo miFicha;
        miFicha = new FichaVehiculo();
        miFicha.setVisible(true);
        
        Moto miMoto=new Moto();
        
        //Modificar
        miFicha.miMotoEnFichaVehiculo = miMoto;
    }   
}
