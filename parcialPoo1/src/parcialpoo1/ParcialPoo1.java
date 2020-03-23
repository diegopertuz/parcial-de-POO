/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ParcialPoo1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.println("Registrar Propietarios: ");
        
        ArrayList<propietarios> listaProp = new ArrayList();
         propietarios pro;
        int idPropietario=0;
        String   DNI,nombre, apellido,direccion;
        boolean nuevo=false;
        int op;
        
        do {
            
             idPropietario++;
        System.out.print("DNI: ");
        DNI = scn.next();
        System.out.println("Nombre: ");
        nombre = scn.next();
        System.out.println("Apellido: ");
        apellido = scn.next();
        System.out.println("Direccion: ");
        direccion = scn.next();
            
       pro=new propietarios(idPropietario, DNI, nombre, apellido, direccion);
        listaProp.add(pro);
        
            System.out.println("¿Desea ingresar más propietarios? 1. Sí  2.No");
            op = scn.nextInt();
            
            if (op==1) {
                nuevo=true;
            }else{
                nuevo = false;
            }
        } while (nuevo);
        
        for (int i = 0; i < listaProp.size(); i++) {
            System.out.println(listaProp.get(i));
        }
        
       
        
        System.out.println("Registrar Talleres: ");
        
        ArrayList<Taller> listaTaller = new ArrayList();
       Taller taller;
        int idTaller=0, ProidPro;
        
        boolean tallerr=false;
        
        do {
            
             idTaller++;
        System.out.println("Nombre: ");
        nombre= scn.next();
        System.out.println("Direccion: ");
        direccion= scn.next();
        System.out.println("Propietario (ID): ");
        ProidPro = scn.nextInt();
            
       taller=new Taller(idTaller, nombre, direccion, ProidPro);
        listaTaller.add(taller);
        
            System.out.println("¿Desea ingresar más Talleres?\n1. Sí\t 2.No");
            op = scn.nextInt();
            
            if (op==1) {
                tallerr=true;
            }
        } while (tallerr);
        
        for (int i = 0; i < listaTaller.size(); i++) {
            System.out.println(listaTaller.get(i));
        }
        
      
        
        System.out.println("\nRegistrar Clientes: ");
        
        ArrayList<cliente> listCliente = new ArrayList();
       cliente clie;
        int idCliente=0;
       String telefono;
        boolean nuevocliente=false;
        
        do {
            
             idCliente++;
        System.out.print("DNI: ");
        DNI = scn.next();
        System.out.println("Nombre: ");
        nombre= scn.next();
        System.out.println("Apellido: ");
        apellido = scn.next();
        System.out.println("Telefono: ");
        telefono= scn.next();
            
       clie=new cliente(idCliente, DNI, nombre, apellido,direccion, telefono);
        listaTaller.add(taller);
        
            System.out.println("¿Desea ingresar más Clientes?\n1. Sí\t 2.No");
            op = scn.nextInt();
            
            if (op==1) {
                nuevocliente=true;
            }
        } while (nuevocliente);
        
        for (int i = 0; i < listCliente.size(); i++) {
            System.out.println(listCliente.get(i));
        }
        
        
     
        
        System.out.println("Registrar Vehículos: ");
        
        ArrayList<Vehiculos> listaVehi = new ArrayList();
       Vehiculos vehi;
        int idVehiculo=0, modelo, Clie_idCliente, anchura, altura;
        String matricula, marca;
        boolean nuevov=false, limitador=false;
        
        do {
            
             idVehiculo++;
        System.out.print("MATRICULA: ");
        matricula = scn.next();
        System.out.println("MARCA: ");
        marca = scn.next();
        System.out.println("MODELO: ");
        modelo = scn.nextInt();
        System.out.println("CLIENTE: ");
        Clie_idCliente = scn.nextInt();
            
       vehi=new Vehiculos(idVehiculo, matricula, marca, modelo, Clie_idCliente);
        listaTaller.add(taller);
        
            System.out.println("¿Desea ingresar más Vehiculos? 1. Sí  2.No");
            op = scn.nextInt();
            
            if (op==1) {
                nuevov=true;
            }
        } while (nuevov);
        
    }
        
       
    }
    
    
     

    

