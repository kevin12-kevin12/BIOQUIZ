/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import java.util.StringTokenizer;

/**
 *
 * @author kevin navarro garro
 */
public class RespuestasM {
    
   String[] respuestas ={
       "2600",
       "578",
       "-79",
       "7820",
       "404",
       "118",
       "266",
       "377",
       "20400",
       "748",
   };
   
   String[] boton={
       "2600,578,118,266",//1
       "748,578,377.118",//2
       "118,377,-79,266",//3
       "20400,2600,748,7820",//4
       "404,266,748,377",//1
       "266,118,748,377",//2
       "748,188,266,377",//3
       "748.578,266,377",//4
       "20400,2600,7820,,748",//1
       "578,748,266,404"//2
   };
   
   public String getrespuestas(int posicion){
   return respuestas[posicion];
   }
   
   public String[] separador(String cadena,String separador){
       StringTokenizer token=new StringTokenizer(cadena,separador);
   
        String[] a = new String[10];
        int i=0;
        while(token.hasMoreTokens()){
        a[i]=token.nextToken();
        i++;
        }
   
        return a;
   }
   
   public String[] setrespuestas(int posicion){
   String s1= boton[posicion];
   String[] s2= separador(s1,",");
   
   return s2;
   }
   
    
}
