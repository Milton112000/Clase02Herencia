/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase02herencia;

/**
 *
 * @author USUARIO
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      profesor profe=new profesor("Milton", "Honduritas Santa Ana", "11/03/2000", "Masculino", 20 , " Tecnico Programador ","Programador ");
        System.out.println(profe.toString());
    
     classEstudiante estu =new classEstudiante("Alvaro", "Aguilares", "12/5/2001", "Masculino", 19, 1500, "Ing. Sistemas y Computacion");
        System.out.println(estu.toString());
    
    }
    
}
