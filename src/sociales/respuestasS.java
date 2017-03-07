/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociales;

import java.util.StringTokenizer;

/**
 *
 * @author kevin navarro garro
 */
public class respuestasS {
    
    String[] RespuestasS={
        
        "Temperatura",
        "Precipitación",
        "Viento",
        "Humedad Atmosférica",
        "Presición Atmosférica",
        "Termómetro",
        "Pluviómetro",
        "Anemómetro",
        "Higrómetro",
        "Barómetro"
    };
    
    String[] boton={
    
      "Temperatura,Precipitacion,Viento,Humedad Atmosférica",//1
      "Viento,Precipitacion,Temperatura,Presición Atmosférica",//2
      "Temperatura,Presipitación,Viento,Humedad Atmosférica",//3
      "Viento,Temperatura,Precipitacion,Humedad Atmosférica",//4
      "Presición Atmosférica,Viento,Temperatura,Presipitación",//1
      "Barómetro,Termómetro,Anemómetro,Higrómetro",//2
      "Barómetro,Termómetro,Pluviómetro,Anemómetro",//3
      "Barómetro,Termómetro,Pluviómetro,Anemómetro",//4
      "Higrómetro,Barómetro,Termómetro,Pluviómetro",//1
      "Barómetro,Termómetro,Pluviómetro,Anemómetro"//2
    };
    
    public String getrespuestasS(int posicion){
    return RespuestasS[posicion];}
    
    public String[] separador(String cadena, String seprador){
        StringTokenizer token=new StringTokenizer(cadena, seprador);
        
        String[] a = new String[10];
        int i =0;
        
        while(token.hasMoreTokens()){
        a[i]=token.nextToken();
        i++;
        
        }
        return a;
        
    }
    
    public String[] setrespuestasS(int posicion){
    String s1=boton[posicion];
    String[] s2=separador(s1,",");
    
     return s2;
    }
   
    
    
}
