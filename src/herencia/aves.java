/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian salamanca
 */
public class aves extends animal {
    String pico;
    String vuelo;
    public aves(String alimentan, String numeropatas){
        super(alimentan, numeropatas);
    } 

    aves() {
       
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public String getPico() {
        return pico;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getVuelo() {
        return vuelo;
    }
     public void Imprimir(){
         JOptionPane.showMessageDialog(null,"su pico   es "+pico);
         JOptionPane.showMessageDialog(null,"su vuelo  es "+vuelo);
     }
}
