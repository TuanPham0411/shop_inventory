package main;

import form.Items;
import form.Warehouse;
import form.Locations;
import form.Import_his;
import form.Export_his;
import form.Account;
import form.Recovery;
import form.More;
import form.Dashboard;
import java.awt.Color;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import login.Login;

public class Main extends javax.swing.JFrame {

    private Dashboard home;
    private Items form1;
    private Locations form2;
    private Import_his form3;
    private Export_his form4;
    private Account form5;
    private Recovery form6;
    private More form7;
    private Warehouse form8;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        home = new Dashboard();
        form1 = new Items();
        form2 = new Locations();
        form3 = new Import_his();
        form4 = new Export_his();
        form5 = new Account();
        form6 = new Recovery();
        form7 = new More();
        form8 = new Warehouse();
        menu.initMoving(Main.this);
        menu.addEventMenuSelected((int index) -> {
            switch (index) {
                case 0:
                    setForm(home);
                    break;
                case 1:
                    setForm(form1);
                    break;
                case 2:
                    setForm(form8);
                    break;
                case 3:
                    setForm(form2);
                    break;
                case 4:
                    setForm(form3);
                    break;
                case 5:
                    setForm(form4);
                    break;
                case 9:
                    if (Login.role.contains("Admin")){
                        setForm(form5);
                    } else {
                        form5.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "You are not allowed access due to insufficient permissions!");
                    }
                    break;
                case 10:
                    if (Login.role.contains("Admin")){
                        setForm(form6);
                    } else {
                        form6.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "You are not allowed access due to insufficient permissions!");
                    }
                    break;
                case 11:
                    if (Login.role.contains("Admin")){
                        setForm(form7);
                    } else {
                        form7.setEnabled(false);
                        JOptionPane.showMessageDialog(this, "You are not allowed access due to insufficient permissions!");
                    }
                    break;
                case 13:
                    logout();
                    break;
                case 14:
                    Window[] windows = Window.getWindows();
                    for (Window window : windows) {
                        window.dispose();
                    }
                    System.exit(0);
                default:
                    break;
            }
        });
        
        setForm(new Dashboard());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void logout() {
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        menu = new component.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private component.Menu menu;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
