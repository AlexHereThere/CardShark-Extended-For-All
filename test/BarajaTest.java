/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
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
public class BarajaTest {
    
    public BarajaTest() {
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
     * Test of agregarOtraBaraja method, of class Baraja.
     */
    @Test
    public void testAgregarOtraBaraja() {
        System.out.println("agregarOtraBaraja");
        Baraja instance = new Baraja();
        instance.agregarOtraBaraja();
        assertNotNull("Fallo - no debe estar vacio la baraja",instance);
       
    }

    /**
     * Test of barajar method, of class Baraja.
     */
    @Test
    public void testBarajar() {
        System.out.println("barajar");
        Baraja instance = new Baraja();
        Baraja instance2 = new Baraja();
        instance.barajar();
        assertNotEquals("Fallo - no deben ser lo mismo",instance2.mazo,instance.mazo);
    }

    /**
     * Test of repartir method, of class Baraja.
     */
    @Test
    public void testRepartir() {
        System.out.println("repartir");
        int n = 5;
        Baraja instance = new Baraja();
        ArrayList<Carta> expResult = instance.repartir(5);
        ArrayList<Carta> result = instance.repartir(n);
        assertEquals("Fallo - no son el mismo tamano",expResult.size(), result.size());
    }

    /**
     * Test of toString method, of class Baraja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Baraja instance = new Baraja();
        String result = instance.toString();
        assertNotNull("Fallo - no presento la baraja",result);
    }
    
}
