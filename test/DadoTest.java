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
        int numeroDeCaras = 6;
        Dado instance = new Dado();
        instance.setNumeroDeCaras(numeroDeCaras);
        assertEquals("Fallo - debe dar que son lo mismo",6,instance.getNumeroDeCaras());
    }

    /**
     * Test of setCaraVisible method, of class Dado.
     */
    @Test
    public void testSetCaraVisible() {
        System.out.println("setCaraVisible");
        int caraVisible = 3;
        Dado instance = new Dado();
        instance.setCaraVisible(caraVisible);
        // TODO review the generated test code and remove the default call to fail.
       assertEquals("Fallo - debe ser lo mismo",3,instance.getCaraVisible());
    }

    /**
     * Test of getNumeroDeCaras method, of class Dado.
     */
    @Test
    public void testGetNumeroDeCaras() {
        System.out.println("getNumeroDeCaras");
        Dado instance = new Dado();
        int expResult = 6;
        int result = instance.getNumeroDeCaras();
        assertEquals("Fallo - debe iniciar con 6",expResult, result);
    }

    /**
     * Test of getCaraVisible method, of class Dado.
     */
    @Test
    public void testGetCaraVisible() {
        System.out.println("getCaraVisible");
        Dado instance = new Dado();
        int expResult = 1;
        int result = instance.getCaraVisible();
        assertEquals("Fallo - debe iniciar en 1",expResult, result);
    }

    /**
     * Test of girarDado method, of class Dado.
     */
    @Test
    public void testGirarDado() {
        System.out.println("girarDado");
        Dado instance = new Dado();
        Dado instance2 = new Dado();
        instance.girarDado();
        assertNotEquals("Fallo - debe ser diferente",instance2,instance);
    }

    /**
     * Test of toString method, of class Dado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dado instance = new Dado();
        String expResult = "Numero De Caras:"+instance.getNumeroDeCaras()+" Cara Mostrada:"+instance.getCaraVisible();
        String result = instance.toString();
        assertEquals("Fallo - debe presentar bien el dado",expResult, result);
    }
    
}
