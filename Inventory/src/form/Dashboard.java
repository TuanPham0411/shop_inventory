package form;

import chart.ModelChart;
import model.Model_Card;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import login.ItemsDB;

public class Dashboard extends javax.swing.JPanel {
    
    private DefaultTableModel Items;
    private DefaultTableModel Quantities;
    private String total;
    private String totalvalue;
    private String safety;

    public Dashboard() {
        initComponents();
        createChart();
        calculateTotalValue();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Stock Total", total + "pcs", "Total amount of goods in stock"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Total Profit", "$" + totalvalue, "Warehouse value"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Safety Stock", safety + "pcs", "Total number of code items with quantity < 5"));
        
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
    }
    
    private void createChart() {
        Items = ItemsDB.fetchDataFromTable("Items");
        Quantities = ItemsDB.fetchDataFromTable("Inventory");
        chart1.addLegend("Total Value of each Items", new Color(189, 135, 245));
        
        for (int i = 0; i < Items.getRowCount(); i++) {
            String itemID = (String) Items.getValueAt(i, 0);
            double unitPrice = Double.parseDouble(Items.getValueAt(i, 7).toString());

            int quantity = 0;
            for (int j = 0; j < Quantities.getRowCount(); j++) {
                if (Quantities.getValueAt(j, 1).toString().equals(itemID)) {
                    quantity += Integer.parseInt(Quantities.getValueAt(j, 3).toString());
                }
            }

            double value = unitPrice * quantity;
            chart1.addData(new ModelChart(itemID.substring(itemID.length() - 2), new double[]{value}));
        }
    }
    
    private void calculateTotalValue() {
        Items = ItemsDB.fetchDataFromTable("Items");
        Quantities = ItemsDB.fetchDataFromTable("Inventory");

        double totalValue = 0.0;
        int total_qtt = 0;
        int countLessThan5 = 0;

        for (int i = 0; i < Quantities.getRowCount(); i++) {
            int quantity = Integer.parseInt(Quantities.getValueAt(i, 3).toString());
            total_qtt += quantity;
            if (quantity < 5) {
                countLessThan5++;
            }
        }

        for (int i = 0; i < Items.getRowCount(); i++) {
            String itemID = (String) Items.getValueAt(i, 0);
            double unitPrice = Double.parseDouble(Items.getValueAt(i, 7).toString());

            int quantity = 0;
            for (int j = 0; j < Quantities.getRowCount(); j++) {
                if (Quantities.getValueAt(j, 1).toString().equals(itemID)) {
                    quantity = Integer.parseInt(Quantities.getValueAt(j, 3).toString());
                    break;
                }
            }

            double itemTotalValue = unitPrice * quantity;
            totalValue += itemTotalValue;
        }
        totalvalue = String.valueOf(totalValue);
        total = String.valueOf(total_qtt);
        safety = String.valueOf(countLessThan5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new component.Card();
        card2 = new component.Card();
        card3 = new component.Card();
        panel1 = new java.awt.Panel();
        chart1 = new chart.Chart();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                    .addComponent(chart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Card card1;
    private component.Card card2;
    private component.Card card3;
    private chart.Chart chart1;
    private javax.swing.JLayeredPane panel;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
