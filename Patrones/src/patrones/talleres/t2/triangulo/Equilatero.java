/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t2.triangulo;

/**
 *
 * @author DiegoCarrascal
 */
public class Equilatero extends Triangulo{
    
        
    public Equilatero(int a, int b, int c) {
        super(a, b, c);
        nombre = "Equilatero";
    }

    @Override
    public String toString() {
        return "Equilatero{" + "nombre=" + nombre + '}';
    }
    
    
    
}
