/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t2;

import patrones.talleres.t2.triangulo.*;

/**
 *
 * @author DiegoCarrascal
 */
public class TrianguloFactory implements TrianguloFactoryMethod {

    @Override
    public Triangulo createTriangulo(int a, int b, int c) {
        switch (getTipo(a, b, c)) {
            case 'E':
                return new Equilatero(a, b, c);
            case 'I':
                return new Isosceles(a, b, c);
            default:
                return new Escaleno(a, b, c);
        }
    }

    private char getTipo(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return 'E';
            } else {
                return 'I';
            }
        } else {
            if (a == c) {
                return 'I';
            } else {
                return 'S';
            }
        }
    }
}
