/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import javax.swing.JOptionPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author joaoc
 */
public class TelaCalculadora extends javax.swing.JFrame {

    double num1, num2, resultado;

    char operacao;

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();

        jPanel1.setFocusable(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_limpar1 = new javax.swing.JButton();
        bt_porcent = new javax.swing.JButton();
        bt_raiz = new javax.swing.JButton();
        tb_limpar = new javax.swing.JButton();
        bt_quatro = new javax.swing.JButton();
        bt_cinco = new javax.swing.JButton();
        bt_seis = new javax.swing.JButton();
        bt_multiplicar = new javax.swing.JButton();
        bt_sete = new javax.swing.JButton();
        bt_oito = new javax.swing.JButton();
        bt_nove = new javax.swing.JButton();
        bt_dividir = new javax.swing.JButton();
        bt_um = new javax.swing.JButton();
        bt_dois = new javax.swing.JButton();
        bt_tres = new javax.swing.JButton();
        bt_somar = new javax.swing.JButton();
        bt_zero = new javax.swing.JButton();
        bt_subtrair = new javax.swing.JButton();
        bt_igual = new javax.swing.JButton();
        bt_ponto = new javax.swing.JButton();
        bt_MoM = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_Tela = new javax.swing.JLabel();
        lb_Tela2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        setResizable(false);

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        bt_limpar1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_limpar1.setText("C");
        bt_limpar1.setMaximumSize(new java.awt.Dimension(40, 38));
        bt_limpar1.setMinimumSize(new java.awt.Dimension(40, 38));
        bt_limpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpar1ActionPerformed(evt);
            }
        });

        bt_porcent.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_porcent.setText("%");
        bt_porcent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_porcentActionPerformed(evt);
            }
        });

        bt_raiz.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_raiz.setText("√");
        bt_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_raizActionPerformed(evt);
            }
        });

        tb_limpar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tb_limpar.setText("CE");
        tb_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_limparActionPerformed(evt);
            }
        });

        bt_quatro.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_quatro.setText("4");
        bt_quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quatroActionPerformed(evt);
            }
        });

        bt_cinco.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_cinco.setText("5");
        bt_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cincoActionPerformed(evt);
            }
        });

        bt_seis.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_seis.setText("6");
        bt_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seisActionPerformed(evt);
            }
        });

        bt_multiplicar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_multiplicar.setText("X");
        bt_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiplicarActionPerformed(evt);
            }
        });

        bt_sete.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_sete.setText("7");
        bt_sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seteActionPerformed(evt);
            }
        });

        bt_oito.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_oito.setText("8");
        bt_oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_oitoActionPerformed(evt);
            }
        });

        bt_nove.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_nove.setText("9");
        bt_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_noveActionPerformed(evt);
            }
        });

        bt_dividir.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_dividir.setText("/");
        bt_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dividirActionPerformed(evt);
            }
        });

        bt_um.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_um.setText("1");
        bt_um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_umActionPerformed(evt);
            }
        });

        bt_dois.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_dois.setText("2");
        bt_dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doisActionPerformed(evt);
            }
        });

        bt_tres.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_tres.setText("3");
        bt_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tresActionPerformed(evt);
            }
        });

        bt_somar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_somar.setText("+");
        bt_somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_somarActionPerformed(evt);
            }
        });

        bt_zero.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_zero.setText("0");
        bt_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_zeroActionPerformed(evt);
            }
        });

        bt_subtrair.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_subtrair.setText("-");
        bt_subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_subtrairActionPerformed(evt);
            }
        });

        bt_igual.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_igual.setText("=");
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });

        bt_ponto.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_ponto.setText(".");
        bt_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pontoActionPerformed(evt);
            }
        });

        bt_MoM.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bt_MoM.setText("+/-");
        bt_MoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_porcent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tb_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_limpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_MoM, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_sete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_oito, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(bt_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_um, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_subtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_somar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_MoM, bt_cinco, bt_dividir, bt_dois, bt_limpar1, bt_multiplicar, bt_nove, bt_oito, bt_ponto, bt_porcent, bt_quatro, bt_raiz, bt_seis, bt_sete, bt_somar, bt_subtrair, bt_tres, bt_um, tb_limpar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_somar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_porcent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_limpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_MoM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_oito, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_sete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_um, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_MoM, bt_cinco, bt_dividir, bt_dois, bt_limpar1, bt_multiplicar, bt_nove, bt_oito, bt_ponto, bt_porcent, bt_quatro, bt_raiz, bt_seis, bt_sete, bt_subtrair, bt_tres, bt_um, bt_zero, tb_limpar});

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_Tela.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lb_Tela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Tela.setText("0");
        lb_Tela.setToolTipText("");

        lb_Tela2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lb_Tela2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Tela, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(lb_Tela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lb_Tela2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Tela, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_limpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpar1ActionPerformed

        LimparMetodo();


    }//GEN-LAST:event_bt_limpar1ActionPerformed


    private void bt_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cincoActionPerformed
        setarNumerosLabel('5');
    }//GEN-LAST:event_bt_cincoActionPerformed

    private void bt_oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_oitoActionPerformed
        setarNumerosLabel('8');
    }//GEN-LAST:event_bt_oitoActionPerformed

    private void bt_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doisActionPerformed
        setarNumerosLabel('2');
    }//GEN-LAST:event_bt_doisActionPerformed

    private void bt_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_zeroActionPerformed
        setarNumerosLabel('0');
    }//GEN-LAST:event_bt_zeroActionPerformed

    private void bt_quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quatroActionPerformed
        setarNumerosLabel('4');
    }//GEN-LAST:event_bt_quatroActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
        pegarNum2();

        calcular();

        lb_Tela2.setText(lb_Tela2.getText() + " " + num2);

    }//GEN-LAST:event_bt_igualActionPerformed

    private void bt_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_umActionPerformed
        setarNumerosLabel('1');

    }//GEN-LAST:event_bt_umActionPerformed

    private void bt_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tresActionPerformed
        setarNumerosLabel('3');
    }//GEN-LAST:event_bt_tresActionPerformed

    private void bt_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seisActionPerformed
        setarNumerosLabel('6');
    }//GEN-LAST:event_bt_seisActionPerformed

    private void bt_seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seteActionPerformed
        setarNumerosLabel('7');
    }//GEN-LAST:event_bt_seteActionPerformed

    private void bt_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_noveActionPerformed
        setarNumerosLabel('9');
    }//GEN-LAST:event_bt_noveActionPerformed

    private void bt_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pontoActionPerformed

        if (!(this.lb_Tela.getText().contains("."))) {
            setarNumerosLabel('.');
        }
        
        
        
        //setarNumerosLabel('.');

    }//GEN-LAST:event_bt_pontoActionPerformed

    private void bt_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_raizActionPerformed
        pegarNum1();
        operacao = '√';
        calcular();
        setarLb_Tela2();
    }//GEN-LAST:event_bt_raizActionPerformed

    private void bt_somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_somarActionPerformed
        pegarNum1();
        operacao = '+';
        setarLb_Tela2();

    }//GEN-LAST:event_bt_somarActionPerformed

    private void bt_subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_subtrairActionPerformed
        pegarNum1();
        operacao = '-';
        setarLb_Tela2();

    }//GEN-LAST:event_bt_subtrairActionPerformed

    private void bt_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiplicarActionPerformed

        pegarNum1();
        operacao = '*';
        setarLb_Tela2();


    }//GEN-LAST:event_bt_multiplicarActionPerformed

    private void bt_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dividirActionPerformed
        pegarNum1();
        operacao = '/';
        setarLb_Tela2();


    }//GEN-LAST:event_bt_dividirActionPerformed

    private void bt_porcentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_porcentActionPerformed
        pegarNum2();
        operacao = '%';
        calcular();

        lb_Tela2.setText(lb_Tela2.getText() + " " + num2);
        jPanel1.requestFocus();
    }//GEN-LAST:event_bt_porcentActionPerformed

    private void tb_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_limparActionPerformed

        reiniciarCalculadora();
        jPanel1.requestFocus();
    }//GEN-LAST:event_tb_limparActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        if (evt.getKeyChar() == '0'
                || evt.getKeyChar() == '1'
                || evt.getKeyChar() == '2'
                || evt.getKeyChar() == '3'
                || evt.getKeyChar() == '4'
                || evt.getKeyChar() == '5'
                || evt.getKeyChar() == '6'
                || evt.getKeyChar() == '7'
                || evt.getKeyChar() == '8'
                || evt.getKeyChar() == '9') {
            setarNumerosLabel(evt.getKeyChar());

        } else if (evt.getKeyChar() == '-'
                || evt.getKeyChar() == '+'
                || evt.getKeyChar() == '/'
                || evt.getKeyChar() == '*') {
            pegarNum1();
            operacao = evt.getKeyChar();
            setarLb_Tela2();

        } else if (evt.getKeyCode() == 10) {
            //usando o enter como =
            pegarNum2();
            calcular();
            lb_Tela2.setText(lb_Tela2.getText() + " " + num2);

        } else if (evt.getKeyCode() == 8) {

            LimparMetodo();
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void bt_MoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MoMActionPerformed
        Double mom = Double.parseDouble(lb_Tela.getText());
        if (mom != 0) {
            mom = mom * -1;

            lb_Tela.setText(String.valueOf(mom));

        }
        jPanel1.requestFocus();


    }//GEN-LAST:event_bt_MoMActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_MoM;
    private javax.swing.JButton bt_cinco;
    private javax.swing.JButton bt_dividir;
    private javax.swing.JButton bt_dois;
    private javax.swing.JButton bt_igual;
    private javax.swing.JButton bt_limpar1;
    private javax.swing.JButton bt_multiplicar;
    private javax.swing.JButton bt_nove;
    private javax.swing.JButton bt_oito;
    private javax.swing.JButton bt_ponto;
    private javax.swing.JButton bt_porcent;
    private javax.swing.JButton bt_quatro;
    private javax.swing.JButton bt_raiz;
    private javax.swing.JButton bt_seis;
    private javax.swing.JButton bt_sete;
    private javax.swing.JButton bt_somar;
    private javax.swing.JButton bt_subtrair;
    private javax.swing.JButton bt_tres;
    private javax.swing.JButton bt_um;
    private javax.swing.JButton bt_zero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Tela;
    private javax.swing.JLabel lb_Tela2;
    private javax.swing.JButton tb_limpar;
    // End of variables declaration//GEN-END:variables
