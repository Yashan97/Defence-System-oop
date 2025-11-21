
package defencesystem;

public class Helicopter extends javax.swing.JFrame implements DefenceObserver{
    
    private int position;
    
    public Helicopter() {
        initComponents();
        setTitle("Helicopter");
        setLocationRelativeTo(this);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAreaClear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAreClear = new javax.swing.JLabel();
        btnLesor = new javax.swing.JButton();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CheckPosition = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
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
        jLabel4.setText("HELICOPTER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, -1));

        lblAreClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreClear.setForeground(new java.awt.Color(255, 255, 255));
        lblAreClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreClear.setText("Area Not Clear");
        jPanel1.add(lblAreClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnLesor.setText("Leser Operation");
        btnLesor.setEnabled(false);
        getContentPane().add(btnLesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        getContentPane().add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, -1));

        btnMissile.setText("Missile Operation");
        btnMissile.setEnabled(false);
        getContentPane().add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 390, 190));
        getContentPane().add(txtSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 210, -1));

        btnSend.setText("Send");
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        CheckPosition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckPosition.setForeground(new java.awt.Color(255, 255, 255));
        CheckPosition.setText("Position");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(CheckPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckPosition)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 160, 380));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem/heli.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckPosition;
    private javax.swing.JButton btnLesor;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreClear;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtSend;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void getMsgMain(String msg) {
        try{
           javax.swing.text.Document doc = txtArea.getDocument();
           doc.insertString(doc.getLength(),"Main Controller - " +msg+"\n",null);
           txtArea.setCaretPosition(doc.getLength());
        }catch(javax.swing.text.BadLocationException e){
        
        }
    }

    @Override
    public void areaClear(boolean clear) {
        if (clear) {
            lblAreClear.setText("Area Cleared");
        }else{
            lblAreClear.setText("Area Not Clear");
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
        this.position=position;
        if (CheckPosition.isSelected()) {
            if (position>=75){
                btnLesor.setEnabled(true);
            }else if(position>=60){
                btnMissile.setEnabled(true);
            }else if (position>=50){
                btnShoot.setEnabled(true);
            }
            if (position<=50) {
                btnShoot.setEnabled(false);
            }else if(position<=60){
                btnMissile.setEnabled(false);
            }else if (position<=75){
                btnLesor.setEnabled(false);
            }
        }
    }

   
}
