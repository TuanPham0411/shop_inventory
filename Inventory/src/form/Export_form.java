package form;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.ItemsDB;
import login.AccountDB;

public class Export_form extends javax.swing.JFrame {
    
    private DefaultTableModel Items;
    private DefaultTableModel Quantities;
    private DefaultTableModel Staff;
    private DefaultTableModel Location;
    
    public Export_form() {
        initComponents();
        Items = ItemsDB.fetchDataFromTable("Items");
        Quantities = ItemsDB.fetchDataFromTable("Inventory");
        Staff = AccountDB.fetchDataFromTable("Accounts");
        Location = ItemsDB.fetchDataFromTable("Locations");
        Combobox();
        txtDes.setEditable(false);
        txtStaff.setEditable(false);
        txtQuan_stock.setEditable(false);
        txtLocid.setEditable(false);
        txtDate.setEditable(false);
        addComboBoxListener();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        txtDate.setText(formattedDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jLabel41 = new javax.swing.JLabel();
        txtid4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        txtDes = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        cmbItem = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cmbSize = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtLocid = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cmbStaff = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtQuan_stock = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        txtStaff = new javax.swing.JTextField();
        txtQuan = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(199, 226, 255));
        jLabel41.setText("Item description");

        txtid4.setFont(txtid4.getFont().deriveFont(txtid4.getFont().getSize()+2f));
        txtid4.setForeground(new java.awt.Color(255, 255, 255));
        txtid4.setBorder(null);

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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 40, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Export Form");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Export goods to shop according to available items");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, -1));

        btnImport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImport.setForeground(new java.awt.Color(25, 118, 211));
        btnImport.setText("Export");
        btnImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        jPanel2.add(btnImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 140, 30));

        txtDes.setFont(txtDes.getFont().deriveFont(txtDes.getFont().getSize()+2f));
        txtDes.setForeground(new java.awt.Color(102, 102, 102));
        txtDes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDes.setBorder(null);
        jPanel2.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 270, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("____________________________________________");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 330, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(199, 226, 255));
        jLabel27.setText("Export date");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 110, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("     ______________________________________________________________________");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 530, 20));

        txtDate.setFont(txtDate.getFont().deriveFont(txtDate.getFont().getSize()+2f));
        txtDate.setForeground(new java.awt.Color(102, 102, 102));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setBorder(null);
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 140, 30));

        cmbItem.setForeground(new java.awt.Color(102, 102, 102));
        cmbItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(199, 226, 255));
        jLabel33.setText("Size");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        cmbSize.setForeground(new java.awt.Color(102, 102, 102));
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(199, 226, 255));
        jLabel34.setText("pcs");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, 30));

        txtLocid.setFont(txtLocid.getFont().deriveFont(txtLocid.getFont().getSize()+2f));
        txtLocid.setForeground(new java.awt.Color(102, 102, 102));
        txtLocid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLocid.setBorder(null);
        jPanel2.add(txtLocid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 140, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(199, 226, 255));
        jLabel35.setText("Item ID");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(199, 226, 255));
        jLabel36.setText("Item description");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(199, 226, 255));
        jLabel37.setText("Location");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(199, 226, 255));
        jLabel38.setText("Staff ID");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        cmbStaff.setForeground(new java.awt.Color(102, 102, 102));
        cmbStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("______________________________________________");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 420, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(199, 226, 255));
        jLabel40.setText("Staff");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, -1));

        txtQuan_stock.setFont(txtQuan_stock.getFont().deriveFont(txtQuan_stock.getFont().getSize()+2f));
        txtQuan_stock.setForeground(new java.awt.Color(102, 102, 102));
        txtQuan_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuan_stock.setBorder(null);
        jPanel2.add(txtQuan_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(199, 226, 255));
        jLabel42.setText("Reason");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 110, -1));

        txtReason.setFont(txtReason.getFont().deriveFont(txtReason.getFont().getSize()+2f));
        txtReason.setForeground(new java.awt.Color(102, 102, 102));
        txtReason.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReason.setBorder(null);
        jPanel2.add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 270, 70));

        txtStaff.setFont(txtStaff.getFont().deriveFont(txtStaff.getFont().getSize()+2f));
        txtStaff.setForeground(new java.awt.Color(102, 102, 102));
        txtStaff.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStaff.setBorder(null);
        jPanel2.add(txtStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 270, 30));

        txtQuan.setFont(txtQuan.getFont().deriveFont(txtQuan.getFont().getSize()+2f));
        txtQuan.setForeground(new java.awt.Color(102, 102, 102));
        txtQuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuan.setBorder(null);
        jPanel2.add(txtQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 50, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(199, 226, 255));
        jLabel43.setText("Quantity");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(199, 226, 255));
        jLabel44.setText("/");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 198, 20, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        setSize(new java.awt.Dimension(532, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
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

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        if (txtDes.getText().isEmpty() || 
            txtStaff.getText().isEmpty() || 
            txtReason.getText().isEmpty() || 
            txtLocid.getText().isEmpty() || 
            txtDate.getText().isEmpty() || 
            txtQuan_stock.getText().isEmpty() || 
            txtQuan.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin.");
        } else {
            try {
                String item = cmbItem.getSelectedItem().toString();
                String size = cmbSize.getSelectedItem().toString();
                String empid = cmbStaff.getSelectedItem().toString();
                String reason = txtReason.getText();
                String date = txtDate.getText();
                int quantityExported = Integer.parseInt(txtQuan.getText());
                int quantityStock = Integer.parseInt(txtQuan_stock.getText());
                
                if (quantityExported > quantityStock){
                    JOptionPane.showMessageDialog(null, "Số lượng xuất kho không được lớn hơn số hàng đang có.");
                    return;
                }

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date parsedDate = dateFormat.parse(date);
                java.sql.Date exportdate = new java.sql.Date(parsedDate.getTime());

                try (Connection conn = ItemsDB.getConnection()) {
                    if(size.contains("Choose Size")){
                        JOptionPane.showMessageDialog(null, "Please choose Size");
                        return;
                    }
                    String sql = "INSERT INTO Export (ItemID, Size, Quantity, EmployeeID, Reason, ExportDate) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, item);
                    pstmt.setString(2, size);
                    pstmt.setInt(3, quantityExported);
                    pstmt.setString(4, empid);
                    pstmt.setString(5, reason);
                    pstmt.setDate(6, exportdate);
                    
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Thông tin đã được lưu thành công vào cơ sở dữ liệu.");
                        txtDes.setText("");
                        txtStaff.setText("");
                        txtReason.setText("");
                        txtLocid.setText("");
                        txtDate.setText("");
                        txtQuan.setText("");
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Không có dữ liệu nào được lưu vào cơ sở dữ liệu.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Export_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên cho Số lượng hàng nhập.");
            } catch (ParseException ex) {
                Logger.getLogger(Export_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImportActionPerformed
      
    private void Combobox(){
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Size", "SX", "S", "M", "L", "XL", "XXL" }));
        
        ArrayList<Object> columnData = new ArrayList<>();
        columnData.add("Choose Item");
        for (int i = 0; i < Items.getRowCount(); i++) {
            Object value = Items.getValueAt(i, 0);
            if (value != null) {
                columnData.add(value);
            }
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(columnData.toArray(new String[0]));
        cmbItem.setModel(model);
        
        ArrayList<Object> columnData_acc = new ArrayList<>();
        columnData_acc.add("Choose Staff ID");
        for (int i = 0; i < Staff.getRowCount(); i++) {
            Object value = Staff.getValueAt(i, 0);
            if (value != null) {
                columnData_acc.add(value);
            }
        }
        DefaultComboBoxModel<String> acc = new DefaultComboBoxModel<>(columnData_acc.toArray(new String[0]));
        cmbStaff.setModel(acc);
    }
    
    private void addComboBoxListener() {
        cmbItem.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) cmbItem.getSelectedItem();
                    for (int row = 0; row < Items.getRowCount(); row++) {
                        String itemID = (String) Items.getValueAt(row, 0);
                        if (selectedItem.equals(itemID)) {
                            String description = (String) Items.getValueAt(row, 1);
                            txtDes.setText(description);
                        }
                    }
                }
            }
        });
        
        cmbStaff.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) cmbStaff.getSelectedItem();
                    for (int row = 0; row < Staff.getRowCount(); row++) {
                    String valueInColumn0 = (String) Staff.getValueAt(row, 0);
                    if (selectedItem.equals(valueInColumn0)) {
                        String description = (String) Staff.getValueAt(row, 1);
                        txtStaff.setText(description);
                        }
                    }
                }
            }
        });
        
        cmbSize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) cmbItem.getSelectedItem();
                    String selectedSize = (String) cmbSize.getSelectedItem();
                    for (int i = 0; i < Quantities.getRowCount(); i++) {
                        if (Quantities.getValueAt(i, 1).toString().equals(selectedItem) && Quantities.getValueAt(i,2).toString().equals(selectedSize)) {
                            String quantity = Quantities.getValueAt(i, 3).toString();
                            String locID = Quantities.getValueAt(i, 4).toString();
                            String locationName = "-";
                            for (int j = 0; j < Location.getRowCount(); j++) {
                                if (Location.getValueAt(j, 0).toString().equals(locID)) {
                                    locationName = Location.getValueAt(j, 1).toString();
                                    break;
                                }
                            }
                            txtLocid.setText(locationName);
                            txtQuan_stock.setText(quantity);
                            break;
                        }
                        else{
                            txtQuan_stock.setText("0");
                            txtLocid.setText("-");
                        }
                    }
                }
            }
        });
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
            java.util.logging.Logger.getLogger(Export_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Export_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Export_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Export_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private java.awt.Choice choice1;
    private javax.swing.JComboBox<String> cmbItem;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JComboBox<String> cmbStaff;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtLocid;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtQuan_stock;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtStaff;
    private javax.swing.JTextField txtid4;
    // End of variables declaration//GEN-END:variables
}
