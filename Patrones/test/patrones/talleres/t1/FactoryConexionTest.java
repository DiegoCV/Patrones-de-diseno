/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patrones.talleres.t1.conexion.IConexion;

/**
 *
 * @author DiegoCarrascal
 */
public class FactoryConexionTest {
    
    public FactoryConexionTest() {
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

    
    @Test
    public void testGetConexion2() {
        System.out.println("getConexion");
        String conexion = "mariadb";
        
        IConexion result = FactoryConexion.getConexion(conexion);
        assertEquals("mariadb", result.getNombre());

    }
    
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        String conexion = "oracle";
        
        IConexion result = FactoryConexion.getConexion(conexion);
          assertNotEquals("oracle", result.getNombre());

    }
    
     
}
