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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of lanzarUnaCarta method, of class Jugador.
     */
    @Test
    public void testLanzarUnaCarta() {
        System.out.println("lanzarUnaCarta");
        Jugador instance = null;
        Carta expResult = null;
        Carta result = instance.lanzarUnaCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCartaLanzada method, of class Jugador.
     */
    @Test
    public void testGetCartaLanzada() {
        System.out.println("getCartaLanzada");
        Jugador instance = null;
        Carta expResult = null;
        Carta result = instance.getCartaLanzada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMano method, of class Jugador.
     */
    @Test
    public void testSetMano() {
        System.out.println("setMano");
        ArrayList<Carta> mano = null;
        Jugador instance = null;
        instance.setMano(mano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMano method, of class Jugador.
     */
    @Test
    public void testGetMano() {
        System.out.println("getMano");
        Jugador instance = null;
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getMano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntuacion method, of class Jugador.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("getPuntuacion");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.getPuntuacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntuacion method, of class Jugador.
     */
    @Test
    public void testSetPuntuacion() {
        System.out.println("setPuntuacion");
        int puntuacion = 0;
        Jugador instance = null;
        instance.setPuntuacion(puntuacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Jugador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExtraCartasPorDado method, of class Jugador.
     */
    @Test
    public void testExtraCartasPorDado() {
        System.out.println("ExtraCartasPorDado");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.ExtraCartasPorDado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
