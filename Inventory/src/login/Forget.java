package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Forget extends javax.swing.JFrame {
    private Login loginWindow;
    
    public Forget(Login loginWindow) {
        initComponents();
        this.loginWindow = loginWindow;
        txtusername.setBackground(new java.awt.Color(0,0,0,1));
        txtanswer.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    private void setLoginWindowVisible() {
        loginWindow.setVisible(true);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtanswer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbQuestion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Forget Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Answer your recover password question");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 430, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 70, 290, -1));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 360, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 290, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 30, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 118, 211));
        jButton1.setText("SUBMIT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("Choose question");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_________________________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setText("Type your answer");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 290, -1));

        txtanswer.setFont(txtanswer.getFont().deriveFont(txtanswer.getFont().getSize()+2f));
        txtanswer.setForeground(new java.awt.Color(255, 255, 255));
        txtanswer.setBorder(null);
        jPanel2.add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 360, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_________________________________________");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 290, 30));

        cmbQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first school?", "What is the name of the animal you love the most?", "How would you describe your closest friend?", "What are your personal hobbies?" }));
        jPanel2.add(cmbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 172, 360, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 350));

        setSize(new java.awt.Dimension(430, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setLoginWindowVisible();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.parseFloat(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = txtusername.getText();
        String question = cmbQuestion.getSelectedItem().toString();
        String answer = txtanswer.getText();

        if (checkPassword(username, question, answer)) {
            try (Connection conn = AccountDB.getConnection()) {
                String sql = "SELECT password FROM Accounts WHERE MSNV = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    String password = rs.getString("password");
                    JOptionPane.showMessageDialog(this, "Your password is: " + password, "Correct information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi truy vấn dữ liệu: " + e.getMessage(), "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc câu trả lời không chính xác!", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private boolean checkPassword(String msnv, String question, String answer) {
        String sql = "SELECT * FROM Recovery WHERE MSNV = ? AND Question = ? AND Answer = ?";
        try (Connection conn = AccountDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, msnv);
            stmt.setString(2, question);
            stmt.setString(3, answer);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi truy vấn dữ liệu: " + e.getMessage(), "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Forget(new Login()).setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
