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
             
public class Cuadrado extends Figurageom {
  
    float lado;
    private float area,perimetro;
  
    

    @Override
    double CalculoArea() {
         area= lado*lado;
        return area;
       
    }

    @Override
    double CalculoPerimetro() {
 perimetro = lado*4;
        return perimetro;
        
    }
    void setlado(float Dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
}