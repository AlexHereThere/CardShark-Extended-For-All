/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 01806
 */
public class ColorTest {
    
    public ColorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("");
        System.out.println("--PRUEBO CLASE->");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("<-TERMINA CLASE--");
    }
    
    @Before
    public void setUp() {
        System.out.println("--PRUEBO METODO->");
    }
    
    @After
    public void tearDown() {
        System.out.println("<-TERMINA METODO--");
    }

    /**
     * Test of values method, of class Color.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Color[] expResult = {Color.ROJO,Color.NEGRO} ;
        Color[] result = Color.values();
        assertArrayEquals("Fallo - debe ser lo mismo",expResult, result);
    }

    /**
     * Test of valueOf method, of class Color.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "ROJO";
        Color expResult = Color.ROJO;
        Color result = Color.valueOf(string);
        assertEquals("Fallo - debe valer lo mismo",expResult, result);
    }
    
}
