
package org.littleBoat.View;

/**
 *
 * @author usuario
 */
public class CaracteristicasBarco extends javax.swing.JFrame {

    /**
     * Creates new form NuevoBarco
     */
    public CaracteristicasBarco() {
        initComponents();
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
        NextBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        GrossTonnageText = new javax.swing.JTextField();
        GrossTonnageLabel = new javax.swing.JLabel();
        NetTonnageLabel = new javax.swing.JLabel();
        NetTonnageText = new javax.swing.JTextField();
        EsloraLabel = new javax.swing.JLabel();
        EsloraText = new javax.swing.JTextField();
        MangaLabel = new javax.swing.JLabel();
        TitleGeneral = new javax.swing.JLabel();
        PuntalLabel = new javax.swing.JLabel();
        MangaText = new javax.swing.JTextField();
        PuntalText = new javax.swing.JTextField();
        ResetBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        TitleNewShip = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MarcaText = new javax.swing.JTextField();
        MarcaLabel = new javax.swing.JLabel();
        PotenciaLabel = new javax.swing.JLabel();
        PotenciaText = new javax.swing.JTextField();
        TitleMotor = new javax.swing.JLabel();
        ShipNameLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        AmountText = new javax.swing.JTextField();
        AmountLabel = new javax.swing.JLabel();
        ExpeditionDateLabel = new javax.swing.JLabel();
        ExpeditionDateText = new javax.swing.JTextField();
        TitleFire = new javax.swing.JLabel();
        DateFormatLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 234, 248));

        NextBtn.setBackground(new java.awt.Color(255, 255, 255));
        NextBtn.setForeground(new java.awt.Color(0, 0, 0));
        NextBtn.setText("Siguiente");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(232, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        GrossTonnageText.setBackground(new java.awt.Color(255, 255, 255));
        GrossTonnageText.setForeground(new java.awt.Color(0, 0, 0));
        GrossTonnageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrossTonnageTextActionPerformed(evt);
            }
        });

        GrossTonnageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GrossTonnageLabel.setForeground(new java.awt.Color(0, 0, 0));
        GrossTonnageLabel.setText("Arqueo Bruto :");

        NetTonnageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NetTonnageLabel.setForeground(new java.awt.Color(0, 0, 0));
        NetTonnageLabel.setText("Arqueo Neto :");

        NetTonnageText.setBackground(new java.awt.Color(255, 255, 255));
        NetTonnageText.setForeground(new java.awt.Color(0, 0, 0));
        NetTonnageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetTonnageTextActionPerformed(evt);
            }
        });

        EsloraLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EsloraLabel.setForeground(new java.awt.Color(0, 0, 0));
        EsloraLabel.setText("Eslora :");

        EsloraText.setBackground(new java.awt.Color(255, 255, 255));
        EsloraText.setForeground(new java.awt.Color(0, 0, 0));
        EsloraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsloraTextActionPerformed(evt);
            }
        });

        MangaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MangaLabel.setForeground(new java.awt.Color(0, 0, 0));
        MangaLabel.setText("Manga :");

        TitleGeneral.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleGeneral.setForeground(new java.awt.Color(0, 0, 0));
        TitleGeneral.setText("General");

        PuntalLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PuntalLabel.setForeground(new java.awt.Color(0, 0, 0));
        PuntalLabel.setText("Puntal :");

        MangaText.setBackground(new java.awt.Color(255, 255, 255));
        MangaText.setForeground(new java.awt.Color(0, 0, 0));
        MangaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangaTextActionPerformed(evt);
            }
        });

        PuntalText.setBackground(new java.awt.Color(255, 255, 255));
        PuntalText.setForeground(new java.awt.Color(0, 0, 0));
        PuntalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntalTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EsloraLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EsloraText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(GrossTonnageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GrossTonnageText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NetTonnageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NetTonnageText))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(TitleGeneral))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PuntalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PuntalText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MangaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MangaText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrossTonnageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GrossTonnageLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetTonnageLabel)
                    .addComponent(NetTonnageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EsloraLabel)
                    .addComponent(EsloraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MangaLabel)
                    .addComponent(MangaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuntalLabel)
                    .addComponent(PuntalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResetBtn.setForeground(new java.awt.Color(0, 0, 0));
        ResetBtn.setText("Limpiar");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        CancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        CancelBtn.setText("Cancelar");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        TitleNewShip.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitleNewShip.setForeground(new java.awt.Color(0, 0, 0));
        TitleNewShip.setText("Caracteristicas del Barco");

        jPanel3.setBackground(new java.awt.Color(232, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        MarcaText.setBackground(new java.awt.Color(255, 255, 255));
        MarcaText.setForeground(new java.awt.Color(0, 0, 0));
        MarcaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaTextActionPerformed(evt);
            }
        });

        MarcaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MarcaLabel.setForeground(new java.awt.Color(0, 0, 0));
        MarcaLabel.setText("Marca :");

        PotenciaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PotenciaLabel.setForeground(new java.awt.Color(0, 0, 0));
        PotenciaLabel.setText("Potencia :");

        PotenciaText.setBackground(new java.awt.Color(255, 255, 255));
        PotenciaText.setForeground(new java.awt.Color(0, 0, 0));
        PotenciaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaTextActionPerformed(evt);
            }
        });

        TitleMotor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleMotor.setForeground(new java.awt.Color(0, 0, 0));
        TitleMotor.setText("Motor del Barco");

        ShipNameLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShipNameLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ShipNameLabel2.setText("Kw");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(PotenciaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PotenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShipNameLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MarcaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MarcaText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TitleMotor)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleMotor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PotenciaLabel)
                    .addComponent(PotenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShipNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(232, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        AmountText.setBackground(new java.awt.Color(255, 255, 255));
        AmountText.setForeground(new java.awt.Color(0, 0, 0));
        AmountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTextActionPerformed(evt);
            }
        });

        AmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AmountLabel.setForeground(new java.awt.Color(0, 0, 0));
        AmountLabel.setText("Cantidad :");

        ExpeditionDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExpeditionDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        ExpeditionDateLabel.setText("Fecha de Expedicion:");

        ExpeditionDateText.setBackground(new java.awt.Color(255, 255, 255));
        ExpeditionDateText.setForeground(new java.awt.Color(0, 0, 0));
        ExpeditionDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpeditionDateTextActionPerformed(evt);
            }
        });

        TitleFire.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleFire.setForeground(new java.awt.Color(0, 0, 0));
        TitleFire.setText("Extintores del Barco");

        DateFormatLabel.setForeground(new java.awt.Color(50, 50, 50));
        DateFormatLabel.setText("dd/mm/aaaa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(AmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ExpeditionDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(DateFormatLabel))
                            .addComponent(ExpeditionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(TitleFire)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleFire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpeditionDateLabel)
                    .addComponent(ExpeditionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateFormatLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(TitleNewShip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(CancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetBtn)
                        .addGap(190, 190, 190)
                        .addComponent(NextBtn)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleNewShip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NextBtn)
                        .addComponent(ResetBtn))
                    .addComponent(CancelBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExpeditionDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpeditionDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpeditionDateTextActionPerformed

    private void AmountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTextActionPerformed

    private void PotenciaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PotenciaTextActionPerformed

    private void MarcaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTextActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        GrossTonnageText.setText("");
        NetTonnageText.setText("");
        EsloraText.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PuntalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntalTextActionPerformed

    private void MangaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MangaTextActionPerformed

    private void EsloraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsloraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsloraTextActionPerformed

    private void NetTonnageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetTonnageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetTonnageTextActionPerformed

    private void GrossTonnageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrossTonnageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GrossTonnageTextActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        String matricula = GrossTonnageText.getText();
        String nombreBarco = NetTonnageText.getText();
        String nombreCapitania = EsloraText.getText();
    }//GEN-LAST:event_NextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CaracteristicasBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaracteristicasBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaracteristicasBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaracteristicasBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaracteristicasBarco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JTextField AmountText;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel DateFormatLabel;
    private javax.swing.JLabel EsloraLabel;
    private javax.swing.JTextField EsloraText;
    private javax.swing.JLabel ExpeditionDateLabel;
    private javax.swing.JTextField ExpeditionDateText;
    private javax.swing.JLabel GrossTonnageLabel;
    private javax.swing.JTextField GrossTonnageText;
    private javax.swing.JLabel MangaLabel;
    private javax.swing.JTextField MangaText;
    private javax.swing.JLabel MarcaLabel;
    private javax.swing.JTextField MarcaText;
    private javax.swing.JLabel NetTonnageLabel;
    private javax.swing.JTextField NetTonnageText;
    private javax.swing.JButton NextBtn;
    private javax.swing.JLabel PotenciaLabel;
    private javax.swing.JTextField PotenciaText;
    private javax.swing.JLabel PuntalLabel;
    private javax.swing.JTextField PuntalText;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ShipNameLabel2;
    private javax.swing.JLabel TitleFire;
    private javax.swing.JLabel TitleGeneral;
    private javax.swing.JLabel TitleMotor;
    private javax.swing.JLabel TitleNewShip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
