
package proyecto.progra;

import javax.swing.JOptionPane;

public class Menu 
{
    
     
    public void Menu()
    {
    String marca=" "; 
    int talla = 0;
    String color=" ";
    int opcion;
    JOptionPane.showMessageDialog(null,"Bienvenido a la tienda ");
     Proveedores fide3 = new Proveedores();
     Estilos fide4 = new Estilos();
     Confirmacion_de_datos llamador2 = new Confirmacion_de_datos();
     
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(  //opciones del menu
        "1. Estilo de zapato Casual."
     +"\n2. Estilo de zapato Deportivo."
     +"\n3. Estilo de zapato Formal."
     +"\n4. Ver los datos de los proveedores."           
     +"\n5. SALIR"));
     
       switch(opcion)
       { 
           case 1: 
           JOptionPane.showMessageDialog(null,"Estos son los estilos Casuales:"); 
          fide4.Rcasuales();
      marca = JOptionPane.showInputDialog("Ingrese la Marca de su zapato");
      talla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla que desea de su zapato"));
      color= JOptionPane.showInputDialog("Ingrese la el color que desea de su zapato");
      
      llamador2.Confirmacion_de_datos();
       break;//llamamos los metodos en el mejor orden
       
        case 2:
            JOptionPane.showMessageDialog(null,"Estos son los estilos Deportivos:");
             fide4.Rdeportivos();
             
      marca = JOptionPane.showInputDialog("Ingrese la Marca de su zapato");
      talla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla que desea de su zapato"));
      color= JOptionPane.showInputDialog("Ingrese la el color que desea de su zapato");
      llamador2.Confirmacion_de_datos();
       break;
       
        case 3:
       JOptionPane.showMessageDialog(null,"Estos son los estilo Formales:");
       fide4.Rformal();
      marca = JOptionPane.showInputDialog("Ingrese la Marca de su zapato");
      talla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla que desea de su zapato"));
      color= JOptionPane.showInputDialog("Ingrese la el color que desea de su zapato");
      llamador2.Confirmacion_de_datos();
       break;
       
        case 4: 
        JOptionPane.showMessageDialog(null,"Estos son los datos de nuestros proveedores:");
          fide3.recorrer();
        
        break;
        
        case 5:
       JOptionPane.showMessageDialog(null,"Gracias por visitarnos, "
               + "y recuerde zapateria la confiable donde encuentra todo a buen precio");
       break;
      
        default: JOptionPane.showMessageDialog(null,"porfavor ingrese una opcion valida para el sistema");
        break;     
       } 
    }
}
