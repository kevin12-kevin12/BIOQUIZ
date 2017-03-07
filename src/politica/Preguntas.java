/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politica;

/**
 *
 * @author kevin navarro garro
 */
public class Preguntas {
    String[] preguntas={
      
      "¿Cuando fue fundado el partido de Leberacion Nacional?",
      "¿Cuando fue fundado el partido de Accion Cuidadana?",
      "¿Cuando fue fundado el partido de Frente Amplio?",
      "¿Cuando fue fundado el partido de Unidad Social Cristiana?",
      "¿Cuando fue fundado el partido de Movimiento Libertario?",
      "¿Cuales son los colores que representan la bandera del partido Liberacion Nacional?",
      "¿Colores que representa el partido de Accion Ciudadana?",
      "¿Colores que representa el partido de Frente Amplio?",
      "¿Colores que representa el partido Unidad Social Cristiana?",
      "¿Colores que representa el partido Movimiento Libertario?"
  };  
  
  public String getPregunta(int posicion){
  return preguntas[posicion];
  }
    
}
