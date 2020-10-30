
package com.tex.view;

import com.tex.controller.ExpenseController;
import com.tex.model.Expense;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;


public class frmUpdateExpense extends javax.swing.JInternalFrame {
int id;
   
    public frmUpdateExpense() {
        initComponents();
        loadToTable();
    }
    
    
   public void loadToTable(){

try{
    List<Expense> list = ExpenseController.getAll(); // Controller eken data genna ganima
    DefaultTableModel dtm =(DefaultTableModel) tblExpense.getModel();
    dtm.setRowCount(0);
    for(Expense t:list){
    Object[] row = {t.getId(),t.getDate(),t.getCategory(),t.getAmount() };
    dtm.addRow(row);
    }
}catch(Exception e){
    
}}
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblDate = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        txtAmount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExpense = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        lblDate.setText("Date");

        lblCategory.setText("Reason");

        lblAmount.setText("Amount");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transportation", "Education", "Food", "Household", "Medical", "Loan" }));

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        tblExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Expense Date", "Expense Reason", "Expense Amount"
            }
        ));
        tblExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpenseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblExpense);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDate)
                            .addComponent(cmbCategory, 0, 395, Short.MAX_VALUE)
                            .addComponent(txtAmount))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
         // TODO add your handling code here:
         String date = txtDate.getText();
         String category = (String) cmbCategory.getSelectedItem();
        
        String amount = txtAmount.getText();
        
        double amt = Double.parseDouble(amount);
        
        Expense expense = new Expense();
        expense.setDate(date);
        expense.setCategory(category);
        expense.setAmount(amt);
        
        
       
        
        boolean done = ExpenseController.save(expense);
        
        if(done){
        JOptionPane.showMessageDialog(this,"Saved");
        }else{
        JOptionPane.showMessageDialog(this,"Error");
        }
        loadToTable();
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpenseMouseClicked
          // TODO add your handling code here:
      int row = tblExpense.getSelectedRow();
       if(row!=-1){//if the row selected
       
           String idstr= tblExpense.getValueAt(row, 0).toString();
           id = Integer.parseInt(idstr);
           Expense expense = ExpenseController.getOne(id);
           txtDate.setText(expense.getDate());
           //cmbCategory.setText(expense.getCategory());
          txtAmount.setText(Double.toString(expense.getAmount()));
         //  txtLname.setText(author.getLastname()+"");
           
        
       }
    }//GEN-LAST:event_tblExpenseMouseClicked

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
         char c = evt.getKeyChar();
       if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
       evt.consume();
       JOptionPane.showMessageDialog(this,"Amount should be a number");
       }
    }//GEN-LAST:event_txtAmountKeyTyped


    
     

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTable tblExpense;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
