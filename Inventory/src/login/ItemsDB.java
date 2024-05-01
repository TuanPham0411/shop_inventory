package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ItemsDB {
    public static Connection getConnection() throws SQLException {
        String serverName = "localhost";
        String databaseName = "InventoryDB";
        String user = "sa1";
        String password = "Thien2001";

        String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName + ";trustServerCertificate=true";
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected! " + connection);
        }
        catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Failed to create the database connection.");
            throw ex;
        }
        return connection;
    }
    
    public static DefaultTableModel fetchDataFromTable(String table) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            connection = getConnection();
            String sql = "SELECT * FROM " + table;
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                tableModel.addColumn(columnName);
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return tableModel;
    }
    
    public static void printTable(DefaultTableModel tableModel) {
        int columnCount = tableModel.getColumnCount();

        for (int i = 0; i < columnCount; i++) {
            System.out.print(tableModel.getColumnName(i) + "\t");
        }
        System.out.println();

        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(tableModel.getValueAt(i, j) + "\t");
            }
            System.out.println();
        }
    }
}