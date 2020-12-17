package proyecto.progra;

public class ProyectoProgra {

    
    public static void main(String[] args) 
    { 
        Menu llamador1 = new Menu();
        Facturacion llamador2 = new Facturacion();
        Descuento llamador3 = new Descuento();
        Cliente llamador4 = new Cliente();
        
        llamador4.datos();
        llamador1.Menu();
        llamador3.AplicarDescuento(0, 0, 0, 0);
        llamador2.Facturacion();
    }
    
}
