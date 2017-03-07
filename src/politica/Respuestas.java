/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politica;

import java.util.StringTokenizer;

/**
 *
 * @author kevin navarro garro
 */
public class Respuestas {
    String[] respuestas={
        
        "12 de Octubre de 1951",
        "3 de Diciembre de 2000",
        "16 de Octubre de 2004",
        "17 de Diciembre de 1983",
        "2 de Diciembre de 1994",
        "Verde y Blanco",
        "Amarillo y Rojo",
        "Amarillo y Negro",
        "Rojo y Azul",
        "Rojo y Blanco"
        
            
    
    };
    
    String[] boton={
    "12 de Octubre de 1991,16 de Octubre de 2004,17 de Diciembre de 1983,2 de Diciembre de 1994",//1
    "2 de Diciembre de 1994 ,3 de Diciembre de 2000,12 de Octubre de 1951,17 de Diciembre de 1983",//2
    "3 de Diciembre de 2000,2 de Diciembre de 1994,16 de Octubre de 2004,12 de Octubre de 1951",//3
    "3 de Diciembre de 2000,12 de Octubre de 1991,2 de Diciembre de 1994,17 de Diciembre de 1983",//4
    "2 de Diciembre de 1994,17 de Diciembre de 1983,12 de Octubre de 1991,16 de Octubre de 2004",//1
    "Rojo y Blanco,Verde y Blanco,Rojo y Azul,Amarillo y Negro",//2
    "Verde y Blanco,Rojo y Blanco,Amarillo y Rojo,Rojo y Azul",//3
    "Rojo y Azul,Verde y Blanco,Rojo y Blanco,Amarillo y Negro",//4
    "Rojo y Azul,Rojo y Blanco,Verde y Blanco,Amarillo y Rojo",//1
    "Amarillo y Negro,Rojo y Blanco,Amarillo y Rojo,Verde y Blanco"//2
    

    
    };
    
    
    public String getrespuesta(int posicion){
    
        return respuestas[posicion];
    }
    
   public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] a= new String[10];
        int i = 0;
        
        while(token.hasMoreTokens()){
        a[i]= token.nextToken();// de esta manera se obtine el token
        i++;
        
        }
        
        return a;
        
    }
    
    
    public String[] setRespuestas(int posicion){
    String s1 = boton[posicion];
    String[] s2 = separar(s1,",");
    
    return s2;
    }
    
}
