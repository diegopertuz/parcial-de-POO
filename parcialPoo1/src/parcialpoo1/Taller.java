/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo1;

/**
 *
 * @author Administrador
 */
public class Taller {
    private int idtaller;
    protected String nombre;
    protected String direccion;
    protected int propietario;
    

    public Taller(int idtaller, String nombre, String direccion, int propietario) {
        this.idtaller = idtaller;
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
       
    }
    
     public String mostrar(){
        String info="";
        info = idtaller+"\t"+nombre+"\t"+direccion+"\t"+propietario;
        return info;
    }
     
     public void setnombre (String nombre){
         
         this.nombre = nombre ;
     }
      public void setdireccion (String direccion){
         
         this.direccion = direccion ;
     }
       public void setpropietario (int propietario){
         
         this.propietario = propietario ;
     }
      
    
}
