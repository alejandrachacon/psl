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
    

    /**
     * Test of procesar method, of class ImpresorLCD.
     */
    @Test
    public void testProcesar() throws Exception {
        System.out.println("procesar");
        String comando = "2,1";
        int espacioDig = 1;
        ImpresorLCD instance = new ImpresorLCD();
        instance.procesar(comando, espacioDig);
    }

    /**
     * Test of isNumeric method, of class ImpresorLCD.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String cadena = "akl";
        boolean expResult = false;
        boolean result = ImpresorLCD.isNumeric(cadena);
        assertEquals(expResult, result);
    }
    
}
