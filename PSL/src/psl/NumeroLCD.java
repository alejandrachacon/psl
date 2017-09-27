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
    
    private final boolean[] lineas;
    private final static int tam = 7;
    private final int[] posC;
    private final int[] posF;
    private int filas;
    private int columnas;
    private String[][] num;
    
      public NumeroLCD(int size, int filas, int columnas) {
        // Inicializa variables
        lineas = new boolean[tam];
        posC = new int[2];
        posF = new int[3];
        this.filas = filas;
        this.columnas =columnas;
        num = new String[filas][columnas];
        posC[0] = 0;
        posC[1] = columnas;
        posF[0] = 0;
        posF[1] = filas/2;
        posF[2] = filas;
      //  this.size = size;
        crearNum();
      }
      public void adicionarLinea(int segmento){
          lineas[segmento] = true;          
      }
      public void crearNum(){
          String hor = "-";
          String ver = "|";
         for(int i = 0; i < tam; i++){
             
             if(lineas[i]){
                 for(int j = 0; j< columnas; j++){
                     if(i==4){
                         num[posF[1]][j]=hor;
                     }
                     if(i<4){
                         num[posF[0]][j]=hor;
                     }else{
                         num[posF[2]][j]=hor;
                     }
                 }
                 for(int j = 0; j< posF[1]; j++){
                     
                     if(i == 1){
                         num[j][posC[0]]=ver;
                     }
                     if(i == 3){
                         num[j][posC[1]]=ver;
                     }
                      
                 }
                 num[posF[1]][posC[0]]=" ";
                 num[posF[1]][posC[1]]=" ";
                 
                 for(int j = posF[1] +1 ; j<= filas; j++){
                     
                     if(i == 5){
                         num[j][posC[0]]=ver;
                     }
                     if(i == 7){
                         num[j][posC[1]]=ver;
                     }
                      
                 }
                 
             }
             
         }
          
      }
       
       public void imprimir(){
          for(int i = 0; i< filas; i++){
              for(int j = 0; j < columnas ; j++){
                  System.out.println(num[i][j]);
              }
          }
      }
      
      
    
      
    
}
