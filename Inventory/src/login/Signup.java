package login;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Signup extends javax.swing.JFrame {
    private Login loginWindow;
    
    public Signup(Login loginWindow) {
        initComponents();
        this.loginWindow = loginWindow;
        txtusername.setBackground(new java.awt.Color(0,0,0,1));
        txtpassword.setBackground(new java.awt.Color(0,0,0,1));
        txtfullname.setBackground(new java.awt.Color(0,0,0,1));
        txtid.setBackground(new java.awt.Color(0,0,0,1));
        txtdob.setBackground(new java.awt.Color(0,0,0,1));
        txtgender.setBackground(new java.awt.Color(0,0,0,1));
        txtadr.setBackground(new java.awt.Color(0,0,0,1));
        txtphone.setBackground(new java.awt.Color(0,0,0,1));
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
        jLabel8 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtadr = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtfullname = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtanswer = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign Up");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create your account");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 380, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 341, -1));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 290, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 300, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 40, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 341, -1));

        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+2f));
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 290, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_________________________________________");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 300, 30));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 40, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 60, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 118, 211));
        jButton1.setText("SUBMIT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 140, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("Address");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 341, -1));

        txtadr.setFont(txtadr.getFont().deriveFont(txtadr.getFont().getSize()+2f));
        txtadr.setForeground(new java.awt.Color(255, 255, 255));
        txtadr.setBorder(null);
        jPanel2.add(txtadr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_________________________________________");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 300, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 40, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(199, 226, 255));
        jLabel17.setText("Date of Birth");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 341, -1));

        txtdob.setFont(txtdob.getFont().deriveFont(txtdob.getFont().getSize()+2f));
        txtdob.setForeground(new java.awt.Color(255, 255, 255));
        txtdob.setBorder(null);
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("_________________________________________");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 300, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(199, 226, 255));
        jLabel20.setText("Gender");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 341, -1));

        txtgender.setFont(txtgender.getFont().deriveFont(txtgender.getFont().getSize()+2f));
        txtgender.setForeground(new java.awt.Color(255, 255, 255));
        txtgender.setBorder(null);
        jPanel2.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("_________________________________________");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 40, 30));

        txtid.setFont(txtid.getFont().deriveFont(txtid.getFont().getSize()+2f));
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setBorder(null);
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("_________________________________________");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 300, 30));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 40, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(199, 226, 255));
        jLabel26.setText("Employee ID");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 341, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(199, 226, 255));
        jLabel27.setText("Full Name");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 341, -1));

        txtfullname.setFont(txtfullname.getFont().deriveFont(txtfullname.getFont().getSize()+2f));
        txtfullname.setForeground(new java.awt.Color(255, 255, 255));
        txtfullname.setBorder(null);
        jPanel2.add(txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("_________________________________________");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 30));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("Phone number");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 341, -1));

        txtphone.setFont(txtphone.getFont().deriveFont(txtphone.getFont().getSize()+2f));
        txtphone.setForeground(new java.awt.Color(255, 255, 255));
        txtphone.setBorder(null);
        jPanel2.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 290, 30));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("_________________________________________");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 300, 30));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 40, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(199, 226, 255));
        jLabel12.setText("Choose question");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 290, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("_________________________________________");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 290, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setText("Type your answer");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 290, -1));

        txtanswer.setFont(txtanswer.getFont().deriveFont(txtanswer.getFont().getSize()+2f));
        txtanswer.setForeground(new java.awt.Color(255, 255, 255));
        txtanswer.setBorder(null);
        jPanel2.add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 320, 30));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("_________________________________________");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 290, 30));

        cmbQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first school?", "What is the name of the animal you love the most?", "How would you describe your closest friend?", "What are your personal hobbies?" }));
        jPanel2.add(cmbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 330, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 730));

        setSize(new java.awt.Dimension(372, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setLoginWindowVisible();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

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
        String id = txtid.getText();
        String fullname = txtfullname.getText();
        String dobText = txtdob.getText();
        String gender = txtgender.getText();
        String adr = txtadr.getText();
        String username = txtusername.getText();
        String phone = txtphone.getText();
        String role = "User";
        String question = cmbQuestion.getSelectedItem().toString();
        String answer = txtanswer.getText();
        String password = String.valueOf(txtpassword.getPassword());

        if (id.isEmpty() || fullname.isEmpty() || dobText.isEmpty() || gender.isEmpty() || adr.isEmpty() || username.isEmpty() || password.isEmpty() || answer.isEmpty() || question.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date parsedDate = dateFormat.parse(dobText);
                java.sql.Date dob = new java.sql.Date(parsedDate.getTime());

                try (Connection conn = AccountDB.getConnection()) {
                    String sql = "INSERT INTO Accounts (MSNV, FullName, BirthDate, Gender, Address, Role, PhoneNumber, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setString(1, id);
                    stmt.setString(2, fullname);
                    stmt.setDate(3, dob);
                    stmt.setString(4, gender);
                    stmt.setString(5, adr);
                    stmt.setString(6,role);
                    stmt.setString(7,phone);
                    stmt.setString(8, username);
                    stmt.setString(9, password);
                    int rowsAffected = stmt.executeUpdate();

                    if (rowsAffected > 0) {
                        String sql_re = "INSERT INTO Recovery (MSNV, Question, Answer) VALUES (?, ?, ?)";
                        PreparedStatement stmt_re = conn.prepareStatement(sql_re);
                        stmt_re.setString(1, id);
                        stmt_re.setString(2, question);
                        stmt_re.setString(3, answer);
                        int rowsAffected_re = stmt_re.executeUpdate();

                        if (rowsAffected_re > 0) {
                            JOptionPane.showMessageDialog(this, "Đã lưu thông tin thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Lưu thông tin thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Lưu thông tin thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu thông tin: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu thông tin: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
                                   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Signup(new Login()).setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JLabel disable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    private javax.swing.JTextField txtadr;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
