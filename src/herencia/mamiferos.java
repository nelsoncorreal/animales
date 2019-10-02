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
public class mamiferos extends animal{
    String respiracion;
    String pelo;
    public mamiferos(String alimentan, String numeropatas){
        super(alimentan, numeropatas);
    }

    mamiferos() {
       
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }

    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }

    public String getRespiracion() {
        return respiracion;
    }
    public void Imprimir(){
         JOptionPane.showMessageDialog(null,"su respiracion  es "+respiracion);
         JOptionPane.showMessageDialog(null,"su pelo es "+pelo);
     }
}
