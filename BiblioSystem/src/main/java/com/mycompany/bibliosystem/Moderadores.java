/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliosystem;
import java.util.ArrayList;

/**
 *
 * @author Pana_Waza
 */
public class Moderadores {
    int rol;
    String nombre;
    String contraseña;
    static ArrayList <Moderadores>ListaModeradores = new ArrayList <>();
    
    Moderadores(int rol,String nombre,String contraseña){
        this.rol=rol;
        this.nombre= nombre;
        this.contraseña=contraseña;
    }
    
    static void saveModeradores(int rol ,String name, String password){
        Moderadores accesoModerador = new Moderadores(rol,name,password);
        ListaModeradores.add(accesoModerador);
    }
    
}
