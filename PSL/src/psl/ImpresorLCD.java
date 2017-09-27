package psl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImpresorLCD {
  
    private List<NumeroLCD> numeros;
    private NumeroLCD num;
    private String[][] matrizImpr;

    
    public ImpresorLCD(){
        numeros = new ArrayList<NumeroLCD>();
    }
    /**
     *
     * Metodo encargado de definir las lineas que componen un digito y
     * a partir de los segmentos adicionar la representacion del digito a la matriz
     *
     * @param numero Digito
     */
    private void adicionarDigito(int numero) {

        switch (numero) {
            case 1:
                num.adicionarLinea(1);
                num.adicionarLinea(5);
                break;
            case 2:
                num.adicionarLinea(2);
                num.adicionarLinea(3);
                num.adicionarLinea(4);
                num.adicionarLinea(5);
                num.adicionarLinea(6);
                break;
            case 3:
                num.adicionarLinea(2);
                num.adicionarLinea(3);
                num.adicionarLinea(4);
                num.adicionarLinea(7);
                num.adicionarLinea(6);
                break;
            case 4:
                num.adicionarLinea(1);
                num.adicionarLinea(4);
                num.adicionarLinea(3);
                num.adicionarLinea(7);
                break;
            case 5:
                num.adicionarLinea(2);
                num.adicionarLinea(1);
                num.adicionarLinea(4);
                num.adicionarLinea(7);
                num.adicionarLinea(6);
                break;
            case 6:
                num.adicionarLinea(2);
                num.adicionarLinea(1);
                num.adicionarLinea(4);
                num.adicionarLinea(5);
                num.adicionarLinea(6);
                num.adicionarLinea(7);
                break;
            case 7:
                num.adicionarLinea(2);
                num.adicionarLinea(3);
                num.adicionarLinea(7);
                break;
            case 8:
                num.adicionarLinea(1);
                num.adicionarLinea(2);
                num.adicionarLinea(3);
                num.adicionarLinea(4);
                num.adicionarLinea(5);
                num.adicionarLinea(6);
                num.adicionarLinea(7);
                break;
            case 9:
                num.adicionarLinea(1);
                num.adicionarLinea(3);
                num.adicionarLinea(4);
                num.adicionarLinea(2);
                num.adicionarLinea(6);
                num.adicionarLinea(7);
                break;
            case 0:
                num.adicionarLinea(1);
                num.adicionarLinea(2);
                num.adicionarLinea(3);
                num.adicionarLinea(6);
                num.adicionarLinea(5);
                num.adicionarLinea(7);
                break;
            default:
                break;
        }

        
    }

    /**
     *
     * Metodo encargado de crear los numeros en el formato de string
     *
     * @param size Tamaño Segmento Digitos
     * @param numeroImp Numero a Imprimir
     * @param espacio Espacio Entre digitos
     */    
    private void crearNumero(int size, String numeroImp, int espacio) throws Exception
    {
        char[] digitos;
        // crea el arreglo de digitos
        digitos = numeroImp.toCharArray();
        // Calcula el numero de filas cada digito
        int filasDig = (2 * size) + 3;
        // Calcula el numero de columna de cada digito
        int columDig = size + 2;
        // Calcula el total de columnas de la matriz en la que se almacenaran los digitos
        int totalColum = (columDig * numeroImp.length())
                + (espacio * numeroImp.length());

        // crea matriz para almacenar los numero a imprimir
        matrizImpr = new String[filasDig][totalColum];

        
        for (char digito : digitos) {
            
            num = new NumeroLCD(filasDig,columDig);   
            
            //Valida que el caracter sea un digito
            if( ! Character.isDigit(digito))
            {
                throw new IllegalArgumentException("Caracter " + digito
                    + " no es un digito");
            }
            int numero = Integer.parseInt(String.valueOf(digito));
            adicionarDigito(numero);
            num.crearNum();
            numeros.add(num);
        }
        
            imprimirNumero(espacio);
       
    }
    
    /**
     * Metodo para la impresión del número completo
     * @param espacio espacio que se debe mantener entre un numero y otro
     */
    public void imprimirNumero(int espacio){
      
        for(int i = 0; i < numeros.get(0).getFilas(); i++){
            
           for(int j = 0; j < numeros.size(); j++){
               
               String [][] res = numeros.get(j).getNum();
               
                    for(int c = 0; c < numeros.get(j).getColumnas(); c++){
                            System.out.print(res[i][c]);
                    }
                    
            }
            System.out.println();
        }
        
    }

     /**
     *
     * Metodo encargado de procesar la entrada que contiene el size del segmento
     * de los digitos y los digitos a imprimir
     *
     * @param comando Entrada que contiene el size del segmento de los digito
     * y el numero a imprimir
     * @param espacioDig Espacio Entre digitos
     */  
    public void procesar(String comando, int espacioDig) throws Exception {
        
        String[] parametros;
        
        int tam;

        if (!comando.contains(",")) {
            throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene caracter ,");
        }
        
        //Se hace el split de la cadena
        parametros = comando.split(",");
        
        //Valida la cantidad de parametros
        if(parametros.length>2)
        {
           throw new IllegalArgumentException("Cadena " + comando
                    + " contiene mas caracter ,"); 
        }
        
        //Valida la cantidad de parametros
        if(parametros.length<2)
        {
           throw new IllegalArgumentException("Cadena " + comando
                    + " no contiene los parametros requeridos"); 
        }
        
        //Valida que el parametro size sea un numerico
        if(isNumeric(parametros[0]))
        {
            tam = Integer.parseInt(parametros[0]);
            
            // se valida que el size este entre 1 y 10
            if(tam <1 || tam >10)
            {
                throw new IllegalArgumentException("El parametro size ["+tam
                        + "] debe estar entre 1 y 10");
            }
        }
        else
        {
            throw new IllegalArgumentException("Parametro Size [" + parametros[0]
                    + "] no es un numero");
        }

        // Crea la matriz con el número completo
        crearNumero(tam, parametros[1],espacioDig);

    }

    /**
     *
     * Metodo encargado de validar si una cadena es numerica
     *
     * @param cadena Cadena
     */  
    static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("Formato del número: "+ex.toString());
            return false;
        }
    }

}
