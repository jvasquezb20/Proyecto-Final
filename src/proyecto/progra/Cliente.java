package proyecto.progra;

import javax.swing.JOptionPane;

public class Cliente 
{
    public int x;
    public String cedula;
    public String nombre;
    public String apellidos;
    public String email;
            
 public Cliente()
 {
 }
    
 public Cliente(String nombre,String apellidos,String cedula,String email)         
 {
 this.nombre = nombre;
 this.apellidos = apellidos;
 this.cedula = cedula;
 this.email = email;
 }
 
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void datos()
    {
     Cliente arreglo[] = new Cliente[1];
        
  
        for (int x=0; x<arreglo.length;x++)
    {
    JOptionPane.showMessageDialog(null,"se le solicita los datos del cliente"
     +x);   
    String nombre=JOptionPane.showInputDialog("Escriba el nombre");
    String apellidos=JOptionPane.showInputDialog("Escriba los apellidos");   
    String cedula= JOptionPane.showInputDialog("ingrese la cedula");
    String email= JOptionPane.showInputDialog("ingrese el email");
    }
        
        
    }
    }
