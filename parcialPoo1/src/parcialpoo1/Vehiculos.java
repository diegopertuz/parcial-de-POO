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
public class Vehiculos {
    protected int idvehiculo;
    protected String matricula;
    protected String marca;
    protected int modelo;
    protected int idcliente;

    public Vehiculos(int idvehiculo,String matricula, String marca, int modelo, int idcliente) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.idcliente = idcliente;
    }
   
    
    
    
}
