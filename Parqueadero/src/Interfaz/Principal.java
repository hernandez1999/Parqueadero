
package Interfaz;

import Datos.Usuario;

public class Principal extends Usuario{
    
    public static void main (String [] args){
        
        FichaUsuario miFicha;
        miFicha = new FichaUsuario();
        miFicha.setVisible(true);
        
        Usuario miUsuario=new Usuario();
        
        //Modificar
        miFicha.miUsuario = miUsuario;
    }   
}



