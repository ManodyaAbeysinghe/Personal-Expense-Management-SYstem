package com.tex.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    static Connection con =null;
    
    
    public static Connection  getCon() throws Exception{
        
        if(con==null){// singleton pattern=== using the same object again and again instead of using 
            //same set of codes again and again
            //reuse the object
    String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";  
    String un ="hbstudent";
    String pw="hbstudent";
    Class.forName("com.mysql.jdbc.Driver");
    con =DriverManager.getConnection(url,un,pw);
    System.out.println("Successfull");
        }
        System.out.println(con);
    return con;
    
    }
    
}
