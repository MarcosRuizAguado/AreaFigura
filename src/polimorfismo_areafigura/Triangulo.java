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
class Triangulo extends Figura{
    
    Triangulo(double a, double b) {
        super(a, b);
    }
    
    double area(){
        System.out.println("Area para el triangulo");
        return dim1 * dim2 / 2;
    }
}
