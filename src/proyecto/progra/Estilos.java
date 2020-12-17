package proyecto.progra;

public class Estilos 
{
    public int precio;
    public String marca;
    
 public Estilos()
 {
 }
    
 public Estilos(int precio,String marca)         
 {
 this.precio = precio;
 this.marca = marca;
 }    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
 Estilos arreglo[] = new Estilos[3];
 public void deportivos()
 {
      arreglo[0]=new Estilos(60000,"Addidas");
      arreglo[1]=new Estilos(43800,"Nike");
      arreglo[2]=new Estilos(55360,"Puma");
      
     for (int x=0;x<arreglo.length;x++)
    {
    System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }
 }
 public void Rdeportivos()
 {
        for (int x=0;x<arreglo.length;x++)
    {
       System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }  
 }       
 
 
 public void casuales()
 {
      arreglo[0]=new Estilos(32400,"Sperry");
      arreglo[1]=new Estilos(35000,"Vans");
      arreglo[2]=new Estilos(45850,"Tommy");
      
     for (int x=0;x<arreglo.length;x++)
    {
    System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }
 }

 public void Rcasuales()
 {
        for (int x=0;x<arreglo.length;x++)
    {
      System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }  
 }  
 
 public void formal()
 {
      arreglo[0]=new Estilos(64700,"Tommy");
      arreglo[1]=new Estilos(70000,"Gucci");
      arreglo[2]=new Estilos(56360,"Adoc");
      
     for (int x=0;x<arreglo.length;x++)
    {
    System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }
 }

 public void Rformal()
 {
        for (int x=0;x<arreglo.length;x++)
    {
      System.out.println(arreglo[x].precio+" "+arreglo[x].marca);
    }  
 }       
}





