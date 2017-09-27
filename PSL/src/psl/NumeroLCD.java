/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psl;

/**
 *
 * @author Ale
 */
public class NumeroLCD {
    
    private final boolean[] num;
    private final int[] pos;
    private int size;
    
      public NumeroLCD(int size) {
        // Inicializa variables
        num = new boolean[7];
        pos = new int[3];
        pos[0] = 0;
        pos[1] = size/2;
        pos[2] = size;
        this.size = size;
        
      }
      
    
      
    
}
