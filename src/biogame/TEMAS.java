/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biogame;

import java.util.Random;
import politica.*;
import matematica.*;
import ciencia.*;
import sociales.*;
import cBiologia.*;
public class TEMAS extends javax.swing.JFrame {

    /**
     * Creates new form TEMAS
     */
    public TEMAS() {
        initComponents();
        
        setTitle("BIOQUIZ");
        setLocationRelativeTo(null);
        setResizable(false);
        
        pregunta.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        
        jugador1.setVisible(true);
        jugador2.setVisible(false);
        
        
        
    }
  int jd =0;
  Random dato= new Random();
  int posicion;
  int posicionM;
  int posicionC;
  int posicionS;
  int posicionB;
  int j;
  int Jugador1=0;
  int Jugador2=0;
  int acumPolitica1=0;
  int acumPolitica2=0;
  int acumMatematica1=0;
  int acumMatematica2=0;
  int acumCiencia1=0;
  int acumCiencia2=0;
  int acumSociales1=0;
  int acumSociales2=0;
  int acumBiologia1=0;
  int acumBiologia2=0;
  Preguntas p=new Preguntas();
  Respuestas r=new Respuestas();
  PreguntasM pm=new PreguntasM();
  RespuestasM rm=new RespuestasM();
  PreguntasC pc=new PreguntasC();
  RespuestasC rc= new RespuestasC();
  preguntasS ps=new preguntasS();
  respuestasS rs=new respuestasS();
  preguntasB pb= new preguntasB();
  respuestasB rb=new respuestasB();
  
  
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        turno = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        Politica = new javax.swing.JButton();
        matematica = new javax.swing.JButton();
        Ciencia = new javax.swing.JButton();
        Estudios = new javax.swing.JButton();
        Biologia = new javax.swing.JButton();
        T6 = new javax.swing.JButton();
        T7 = new javax.swing.JButton();
        T8 = new javax.swing.JButton();
        T9 = new javax.swing.JButton();
        T10 = new javax.swing.JButton();
        pregunta = new javax.swing.JLabel();
        P1 = new javax.swing.JButton();
        P2 = new javax.swing.JButton();
        P3 = new javax.swing.JButton();
        P4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        turno.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        turno.setText("TURNO DE:");

        jugador1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jugador1.setText("1");

        jugador2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jugador2.setText("2");

