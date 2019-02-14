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
public class POLIMORFISMO_AreaFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo r = new Rectangulo(9, 5);
       Triangulo t = new Triangulo(10, 8);
       Circulo c = new Circulo(3.14, 5);
       Cubo k = new Cubo(6, 3);
       
       Figura figref;
       
       figref = r;
       System.out.println("Area igual a: " +figref.area());
        
       figref = t;
       System.out.println("Area igual a: " +figref.area());
       
       figref = c;
       System.out.println("Area igual a: " +figref.area());
       
       figref = k;
       System.out.println("Area igual a: " +figref.area());
       
    }
    
}
