/*
Universidad Fidelitas
Proyecto Final programacion
Introduccion a la Progamacion
Fecha de entrega 17/12/2020
Realizado por Johan Vasquez y Jocksan Cubero
*/

package proyecto.progra;

public class ProyectoProgra {

    
    public static void main(String[] args) 
    { 
        Menu llamador1 = new Menu();
        Descuento llamador3 = new Descuento();
        Cliente llamador4 = new Cliente();
        
        llamador4.datos();
        llamador1.Menu();
        llamador3.AplicarDescuento(0, 0, 0, 0);
        
    }
    
}
