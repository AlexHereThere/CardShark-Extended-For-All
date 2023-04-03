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
public class CardSharkTest {
    
    public CardSharkTest() {
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
     * Test of inicia method, of class CardShark.
     */
    @Test
    public void testInicia() {//metodo void
        System.out.println("inicia");
        CardShark instance = new CardShark(3);
        assertNotNull("Fallo - no debe ser nullo instancia",instance);
    }

    /**
     * Test of main method, of class CardShark.
     */
    @Test
    public void testMain() {//metodo void
        System.out.println("main");
        String[] args = null;
        assertNull("Fallo - debe ser nulo los argumentos",args);
    }
    
}
