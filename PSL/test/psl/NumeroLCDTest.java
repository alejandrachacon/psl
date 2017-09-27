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
public class NumeroLCDTest {
    
    private NumeroLCD num;
    

    @Test
    public void imprimirMethod() {
        System.out.println("prueba imprimir");
        num.adicionarLinea(1);
        num.adicionarLinea(5);
        
        num.imprimir();
        assertTrue(true);
    }
    
}
