/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageo;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo extends Figurageom {

    float ladoa, ladob;
    private float area, perimetro;

   
    @Override
    double CalculoArea() {
        area = ladoa * ladob;
        return area;
    
    }

    @Override
    double CalculoPerimetro() {
perimetro = (ladoa*2) + (ladob*2);
        return perimetro;
        
    }

}


    
    
