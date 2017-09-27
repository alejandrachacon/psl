/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ale
 */
public class ImpresorLCDTest {
    
    public ImpresorLCDTest() {
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

    /**
     * Test of getMatrizImpr method, of class ImpresorLCD.
     */
    @Test
    public void testGetMatrizImpr() {
        System.out.println("getMatrizImpr");
        ImpresorLCD instance = new ImpresorLCD();
        String[][] expResult = null;
        String[][] result = instance.getMatrizImpr();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatrizImpr method, of class ImpresorLCD.
     */
    @Test
    public void testSetMatrizImpr() {
        System.out.println("setMatrizImpr");
        String[][] matrizImpr = null;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setMatrizImpr(matrizImpr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ImpresorLCD.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ImpresorLCD instance = new ImpresorLCD();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ImpresorLCD.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilasDig method, of class ImpresorLCD.
     */
    @Test
    public void testGetFilasDig() {
        System.out.println("getFilasDig");
        ImpresorLCD instance = new ImpresorLCD();
        int expResult = 0;
        int result = instance.getFilasDig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilasDig method, of class ImpresorLCD.
     */
    @Test
    public void testSetFilasDig() {
        System.out.println("setFilasDig");
        int filasDig = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setFilasDig(filasDig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumDig method, of class ImpresorLCD.
     */
    @Test
    public void testGetColumDig() {
        System.out.println("getColumDig");
        ImpresorLCD instance = new ImpresorLCD();
        int expResult = 0;
        int result = instance.getColumDig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumDig method, of class ImpresorLCD.
     */
    @Test
    public void testSetColumDig() {
        System.out.println("setColumDig");
        int columDig = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setColumDig(columDig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalFilas method, of class ImpresorLCD.
     */
    @Test
    public void testGetTotalFilas() {
        System.out.println("getTotalFilas");
        ImpresorLCD instance = new ImpresorLCD();
        int expResult = 0;
        int result = instance.getTotalFilas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalFilas method, of class ImpresorLCD.
     */
    @Test
    public void testSetTotalFilas() {
        System.out.println("setTotalFilas");
        int totalFilas = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setTotalFilas(totalFilas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalColum method, of class ImpresorLCD.
     */
    @Test
    public void testGetTotalColum() {
        System.out.println("getTotalColum");
        ImpresorLCD instance = new ImpresorLCD();
        int expResult = 0;
        int result = instance.getTotalColum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalColum method, of class ImpresorLCD.
     */
    @Test
    public void testSetTotalColum() {
        System.out.println("setTotalColum");
        int totalColum = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.setTotalColum(totalColum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procesar method, of class ImpresorLCD.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        String comando = "";
        int espacioDig = 0;
        ImpresorLCD instance = new ImpresorLCD();
        instance.procesar(comando, espacioDig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class ImpresorLCD.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String cadena = "";
        boolean expResult = false;
        boolean result = ImpresorLCD.isNumeric(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
