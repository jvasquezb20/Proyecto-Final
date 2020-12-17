package proyecto.progra;


public class Proveedores 
{
    private int cedula;
    private String nombre;
    private String apellidos;
    
 public Proveedores()
 {
 }
    
 public Proveedores(int cedula,String nombre,String apellidos)         
 {
 this.cedula = cedula;
 this.nombre = nombre;
 this.apellidos = apellidos;
 }    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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
 
 Proveedores arreglo[] = new Proveedores[4];
 public void datos()
 {
     
      
      arreglo[0]=new Proveedores(102650858,"Marcos","Gonzales Ferreira");
      arreglo[1]=new Proveedores(205870468,"Victor","Valenzuela Morales");
      arreglo[2]=new Proveedores(118040480,"Juan Josue","Sanchez Villagra");
      arreglo[3]=new Proveedores(307950520,"Christian","Dalas Pacheco");
     
     for (int x=0;x<5;x++)
    {
    System.out.println(arreglo[x].cedula+" "+arreglo[x].nombre+" "+arreglo[x].apellidos);
    }
 }
 
 
 public void recorrer()
 {
        for (int x=0;x<5;x++)
    {
    System.out.println(arreglo[x].cedula+" "+arreglo[x].nombre+" "+arreglo[x].apellidos);
    }  
 }       
 
 
}
