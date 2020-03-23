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
public class moto extends Vehiculos{
    
    private int idmoto;
    private boolean limitador;

    public moto(int idvehiculo,boolean limitador,String matricula, int idcliente, String marca, int modelo) {
        super(idvehiculo,matricula, marca, modelo,idcliente);
        this.idmoto = idmoto;
        this.limitador = limitador;
         
    }

     public String mostrar(){
        String info="";
        info = idmoto+"\t"+matricula+"\t"+marca+"\t"+modelo+"\t"+limitador;
        return info;
    }
   
     public void setmatricula(String matricula){
        
        this.matricula = matricula;
    }
    public void setmarca(String marca){
        
        this.marca = marca;
    }
    public void setmodelo(int modelo){
        
        this.modelo = modelo ;
    }
    
    public void setlimitador(boolean limitador){
        
        this.limitador = limitador ;
    }
}
