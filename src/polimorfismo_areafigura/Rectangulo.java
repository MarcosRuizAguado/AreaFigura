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
class Rectangulo extends Figura{
    
    Rectangulo(double a, double b) {
        super(a, b);
    }
    
    double area(){
        System.out.println("Area para el rectangulo");
        return dim1 * dim2;
    }
}
