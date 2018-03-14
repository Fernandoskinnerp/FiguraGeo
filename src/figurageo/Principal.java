/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner miEscaner = new Scanner(System.in);
        float Dato;
        int b = miEscaner.nextInt();
        
      
        Cuadrado miCuadrado = new Cuadrado();
        System.out.println("digite el valor del lado del Cuadrado");
        Dato = miEscaner.nextFloat();
        miCuadrado.setlado(Dato);
        System.out.println(miCuadrado.CalculoArea());
        System.out.println(miCuadrado.CalculoPerimetro());
        
        
         Triangulo miTriangulo = new Triangulo();
        System.out.println("digite el valor de la base del triangulo");
        Dato = miEscaner.nextFloat();
        miTriangulo.setBase(Dato);
        System.out.println("digite el valor de la altura del triangulo");
        Dato = miEscaner.nextFloat();
        miTriangulo.setBase(Dato);
         System.out.println(miTriangulo.CalculoArea());
        System.out.println(miTriangulo.CalculoPerimetro());
        
        Rectangulo miRectangulo = new Rectangulo();
        System.out.println("digite el valor del ladoa del Rectangulo");
        Dato = miEscaner.nextFloat();
        miTriangulo.setBase(Dato);
        System.out.println("digite el valor del lado2 del Rectangulo");
        Dato = miEscaner.nextFloat();
        miTriangulo.setBase(Dato);
         System.out.println(miRectangulo.CalculoArea());
        System.out.println(miRectangulo.CalculoPerimetro());
    }
}
        
     
