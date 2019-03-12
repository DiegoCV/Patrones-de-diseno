/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t2.main;
import patrones.talleres.t2.triangulo.*;
import patrones.talleres.t2.*;
/**
 *
 * @author DiegoCarrascal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrianguloFactoryMethod factory = new TrianguloFactory();
        Triangulo triangulo = factory.createTriangulo(17,10,11);
        Triangulo triangulo2 = factory.createTriangulo(10,10,10);
        Triangulo triangulo3 = factory.createTriangulo(11,10,11);
        System.out.println(triangulo);
        System.out.println(triangulo2);
        System.out.println(triangulo3);
    }
    
}
