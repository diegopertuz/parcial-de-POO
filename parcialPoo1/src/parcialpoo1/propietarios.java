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
public class propietarios extends persona{
    private int idpropietario ;
    public propietarios(int idpropietarios,String DNI, String nombre, String primerApellido, String direccion) {
        super(DNI, nombre, primerApellido, direccion);
        
        this.idpropietario = idpropietario;
    }


    
    public String mostrar(){
        String info="";
        info = idpropietario+"\t"+DNI+"\t"+nombre+"\t"+primerApellido+"\t"+direccion;
        return info;
    }
    public void setDNI(String dni){
        
        this.DNI = dni;
        
    }
    public void setnombre(String nombre ){
        
        this.nombre = nombre;
        
    }
    public void setprimerApellido(String apellido ){
        
        this.primerApellido = apellido;
        
    }
      
}
