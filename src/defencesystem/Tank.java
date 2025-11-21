
package defencesystem;

import java.awt.Checkbox;

public class Tank extends javax.swing.JFrame implements DefenceObserver{

    private int position;
    public Tank() {
        setLocationRelativeTo(this);
        initComponents();
        setTitle("Tank");
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAreaClear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCB = new javax.swing.JCheckBox();
        lblAreClear = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnRedar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSlider2 = new javax.swing.JSlider();
        btnSend = new javax.swing.JButton();
        btnRotation = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(63, 82, 45));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tank");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 242, -1));

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaClear.setForeground(new java.awt.Color(51, 102, 0));
        lblAreaClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreaClear.setText("Area Not Clear");
        jPanel1.add(lblAreaClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem/q.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 366, 1811));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TANK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, -1));

        JCB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JCB.setForeground(new java.awt.Color(255, 255, 255));
        JCB.setText("Position");
        jPanel1.add(JCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, -1));

        lblAreClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreClear.setForeground(new java.awt.Color(255, 255, 255));
        lblAreClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreClear.setText("Area Not Clear");
        jPanel1.add(lblAreClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 70));

        btnShoot.setBackground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        getContentPane().add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        btnMissile.setText("Missile Operation");
        btnMissile.setEnabled(false);
        btnMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileActionPerformed(evt);
            }
        });
        getContentPane().add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, -1));

        btnRedar.setText("Redar Operation");
        btnRedar.setEnabled(false);
        btnRedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRedar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, -1));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 255, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 440, 170));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(49, 69, 30));

        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);

        btnSend.setBackground(new java.awt.Color(255, 51, 51));
        btnSend.setText("Send");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 220, 390));

        btnRotation.setText("Rotate Shooting");
        btnRotation.setEnabled(false);
        btnRotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotationActionPerformed(evt);
            }
        });
        getContentPane().add(btnRotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem/tank.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 70, 660, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissileActionPerformed

    private void btnRedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedarActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnRotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRotationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCB;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRedar;
    private javax.swing.JButton btnRotation;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAreClear;
    private javax.swing.JLabel lblAreaClear;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void getMsgMain(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void areaClear(boolean clear) {
        if (clear) {
            lblAreClear.setText("Area Cleared");
        }else{
            lblAreClear.setText("Area not  Cleared");
        }
    }

    @Override
    public void setPosition(int position) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int position) {
        this.position = position;
        updatebutton(position);
    }

    @Override
    public void updatebutton(int position) {
        this.position = position;
        if (JCB.isSelected()) {
            if (position>=75) {
                btnRotation.setEnabled(true);
            }else if (position>=65){
                btnRedar.setEnabled(true);
            }else if(position>=55){
                btnMissile.setEnabled(true);
            }else if(position>=45){
                btnShoot.setEnabled(true);
            }
            if (position<=45) {
                btnShoot.setEnabled(false);
            }else if (position<=55){
                btnMissile.setEnabled(false);
            }else if(position<=65){
                btnRedar.setEnabled(false);
            }else if(position<=75){
                btnRotation.setEnabled(false);
            }
            
        }
    }
}
