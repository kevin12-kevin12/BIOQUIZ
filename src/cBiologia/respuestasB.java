/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cBiologia;

import java.util.StringTokenizer;

/**
 *
 * @author kevin navarro garro
 */
public class respuestasB {
    
    String[] respuestasb={
    
        "Cerebelo","Cerebro","Bulbo Raquídeo","Medula espinal",//1
        "Tejidos","Neuronas","Meningues","Liquido Cefalo Raquedeo",//3
        "Cerebro","Bulbo Raquideo","Cerebelo","Todas las obciones",//4
        "Oxitocina","Tiroxina","Prolactina","Luteinizante",//4
        "Hipotálamo","Amígdala cerebral","Sistema límbico","Cerebro",//1
        "Pene","Testiculos","Escroto","Epididimo",//2
        "Gen","Fenotipo","Genotipo","Cariotipo",//3
        "Calcio","Sodio","Carbono","Oxigeno",//1
        "Proteínas","Carbohidratos","Lípidos","ADN",//4
        "Queratina","Elastica","Colageno","Caseina",//1

    };
    
    
    String[] boton={
        "Cerebelo,Cerebro,Bulbo raquideo,Medula espinal",//1
        "Tejidos,Meningues,Neuronas,Liquido Cefalo Raquedeo",//2
        "Cerebro,Bulbo raquideo,Todas las obciones,Cerebelo",//3
        "Oxitocina,Tiroxina,Prolactina,Luteinizante",//4
        "Hipotálamo,Amígdala cerebral,Sistema límbico,Cerebro",//1
        "Pene,Testiculos,Escroto,Epididimo",//2
        "Gen,Fenotipo,Genotipo,Cariotipo",//3
        "Sodio,Carbono,Oxigeno,Calcio",//4
        "ADN,Proteínas,Carbohidratos,Lípidos",//1
        "Elastica,Queratina,Colageno,Caseina"//2
    
    };
    
    
    public String getRespuestas(int posicion){
    return respuestasb[posicion];}
    
    public String[] separador(String cadena,String Separador){
        StringTokenizer token= new StringTokenizer(cadena,Separador);
        
        
        String[] a= new String[10];
        int i=0;
        
        while(token.hasMoreTokens()){
             a[i]=token.nextToken();
             i++;
             }
        return a;
    }
    
    public String[] setRespuestasB(int posicion){
    String s1=boton[posicion];
    String[] s2= separador(s1,",");
    
    
    return s2;
    }
    
    
}
