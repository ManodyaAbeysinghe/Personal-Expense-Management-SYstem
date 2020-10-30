package com.tex.view;

import com.tex.controller.ExpenseController;
import com.tex.model.Expense;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MN
 */
public class frmShowAllExpense extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmShowAllExpense
     */
    public frmShowAllExpense() {
        initComponents();
        loadToTable();
    }

    
     public void loadToTable(){

try{
    java.util.List<Expense> list = ExpenseController.getAll(); // Controller eken data genna ganima
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

        btnShowAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpense = new javax.swing.JTable();

        setClosable(true);
        setTitle("Show All Expenses");

        btnShowAll.setText("Show All Expenses");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
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
                "No", "Expense Date", "Expense Reason", "Expense Amount"
            }
        ));
        jScrollPane1.setViewportView(tblExpense);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        
        
    }//GEN-LAST:event_btnShowAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExpense;
    // End of variables declaration//GEN-END:variables
}
