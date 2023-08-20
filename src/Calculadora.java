
public class Calculadora extends javax.swing.JFrame {

    public float primernumero;
    public float segundonumero;
    public String operador;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visor = new javax.swing.JLabel();
        cleaningvisor = new javax.swing.JToggleButton();
        buttondivision = new javax.swing.JToggleButton();
        buttonmultiplicacion = new javax.swing.JToggleButton();
        buttonmenos = new javax.swing.JToggleButton();
        siete = new javax.swing.JToggleButton();
        ocho = new javax.swing.JToggleButton();
        nueve = new javax.swing.JToggleButton();
        buttonmas = new javax.swing.JToggleButton();
        cuatro = new javax.swing.JToggleButton();
        cinco = new javax.swing.JToggleButton();
        seis = new javax.swing.JToggleButton();
        uno = new javax.swing.JToggleButton();
        dos = new javax.swing.JToggleButton();
        tres = new javax.swing.JToggleButton();
        cero = new javax.swing.JToggleButton();
        buttondecimal = new javax.swing.JToggleButton();
        buttonnigual = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));

        visor.setBackground(new java.awt.Color(255, 255, 255));
        visor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        visor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        visor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));
        visor.setOpaque(true);

        cleaningvisor.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        cleaningvisor.setText("c");
        cleaningvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleaningvisorActionPerformed(evt);
            }
        });

        buttondivision.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttondivision.setText("/");
        buttondivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondivisionActionPerformed(evt);
            }
        });

        buttonmultiplicacion.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttonmultiplicacion.setText("*");
        buttonmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmultiplicacionActionPerformed(evt);
            }
        });

        buttonmenos.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttonmenos.setText("-");
        buttonmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmenosActionPerformed(evt);
            }
        });

        siete.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        buttonmas.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttonmas.setText("+");
        buttonmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmasActionPerformed(evt);
            }
        });

        cuatro.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        uno.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cero.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        buttondecimal.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttondecimal.setText(",");
        buttondecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondecimalActionPerformed(evt);
            }
        });

        buttonnigual.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        buttonnigual.setText("=");
        buttonnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnigualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cleaningvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttondivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonmas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttondecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttondivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleaningvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttondecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonnigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttondivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondivisionActionPerformed
        this.primernumero = Float.parseFloat(this.visor.getText());
        this.operador = "/";
        this.visor.setText("");
    }//GEN-LAST:event_buttondivisionActionPerformed

    private void buttonmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmultiplicacionActionPerformed
        this.primernumero = Float.parseFloat(this.visor.getText());
        this.operador = "*";
        this.visor.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_buttonmultiplicacionActionPerformed

    private void buttonmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmenosActionPerformed
        this.primernumero = Float.parseFloat(this.visor.getText());
        this.operador = "-";
        this.visor.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_buttonmenosActionPerformed

    private void buttonmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmasActionPerformed
        this.primernumero = Float.parseFloat(this.visor.getText());
        this.operador = "+";
        this.visor.setText("");
    }//GEN-LAST:event_buttonmasActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        this.visor.setText(this.visor.getText() + "5");             // TODO add your handling code here:
    }//GEN-LAST:event_cincoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        this.visor.setText(this.visor.getText() + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_ceroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        this.visor.setText(this.visor.getText() + "1");        // TODO add your handling code here:
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        this.visor.setText(this.visor.getText() + "2");          // TODO add your handling code here:
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        this.visor.setText(this.visor.getText() + "3");         // TODO add your handling code here:
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        this.visor.setText(this.visor.getText() + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_cuatroActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        this.visor.setText(this.visor.getText() + "6");             // TODO add your handling code here:
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        this.visor.setText(this.visor.getText() + "7");          // TODO add your handling code here:
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed

        this.visor.setText(this.visor.getText() + "8");         // TODO add your handling code here:
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        this.visor.setText(this.visor.getText() + "9");         // TODO add your handling code here:
    }//GEN-LAST:event_nueveActionPerformed

    private void cleaningvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleaningvisorActionPerformed
        this.visor.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_cleaningvisorActionPerformed

    private void buttonnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnigualActionPerformed
        this.segundonumero = Float.parseFloat(this.visor.getText());
        switch (this.operador) {
            case "+":
                this.visor.setText(sincero(this.primernumero + this.segundonumero));
                break;
            case "-":
                this.visor.setText(sincero(this.primernumero - this.segundonumero));
                break;
            case "*":
                this.visor.setText(sincero(this.primernumero * this.segundonumero));
                break;
            case "/":if(this.segundonumero ==0) {this.visor.setText("No se puede dividir entre Cero");
                }
        
        
            else{
                this.visor.setText(sincero(this.primernumero/this.segundonumero));break;
            }
    }
    }//GEN-LAST:event_buttonnigualActionPerformed

    private void buttondecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondecimalActionPerformed
      if (!this.visor.getText().contains(".")) {
          this.visor.setText(this.visor.getText()+".");
      }
    }//GEN-LAST:event_buttondecimalActionPerformed
public String sincero(float resultado){
String retorno=""; 
retorno=Float.toString(resultado);
if(resultado%1==0){
    retorno=retorno.substring(0, retorno.length()-2);
    
}

return retorno; 
}

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
            java.util.logging.Logger.getLogger(Calculadora.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttondecimal;
    private javax.swing.JToggleButton buttondivision;
    private javax.swing.JToggleButton buttonmas;
    private javax.swing.JToggleButton buttonmenos;
    private javax.swing.JToggleButton buttonmultiplicacion;
    private javax.swing.JToggleButton buttonnigual;
    private javax.swing.JToggleButton cero;
    private javax.swing.JToggleButton cinco;
    private javax.swing.JToggleButton cleaningvisor;
    private javax.swing.JToggleButton cuatro;
    private javax.swing.JToggleButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton nueve;
    private javax.swing.JToggleButton ocho;
    private javax.swing.JToggleButton seis;
    private javax.swing.JToggleButton siete;
    private javax.swing.JToggleButton tres;
    private javax.swing.JToggleButton uno;
    private javax.swing.JLabel visor;
    // End of variables declaration//GEN-END:variables
}