public void setarNumerosLabel(char numero) {

        if ("0".equals(lb_Tela.getText()) && !".".equals(String.valueOf(numero))) {

            lb_Tela.setText("");

        }

        String texto = lb_Tela.getText();
        if (texto.length() <= 15) {

            texto = texto + numero;
            lb_Tela.setText(texto);

            jPanel1.requestFocus();

        }

    }

    public void pegarNum1() {

        num1 = Double.parseDouble(lb_Tela.getText());
        lb_Tela.setText("0");
        jPanel1.requestFocus();

    }

    public void pegarNum2() {

        num2 = Double.parseDouble(lb_Tela.getText());
        lb_Tela.setText("");

    }

    public void calcular() {
        if (num2 == 0 && operacao == '/') {
            JOptionPane.showMessageDialog(rootPane, "Operação invalida!!!");
            reiniciarCalculadora();

        } else {

            if (operacao == '+') {
                resultado = num1 + num2;

            } else if (operacao == '/') {
                resultado = num1 / num2;

            } else if (operacao == '*') {
                resultado = num1 * num2;

            } else if (operacao == '-') {

                resultado = num1 - num2;

            } else if (operacao == '%') {
                resultado = (num1 * num2) / 100;

            } else {
                resultado = Math.sqrt(num1);

            }
            lb_Tela.setText(String.valueOf(resultado));
            jPanel1.requestFocus();

        }

    }

    public void setarLb_Tela2() {

        lb_Tela2.setText(num1 + " " + operacao);

    }

    private void reiniciarCalculadora() {
        num1 = 0;
        num2 = 0;
        resultado = 0;
        lb_Tela.setText("0");
        lb_Tela2.setText("");

    }

    private void LimparMetodo() {
        String vt = lb_Tela.getText();

        if (vt.length() > 0) {

            if (".".equals(vt.substring(vt.length() - 1, vt.length() - 1))) {
                vt = vt.substring(0, vt.length() - 2);

            } else {
                vt = vt.substring(0, vt.length() - 1);

            }

            lb_Tela.setText(vt);

            if (vt.length() < 0) {
                lb_Tela.setText("0");
            }
        } else {
            lb_Tela.setText("0");

        }
        jPanel1.requestFocus();
    }

}
