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
public class DadoTest {
    
    public DadoTest() {
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
     * Test of setNumeroDeCaras method, of class Dado.
     */
    @Test
    public void testSetNumeroDeCaras() {
        System.out.println("setNumeroDeCaras");
        int numeroDeCaras = 0;
        Dado instance = new Dado();
        instance.setNumeroDeCaras(numeroDeCaras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaraVisible method, of class Dado.
     */
    @Test
    public void testSetCaraVisible() {
        System.out.println("setCaraVisible");
        int caraVisible = 0;
        Dado instance = new Dado();
        instance.setCaraVisible(caraVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDeCaras method, of class Dado.
     */
    @Test
    public void testGetNumeroDeCaras() {
        System.out.println("getNumeroDeCaras");
        Dado instance = new Dado();
        int expResult = 0;
        int result = instance.getNumeroDeCaras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaraVisible method, of class Dado.
     */
    @Test
    public void testGetCaraVisible() {
        System.out.println("getCaraVisible");
        Dado instance = new Dado();
        int expResult = 0;
        int result = instance.getCaraVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girarDado method, of class Dado.
     */
    @Test
    public void testGirarDado() {
        System.out.println("girarDado");
        Dado instance = new Dado();
        instance.girarDado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dado instance = new Dado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
