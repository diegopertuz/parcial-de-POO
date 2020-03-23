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
public class persona {
    protected String DNI;
    protected String nombre;
    protected String primerApellido;
    protected String direccion;

    public persona(String DNI, String nombre, String primerApellido, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.direccion = direccion;
    }
    
    
}
