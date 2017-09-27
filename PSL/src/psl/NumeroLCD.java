/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psl;

import static java.lang.Math.ceil;

/**
 *
 * @author Ale
 */
public class NumeroLCD {
    
    private final boolean[] lineas;
    private final static int tam = 7;
    private final int[] posC;
    private final int[] posF;
    private int filas;
    private int columnas;
    private String[][] num;

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
     
    public String[][] getNum() {
        return num;
    }
    
   
      public NumeroLCD(int size, int filas, int columnas) {
        // Inicializa variables
        lineas = new boolean[tam];
        posC = new int[2];
        posF = new int[3];
        this.filas = filas;
        this.columnas = columnas;
        num = new String[filas][columnas];
        posC[0] = 0;
        posC[1] = columnas-1;
        posF[0] = 0;
        posF[1] = (int) ceil(filas/2);
        posF[2] = filas-1;
      //  this.size = size;
        initNum();
      }
      public void adicionarLinea(int segmento){
         
          lineas[segmento-1] = true;          
      }
      public void crearNum() {
          String hor = "-";
          String ver = "|";
         for(int i = 0; i < tam; i++){
             
             if(lineas[i]){
               
                 for(int j = 1; j < columnas-1; j++){
                     if(i==3){
                         num[posF[1]][j]=hor;
                     }
                     if(i==1){
                         num[posF[0]][j]=hor;
                     }
                     if(i==5)
                     {
                         num[posF[2]][j]=hor;
                     }
                 }
                 for(int j = 1; j< posF[1]; j++){
                     
                     if(i == 0){
                         num[j][posC[0]]=ver;
                     }
                     if(i == 2){
                         
                         num[j][posC[1]]=ver;
                     }
                      
                 }
              
                 for(int j = posF[1] + 1 ; j< filas-1; j++){
                     
                     if(i == 4){
                         num[j][posC[0]]=ver;
                     }
                     if(i == 6){
                         
                         num[j][posC[1]]=ver;
                     }
                      
                 }
                 
             }
            
         }
          
      }
       public void initNum(){
           
          for(int i = 0; i< filas; i++){
              for(int j = 0; j < columnas ; j++){
                  num[i][j]=" ";
              }
              
          }
      }
       
       public void imprimir(){
           
          for(int i = 0; i< filas; i++){
              for(int j = 0; j < columnas ; j++){
                  System.out.print(num[i][j]);
              }
              System.out.println();
          }
      }
      
      
    
      
    
}
