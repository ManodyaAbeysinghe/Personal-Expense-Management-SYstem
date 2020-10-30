/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tex.view;

import com.tex.controller.ExpenseController;
import com.tex.model.Expense;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MN
 */
public class frmDeleteExpense extends javax.swing.JInternalFrame {
int id;
    /**
     * Creates new form frmDeleteExpense
     */
    public frmDeleteExpense() {
        initComponents();
        loadToTable();
    }

    
     public void loadToTable(){

try{
    List<Expense> list = ExpenseController.getAll(); // Controller eken data genna ganima
    DefaultTableModel dtm =(DefaultTableModel) tblExpense.getModel();
    dtm.setRowCount(0);
    for(Expense t:list){
    Object[] row = {t.getId(),t.getDate(),t.getCategory(),Double.toString(t.getAmount()) };
    dtm.addRow(row);
    }
}catch(Exception e){
    
}}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpense = new javax.swing.JTable();

        setClosable(true);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Expense Date", "Expense Category", "Expense Amount"
            }
        ));
        tblExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpenseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExpense);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
         ExpenseController.delete(id);
        loadToTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpenseMouseClicked
           // TODO add your handling code here:
      int row = tblExpense.getSelectedRow();
       if(row!=-1){//if the row selected
       
           String idstr= tblExpense.getValueAt(row, 0).toString();
           id = Integer.parseInt(idstr);
           Expense expense = ExpenseController.getOne(id);
         // txtDate.setText(author.getFirstname());
          // txtLname.setText(author.getLastname()+"");
    }//GEN-LAST:event_tblExpenseMouseClicked
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExpense;
    // End of variables declaration//GEN-END:variables
}

