/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_areafigura;

/**
 *
 * @author Marcos
 */
public class Cubo extends Figura{
    
    Cubo(double a, double b) {
        super(a, b);
    }
    
    double area(){
        System.out.println("Area para el Cubo");
        return dim1 * ((dim2)*(dim2));
    }
}
