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
public class FiguraTest {
    
    public FiguraTest() {
    }
    
   
    @BeforeClass
    public static void setUpClass() {
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
     * Test of values method, of class Figura.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Figura[] expResult = {Figura.CORAZONES,Figura.PICAS,Figura.DIAMANTES,Figura.TREBOLES};
        Figura[] result = Figura.values();
        assertArrayEquals("Fallo - debe tener lo mismo",expResult, result);
    }

    /**
     * Test of valueOf method, of class Figura.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "CORAZONES";
        Figura expResult = Figura.CORAZONES;
        Figura result = Figura.valueOf(string);
        assertEquals(expResult, result);
        assertEquals("Fallo - debe valer lo mismo",expResult,result);
    }
    
}
