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
public abstract class Triangulo {

    private int a, b, c;
    
    protected String nombre;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNombre(){
        return nombre;
    }
    
    
}
