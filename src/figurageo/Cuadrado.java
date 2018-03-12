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
  float base,altura;
    @Override
    float calcularArea() {
         return base*altura;   
    }

    @Override
    float calcularPerimetro() {
          return (base*2)+(altura*2);
}
}
