/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pautaroman_proyecto3.u1;

/**
 *
 * @author Paul
 */
public class PautaRoman_Proyecto3U1 {

    public static void main(String[] args) {
        
        var pais1=new Pais("Guillermo Lasso","America",19,"Ecuador");
        var ciudad1=new Ciudad("pepe",2);
        ciudad1.setNombre("Cuenca");
        var provincia1=new Provincia(2300);
        provincia1.setNombre("Cañar");
        
        
        System.out.println(pais1.mostrarInfo()+ciudad1.mostrarInfo()+provincia1.mostrarInfo());
        System.out.println(provincia1.getciu());
    
    }
}
