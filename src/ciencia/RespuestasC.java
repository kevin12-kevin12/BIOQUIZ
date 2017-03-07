/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciencia;

import java.util.StringTokenizer;

/**
 *
 * @author kevin navarro garro
 */
public class RespuestasC {
    
    String[] respuestasC={
        
        "Todas las bebidas Gaseosas",
        "Leche en Agua",
        "Sal en Agua",
        "S",
        "P",
        "Ca",
        "Al",
        "Li",
        "Zn",
        "Ag",
        "Chocale en leche", 
        "Cloro diluido en el agua de las piscinas"   
            
    
    };
    
    
    
    String[] boton={
       
        "Todas las  bebidas Gaseosas,Leche en Agua,Sal en Agua,Chocolate en leche",//1
        "Sal en Agua,Leche en Agua,Todas las bebidas Gaseosas,Chocalate en leche",//2
        "Leche en Agua,Todas las bebidas Gaseosas,Sal Agua,Cloro diluido en el agua de las piscinas",//3
        "P,Al,Li,S",//4
        "P,S,Ca,Al",//1
        "S,Ca,Ag,Zn",//2
        "P,S,Al,Ca",//3
        "Ag,Ca,S,Li",//4
        "Zn,S,P,Ca",//1
        "P,Ag,S,Al"//2    
  };
    public String getrespuestas(int posicion){
    return respuestasC[posicion];}
    
    
    
    
    public String[] separar(String cadena,String separador){
        StringTokenizer token= new StringTokenizer(cadena, separador);
        String[] a = new String[10];
        int i=0;
        
        while(token.hasMoreTokens()){
            a[i]= token.nextToken();
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
