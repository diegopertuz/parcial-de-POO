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
public class cliente extends persona{
    
   
    private int idcliente;
    private String telefono;
    public cliente(int idcliente , String DNI, String nombre, String primerApellido, String direccion, String telefono) {
        super(DNI, nombre, primerApellido, direccion);
       
        this.idcliente = idcliente;
        this.telefono = telefono;
    }
    
   
    public String mostrar(){
        String info="";
        info = idcliente+"\t"+DNI+"\t"+nombre+"\t"+primerApellido+"\t"+direccion+"\t"+telefono;
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
