/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pautaroman_proyecto3.u1;

/**
 *
 * @author Paul
 */
public class Provincia extends Reconocer{

    private int territorio;
    private Ciudad ciu;

    public Provincia( int territorio, Ciudad ciu) {
        this.territorio = territorio;
        this.ciu=ciu;
    }

    public int getTerritorio() {
        return territorio;
    }
    public Ciudad getciu() {
        return ciu;
    }
    public void setciu(Ciudad ciu) {
        this.ciu; =ciu ;
    }


    @Override
    public String mostrarInfo() {
        return ("; la provincia "+this.getNombre()+" tiene una extencion de terreno de "+ this.getTerritorio()+" metros cuadrados");
    }

    
    
}
