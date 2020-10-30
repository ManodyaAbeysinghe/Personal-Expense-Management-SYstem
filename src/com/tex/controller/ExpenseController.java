
package com.tex.controller;

import com.tex.model.Expense;
import com.tex.util.DB;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ExpenseController {
    
       public static  boolean save(Expense expense){
    
         //3.Store in the database
       //a. SQL statement
       String sql = "INSERT INTO expense" + "(date,category,amount) VALUES "+
       "(?,?,?)";
       
     try{
         //b. DB connection
         Connection con = DB.getCon();
         
       PreparedStatement ps = con.prepareStatement(sql);
      
       ps.setString(1,expense.getDate());
       ps.setString(2,expense.getCategory());
       ps.setString(3,Double.toString(expense.getAmount()));
       
      
       
       
       //d. ExecuteUpdate();
       ps.executeUpdate();
      
      
       return true;
       }catch(Exception ex){
       ex.printStackTrace();
      return false;
       }
    }
       
       
      public static java.util.List<Expense> getAll(){
         List<Expense> list = new ArrayList<Expense>();
         
         //a.SQL statement
    String sql = "SELECT * FROM expense";
    //b.database connection
    try{
    Connection con = DB.getCon();
    
    //c. Prepare statement and execute
    PreparedStatement ps = con.prepareStatement(sql);
    
    ResultSet rs = ps.executeQuery();// this is the result set
    
    while(rs.next()){ //while there is a next
    Expense expense = new Expense();
    expense.setId(rs.getInt("id"));
    expense.setDate(rs.getString("date"));
    expense.setCategory(rs.getString("category"));
    expense.setAmount(Double.parseDouble(rs.getString("amount")));
   
    list.add(expense);
    }
    
    }catch(Exception e){
    e.printStackTrace();
    } 
    return list;
         
          
      }
      
      
      
       public static Expense getOne(int id){
    
    Expense expense = new Expense();
    try{
     Connection con = DB.getCon();
     
     String sql = "SELECT * FROM expense WHERE id=?";
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1, id);
     ResultSet rs = ps.executeQuery();
     if(rs.next()){
     expense.setId(rs.getInt("id"));
     expense.setDate(rs.getString("date"));
     //expense.setCategory(rs.getString("category"));
     expense.setCategory(rs.getString("amount"));
     
   
     }
     
    }catch(Exception e){
    e.printStackTrace();
    }
    return expense;
    }
       
       
       
           public static  boolean delete(int id){
    
         //3.Store in the database
       //a. SQL statement
       String sql = "DELETE FROM expense WHERE id=?";
       
     try{
         //b. DB connection
         Connection con = DB.getCon();
         
         
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setInt(1,id);
      
       //d. ExecuteUpdate();
       ps.executeUpdate();
      
      
       return true;
       }catch(Exception ex){
       ex.printStackTrace();
      return false;
       }
    }
           
           
           
           
           
                 public static  boolean update(Expense expense){
         //3.Store in the database
       //a. SQL statement
       String sql = "UPDATE expense SET" + 
               "date=?, category=?,amount=?" +
               "WHERE id=?";
       
     try{
         //b. DB connection
         Connection con = DB.getCon();
         
         
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(1,expense.getDate());
       ps.setString(2,expense.getCategory());
       ps.setString(3,Double.toString(expense.getAmount()));
      
      
       //d. ExecuteUpdate();
       ps.executeUpdate();
       
       return true;
       }catch(Exception ex){
       ex.printStackTrace();
      return false;
       }
    }
       
       
       
   
       
}
