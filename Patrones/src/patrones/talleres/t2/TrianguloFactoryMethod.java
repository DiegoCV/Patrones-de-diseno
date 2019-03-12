/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t2;

import patrones.talleres.t2.triangulo.Triangulo;

/**
 *
 * @author DiegoCarrascal
 */
public interface TrianguloFactoryMethod {
    public Triangulo createTriangulo(int a, int b, int c);
}