        Politica.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        Politica.setText("Politica");
        Politica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliticaActionPerformed(evt);
            }
        });

        matematica.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        matematica.setText("Matematica");
        matematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matematicaActionPerformed(evt);
            }
        });

        Ciencia.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        Ciencia.setText("Ciencia");
        Ciencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CienciaActionPerformed(evt);
            }
        });

        Estudios.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        Estudios.setText("Estudios S");
        Estudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiosActionPerformed(evt);
            }
        });

        Biologia.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        Biologia.setText("Bioligia");
        Biologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiologiaActionPerformed(evt);
            }
        });

        T6.setText("T6");
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });

        T7.setText("T7");
        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });

        T8.setText("T8");
        T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T8ActionPerformed(evt);
            }
        });

        T9.setText("T9");
        T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T9ActionPerformed(evt);
            }
        });

        T10.setText("T10");
        T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T10ActionPerformed(evt);
            }
        });

        pregunta.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        pregunta.setText("Pregunta");

        P1.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        P1.setText("P1");
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        P2.setText("P2");
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });

        P3.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        P3.setText("P3");
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });

        P4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        P4.setText("P4");
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Politica, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(matematica, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ciencia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Estudios, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Biologia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(T9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Politica)
                    .addComponent(matematica)
                    .addComponent(Ciencia)
                    .addComponent(Estudios)
                    .addComponent(Biologia)
                    .addComponent(T6)
                    .addComponent(T7)
                    .addComponent(T8)
                    .addComponent(T9)
                    .addComponent(T10))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void PoliticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliticaActionPerformed
        pregunta.setVisible(true);P1.setVisible(true);P2.setVisible(true);
        P3.setVisible(true);P4.setVisible(true);
        Politica.setVisible(false);matematica.setVisible(false);
        Ciencia.setVisible(false);
        Estudios.setVisible(false);
        Biologia.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        for(j=0;j<=10;j++){
        posicion=dato.nextInt(10);   
        pregunta.setText(p.getPregunta(posicion));
        String[] a=r.setRespuestas(posicion);
        P1.setText(a[0]);P2.setText(a[1]);P3.setText(a[2]);P4.setText(a[3]); } 
    }//GEN-LAST:event_PoliticaActionPerformed

    private void matematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matematicaActionPerformed
       pregunta.setVisible(true);P1.setVisible(true);P2.setVisible(true);
       P3.setVisible(true);P4.setVisible(true);
        Politica.setVisible(false);matematica.setVisible(false);
        Ciencia.setVisible(false);
        Estudios.setVisible(false);
        Biologia.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        for(j=0;j<=10;j++){
        posicionM=dato.nextInt(10);
        pregunta.setText(pm.getpreguntas(posicionM));
        String[] a=rm.setrespuestas(posicionM);
        P1.setText(a[0]);P2.setText(a[1]);P3.setText(a[2]);P4.setText(a[3]); } 
    }//GEN-LAST:event_matematicaActionPerformed

    private void CienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CienciaActionPerformed
        pregunta.setVisible(true);P1.setVisible(true);P2.setVisible(true);
       P3.setVisible(true);P4.setVisible(true);
        Politica.setVisible(false);matematica.setVisible(false);
        Ciencia.setVisible(false);
        Estudios.setVisible(false);
        Biologia.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        for(j=0;j<10;j++){
            posicionC=dato.nextInt(10);
            pregunta.setText(pc.getPreguntasC(posicionC));
            String[] a=rc.setRespuestas(posicionC);
            P1.setText(a[0]);P2.setText(a[1]);P3.setText(a[2]);P4.setText(a[3]);
        }
        
    }//GEN-LAST:event_CienciaActionPerformed

    private void EstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiosActionPerformed
        pregunta.setVisible(true);P1.setVisible(true);P2.setVisible(true);
       P3.setVisible(true);P4.setVisible(true);
        Politica.setVisible(false);matematica.setVisible(false);
        Ciencia.setVisible(false);
        Estudios.setVisible(false);
        Biologia.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        for(j=0;j<10;j++){
          posicionS=dato.nextInt(10);
          pregunta.setText(ps.getPreguntas(posicionS));
          String[] a = rs.setrespuestasS(posicionS);
          P1.setText(a[0]);P2.setText(a[1]);P3.setText(a[2]);P4.setText(a[3]);
        }
    }//GEN-LAST:event_EstudiosActionPerformed

    private void BiologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiologiaActionPerformed
       pregunta.setVisible(true);P1.setVisible(true);P2.setVisible(true);
       P3.setVisible(true);P4.setVisible(true);
        Politica.setVisible(false);matematica.setVisible(false);
        Ciencia.setVisible(false);
        Estudios.setVisible(false);
        Biologia.setVisible(false);
        T6.setVisible(false);
        T7.setVisible(false);
        T8.setVisible(false);
        T9.setVisible(false);
        T10.setVisible(false);
        for(j=0;j<10;j++){
            posicionB=dato.nextInt(10);
            pregunta.setText(pb.getPreguntasB(posicionB));
            String[] a = rb.setRespuestasB(posicionB);
            P1.setText(a[0]);P2.setText(a[1]);P3.setText(a[2]);P4.setText(a[3]);
        }
        
    }//GEN-LAST:event_BiologiaActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T6ActionPerformed

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T7ActionPerformed

    private void T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T8ActionPerformed

    private void T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T9ActionPerformed

    private void T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T10ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        jd++;
        pregunta.setVisible(false);P1.setVisible(false);P2.setVisible(false);
        P3.setVisible(false);P4.setVisible(false);
        Politica.setVisible(true);matematica.setVisible(true);        
        Ciencia.setVisible(true);
        Estudios.setVisible(true);
        Biologia.setVisible(true);
        T6.setVisible(true);
        T7.setVisible(true);
        T8.setVisible(true);
        T9.setVisible(true);
        T10.setVisible(true);
        if(jd%2==0){
            if(posicion==1||posicion==5||posicion==9){Jugador1++; acumPolitica1++;}
            if(posicionM==1||posicionM==5||posicionM==9){Jugador1++;acumMatematica1++;}
            if(posicionC==1||posicion==5||posicionC==9){Jugador1++;acumCiencia1++;}
            if(posicionS==1||posicionS==5||posicionS==9){Jugador1++;acumSociales1++;}
            if(posicionB==1||posicionB==5||posicionB==9){Jugador1++;acumBiologia1++;}
            
            jugador1.setVisible(true);jugador2.setVisible(false);   }
            else if(jd%2!=0){       
               if(posicion==1||posicion==5||posicion==9){Jugador2++;acumPolitica2++;}
               if(posicionM==1||posicionM==5||posicionM==9){Jugador2++;acumMatematica2++;}   
               if(posicionC==1||posicionC==5||posicionC==9){Jugador2++;acumCiencia2++;}
               if(posicionS==1||posicionS==5||posicionS==9){Jugador2++;acumSociales2++;}
               if(posicionB==1||posicionB==5||posicionB==9){Jugador2++;acumBiologia2++;}
               jugador1.setVisible(false);jugador2.setVisible(true);    }              
    }//GEN-LAST:event_P1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        jd++;
        pregunta.setVisible(false);P1.setVisible(false);P2.setVisible(false);
        P3.setVisible(false);P4.setVisible(false);
        Politica.setVisible(true);matematica.setVisible(true);        
        Ciencia.setVisible(true);
        Estudios.setVisible(true);
        Biologia.setVisible(true);
        T6.setVisible(true);
        T7.setVisible(true);
        T8.setVisible(true);
        T9.setVisible(true);
        T10.setVisible(true);
        if(jd%2==0){
            if(posicion==2||posicion==6||posicion==10){Jugador1++; acumPolitica1++;}
            if(posicionM==2||posicionM==6||posicion==10){Jugador1++; acumMatematica1++;}
            if(posicionC==2||posicion==6||posicion==10){Jugador1++; acumCiencia1++;}
            if(posicionS==2||posicionS==6||posicionS==10){Jugador1++;acumSociales1++;}
            if(posicionB==2||posicionB==6||posicionB==10){Jugador1++;acumBiologia1++;}
            jugador1.setVisible(true);jugador2.setVisible(false);   }
        else if(jd%2!=0){
            if(posicion==2||posicion==6||posicion==10){Jugador2++; acumPolitica2++;}
            if(posicionM==2||posicionM==6||posicionM==10){Jugador2++; acumMatematica2++;}    
            if(posicionC==2||posicionC==6||posicionC==10){Jugador2++; acumCiencia2++;}
            if(posicionS==2||posicionS==6||posicionS==10){Jugador2++;acumSociales2++;}
            if(posicionB==2||posicionB==6||posicion==10){Jugador2++;acumBiologia2++;}
            jugador1.setVisible(false);jugador2.setVisible(true);    }
    }//GEN-LAST:event_P2ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
        jd++;
        pregunta.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);

        Politica.setVisible(true);
        matematica.setVisible(true);
        Ciencia.setVisible(true);
        Estudios.setVisible(true);
        Biologia.setVisible(true);
        T6.setVisible(true);
        T7.setVisible(true);
        T8.setVisible(true);
        T9.setVisible(true);
        T10.setVisible(true);
        if(jd%2==0){
            if(posicion==3||posicion==7){Jugador1++;acumPolitica1++;}
            if(posicionM==3||posicionM==7){Jugador1++;acumMatematica1++;}
            if(posicionC==3||posicionC==7){Jugador1++;acumCiencia1++;}
            if(posicionS==3||posicionS==7){Jugador1++;acumSociales1++;}
            if(posicionB==3||posicionB==7){Jugador1++;acumBiologia1++;}
            jugador1.setVisible(true);jugador2.setVisible(false);
            
        }else if(jd%2!=0){
            if(posicion==3||posicion==7){Jugador2++;acumPolitica2++;}
            if(posicionM==3||posicionM==7){Jugador2++;acumMatematica2++;}
            if(posicionC==3||posicionC==7){Jugador2++;acumCiencia2++;}
            if(posicionS==3||posicionS==7){Jugador2++;acumSociales2++;}
            if(posicionB==3||posicionB==7){Jugador2++;acumBiologia2++;}
            jugador1.setVisible(false);jugador2.setVisible(true);  
        }
    }//GEN-LAST:event_P3ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed
        jd++;
        pregunta.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        Politica.setVisible(true);
        matematica.setVisible(true);
        Ciencia.setVisible(true);
        Estudios.setVisible(true);
        Biologia.setVisible(true);
        T6.setVisible(true);
        T7.setVisible(true);
        T8.setVisible(true);
        T9.setVisible(true);
        T10.setVisible(true);
        if(jd%2==0){
            if(posicion==4||posicion==8){Jugador1++;acumPolitica1++;}
            if(posicionM==4||posicionM==8){Jugador1++;acumMatematica1++;}
            if(posicionC==4||posicionC==8){Jugador1++;acumCiencia1++;}
            if(posicionS==4||posicionS==8){Jugador1++;acumSociales1++;}
            if(posicionB==4||posicionB==8){Jugador1++;acumBiologia1++;}
            jugador1.setVisible(true);jugador2.setVisible(false);
        }else if(jd%2!=0){
            if(posicion==4||posicion==8){Jugador2++;acumPolitica2++;}
            if(posicionM==4||posicion==8){Jugador2++;acumMatematica2++;}
            if(posicionC==4||posicion==8){Jugador2++;}acumCiencia2++;
            if(posicionS==4||posicionS==8){Jugador2++;acumSociales2++;}
            if(posicionB==4||posicionB==8){Jugador2++;acumBiologia2++;}
            jugador1.setVisible(false); jugador2.setVisible(true);   
        }
    }//GEN-LAST:event_P4ActionPerformed
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TEMAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEMAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEMAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEMAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEMAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Biologia;
    private javax.swing.JButton Ciencia;
    private javax.swing.JButton Estudios;
    private javax.swing.JButton P1;
    private javax.swing.JButton P2;
    private javax.swing.JButton P3;
    private javax.swing.JButton P4;
    private javax.swing.JButton Politica;
    private javax.swing.JButton T10;
    private javax.swing.JButton T6;
    private javax.swing.JButton T7;
    private javax.swing.JButton T8;
    private javax.swing.JButton T9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jugador1;
    public static javax.swing.JLabel jugador2;
    private javax.swing.JButton matematica;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}