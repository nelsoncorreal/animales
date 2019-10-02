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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mamiferos perro =new mamiferos();
        reptiles cocodrilo=new reptiles();
        aves tucan =new aves();
        
        perro.setAlimentan("Carne, arroz y pescado, entre los mejores alimentos para los perros");
        perro.setNumeropatas("cuatro patas");
        perro.setPelo("cuentan con diferentes tipos de pelo");
        perro.setRespiracion("En un perro grande la frecuencia respiratoria se aproxima a las 15 respiraciones por minuto y en un perro pequeño suele ser en torno a 25 respiraciones por minuto.");
        
        cocodrilo.setAlimentan("se alimentan de ranas, peces pequeños y cangrejos");
        cocodrilo.setNumeropatas("cuatro patas");
        cocodrilo.setEscamas("Las escamas del cocodrilo están compuestas por queratina, una proteína que en otros animales es el constituyente principal de las uñas, plumas, cuernos y otras partes del cuerpo similares.");
        cocodrilo.setPupila("Tienen una pupila vertical, como la de los gatos, que favorece su visión nocturna.");
        
        tucan.setAlimentan("se alimentan principalmente de bayas, semillas, frutos, y fruta madura.");
        tucan.setNumeropatas("2 . Sus patas  son cortas y fuertes que le facilita la sujeción a las ramas y le  permite desplazarse fácilmente entre los árboles.");
        tucan.setPico("El pico de un tucán es largo, macizo con dientecillos como sierra llega a medir la tercera parte de su tamaño. ");
        tucan.setVuelo("Son aves voladoras que se mantienen por lo general en la copa de los árboles, presentan alas pequeñas y redondas");        
        int opc=Integer.parseInt(JOptionPane.showInputDialog("1.perro \2. cocodrilo \3. tucan"));
        switch(opc){
            case 1:
                perro.ImprimirAlimento();
                perro.Imprimir();
                break;
            case 2:
                cocodrilo.ImprimirAlimento();
                cocodrilo.Imprimir();
            case 3:
                tucan.ImprimirAlimento();
                tucan.Imprimir();
             break;
        }
    }
    
}
