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
public class CartaTest {
    
    public CartaTest() {
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
     * Test of getValor method, of class Carta.
     * 
     * @throws FueraDeRangoException
     */
    @Test
    public void testGetValor() throws FueraDeRangoException {
        System.out.println("getValor");
        Carta instance = new Carta(6,Figura.CORAZONES);
        int expResult = 6;
        int result = instance.getValor();
        assertEquals("Fallo - debe valer lo mismo",expResult,result);
    }

    /**
     * Test of getFigura method, of class Carta.
     * @throws FueraDeRangoException
     */
    @Test
    public void testGetFigura() throws FueraDeRangoException {
        System.out.println("getFigura");
        Carta instance = new Carta(6,Figura.CORAZONES);
        Figura expResult = Figura.CORAZONES;
        Figura result = instance.getFigura();
        assertEquals("Fallo - debe ser de la misma figura",expResult,result);
    }

    /**
     * Test of getColor method, of class Carta.
     * @throws FueraDeRangoException
     */
    @Test
    public void testGetColor() throws FueraDeRangoException {
        System.out.println("getColor");
        Carta instance = new Carta(6,Figura.CORAZONES);
        Color expResult = Color.ROJO;
        Color result = instance.getColor();
        assertEquals("Fallo - debe ser del mismo color",expResult, result);
    }

    /**
     * Test of toString method, of class Carta.
     * @throws FueraDeRangoException
     */
    @Test
    public void testToString() throws FueraDeRangoException {
        System.out.println("toString");
        Carta instance = new Carta(6,Figura.CORAZONES);
        String result= instance.toString();
        assertNotNull("Fallo - debe regresar algo toString", result);
    }

    /**
     * Test of compareTo method, of class Carta.
     * @throws FueraDeRangoException
     */
    @Test
    public void testCompareTo() throws FueraDeRangoException{
        System.out.println("compareTo");
        Carta o = new Carta(6,Figura.CORAZONES);
        Carta instance = new Carta(8,Figura.DIAMANTES);
        int result = instance.compareTo(o);
        assertEquals("Fallo - debe regresar mayor que el otro", 1,result);
    }
    
}
