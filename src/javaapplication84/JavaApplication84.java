/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication84;

import javax.swing.JOptionPane;

/**
 *
 * @author danilus
 */
public class JavaApplication84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] a,b;
            int f; //Filas
            int c; //Columnas
            int s;
            String salida = "";
            String salida2 = "";
            String sum = "";
                 
        //Entrada de datos
          f = 3;
          c=3;
        //Procesamiento
         a = new int[f][c];
         b = new int[f][c];
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                a[i][j] = (int) (Math.random()*9+1);
                b[i][j] = (int) (Math.random()*9+1);
            }
        }
  
          for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
              sum= sum+ sumar (a[i][j], b[i][j])+ "  ";
            } 
          sum  = sum + "\n";
        }
        
          //Salida de datos
       for (int i = 0; i < a.length; i++) 
          {
            for (int j = 0; j < a[0].length; j++) 
        {
          salida = salida + a[i][j] + "   ";
          salida2= salida2+ b[i][j] + "   ";
        }  
           salida = salida + "\n";
           salida2 = salida2 + "\n";
        }
        //Salida
       JOptionPane.showMessageDialog(null, "MATRIZ N°1"+"\n"+salida +"\n"+ "MATRIZ N°2"+"\n"+salida2 +"\n"+ "La suma de LA MATRIZN|:" +"\n"+sum);
    }

    //------------------
    //Metodos
    //------------------
     private static int sumar(int a, int b)
    
     {
        //Variables locales
        int sumar;
        
        //Proceso
         sumar= a + b;
        
        //Salida
        return sumar;
    }
}

    
 
