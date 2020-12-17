
package proyecto.progra;

import javax.swing.JOptionPane;

public class Confirmacion_de_datos 
{
    String marca="";
    int talla = 0;
    int cantidad = 0;
    public void Confirmacion_de_datos()
    {
    JOptionPane.showMessageDialog(null,"Porfavor, por su seguridad ingrese los datos de su compra: ");
      cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pares que desea comprar"));
      marca = JOptionPane.showInputDialog("Ingrese la Marca de su zapato");
      talla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla que desea de su zapato"));
    
      JOptionPane.showMessageDialog(null,"Usted escogio la Marca: "+marca+" "
              + "y de talla: "+talla);
           
    JOptionPane.showMessageDialog(null,"Gracias por su compra y su confianza en nosotros");
    }
}
