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
public class carro extends Vehiculos{
    private int idcarro;
    private Double anchura;
    private Double altura;

    public carro(int idvehiculo, String matricula, String marca, int modelo,int idcliente,Double anchura, Double altura) {
        super(idvehiculo,matricula, marca, modelo,idcliente);
        this.idcarro = idcarro;
        this.anchura = anchura;
        this.altura = altura;
    }
   
    public String mostrar(){
        String info="";
        info = matricula+"\t"+marca+"\t"+modelo+"\t"+anchura+"\t"+altura;
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
    public void setanchura(Double anchura ){
        
        this.anchura = anchura ;
    }
    public void setaltura(Double altura ){
        
        this.altura = altura ;
    }
    
}
