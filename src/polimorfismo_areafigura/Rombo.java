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
public class Rombo extends Figura{

    Rombo(double a, double b) {
        super(a, b);
    }
    
    @Override
    double area() {
        System.out.println("Area para el rombo");
        return (dim1 * dim2) / 2;
    }
    
}
