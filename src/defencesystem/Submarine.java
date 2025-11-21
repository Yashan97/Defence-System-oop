
package defencesystem;
public class Submarine extends javax.swing.JFrame implements DefenceObserver{
        
    private int position;
    
    public Submarine() {
        initComponents();
        setTitle("Submarine");
        setLocationRelativeTo(this);
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
        lblAreClear = new javax.swing.JLabel();
        btnTowah = new javax.swing.JButton();
        btnShoot = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTrident = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jSlider5 = new javax.swing.JSlider();
        JbtnClick = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();
        txtSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
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
        jLabel4.setText("SUBMARINE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, -1));

        lblAreClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreClear.setForeground(new java.awt.Color(255, 255, 255));
        lblAreClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreClear.setText("Area Not Clear");
        jPanel1.add(lblAreClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 70));

        btnTowah.setBackground(new java.awt.Color(156, 100, 100));
        btnTowah.setText("Towah -Missile");
        btnTowah.setEnabled(false);
        getContentPane().add(btnTowah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, -1));

        btnShoot.setBackground(new java.awt.Color(156, 100, 100));
        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        getContentPane().add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, -1));

        btnSonar.setBackground(new java.awt.Color(156, 100, 100));
        btnSonar.setText("Sonar Operation");
        btnSonar.setEnabled(false);
        getContentPane().add(btnSonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        btnTrident.setBackground(new java.awt.Color(156, 100, 100));
        btnTrident.setText("Trident - Missile");
        btnTrident.setEnabled(false);
        getContentPane().add(btnTrident, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        jPanel2.setBackground(new java.awt.Color(20, 20, 86));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel2.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel2.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel2.add(jSlider4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel2.add(jSlider5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        JbtnClick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JbtnClick.setForeground(new java.awt.Color(255, 255, 255));
        JbtnClick.setText("Position");
        jPanel2.add(JbtnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 250, 410));

        txtArea2.setBackground(new java.awt.Color(84, 84, 203));
        txtArea2.setColumns(20);
        txtArea2.setForeground(new java.awt.Color(255, 255, 255));
        txtArea2.setRows(5);
        jScrollPane2.setViewportView(txtArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 370, 190));
        getContentPane().add(txtSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, -1));

        btnSend.setBackground(new java.awt.Color(255, 0, 0));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem/sub.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = "SUBMARINE - "+txtSend.getText();
        MainController.setDefeneMsg(msg);
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JbtnClick;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTowah;
    private javax.swing.JButton btnTrident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JLabel lblAreClear;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JTextField txtSend;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void getMsgMain(String msg) {
         try{
           javax.swing.text.Document doc = txtArea2.getDocument();
           doc.insertString(doc.getLength(),"Main Controller - " +msg+"\n",null);
           txtArea2.setCaretPosition(doc.getLength());
        }catch(javax.swing.text.BadLocationException e){
        
        }
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
        if (JbtnClick.isSelected()) {
            if (position>=75) {
                btnTrident.setEnabled(true);
            }else if(position>=65){
                btnTowah.setEnabled(true);
            }
            else if (position>=55){
                btnSonar.setEnabled(true);
            }
            else if(position>=45){
                btnShoot.setEnabled(true);
            }
            if (position<=45) {
                btnShoot.setEnabled(false);
            }else if(position<=55){
                btnSonar.setEnabled(false);
            }else if(position<=65){
                btnTowah.setEnabled(false);
            }else if (position<=75){
                btnTrident.setEnabled(false);
            }
        }
    }

    
}
