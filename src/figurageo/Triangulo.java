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
public class Triangulo extends Figurageom {

    float base, altura;
    private float perimetro,area;

     
    @Override
    double CalculoArea() {
        area = (base*altura)/2;
        return area;
        
    }

    @Override
    double CalculoPerimetro() {
         perimetro = base*3;
        return perimetro;
        
        
    }
    void setBase(float Dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLado(float Dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
