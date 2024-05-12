package form;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import login.ItemsDB;
import login.Login;

public class Items extends javax.swing.JPanel {
    
    private DefaultTableModel Items;
    private TableRowSorter<TableModel> rowSorter;
    private DefaultTableModel clone;
    private List<String> deleteValue = new ArrayList<>();;

    public Items() {
        initComponents();
        if (!Login.role.contains("Admin")){
                        btnInsert.setEnabled(false);
                        btnDel.setEnabled(false);
                        btnSave.setEnabled(false);
                    }
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_C && evt.isControlDown()) {
                    copySelectedRow();
                } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_V && evt.isControlDown()) {
                    pasteCopiedRow();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Items information");

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Style", "Material", "Gender ID", "Origin", "Brand ID", "Unit Prize", "Color", "Create Date", "Updated Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(25);
        table.setShowGrid(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(70);
            table.getColumnModel().getColumn(1).setPreferredWidth(90);
            table.getColumnModel().getColumn(2).setPreferredWidth(40);
            table.getColumnModel().getColumn(3).setPreferredWidth(50);
            table.getColumnModel().getColumn(4).setPreferredWidth(50);
            table.getColumnModel().getColumn(5).setPreferredWidth(50);
            table.getColumnModel().getColumn(6).setPreferredWidth(50);
            table.getColumnModel().getColumn(7).setPreferredWidth(80);
            table.getColumnModel().getColumn(8).setPreferredWidth(50);
            table.getColumnModel().getColumn(9).setPreferredWidth(120);
            table.getColumnModel().getColumn(10).setPreferredWidth(120);
        }
        table.getAccessibleContext().setAccessibleParent(table);

        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Search");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilter)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnLoad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLoad.setForeground(new java.awt.Color(127, 127, 127));
        btnLoad.setText("Load data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDel.setForeground(new java.awt.Color(127, 127, 127));
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(127, 127, 127));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(127, 127, 127));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        Items = ItemsDB.fetchDataFromTable("Items");
        table.setModel(Items);
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        adjustColumnWidths(table);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        clone = cloneTableModel(table);
        deleteValue.clear();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String filterText = txtFilter.getText();
            createFilter(filterText);
        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object value = model.getValueAt(selectedRow, 0);
                String stringValue = value.toString();
                deleteValue.add(stringValue);
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        
        List<Object> cloneCol = new ArrayList<>();
        int clonerowCount = clone.getRowCount();
        int clonecolumnCount = clone.getColumnCount();

        if (clonecolumnCount > 0) {
            for (int row = 0; row < clonerowCount; row++) {
                Object value = clone.getValueAt(row, 0);
                cloneCol.add(value);
            }
        }
        
        for (String deleteValue1 : deleteValue) {
            try {
                delRow(deleteValue1);
            } catch (SQLException ex) {
                Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (int i = 0; i < rowCount; i++) {
            String column1 = model.getValueAt(i, 0).toString();
            String column2 = model.getValueAt(i, 1).toString();
            String column3 = model.getValueAt(i, 2).toString();
            String column4 = model.getValueAt(i, 3).toString();
            String column5 = model.getValueAt(i, 4).toString();
            String column6 = model.getValueAt(i, 5).toString();
            String column7 = model.getValueAt(i, 6).toString();
            BigDecimal column8 = new BigDecimal(model.getValueAt(i, 7).toString());
            String column9 = model.getValueAt(i, 8).toString();
            Date column10 = (Date) model.getValueAt(i, 9);

            List<Object> newValues = new ArrayList<>();
            newValues.add(column1);
            newValues.add(column2);
            newValues.add(column3);
            newValues.add(column4);
            newValues.add(column5);
            newValues.add(column6);
            newValues.add(column7);
            newValues.add(column8);
            newValues.add(column9);
            newValues.add(column10.toString());
            
            if (!cloneCol.contains(column1)){
                    try {
                        addNew(column1, column2, column3, column4, column5, column6, column7, column8, column9, column10);
                    } catch (SQLException ex) {
                        Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean addNew(String col1, String col2, String col3, String col4, String col5, String col6, String col7, BigDecimal col8, String col9, Date col10) throws SQLException {
        try (Connection conn = ItemsDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Items (ItemID, Name, Style, Gender, Brand, Material, Origin, Price, Color, CreateDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            pstmt.setString(1, col1);
            pstmt.setString(2, col2);
            pstmt.setString(3, col3);
            pstmt.setString(4, col4);
            pstmt.setString(5, col5);
            pstmt.setString(6, col6);
            pstmt.setString(7, col7);
            pstmt.setBigDecimal(8, col8);
            pstmt.setString(9, col9);
            pstmt.setDate(10, col10);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    private boolean delRow(String delvalue) throws SQLException {
        try (Connection conn = ItemsDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Items WHERE ItemID = ?")) {
            pstmt.setString(1, delvalue);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"-","-","-","-","-","-","-","-","-","-"});
        int lastRow = table.getRowCount() - 1;
        table.setRowSelectionInterval(lastRow, lastRow);
        Rectangle rect = table.getCellRect(lastRow, 0, true);
        table.scrollRectToVisible(rect);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void adjustColumnWidths(JTable table) {
        for (int column = 0; column < table.getColumnCount(); column++) {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = getPreferredColumnWidth(table, column);
            tableColumn.setPreferredWidth(preferredWidth);
        }
    }
    
    private void copySelectedRow() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            TableModel model = table.getModel();
            Object[] rowData = new Object[model.getColumnCount()];
            for (int i = 0; i < model.getColumnCount(); i++) {
                rowData[i] = model.getValueAt(selectedRow, i);
            }
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new Transferable() {
                @Override
                public DataFlavor[] getTransferDataFlavors() {
                    return new DataFlavor[]{DataFlavor.stringFlavor};
                }

                @Override
                public boolean isDataFlavorSupported(DataFlavor flavor) {
                    return flavor.equals(DataFlavor.stringFlavor);
                }

                @Override
                public Object getTransferData(DataFlavor flavor) {
                    StringBuilder rowDataString = new StringBuilder();
                    for (Object data : rowData) {
                        rowDataString.append(data.toString()).append("\t");
                    }
                    return rowDataString.toString().trim();
                }
            }, null);
        }
    }

    private void pasteCopiedRow() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = clipboard.getContents(null);
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String rowDataString = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                String[] rowData = rowDataString.split("\t");
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object[] parsedRowData = new Object[rowData.length];
                for (int i = 0; i < rowData.length; i++) {
                    switch (i) {
                        case 7:
                            parsedRowData[i] = new BigDecimal(rowData[i]);
                            break;
                        case 9:
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            java.util.Date utilDate = dateFormat.parse(rowData[i]);
                            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                            parsedRowData[i] = sqlDate;
                            break;
                        default:
                            parsedRowData[i] = rowData[i];
                            break;
                    }
                }
                model.addRow(parsedRowData);
                model.setValueAt("", model.getRowCount() - 1, 0);
                table.changeSelection(model.getRowCount() - 1, 0, false, false);
            } catch (UnsupportedFlavorException | IOException | ParseException ex) {
                ex.printStackTrace();
            }
        }
    }

    private int getPreferredColumnWidth(JTable table, int column) {
        int maxWidth = 0;
        int columnWidth;
        TableCellRenderer renderer;
        Component comp;
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn tableColumn = columnModel.getColumn(column);
        int headerWidth;

        renderer = tableColumn.getHeaderRenderer();
        if (renderer == null) {
            renderer = table.getDefaultRenderer(tableColumn.getHeaderValue().getClass());
        }
        comp = renderer.getTableCellRendererComponent(table, tableColumn.getHeaderValue(), false, false, -1, column);
        headerWidth = comp.getPreferredSize().width;

        for (int row = 0; row < table.getRowCount(); row++) {
            renderer = table.getCellRenderer(row, column);
            comp = table.prepareRenderer(renderer, row, column);
            columnWidth = comp.getPreferredSize().width;

            maxWidth = Math.max(maxWidth, Math.max(columnWidth, headerWidth));
        }

        return maxWidth + 35;
    }
    
    private void createFilter(String filterText) {
        RowFilter<Object, Object> filter = RowFilter.regexFilter("(?i)" + filterText);
        rowSorter.setRowFilter(filter);
    }
    
    private DefaultTableModel cloneTableModel(JTable sourceTable) {
        DefaultTableModel sourceModel = (DefaultTableModel) sourceTable.getModel();
        DefaultTableModel clonedModel = new DefaultTableModel(sourceModel.getColumnCount(), sourceModel.getRowCount());

        for (int columnIndex = 0; columnIndex < sourceModel.getColumnCount(); columnIndex++) {
            clonedModel.addColumn(sourceModel.getColumnName(columnIndex));
        }

        for (int rowIndex = 0; rowIndex < sourceModel.getRowCount(); rowIndex++) {
            Object[] rowData = new Object[sourceModel.getColumnCount()];
            for (int columnIndex = 0; columnIndex < sourceModel.getColumnCount(); columnIndex++) {
                rowData[columnIndex] = sourceModel.getValueAt(rowIndex, columnIndex);
            }
            clonedModel.addRow(rowData);
        }

        return clonedModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane panel;
    private swing.PanelBorder panelBorder1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
