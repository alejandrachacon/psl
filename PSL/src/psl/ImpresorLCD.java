package psl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImpresorLCD {
    // TODO code application logic here
    //String entrada = JOptionPane.showInputDialog("Digite el numero");
    private int size;
    // Calcula el numero de filasDig
    private int filasDig;
    private int columDig;
    private int totalFilas;
    private int totalColum;
    private NumeroLCD num;

    /**
     *
     * Metodo encargado de definir los segmentos que componen un digito y
     * a partir de los segmentos adicionar la representacion del digito a la matriz
     *
     * @param numero Digito
     */
    private void adicionarDigito(int numero) {

        inicializarNumero(size);
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
     * Metodo encargado de imprimir un numero
     *
     * @param size Tamaño Segmento Digitos
     * @param numeroImp Numero a Imprimir
     * @param espacio Espacio Entre digitos
     */    
    private void inicializarNumero(int size) 
    {
        int pivotX = 0;
        char[] digitos;
        // Calcula el numero de filas cada digito
        int filasDig = (2 * size) + 3;
        // Calcula el numero de columna de cada digito
        int columDig = size + 2;

        num = new NumeroLCD(size,filasDig,columDig);

        

        // crea el arreglo de digitos
        digitos = numeroImp.toCharArray();


        for (char digito : digitos) {
            
            //Valida que el caracter sea un digito
            if( ! Character.isDigit(digito))
            {
                throw new IllegalArgumentException("Caracter " + digito
                    + " no es un digito");
            }

            int numero = Integer.parseInt(String.valueOf(digito));
            adicionarDigito(numero);
            for(int i = 0; i<espacio; i++)
            {
                System.out.println(" ");
            }

            num.imprimir();
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
    public void procesar(String comando, int espacioDig) {
        
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

        // Realiza la impresion del numero
        imprimirNumero(tam, parametros[1],espacioDig);

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
            return false;
        }
    }

}
