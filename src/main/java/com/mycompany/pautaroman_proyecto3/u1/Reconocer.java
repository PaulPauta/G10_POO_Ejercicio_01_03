/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pautaroman_proyecto3.u1;

/**
 *
 * @author Paul
 */
public abstract class Reconocer {
    
    String nombre;
    private int numerodeHabitantes;
    
   public abstract String mostrarInfo();
    

    public String getNombre() {
        return nombre;
    }
  
    public void setNumerodeHabitantes(int numerodeHabitantes) {
        this.numerodeHabitantes = numerodeHabitantes;
    } 

    public int getNumerodeHabitantes() {
        return numerodeHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
