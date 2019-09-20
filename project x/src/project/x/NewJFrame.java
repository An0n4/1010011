package project.x;

/**
 *
 * @author Ian
 */
public class NewJFrame extends javax.swing.JFrame {

    int num1;
    int num2;
    float results;
    String operations;

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonIX = new javax.swing.JButton();
        jButtonIV = new javax.swing.JButton();
        jButtonII = new javax.swing.JButton();
        jButtonIII = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonVI = new javax.swing.JButton();
        jButtonVII = new javax.swing.JButton();
        jButtonVIII = new javax.swing.JButton();
        jButtonMINUS = new javax.swing.JButton();
        jButtonDIVISION = new javax.swing.JButton();
        jButtonEQUALS = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        jButtonMULTIPLY = new javax.swing.JButton();
        jButtonSUM = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("DFKai-SB", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("    CALCULATOR");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonIX.setText("9");
        jButtonIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIXActionPerformed(evt);
            }
        });

        jButtonIV.setText("4");
        jButtonIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIVActionPerformed(evt);
            }
        });

        jButtonII.setText("2");
        jButtonII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIIActionPerformed(evt);
            }
        });

        jButtonIII.setText("3");
        jButtonIII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIIIActionPerformed(evt);
            }
        });

        jButtonV.setText("5");
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });

        jButtonVI.setText("6");
        jButtonVI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIActionPerformed(evt);
            }
        });

        jButtonVII.setText("7");
        jButtonVII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIIActionPerformed(evt);
            }
        });

        jButtonVIII.setText("8");
        jButtonVIII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIIIActionPerformed(evt);
            }
        });

        jButtonMINUS.setText("-");
        jButtonMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMINUSActionPerformed(evt);
            }
        });

        jButtonDIVISION.setText("/");
        jButtonDIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDIVISIONActionPerformed(evt);
            }
        });

        jButtonEQUALS.setText("=");
        jButtonEQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEQUALSActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        jButtonMULTIPLY.setText("*");
        jButtonMULTIPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMULTIPLYActionPerformed(evt);
            }
        });

        jButtonSUM.setText("+");
        jButtonSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUMActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonVII, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonII, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonIII, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonIV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonVIII, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jButtonEQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonIX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jButtonVI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMINUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDIVISION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMULTIPLY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtDisplay)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonIII, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSUM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonII, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonIV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonVI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonVIII, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonVII, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonIX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonDIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMULTIPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Enternumber = txtDisplay.getText() + jButton1.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMINUSActionPerformed
        num1 = Integer.parseInt(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jButtonMINUSActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String Enternumber = txtDisplay.getText() + jButton0.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonEQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEQUALSActionPerformed
        num2 = Integer.parseInt(txtDisplay.getText());
        if (operations.equals("+")) {
            results = num1 + num2;
        }

        if (operations.equals("*")) {
            results = num1 * num2;
        }

        if (operations.equals("-")) {
            results = num1 - num2;
        }

        if (operations.equals("/")) {
            results = num1 / num2;
        }

        txtDisplay.setText(results + " ");
    }//GEN-LAST:event_jButtonEQUALSActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        num2 = 0;
        txtDisplay.setText("0");
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void jButtonIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIVActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonIV.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonIVActionPerformed

    private void jButtonIIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIIIActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonIII.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonIIIActionPerformed

    private void jButtonVIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIIActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonVII.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonVIIActionPerformed

    private void jButtonVIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonVI.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonVIActionPerformed

    private void jButtonIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIXActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonIX.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonIXActionPerformed

    private void jButtonMULTIPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMULTIPLYActionPerformed
        num1 = Integer.parseInt(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jButtonMULTIPLYActionPerformed

    private void jButtonSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUMActionPerformed
        num1 = Integer.parseInt(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jButtonSUMActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonV.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonVIIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIIIActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonVIII.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonVIIIActionPerformed

    private void jButtonDIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDIVISIONActionPerformed
        num1 = Integer.parseInt(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jButtonDIVISIONActionPerformed

    private void jButtonIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIIActionPerformed
        String Enternumber = txtDisplay.getText() + jButtonII.getText();
        txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonIIActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        num2 = 0;
        txtDisplay.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonSUBTRACTActionPerformed(java.awt.event.ActionEvent evt) {
        num1 = Integer.parseInt(txtDisplay.getText());
        txtDisplay.setText("-");
        operations = "-";
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDIVISION;
    private javax.swing.JButton jButtonEQUALS;
    private javax.swing.JButton jButtonII;
    private javax.swing.JButton jButtonIII;
    private javax.swing.JButton jButtonIV;
    private javax.swing.JButton jButtonIX;
    private javax.swing.JButton jButtonMINUS;
    private javax.swing.JButton jButtonMULTIPLY;
    private javax.swing.JButton jButtonSUM;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonVI;
    private javax.swing.JButton jButtonVII;
    private javax.swing.JButton jButtonVIII;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
