/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.talleres.t2.triangulo.Isosceles;
import patrones.talleres.t2.triangulo.Triangulo;

/**
 *
 * @author DiegoCarrascal
 */
public class TrianguloFactoryTest {
    
    public TrianguloFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    
    /**
     * Test of createTriangulo method, of class TrianguloFactory.
     */
    @Test
    public void testCreateTrianguloEscaleno() {       
        int a = 10;
        int b = 5;
        int c = 8;
        TrianguloFactory instance = new TrianguloFactory();       
        Triangulo result = instance.createTriangulo(a, b, c);
        assertEquals("Escaleno", result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCreateTrianguloIsosceles() {       
        int a = 7;
        int b = 5;
        int c = 7;
        TrianguloFactory instance = new TrianguloFactory();       
        Triangulo result = instance.createTriangulo(a, b, c);
        assertEquals("Isosceles", result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCreateTrianguloEquilatero() {       
        int a = 5;
        int b = 5;
        int c = 5;
        TrianguloFactory instance = new TrianguloFactory();       
        Triangulo result = instance.createTriangulo(a, b, c);
        assertEquals("Equilatero", result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
}
