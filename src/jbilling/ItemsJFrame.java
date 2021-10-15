package jbilling;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author SKIDDOW
 */
public class ItemsJFrame extends javax.swing.JFrame {

    Connection conn = null;
    
    public ItemsJFrame() {
        initComponents();
        setLocationRelativeTo(null); // Open in center screen
        this.setResizable(false); // Disable window resizing

        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ItemNameTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ItemCodeTextBox = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PriceTextBox = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        RefreshjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add items");
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Item name");

        jLabel2.setText("Item Code");

        ItemCodeTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ItemCodeTextBoxKeyTyped(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ItemsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ItemsTable.getTableHeader().setReorderingAllowed(false);
        ItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsTable);
        if (ItemsTable.getColumnModel().getColumnCount() > 0) {
            ItemsTable.getColumnModel().getColumn(0).setMaxWidth(100);
            ItemsTable.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        DeleteButton.setText("Delete selected");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Price");

        PriceTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceTextBoxKeyTyped(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        RefreshjButton.setText("🔃");
        RefreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ItemCodeTextBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RefreshjButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ItemNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ItemCodeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ItemNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton)
                    .addComponent(UpdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetNull(){
        ItemCodeTextBox.setText(null);
        ItemNameTextBox.setText(null);
        PriceTextBox.setText(null);
        ItemCodeTextBox.setEditable(true);
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // Insert data
        MySQLConnection con = new MySQLConnection();
        con.ExecuteQuery("INSERT INTO items(item_code, item_name) "
                    + "VALUES('"+Integer.parseInt(ItemCodeTextBox.getText())+"','"+ItemNameTextBox.getText()+"')");
        SetNull();
        LoadData();
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ItemCodeTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemCodeTextBoxKeyTyped
        // Allow only numbers ======= 
        char c = evt.getKeyChar();        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_ItemCodeTextBoxKeyTyped

    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        ItemCodeTextBox.setEditable(false);
        int row = ItemsTable.getSelectedRow();
        ItemCodeTextBox.setText(ItemsTable.getModel().getValueAt(row, 0).toString());
        ItemNameTextBox.setText(ItemsTable.getModel().getValueAt(row, 1).toString());
        PriceTextBox.setText(ItemsTable.getModel().getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        MySQLConnection con = new MySQLConnection();
        con.ExecuteQuery("DELETE FROM items WHERE item_code="+ItemCodeTextBox.getText());
        SetNull();        
        LoadData();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PriceTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceTextBoxKeyTyped
        // Allow only numbers ======= 
        char c = evt.getKeyChar();        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_PriceTextBoxKeyTyped

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        MySQLConnection con = new MySQLConnection();
        con.ExecuteQuery("UPDATE items SET item_name='"+ItemNameTextBox.getText()+"', price='"+PriceTextBox.getText()+"'" 
            +"WHERE item_code="+ItemCodeTextBox.getText());        
        SetNull();        
        LoadData();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void RefreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshjButtonActionPerformed
        LoadData();
        SetNull();
    }//GEN-LAST:event_RefreshjButtonActionPerformed
    
    private void LoadData(){
        // Text alignment
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.LEFT );
        ItemsTable.setDefaultRenderer(Integer.class, centerRenderer);
        ItemsTable.setDefaultRenderer(String.class, centerRenderer);
        
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();         
        
        // Clear table rows
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
           model.removeRow(i); 
        } 
        
        // Add rows to table from DB
        conn = MySQLConnection.Connect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM items");
            while(rs.next())  
            model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getDouble(3)});
            conn.close();         
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField ItemCodeTextBox;
    private javax.swing.JTextField ItemNameTextBox;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JTextField PriceTextBox;
    private javax.swing.JButton RefreshjButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}