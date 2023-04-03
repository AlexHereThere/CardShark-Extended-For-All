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
        Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        assertNotNull("Fallo - no debe ser nullo",instance );
    }

    /**
     * Test of getCartaLanzada method, of class Jugador.
     */
    @Test
    public void testGetCartaLanzada() {
        System.out.println("getCartaLanzada");
        Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        Carta result = instance.getCartaLanzada();
        assertNull("Fallo - no debe valer algo",result);
    }

    /**
     * Test of setMano method, of class Jugador.
     */
    @Test
    public void testSetMano() {
        System.out.println("setMano");
         Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        ArrayList<Carta> mano = b.repartir(5);
        instance.setMano(mano);
        assertEquals("Fallo - debe ser lo mismo",mano,instance.getMano());
    }

    /**
     * Test of getMano method, of class Jugador.
     */
    @Test
    public void testGetMano() {
        System.out.println("getMano");
         Baraja b = new Baraja();
         ArrayList<Carta> expResult = b.repartir(5);
        Jugador instance = new Jugador(1,expResult,5);
        ArrayList<Carta> result = instance.getMano();
        assertEquals("Fallo - debe dar lo mismo",expResult, result);
    }

    /**
     * Test of getPuntuacion method, of class Jugador.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("getPuntuacion");
        Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        instance.setPuntuacion(5);
        int result = instance.getPuntuacion();
        assertEquals("Fallo - deben ser iguales",5, result);
    }

    /**
     * Test of setPuntuacion method, of class Jugador.
     */
    @Test
    public void testSetPuntuacion() {
        System.out.println("setPuntuacion");
        int puntuacion = 5;
          Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        instance.setPuntuacion(puntuacion);
        assertEquals("Fallo - deben valer lo mismo",5,instance.getPuntuacion());
    }

    /**
     * Test of getId method, of class Jugador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
         Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        int expResult = 1;
        int result = instance.getId();
        assertEquals("Fallo - debe valer 1",expResult, result);
    
    }

    /**
     * Test of ExtraCartasPorDado method, of class Jugador.
     */
    @Test
    public void testExtraCartasPorDado() {
        System.out.println("ExtraCartasPorDado");
         Baraja b = new Baraja();
        Jugador instance = new Jugador(1,b.repartir(5),5);
        int result = instance.ExtraCartasPorDado();
        assertNotNull("Fallo - debe regresar algo", result);
    }
    
}
